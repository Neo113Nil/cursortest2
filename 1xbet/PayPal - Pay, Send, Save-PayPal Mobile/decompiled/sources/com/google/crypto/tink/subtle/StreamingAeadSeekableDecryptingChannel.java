package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
class StreamingAeadSeekableDecryptingChannel implements java.nio.channels.SeekableByteChannel {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final java.nio.channels.SeekableByteChannel ciphertextChannel;
    private final long ciphertextChannelSize;
    private final int ciphertextOffset;
    private final java.nio.ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private int currentSegmentNr;
    private final com.google.crypto.tink.subtle.StreamSegmentDecrypter decrypter;
    private final int firstSegmentOffset;
    private final java.nio.ByteBuffer header;
    private boolean headerRead;
    private boolean isCurrentSegmentDecrypted;
    private boolean isopen;
    private final int lastCiphertextSegmentSize;
    private final int numberOfSegments;
    private long plaintextPosition;
    private final java.nio.ByteBuffer plaintextSegment;
    private final int plaintextSegmentSize;
    private long plaintextSize;

    public StreamingAeadSeekableDecryptingChannel(com.google.crypto.tink.subtle.NonceBasedStreamingAead nonceBasedStreamingAead, java.nio.channels.SeekableByteChannel seekableByteChannel, byte[] bArr) throws java.io.IOException, java.security.GeneralSecurityException {
        this.decrypter = nonceBasedStreamingAead.newStreamSegmentDecrypter();
        this.ciphertextChannel = seekableByteChannel;
        this.header = java.nio.ByteBuffer.allocate(nonceBasedStreamingAead.getHeaderLength());
        int ciphertextSegmentSize = nonceBasedStreamingAead.getCiphertextSegmentSize();
        this.ciphertextSegmentSize = ciphertextSegmentSize;
        this.ciphertextSegment = java.nio.ByteBuffer.allocate(ciphertextSegmentSize);
        int plaintextSegmentSize = nonceBasedStreamingAead.getPlaintextSegmentSize();
        this.plaintextSegmentSize = plaintextSegmentSize;
        this.plaintextSegment = java.nio.ByteBuffer.allocate(plaintextSegmentSize + 16);
        this.plaintextPosition = 0L;
        this.headerRead = false;
        this.currentSegmentNr = -1;
        this.isCurrentSegmentDecrypted = false;
        long size = seekableByteChannel.size();
        this.ciphertextChannelSize = size;
        this.aad = java.util.Arrays.copyOf(bArr, bArr.length);
        this.isopen = seekableByteChannel.isOpen();
        long j = ciphertextSegmentSize;
        int i = (int) (size / j);
        int i2 = (int) (size % j);
        int ciphertextOverhead = nonceBasedStreamingAead.getCiphertextOverhead();
        if (i2 > 0) {
            this.numberOfSegments = i + 1;
            if (i2 < ciphertextOverhead) {
                throw new java.io.IOException("Invalid ciphertext size");
            }
            this.lastCiphertextSegmentSize = i2;
        } else {
            this.numberOfSegments = i;
            this.lastCiphertextSegmentSize = ciphertextSegmentSize;
        }
        int ciphertextOffset = nonceBasedStreamingAead.getCiphertextOffset();
        this.ciphertextOffset = ciphertextOffset;
        int headerLength = ciphertextOffset - nonceBasedStreamingAead.getHeaderLength();
        this.firstSegmentOffset = headerLength;
        if (headerLength < 0) {
            throw new java.io.IOException("Invalid ciphertext offset or header length");
        }
        long j2 = (this.numberOfSegments * ciphertextOverhead) + ciphertextOffset;
        if (j2 > size) {
            throw new java.io.IOException("Ciphertext is too short");
        }
        this.plaintextSize = size - j2;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String obj;
        synchronized (this) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamingAeadSeekableDecryptingChannel\nciphertextChannel");
            try {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("position:");
                sb2.append(this.ciphertextChannel.position());
                str = sb2.toString();
            } catch (java.io.IOException unused) {
                str = "position: n/a";
            }
            sb.append(str);
            sb.append("\nciphertextChannelSize:");
            sb.append(this.ciphertextChannelSize);
            sb.append("\nplaintextSize:");
            sb.append(this.plaintextSize);
            sb.append("\nciphertextSegmentSize:");
            sb.append(this.ciphertextSegmentSize);
            sb.append("\nnumberOfSegments:");
            sb.append(this.numberOfSegments);
            sb.append("\nheaderRead:");
            sb.append(this.headerRead);
            sb.append("\nplaintextPosition:");
            sb.append(this.plaintextPosition);
            sb.append("\nHeader position:");
            sb.append(this.header.position());
            sb.append(" limit:");
            sb.append(this.header.position());
            sb.append("\ncurrentSegmentNr:");
            sb.append(this.currentSegmentNr);
            sb.append("\nciphertextSgement position:");
            sb.append(this.ciphertextSegment.position());
            sb.append(" limit:");
            sb.append(this.ciphertextSegment.limit());
            sb.append("\nisCurrentSegmentDecrypted:");
            sb.append(this.isCurrentSegmentDecrypted);
            sb.append("\nplaintextSegment position:");
            sb.append(this.plaintextSegment.position());
            sb.append(" limit:");
            sb.append(this.plaintextSegment.limit());
            obj = sb.toString();
        }
        return obj;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long position() {
        long j;
        synchronized (this) {
            j = this.plaintextPosition;
        }
        return j;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel position(long j) {
        synchronized (this) {
            this.plaintextPosition = j;
        }
        return this;
    }

    private boolean tryReadHeader() throws java.io.IOException {
        this.ciphertextChannel.position(this.header.position() + this.firstSegmentOffset);
        this.ciphertextChannel.read(this.header);
        if (this.header.remaining() > 0) {
            return false;
        }
        this.header.flip();
        try {
            this.decrypter.init(this.header, this.aad);
            this.headerRead = true;
            return true;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.io.IOException(e);
        }
    }

    private int getSegmentNr(long j) {
        return (int) ((j + this.ciphertextOffset) / this.plaintextSegmentSize);
    }

    private boolean tryLoadSegment(int i) throws java.io.IOException {
        int i2;
        if (i < 0 || i >= (i2 = this.numberOfSegments)) {
            throw new java.io.IOException("Invalid position");
        }
        boolean z = i == i2 - 1;
        if (i == this.currentSegmentNr) {
            if (this.isCurrentSegmentDecrypted) {
                return true;
            }
        } else {
            int i3 = this.ciphertextSegmentSize;
            long j = i * i3;
            if (z) {
                i3 = this.lastCiphertextSegmentSize;
            }
            if (i == 0) {
                int i4 = this.ciphertextOffset;
                i3 -= i4;
                j = i4;
            }
            this.ciphertextChannel.position(j);
            this.ciphertextSegment.clear();
            this.ciphertextSegment.limit(i3);
            this.currentSegmentNr = i;
            this.isCurrentSegmentDecrypted = false;
        }
        if (this.ciphertextSegment.remaining() > 0) {
            this.ciphertextChannel.read(this.ciphertextSegment);
        }
        if (this.ciphertextSegment.remaining() > 0) {
            return false;
        }
        this.ciphertextSegment.flip();
        this.plaintextSegment.clear();
        try {
            this.decrypter.decryptSegment(this.ciphertextSegment, i, z, this.plaintextSegment);
            this.plaintextSegment.flip();
            this.isCurrentSegmentDecrypted = true;
            return true;
        } catch (java.security.GeneralSecurityException e) {
            this.currentSegmentNr = -1;
            throw new java.io.IOException("Failed to decrypt", e);
        }
    }

    private boolean reachedEnd() {
        return this.plaintextPosition == this.plaintextSize && this.isCurrentSegmentDecrypted && this.currentSegmentNr == this.numberOfSegments - 1 && this.plaintextSegment.remaining() == 0;
    }

    public int read(java.nio.ByteBuffer byteBuffer, long j) throws java.io.IOException {
        int read;
        synchronized (this) {
            long position = position();
            try {
                position(j);
                read = read(byteBuffer);
            } finally {
                position(position);
            }
        }
        return read;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        long j;
        synchronized (this) {
            if (!this.isopen) {
                throw new java.nio.channels.ClosedChannelException();
            }
            if (!this.headerRead && !tryReadHeader()) {
                return 0;
            }
            int position = byteBuffer.position();
            while (byteBuffer.remaining() > 0) {
                long j2 = this.plaintextPosition;
                if (j2 < this.plaintextSize) {
                    int segmentNr = getSegmentNr(j2);
                    if (segmentNr == 0) {
                        j = this.plaintextPosition;
                    } else {
                        j = (this.plaintextPosition + this.ciphertextOffset) % this.plaintextSegmentSize;
                    }
                    int i = (int) j;
                    if (!tryLoadSegment(segmentNr)) {
                        break;
                    }
                    this.plaintextSegment.position(i);
                    if (this.plaintextSegment.remaining() <= byteBuffer.remaining()) {
                        this.plaintextPosition += this.plaintextSegment.remaining();
                        byteBuffer.put(this.plaintextSegment);
                    } else {
                        int remaining = byteBuffer.remaining();
                        java.nio.ByteBuffer duplicate = this.plaintextSegment.duplicate();
                        duplicate.limit(duplicate.position() + remaining);
                        byteBuffer.put(duplicate);
                        this.plaintextPosition += remaining;
                        java.nio.ByteBuffer byteBuffer2 = this.plaintextSegment;
                        byteBuffer2.position(byteBuffer2.position() + remaining);
                    }
                } else {
                    break;
                }
            }
            int position2 = byteBuffer.position() - position;
            if (position2 == 0 && reachedEnd()) {
                return -1;
            }
            return position2;
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() {
        return this.plaintextSize;
    }

    public long verifiedSize() throws java.io.IOException {
        long j;
        synchronized (this) {
            if (tryLoadSegment(this.numberOfSegments - 1)) {
                j = this.plaintextSize;
            } else {
                throw new java.io.IOException("could not verify the size");
            }
        }
        return j;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public java.nio.channels.SeekableByteChannel truncate(long j) throws java.nio.channels.NonWritableChannelException {
        throw new java.nio.channels.NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) throws java.nio.channels.NonWritableChannelException {
        throw new java.nio.channels.NonWritableChannelException();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this) {
            this.ciphertextChannel.close();
            this.isopen = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        boolean z;
        synchronized (this) {
            z = this.isopen;
        }
        return z;
    }
}

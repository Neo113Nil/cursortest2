package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
final class SeekableByteChannelDecrypter implements java.nio.channels.SeekableByteChannel {
    byte[] associatedData;
    long cachedPosition;
    java.nio.channels.SeekableByteChannel ciphertextChannel;
    long startingPosition;
    java.nio.channels.SeekableByteChannel attemptingChannel = null;
    java.nio.channels.SeekableByteChannel matchingChannel = null;
    java.util.Deque<com.google.crypto.tink.StreamingAead> remainingPrimitives = new java.util.ArrayDeque();

    public SeekableByteChannelDecrypter(java.util.List<com.google.crypto.tink.StreamingAead> list, java.nio.channels.SeekableByteChannel seekableByteChannel, byte[] bArr) throws java.io.IOException {
        java.util.Iterator<com.google.crypto.tink.StreamingAead> it = list.iterator();
        while (it.hasNext()) {
            this.remainingPrimitives.add(it.next());
        }
        this.ciphertextChannel = seekableByteChannel;
        this.cachedPosition = -1L;
        this.startingPosition = seekableByteChannel.position();
        this.associatedData = (byte[]) bArr.clone();
    }

    private java.nio.channels.SeekableByteChannel nextAttemptingChannel() throws java.io.IOException {
        java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel;
        synchronized (this) {
            while (!this.remainingPrimitives.isEmpty()) {
                this.ciphertextChannel.position(this.startingPosition);
                try {
                    newSeekableDecryptingChannel = this.remainingPrimitives.removeFirst().newSeekableDecryptingChannel(this.ciphertextChannel, this.associatedData);
                    long j = this.cachedPosition;
                    if (j >= 0) {
                        newSeekableDecryptingChannel.position(j);
                    }
                } catch (java.security.GeneralSecurityException unused) {
                }
            }
            throw new java.io.IOException("No matching key found for the ciphertext in the stream.");
        }
        return newSeekableDecryptingChannel;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        synchronized (this) {
            if (byteBuffer.remaining() == 0) {
                return 0;
            }
            java.nio.channels.SeekableByteChannel seekableByteChannel = this.matchingChannel;
            if (seekableByteChannel != null) {
                return seekableByteChannel.read(byteBuffer);
            }
            if (this.attemptingChannel == null) {
                this.attemptingChannel = nextAttemptingChannel();
            }
            while (true) {
                try {
                    int read = this.attemptingChannel.read(byteBuffer);
                    if (read == 0) {
                        return 0;
                    }
                    this.matchingChannel = this.attemptingChannel;
                    this.attemptingChannel = null;
                    return read;
                } catch (java.io.IOException unused) {
                    this.attemptingChannel = nextAttemptingChannel();
                }
            }
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final java.nio.channels.SeekableByteChannel position(long j) throws java.io.IOException {
        synchronized (this) {
            java.nio.channels.SeekableByteChannel seekableByteChannel = this.matchingChannel;
            if (seekableByteChannel != null) {
                seekableByteChannel.position(j);
            } else {
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException("Position must be non-negative");
                }
                this.cachedPosition = j;
                java.nio.channels.SeekableByteChannel seekableByteChannel2 = this.attemptingChannel;
                if (seekableByteChannel2 != null) {
                    seekableByteChannel2.position(j);
                }
            }
        }
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long position() throws java.io.IOException {
        synchronized (this) {
            java.nio.channels.SeekableByteChannel seekableByteChannel = this.matchingChannel;
            if (seekableByteChannel != null) {
                return seekableByteChannel.position();
            }
            return this.cachedPosition;
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long size() throws java.io.IOException {
        long size;
        synchronized (this) {
            java.nio.channels.SeekableByteChannel seekableByteChannel = this.matchingChannel;
            if (seekableByteChannel != null) {
                size = seekableByteChannel.size();
            } else {
                throw new java.io.IOException("Cannot determine size before first read()-call.");
            }
        }
        return size;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final java.nio.channels.SeekableByteChannel truncate(long j) throws java.io.IOException {
        throw new java.nio.channels.NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        throw new java.nio.channels.NonWritableChannelException();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.ciphertextChannel.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        boolean isOpen;
        synchronized (this) {
            isOpen = this.ciphertextChannel.isOpen();
        }
        return isOpen;
    }
}

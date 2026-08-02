package org.apache.commons.imaging.common.bytesource;

/* loaded from: classes17.dex */
public class ByteSourceInputStream extends org.apache.commons.imaging.common.bytesource.ByteSource {
    private static final int BLOCK_SIZE = 1024;
    private org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock cacheHead;
    private final java.io.InputStream is;
    private byte[] readBuffer;
    private long streamLength;

    public ByteSourceInputStream(java.io.InputStream inputStream, java.lang.String str) {
        super(str);
        this.streamLength = -1L;
        this.is = new java.io.BufferedInputStream(inputStream);
    }

    class CacheBlock {
        public final byte[] bytes;
        private org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock next;
        private boolean triedNext;

        CacheBlock(byte[] bArr) {
            this.bytes = bArr;
        }

        public org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock getNext() throws java.io.IOException {
            org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock cacheBlock = this.next;
            if (cacheBlock != null) {
                return cacheBlock;
            }
            if (this.triedNext) {
                return null;
            }
            this.triedNext = true;
            org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock readBlock = org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.this.readBlock();
            this.next = readBlock;
            return readBlock;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock readBlock() throws java.io.IOException {
        if (this.readBuffer == null) {
            this.readBuffer = new byte[1024];
        }
        int read = this.is.read(this.readBuffer);
        if (read <= 0) {
            return null;
        }
        if (read < 1024) {
            byte[] bArr = new byte[read];
            java.lang.System.arraycopy(this.readBuffer, 0, bArr, 0, read);
            return new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock(bArr);
        }
        byte[] bArr2 = this.readBuffer;
        this.readBuffer = null;
        return new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock getFirstBlock() throws java.io.IOException {
        if (this.cacheHead == null) {
            this.cacheHead = readBlock();
        }
        return this.cacheHead;
    }

    class CacheReadingInputStream extends java.io.InputStream {
        private org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock block;
        private int blockIndex;
        private boolean readFirst;

        private CacheReadingInputStream() {
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            if (this.block == null) {
                if (this.readFirst) {
                    return -1;
                }
                this.block = org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.this.getFirstBlock();
                this.readFirst = true;
            }
            org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock cacheBlock = this.block;
            if (cacheBlock != null && this.blockIndex >= cacheBlock.bytes.length) {
                this.block = this.block.getNext();
                this.blockIndex = 0;
            }
            org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock cacheBlock2 = this.block;
            if (cacheBlock2 == null || this.blockIndex >= cacheBlock2.bytes.length) {
                return -1;
            }
            byte[] bArr = this.block.bytes;
            int i = this.blockIndex;
            this.blockIndex = i + 1;
            return bArr[i] & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            int i3;
            java.util.Objects.requireNonNull(bArr, "array");
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.block == null) {
                if (this.readFirst) {
                    return -1;
                }
                this.block = org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.this.getFirstBlock();
                this.readFirst = true;
            }
            org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock cacheBlock = this.block;
            if (cacheBlock != null && this.blockIndex >= cacheBlock.bytes.length) {
                this.block = this.block.getNext();
                this.blockIndex = 0;
            }
            org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock cacheBlock2 = this.block;
            if (cacheBlock2 == null || this.blockIndex >= cacheBlock2.bytes.length) {
                return -1;
            }
            int min = java.lang.Math.min(i2, this.block.bytes.length - this.blockIndex);
            java.lang.System.arraycopy(this.block.bytes, this.blockIndex, bArr, i, min);
            this.blockIndex += min;
            return min;
        }

        @Override // java.io.InputStream
        public long skip(long j) throws java.io.IOException {
            if (j <= 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                if (this.block == null) {
                    if (this.readFirst) {
                        return -1L;
                    }
                    this.block = org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.this.getFirstBlock();
                    this.readFirst = true;
                }
                org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock cacheBlock = this.block;
                if (cacheBlock != null && this.blockIndex >= cacheBlock.bytes.length) {
                    this.block = this.block.getNext();
                    this.blockIndex = 0;
                }
                org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock cacheBlock2 = this.block;
                if (cacheBlock2 == null || this.blockIndex >= cacheBlock2.bytes.length) {
                    break;
                }
                int min = java.lang.Math.min((int) java.lang.Math.min(okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, j2), this.block.bytes.length - this.blockIndex);
                this.blockIndex += min;
                j2 -= min;
            }
            return j - j2;
        }
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public java.io.InputStream getInputStream() throws java.io.IOException {
        return new org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheReadingInputStream();
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getBlock(long j, int i) throws java.io.IOException {
        if (j >= 0 && i >= 0) {
            long j2 = i + j;
            if (j2 >= 0 && j2 <= getLength()) {
                java.io.InputStream inputStream = getInputStream();
                org.apache.commons.imaging.common.BinaryFunctions.skipBytes(inputStream, j);
                byte[] bArr = new byte[i];
                int i2 = 0;
                do {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read <= 0) {
                        throw new java.io.IOException("Could not read block.");
                    }
                    i2 += read;
                } while (i2 < i);
                return bArr;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not read block (block start: ");
        sb.append(j);
        sb.append(", block length: ");
        sb.append(i);
        sb.append(", data length: ");
        sb.append(this.streamLength);
        sb.append(").");
        throw new java.io.IOException(sb.toString());
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public long getLength() throws java.io.IOException {
        long j = this.streamLength;
        if (j >= 0) {
            return j;
        }
        java.io.InputStream inputStream = getInputStream();
        long j2 = 0;
        while (true) {
            long skip = inputStream.skip(okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            if (skip <= 0) {
                this.streamLength = j2;
                return j2;
            }
            j2 += skip;
        }
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public byte[] getAll() throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        for (org.apache.commons.imaging.common.bytesource.ByteSourceInputStream.CacheBlock firstBlock = getFirstBlock(); firstBlock != null; firstBlock = firstBlock.getNext()) {
            byteArrayOutputStream.write(firstBlock.bytes);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.apache.commons.imaging.common.bytesource.ByteSource
    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Inputstream: '");
        sb.append(getFileName());
        sb.append("'");
        return sb.toString();
    }
}

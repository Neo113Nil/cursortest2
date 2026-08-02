package com.google.protobuf;

/* loaded from: classes9.dex */
class IterableByteBufferInputStream extends java.io.InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private java.nio.ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private java.util.Iterator<java.nio.ByteBuffer> iterator;

    IterableByteBufferInputStream(java.lang.Iterable<java.nio.ByteBuffer> iterable) {
        this.iterator = iterable.iterator();
        for (java.nio.ByteBuffer byteBuffer : iterable) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.currentByteBuffer = com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0L;
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (!this.iterator.hasNext()) {
            return false;
        }
        java.nio.ByteBuffer next = this.iterator.next();
        this.currentByteBuffer = next;
        this.currentByteBufferPos = next.position();
        if (this.currentByteBuffer.hasArray()) {
            this.hasArray = true;
            this.currentArray = this.currentByteBuffer.array();
            this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
        } else {
            this.hasArray = false;
            this.currentAddress = com.google.protobuf.UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentArray = null;
        }
        return true;
    }

    private void updateCurrentByteBufferPos(int i) {
        int i2 = this.currentByteBufferPos + i;
        this.currentByteBufferPos = i2;
        if (i2 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        byte b;
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            b = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset];
            updateCurrentByteBufferPos(1);
        } else {
            b = com.google.protobuf.UnsafeUtil.getByte(this.currentByteBufferPos + this.currentAddress);
            updateCurrentByteBufferPos(1);
        }
        return b & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int limit = this.currentByteBuffer.limit();
        int i3 = this.currentByteBufferPos;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.hasArray) {
            java.lang.System.arraycopy(this.currentArray, i3 + this.currentArrayOffset, bArr, i, i2);
            updateCurrentByteBufferPos(i2);
            return i2;
        }
        int position = this.currentByteBuffer.position();
        com.google.protobuf.Java8Compatibility.position(this.currentByteBuffer, this.currentByteBufferPos);
        this.currentByteBuffer.get(bArr, i, i2);
        com.google.protobuf.Java8Compatibility.position(this.currentByteBuffer, position);
        updateCurrentByteBufferPos(i2);
        return i2;
    }
}

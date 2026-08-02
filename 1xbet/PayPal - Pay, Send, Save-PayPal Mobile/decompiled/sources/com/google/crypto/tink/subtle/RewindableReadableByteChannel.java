package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class RewindableReadableByteChannel implements java.nio.channels.ReadableByteChannel {
    final java.nio.channels.ReadableByteChannel baseChannel;
    java.nio.ByteBuffer buffer = null;
    boolean canRewind = true;
    boolean directRead = false;

    public RewindableReadableByteChannel(java.nio.channels.ReadableByteChannel readableByteChannel) {
        this.baseChannel = readableByteChannel;
    }

    public final void disableRewinding() {
        synchronized (this) {
            this.canRewind = false;
        }
    }

    public final void rewind() throws java.io.IOException {
        synchronized (this) {
            if (!this.canRewind) {
                throw new java.io.IOException("Cannot rewind anymore.");
            }
            java.nio.ByteBuffer byteBuffer = this.buffer;
            if (byteBuffer != null) {
                byteBuffer.position(0);
            }
        }
    }

    private void setBufferLimit(int i) {
        synchronized (this) {
            if (this.buffer.capacity() < i) {
                int position = this.buffer.position();
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(java.lang.Math.max(this.buffer.capacity() * 2, i));
                this.buffer.rewind();
                allocate.put(this.buffer);
                allocate.position(position);
                this.buffer = allocate;
            }
            this.buffer.limit(i);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        synchronized (this) {
            if (this.directRead) {
                return this.baseChannel.read(byteBuffer);
            }
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                return 0;
            }
            java.nio.ByteBuffer byteBuffer2 = this.buffer;
            if (byteBuffer2 == null) {
                if (!this.canRewind) {
                    this.directRead = true;
                    return this.baseChannel.read(byteBuffer);
                }
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(remaining);
                this.buffer = allocate;
                int read = this.baseChannel.read(allocate);
                this.buffer.flip();
                if (read > 0) {
                    byteBuffer.put(this.buffer);
                }
                return read;
            }
            if (byteBuffer2.remaining() >= remaining) {
                int limit = this.buffer.limit();
                java.nio.ByteBuffer byteBuffer3 = this.buffer;
                byteBuffer3.limit(byteBuffer3.position() + remaining);
                byteBuffer.put(this.buffer);
                this.buffer.limit(limit);
                if (!this.canRewind && !this.buffer.hasRemaining()) {
                    this.buffer = null;
                    this.directRead = true;
                }
                return remaining;
            }
            int remaining2 = this.buffer.remaining();
            int position = this.buffer.position();
            int limit2 = this.buffer.limit();
            setBufferLimit((remaining - remaining2) + limit2);
            this.buffer.position(limit2);
            int read2 = this.baseChannel.read(this.buffer);
            this.buffer.flip();
            this.buffer.position(position);
            byteBuffer.put(this.buffer);
            if (remaining2 == 0 && read2 < 0) {
                return -1;
            }
            int position2 = this.buffer.position();
            if (!this.canRewind && !this.buffer.hasRemaining()) {
                this.buffer = null;
                this.directRead = true;
            }
            return position2 - position;
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.canRewind = false;
            this.directRead = true;
            this.baseChannel.close();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        boolean isOpen;
        synchronized (this) {
            isOpen = this.baseChannel.isOpen();
        }
        return isOpen;
    }
}

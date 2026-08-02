package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
final class ReadableByteChannelDecrypter implements java.nio.channels.ReadableByteChannel {
    byte[] associatedData;
    com.google.crypto.tink.subtle.RewindableReadableByteChannel ciphertextChannel;
    java.nio.channels.ReadableByteChannel attemptingChannel = null;
    java.nio.channels.ReadableByteChannel matchingChannel = null;
    java.util.Deque<com.google.crypto.tink.StreamingAead> remainingPrimitives = new java.util.ArrayDeque();

    public ReadableByteChannelDecrypter(java.util.List<com.google.crypto.tink.StreamingAead> list, java.nio.channels.ReadableByteChannel readableByteChannel, byte[] bArr) {
        java.util.Iterator<com.google.crypto.tink.StreamingAead> it = list.iterator();
        while (it.hasNext()) {
            this.remainingPrimitives.add(it.next());
        }
        this.ciphertextChannel = new com.google.crypto.tink.subtle.RewindableReadableByteChannel(readableByteChannel);
        this.associatedData = (byte[]) bArr.clone();
    }

    private java.nio.channels.ReadableByteChannel nextAttemptingChannel() throws java.io.IOException {
        java.nio.channels.ReadableByteChannel newDecryptingChannel;
        synchronized (this) {
            while (!this.remainingPrimitives.isEmpty()) {
                try {
                    newDecryptingChannel = this.remainingPrimitives.removeFirst().newDecryptingChannel(this.ciphertextChannel, this.associatedData);
                } catch (java.security.GeneralSecurityException unused) {
                    this.ciphertextChannel.rewind();
                }
            }
            throw new java.io.IOException("No matching key found for the ciphertext in the stream.");
        }
        return newDecryptingChannel;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        synchronized (this) {
            if (byteBuffer.remaining() == 0) {
                return 0;
            }
            java.nio.channels.ReadableByteChannel readableByteChannel = this.matchingChannel;
            if (readableByteChannel != null) {
                return readableByteChannel.read(byteBuffer);
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
                    this.ciphertextChannel.disableRewinding();
                    return read;
                } catch (java.io.IOException unused) {
                    this.ciphertextChannel.rewind();
                    this.attemptingChannel = nextAttemptingChannel();
                }
            }
        }
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

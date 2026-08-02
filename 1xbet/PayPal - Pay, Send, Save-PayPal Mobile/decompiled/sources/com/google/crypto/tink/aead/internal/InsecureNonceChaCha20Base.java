package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
abstract class InsecureNonceChaCha20Base {
    private final int initialCounter;
    int[] key;

    abstract int[] createInitialState(int[] iArr, int i);

    abstract int nonceSizeInBytes();

    public InsecureNonceChaCha20Base(byte[] bArr, int i) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("The key length in bytes must be 32.");
        }
        this.key = com.google.crypto.tink.aead.internal.ChaCha20Util.toIntArray(bArr);
        this.initialCounter = i;
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr2.length);
        encrypt(allocate, bArr, bArr2);
        return allocate.array();
    }

    public void encrypt(java.nio.ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new java.lang.IllegalArgumentException("Given ByteBuffer output is too small");
        }
        process(bArr, byteBuffer, java.nio.ByteBuffer.wrap(bArr2));
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return decrypt(bArr, java.nio.ByteBuffer.wrap(bArr2));
    }

    public byte[] decrypt(byte[] bArr, java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
        process(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    private void process(byte[] bArr, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) throws java.security.GeneralSecurityException {
        if (bArr.length != nonceSizeInBytes()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The nonce length (in bytes) must be ");
            sb.append(nonceSizeInBytes());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            java.nio.ByteBuffer chacha20Block = chacha20Block(bArr, this.initialCounter + i2);
            if (i2 == i) {
                com.google.crypto.tink.subtle.Bytes.xor(byteBuffer, byteBuffer2, chacha20Block, remaining % 64);
            } else {
                com.google.crypto.tink.subtle.Bytes.xor(byteBuffer, byteBuffer2, chacha20Block, 64);
            }
        }
    }

    java.nio.ByteBuffer chacha20Block(byte[] bArr, int i) {
        int[] createInitialState = createInitialState(com.google.crypto.tink.aead.internal.ChaCha20Util.toIntArray(bArr), i);
        int[] iArr = (int[]) createInitialState.clone();
        com.google.crypto.tink.aead.internal.ChaCha20Util.shuffleState(iArr);
        for (int i2 = 0; i2 < createInitialState.length; i2++) {
            createInitialState[i2] = createInitialState[i2] + iArr[i2];
        }
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(64).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(createInitialState, 0, 16);
        return order;
    }
}

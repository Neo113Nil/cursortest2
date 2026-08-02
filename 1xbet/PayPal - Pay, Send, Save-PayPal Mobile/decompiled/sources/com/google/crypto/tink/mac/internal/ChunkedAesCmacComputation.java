package com.google.crypto.tink.mac.internal;

/* loaded from: classes9.dex */
final class ChunkedAesCmacComputation implements com.google.crypto.tink.mac.ChunkedMacComputation {
    private static final byte[] formatVersion = {0};
    private final javax.crypto.Cipher aes;
    private final byte[] dataBlock;
    private boolean finalized = false;
    private final com.google.crypto.tink.mac.AesCmacKey key;
    private final java.nio.ByteBuffer localStash;
    private final byte[] subKey1;
    private final byte[] subKey2;
    private final byte[] x;
    private final byte[] y;

    ChunkedAesCmacComputation(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        this.key = aesCmacKey;
        javax.crypto.Cipher engineFactory = com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        this.aes = engineFactory;
        engineFactory.init(1, new javax.crypto.spec.SecretKeySpec(aesCmacKey.getAesKey().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), org.jose4j.keys.AesKey.ALGORITHM));
        byte[] dbl = com.google.crypto.tink.mac.internal.AesUtil.dbl(engineFactory.doFinal(new byte[16]));
        this.subKey1 = dbl;
        this.subKey2 = com.google.crypto.tink.mac.internal.AesUtil.dbl(dbl);
        this.localStash = java.nio.ByteBuffer.allocate(16);
        this.x = new byte[16];
        this.y = new byte[16];
        this.dataBlock = new byte[16];
    }

    private void munch(java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
        byteBuffer.get(this.dataBlock);
        for (int i = 0; i < 16; i++) {
            this.y[i] = (byte) (this.x[i] ^ this.dataBlock[i]);
        }
        this.aes.doFinal(this.y, 0, 16, this.x);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public final void update(java.nio.ByteBuffer byteBuffer) throws java.security.GeneralSecurityException {
        if (this.finalized) {
            throw new java.lang.IllegalStateException("Can not update after computing the MAC tag. Please create a new object.");
        }
        if (this.localStash.remaining() != 16) {
            int min = java.lang.Math.min(this.localStash.remaining(), byteBuffer.remaining());
            for (int i = 0; i < min; i++) {
                this.localStash.put(byteBuffer.get());
            }
        }
        if (this.localStash.remaining() == 0 && byteBuffer.remaining() > 0) {
            this.localStash.rewind();
            munch(this.localStash);
            this.localStash.rewind();
        }
        while (byteBuffer.remaining() > 16) {
            munch(byteBuffer);
        }
        this.localStash.put(byteBuffer);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public final byte[] computeMac() throws java.security.GeneralSecurityException {
        byte[] xor;
        if (this.finalized) {
            throw new java.lang.IllegalStateException("Can not compute after computing the MAC tag. Please create a new object.");
        }
        if (this.key.getParameters().getVariant() == com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY) {
            update(java.nio.ByteBuffer.wrap(formatVersion));
        }
        this.finalized = true;
        if (this.localStash.remaining() > 0) {
            xor = com.google.crypto.tink.subtle.Bytes.xor(com.google.crypto.tink.mac.internal.AesUtil.cmacPad(java.util.Arrays.copyOf(this.localStash.array(), this.localStash.position())), this.subKey2);
        } else {
            xor = com.google.crypto.tink.subtle.Bytes.xor(this.localStash.array(), 0, this.subKey1, 0, 16);
        }
        return com.google.crypto.tink.subtle.Bytes.concat(this.key.getOutputPrefix().toByteArray(), java.util.Arrays.copyOf(this.aes.doFinal(com.google.crypto.tink.subtle.Bytes.xor(xor, this.x)), this.key.getParameters().getCryptographicTagSizeBytes()));
    }
}

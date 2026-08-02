package com.google.crypto.tink.mac.internal;

/* loaded from: classes9.dex */
final class ChunkedHmacComputation implements com.google.crypto.tink.mac.ChunkedMacComputation {
    private static final byte[] formatVersion = {0};
    private boolean finalized = false;
    private final com.google.crypto.tink.mac.HmacKey key;
    private final javax.crypto.Mac mac;

    ChunkedHmacComputation(com.google.crypto.tink.mac.HmacKey hmacKey) throws java.security.GeneralSecurityException {
        javax.crypto.Mac engineFactory = com.google.crypto.tink.subtle.EngineFactory.MAC.getInstance(composeAlgorithmName(hmacKey));
        this.mac = engineFactory;
        engineFactory.init(new javax.crypto.spec.SecretKeySpec(hmacKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), org.jose4j.keys.HmacKey.ALGORITHM));
        this.key = hmacKey;
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public final void update(java.nio.ByteBuffer byteBuffer) {
        if (this.finalized) {
            throw new java.lang.IllegalStateException("Cannot update after computing the MAC tag. Please create a new object.");
        }
        this.mac.update(byteBuffer);
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public final byte[] computeMac() throws java.security.GeneralSecurityException {
        if (this.finalized) {
            throw new java.lang.IllegalStateException("Cannot compute after already computing the MAC tag. Please create a new object.");
        }
        if (this.key.getParameters().getVariant() == com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY) {
            update(java.nio.ByteBuffer.wrap(formatVersion));
        }
        this.finalized = true;
        return com.google.crypto.tink.subtle.Bytes.concat(this.key.getOutputPrefix().toByteArray(), java.util.Arrays.copyOf(this.mac.doFinal(), this.key.getParameters().getCryptographicTagSizeBytes()));
    }

    private static java.lang.String composeAlgorithmName(com.google.crypto.tink.mac.HmacKey hmacKey) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(org.jose4j.keys.HmacKey.ALGORITHM);
        sb.append(hmacKey.getParameters().getHashType());
        return sb.toString();
    }
}

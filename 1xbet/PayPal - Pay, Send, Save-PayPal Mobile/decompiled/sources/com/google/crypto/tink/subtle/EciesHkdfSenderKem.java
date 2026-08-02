package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class EciesHkdfSenderKem {
    private final java.security.interfaces.ECPublicKey recipientPublicKey;

    public static final class KemKey {
        private final com.google.crypto.tink.util.Bytes kemBytes;
        private final com.google.crypto.tink.util.Bytes symmetricKey;

        public KemKey(byte[] bArr, byte[] bArr2) {
            if (bArr == null) {
                throw new java.lang.NullPointerException("KemBytes must be non-null");
            }
            if (bArr2 == null) {
                throw new java.lang.NullPointerException("symmetricKey must be non-null");
            }
            this.kemBytes = com.google.crypto.tink.util.Bytes.copyFrom(bArr);
            this.symmetricKey = com.google.crypto.tink.util.Bytes.copyFrom(bArr2);
        }

        public final byte[] getKemBytes() {
            return this.kemBytes.toByteArray();
        }

        public final byte[] getSymmetricKey() {
            return this.symmetricKey.toByteArray();
        }
    }

    public EciesHkdfSenderKem(java.security.interfaces.ECPublicKey eCPublicKey) {
        this.recipientPublicKey = eCPublicKey;
    }

    public final com.google.crypto.tink.subtle.EciesHkdfSenderKem.KemKey generateKey(java.lang.String str, byte[] bArr, byte[] bArr2, int i, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType) throws java.security.GeneralSecurityException {
        java.security.KeyPair generateKeyPair = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(this.recipientPublicKey.getParams());
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) generateKeyPair.getPublic();
        byte[] computeSharedSecret = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret((java.security.interfaces.ECPrivateKey) generateKeyPair.getPrivate(), this.recipientPublicKey);
        byte[] pointEncode = com.google.crypto.tink.subtle.EllipticCurves.pointEncode(eCPublicKey.getParams().getCurve(), pointFormatType, eCPublicKey.getW());
        return new com.google.crypto.tink.subtle.EciesHkdfSenderKem.KemKey(pointEncode, com.google.crypto.tink.subtle.Hkdf.computeEciesHkdfSymmetricKey(pointEncode, computeSharedSecret, str, bArr, bArr2, i));
    }
}

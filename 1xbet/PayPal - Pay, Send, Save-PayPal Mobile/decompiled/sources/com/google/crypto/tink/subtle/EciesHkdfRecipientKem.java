package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class EciesHkdfRecipientKem {
    private java.security.interfaces.ECPrivateKey recipientPrivateKey;

    public EciesHkdfRecipientKem(java.security.interfaces.ECPrivateKey eCPrivateKey) {
        this.recipientPrivateKey = eCPrivateKey;
    }

    public final byte[] generateKey(byte[] bArr, java.lang.String str, byte[] bArr2, byte[] bArr3, int i, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.Hkdf.computeEciesHkdfSymmetricKey(bArr, com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(this.recipientPrivateKey, com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(this.recipientPrivateKey.getParams(), pointFormatType, bArr)), str, bArr2, bArr3, i);
    }
}

package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class EciesAeadHkdfHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private final com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem dem;
    private final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType ecPointFormat;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final byte[] outputPrefix;
    private final com.google.crypto.tink.subtle.EciesHkdfRecipientKem recipientKem;
    private final java.security.interfaces.ECPrivateKey recipientPrivateKey;

    private EciesAeadHkdfHybridDecrypt(java.security.interfaces.ECPrivateKey eCPrivateKey, byte[] bArr, java.lang.String str, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem dem, byte[] bArr2) {
        this.recipientPrivateKey = eCPrivateKey;
        this.recipientKem = new com.google.crypto.tink.subtle.EciesHkdfRecipientKem(eCPrivateKey);
        this.hkdfSalt = bArr;
        this.hkdfHmacAlgo = str;
        this.ecPointFormat = pointFormatType;
        this.dem = dem;
        this.outputPrefix = bArr2;
    }

    public static com.google.crypto.tink.HybridDecrypt create(com.google.crypto.tink.hybrid.EciesPrivateKey eciesPrivateKey) throws java.security.GeneralSecurityException {
        java.security.interfaces.ECPrivateKey ecPrivateKey = com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt.CURVE_TYPE_CONVERTER.toProtoEnum(eciesPrivateKey.getParameters().getCurveType()), com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytes(eciesPrivateKey.getNistPrivateKeyValue().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get())));
        byte[] bArr = new byte[0];
        if (eciesPrivateKey.getParameters().getSalt() != null) {
            bArr = eciesPrivateKey.getParameters().getSalt().toByteArray();
        }
        return new com.google.crypto.tink.subtle.EciesAeadHkdfHybridDecrypt(ecPrivateKey, bArr, com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt.toHmacAlgo(eciesPrivateKey.getParameters().getHashType()), com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt.POINT_FORMAT_TYPE_CONVERTER.toProtoEnum(eciesPrivateKey.getParameters().getNistCurvePointFormat()), com.google.crypto.tink.hybrid.internal.EciesDemHelper.getDem(eciesPrivateKey.getParameters()), eciesPrivateKey.getOutputPrefix().toByteArray());
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.internal.Util.isPrefix(this.outputPrefix, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        int length = this.outputPrefix.length;
        int encodingSizeInBytes = com.google.crypto.tink.subtle.EllipticCurves.encodingSizeInBytes(this.recipientPrivateKey.getParams().getCurve(), this.ecPointFormat) + length;
        if (bArr.length < encodingSizeInBytes) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        return this.dem.decrypt(this.recipientKem.generateKey(java.util.Arrays.copyOfRange(bArr, length, encodingSizeInBytes), this.hkdfHmacAlgo, this.hkdfSalt, bArr2, this.dem.getSymmetricKeySizeInBytes(), this.ecPointFormat), bArr, encodingSizeInBytes);
    }
}

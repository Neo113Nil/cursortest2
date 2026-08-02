package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class EciesAeadHkdfHybridEncrypt implements com.google.crypto.tink.HybridEncrypt {
    static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.subtle.EllipticCurves.CurveType, com.google.crypto.tink.hybrid.EciesParameters.CurveType> CURVE_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256, com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).add(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384, com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P384).add(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521, com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P521).build();
    static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.subtle.EllipticCurves.PointFormatType, com.google.crypto.tink.hybrid.EciesParameters.PointFormat> POINT_FORMAT_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).add(com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.COMPRESSED, com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).add(com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, com.google.crypto.tink.hybrid.EciesParameters.PointFormat.LEGACY_UNCOMPRESSED).build();
    private final com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem dem;
    private final com.google.crypto.tink.subtle.EllipticCurves.PointFormatType ecPointFormat;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final byte[] outputPrefix;
    private final com.google.crypto.tink.subtle.EciesHkdfSenderKem senderKem;

    static final java.lang.String toHmacAlgo(com.google.crypto.tink.hybrid.EciesParameters.HashType hashType) throws java.security.GeneralSecurityException {
        if (hashType.equals(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA1)) {
            return "HmacSha1";
        }
        if (hashType.equals(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA224)) {
            return "HmacSha224";
        }
        if (hashType.equals(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256)) {
            return "HmacSha256";
        }
        if (hashType.equals(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA384)) {
            return "HmacSha384";
        }
        if (hashType.equals(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA512)) {
            return "HmacSha512";
        }
        throw new java.security.GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(java.lang.String.valueOf(hashType)));
    }

    private EciesAeadHkdfHybridEncrypt(java.security.interfaces.ECPublicKey eCPublicKey, byte[] bArr, java.lang.String str, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType pointFormatType, com.google.crypto.tink.hybrid.internal.EciesDemHelper.Dem dem, byte[] bArr2) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.EllipticCurves.checkPublicKey(eCPublicKey);
        this.senderKem = new com.google.crypto.tink.subtle.EciesHkdfSenderKem(eCPublicKey);
        this.hkdfSalt = bArr;
        this.hkdfHmacAlgo = str;
        this.ecPointFormat = pointFormatType;
        this.dem = dem;
        this.outputPrefix = bArr2;
    }

    public static com.google.crypto.tink.HybridEncrypt create(com.google.crypto.tink.hybrid.EciesPublicKey eciesPublicKey) throws java.security.GeneralSecurityException {
        java.security.interfaces.ECPublicKey ecPublicKey = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(CURVE_TYPE_CONVERTER.toProtoEnum(eciesPublicKey.getParameters().getCurveType()), eciesPublicKey.getNistCurvePoint().getAffineX().toByteArray(), eciesPublicKey.getNistCurvePoint().getAffineY().toByteArray());
        byte[] bArr = new byte[0];
        if (eciesPublicKey.getParameters().getSalt() != null) {
            bArr = eciesPublicKey.getParameters().getSalt().toByteArray();
        }
        return new com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt(ecPublicKey, bArr, toHmacAlgo(eciesPublicKey.getParameters().getHashType()), POINT_FORMAT_TYPE_CONVERTER.toProtoEnum(eciesPublicKey.getParameters().getNistCurvePointFormat()), com.google.crypto.tink.hybrid.internal.EciesDemHelper.getDem(eciesPublicKey.getParameters()), eciesPublicKey.getOutputPrefix().toByteArray());
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.EciesHkdfSenderKem.KemKey generateKey = this.senderKem.generateKey(this.hkdfHmacAlgo, this.hkdfSalt, bArr2, this.dem.getSymmetricKeySizeInBytes(), this.ecPointFormat);
        return this.dem.encrypt(generateKey.getSymmetricKey(), this.outputPrefix, generateKey.getKemBytes(), bArr);
    }
}

package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
final class NistCurvesHpkeKem implements com.google.crypto.tink.hybrid.internal.HpkeKem {
    private final com.google.crypto.tink.subtle.EllipticCurves.CurveType curve;
    private final com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdf;

    /* renamed from: com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType;

        static {
            int[] iArr = new int[com.google.crypto.tink.subtle.EllipticCurves.CurveType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = iArr;
            try {
                iArr[com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[curveType.ordinal()];
        if (i == 1) {
            return new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem(new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha256"), com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256);
        }
        if (i == 2) {
            return new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem(new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha384"), com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384);
        }
        if (i == 3) {
            return new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem(new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha512"), com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521);
        }
        throw new java.security.GeneralSecurityException("invalid curve type: ".concat(java.lang.String.valueOf(curveType)));
    }

    private NistCurvesHpkeKem(com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdfHpkeKdf, com.google.crypto.tink.subtle.EllipticCurves.CurveType curveType) {
        this.hkdf = hkdfHpkeKdf;
        this.curve = curveType;
    }

    final byte[] deriveKemSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return extractAndExpand(bArr, com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr3));
    }

    final byte[] deriveKemSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
        return extractAndExpand(bArr, com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr3, bArr4));
    }

    private byte[] extractAndExpand(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] kemSuiteId = com.google.crypto.tink.hybrid.internal.HpkeUtil.kemSuiteId(getKemId());
        com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf hkdfHpkeKdf = this.hkdf;
        return hkdfHpkeKdf.extractAndExpand(null, bArr, "eae_prk", bArr2, "shared_secret", kemSuiteId, hkdfHpkeKdf.getMacLength());
    }

    final com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] bArr, java.security.KeyPair keyPair) throws java.security.GeneralSecurityException {
        byte[] computeSharedSecret = com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret((java.security.interfaces.ECPrivateKey) keyPair.getPrivate(), com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(this.curve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, bArr));
        byte[] pointEncode = com.google.crypto.tink.subtle.EllipticCurves.pointEncode(this.curve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, ((java.security.interfaces.ECPublicKey) keyPair.getPublic()).getW());
        return new com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput(deriveKemSharedSecret(computeSharedSecret, pointEncode, bArr), pointEncode);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput encapsulate(byte[] bArr) throws java.security.GeneralSecurityException {
        return encapsulate(bArr, com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(this.curve));
    }

    final com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput authEncapsulate(byte[] bArr, java.security.KeyPair keyPair, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException {
        java.security.interfaces.ECPublicKey ecPublicKey = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(this.curve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, bArr);
        byte[] concat = com.google.crypto.tink.subtle.Bytes.concat(com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret((java.security.interfaces.ECPrivateKey) keyPair.getPrivate(), ecPublicKey), com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(this.curve, hpkeKemPrivateKey.getSerializedPrivate().toByteArray()), ecPublicKey));
        byte[] pointEncode = com.google.crypto.tink.subtle.EllipticCurves.pointEncode(this.curve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, ((java.security.interfaces.ECPublicKey) keyPair.getPublic()).getW());
        return new com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput(deriveKemSharedSecret(concat, pointEncode, bArr, hpkeKemPrivateKey.getSerializedPublic().toByteArray()), pointEncode);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput authEncapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException {
        return authEncapsulate(bArr, com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(this.curve), hpkeKemPrivateKey);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final byte[] decapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey) throws java.security.GeneralSecurityException {
        return deriveKemSharedSecret(com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(this.curve, hpkeKemPrivateKey.getSerializedPrivate().toByteArray()), com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(this.curve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, bArr)), bArr, hpkeKemPrivateKey.getSerializedPublic().toByteArray());
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final byte[] authDecapsulate(byte[] bArr, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey hpkeKemPrivateKey, byte[] bArr2) throws java.security.GeneralSecurityException {
        java.security.interfaces.ECPrivateKey ecPrivateKey = com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(this.curve, hpkeKemPrivateKey.getSerializedPrivate().toByteArray());
        return deriveKemSharedSecret(com.google.crypto.tink.subtle.Bytes.concat(com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(ecPrivateKey, com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(this.curve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, bArr)), com.google.crypto.tink.subtle.EllipticCurves.computeSharedSecret(ecPrivateKey, com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(this.curve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, bArr2))), bArr, hpkeKemPrivateKey.getSerializedPublic().toByteArray(), bArr2);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKem
    public final byte[] getKemId() throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[this.curve.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.P256_HKDF_SHA256_KEM_ID;
        }
        if (i == 2) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.P384_HKDF_SHA384_KEM_ID;
        }
        if (i == 3) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.P521_HKDF_SHA512_KEM_ID;
        }
        throw new java.security.GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}

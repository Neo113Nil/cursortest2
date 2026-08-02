package com.google.crypto.tink.signature.internal;

/* loaded from: classes9.dex */
public final class SigUtil {
    static final java.lang.String INVALID_PARAMS = "Invalid ECDSA parameters";

    public static com.google.crypto.tink.subtle.Enums.HashType toHashType(com.google.crypto.tink.proto.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hashType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.subtle.Enums.HashType.SHA256;
        }
        if (i == 2) {
            return com.google.crypto.tink.subtle.Enums.HashType.SHA384;
        }
        if (i == 3) {
            return com.google.crypto.tink.subtle.Enums.HashType.SHA512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported hash type: ");
        sb.append(hashType.name());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.CurveType toCurveType(com.google.crypto.tink.proto.EllipticCurveType ellipticCurveType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[ellipticCurveType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256;
        }
        if (i == 2) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384;
        }
        if (i == 3) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown curve type: ");
        sb.append(ellipticCurveType.name());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    /* renamed from: com.google.crypto.tink.signature.internal.SigUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.EcdsaSignatureEncoding.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding = iArr;
            try {
                iArr[com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.EllipticCurveType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.EllipticCurveType.NIST_P256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[com.google.crypto.tink.proto.EllipticCurveType.NIST_P384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$EllipticCurveType[com.google.crypto.tink.proto.EllipticCurveType.NIST_P521.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[com.google.crypto.tink.proto.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr3;
            try {
                iArr3[com.google.crypto.tink.proto.HashType.SHA256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[com.google.crypto.tink.proto.HashType.SHA512.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public static com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding toEcdsaEncoding(com.google.crypto.tink.proto.EcdsaSignatureEncoding ecdsaSignatureEncoding) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.signature.internal.SigUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$EcdsaSignatureEncoding[ecdsaSignatureEncoding.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363;
        }
        if (i == 2) {
            return com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.DER;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown ECDSA encoding: ");
        sb.append(ecdsaSignatureEncoding.name());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public static com.google.crypto.tink.shaded.protobuf.ByteString toUnsignedIntByteString(java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            return com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(byteArray, 1, byteArray.length - 1);
        }
        return com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(byteArray);
    }

    private SigUtil() {
    }
}

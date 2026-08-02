package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
class JwtEcdsaVerifyKeyManager {
    static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.jwt.JwtEcdsaPublicKey, com.google.crypto.tink.jwt.JwtPublicKeyVerify> PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.createFullPrimitive((com.google.crypto.tink.jwt.JwtEcdsaPublicKey) key);
        }
    }, com.google.crypto.tink.jwt.JwtEcdsaPublicKey.class, com.google.crypto.tink.jwt.JwtPublicKeyVerify.class);

    static com.google.crypto.tink.signature.EcdsaParameters.CurveType getCurveType(com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters) throws java.security.GeneralSecurityException {
        if (jwtEcdsaParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256)) {
            return com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256;
        }
        if (jwtEcdsaParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384)) {
            return com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384;
        }
        if (jwtEcdsaParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512)) {
            return com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521;
        }
        throw new java.security.GeneralSecurityException("unknown algorithm in parameters: ".concat(java.lang.String.valueOf(jwtEcdsaParameters)));
    }

    static com.google.crypto.tink.signature.EcdsaParameters.HashType getHash(com.google.crypto.tink.jwt.JwtEcdsaParameters jwtEcdsaParameters) throws java.security.GeneralSecurityException {
        if (jwtEcdsaParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256)) {
            return com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256;
        }
        if (jwtEcdsaParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384)) {
            return com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384;
        }
        if (jwtEcdsaParameters.getAlgorithm().equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512)) {
            return com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("unknown algorithm in parameters: ".concat(java.lang.String.valueOf(jwtEcdsaParameters)));
    }

    static com.google.crypto.tink.signature.EcdsaPublicKey toEcdsaPublicKey(com.google.crypto.tink.jwt.JwtEcdsaPublicKey jwtEcdsaPublicKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.EcdsaPublicKey.builder().setParameters(com.google.crypto.tink.signature.EcdsaParameters.builder().setSignatureEncoding(com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363).setCurveType(getCurveType(jwtEcdsaPublicKey.getParameters())).setHashType(getHash(jwtEcdsaPublicKey.getParameters())).build()).setPublicPoint(jwtEcdsaPublicKey.getPublicPoint()).build();
    }

    static com.google.crypto.tink.jwt.JwtPublicKeyVerify createFullPrimitive(final com.google.crypto.tink.jwt.JwtEcdsaPublicKey jwtEcdsaPublicKey) throws java.security.GeneralSecurityException {
        final com.google.crypto.tink.PublicKeyVerify create = com.google.crypto.tink.subtle.EcdsaVerifyJce.create(toEcdsaPublicKey(jwtEcdsaPublicKey));
        return new com.google.crypto.tink.jwt.JwtPublicKeyVerify() { // from class: com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.1
            @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerify
            public com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.jwt.JwtFormat.Parts splitSignedCompact = com.google.crypto.tink.jwt.JwtFormat.splitSignedCompact(str);
                com.google.crypto.tink.PublicKeyVerify.this.verify(splitSignedCompact.signatureOrMac, splitSignedCompact.unsignedCompact.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                com.google.gson.JsonObject parseJson = com.google.crypto.tink.jwt.JsonUtil.parseJson(splitSignedCompact.header);
                com.google.crypto.tink.jwt.JwtFormat.validateHeader(parseJson, jwtEcdsaPublicKey.getParameters().getAlgorithm().getStandardName(), jwtEcdsaPublicKey.getKid(), jwtEcdsaPublicKey.getParameters().allowKidAbsent());
                return jwtValidator.validate(com.google.crypto.tink.jwt.RawJwt.fromJsonPayload(com.google.crypto.tink.jwt.JwtFormat.getTypeHeader(parseJson), splitSignedCompact.payload));
            }
        };
    }

    /* renamed from: com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.JwtEcdsaAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = iArr;
            try {
                iArr[com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    static final com.google.crypto.tink.subtle.EllipticCurves.CurveType getCurve(com.google.crypto.tink.proto.JwtEcdsaAlgorithm jwtEcdsaAlgorithm) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[jwtEcdsaAlgorithm.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256;
        }
        if (i == 2) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384;
        }
        if (i == 3) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown algorithm ");
        sb.append(jwtEcdsaAlgorithm.name());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public static com.google.crypto.tink.subtle.Enums.HashType hashForEcdsaAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm jwtEcdsaAlgorithm) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.jwt.JwtEcdsaVerifyKeyManager.AnonymousClass2.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[jwtEcdsaAlgorithm.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.subtle.Enums.HashType.SHA256;
        }
        if (i == 2) {
            return com.google.crypto.tink.subtle.Enums.HashType.SHA384;
        }
        if (i == 3) {
            return com.google.crypto.tink.subtle.Enums.HashType.SHA512;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown algorithm ");
        sb.append(jwtEcdsaAlgorithm.name());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    static final void validateEcdsaAlgorithm(com.google.crypto.tink.proto.JwtEcdsaAlgorithm jwtEcdsaAlgorithm) throws java.security.GeneralSecurityException {
        hashForEcdsaAlgorithm(jwtEcdsaAlgorithm);
    }

    private JwtEcdsaVerifyKeyManager() {
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    }
}

package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JwtRsaSsaPssVerifyKeyManager {
    static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey, com.google.crypto.tink.jwt.JwtPublicKeyVerify> PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.createFullPrimitive((com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey) key);
        }
    }, com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey.class, com.google.crypto.tink.jwt.JwtPublicKeyVerify.class);

    private static com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashTypeForAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS256)) {
            return com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS384)) {
            return com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA384;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS512)) {
            return com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("unknown algorithm ".concat(java.lang.String.valueOf(algorithm)));
    }

    static final int saltLengthForPssAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS256)) {
            return 32;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS384)) {
            return 48;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS512)) {
            return 64;
        }
        throw new java.security.GeneralSecurityException("unknown algorithm ".concat(java.lang.String.valueOf(algorithm)));
    }

    static com.google.crypto.tink.signature.RsaSsaPssPublicKey toRsaSsaPssPublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.RsaSsaPssPublicKey.builder().setParameters(com.google.crypto.tink.signature.RsaSsaPssParameters.builder().setModulusSizeBits(jwtRsaSsaPssPublicKey.getParameters().getModulusSizeBits()).setPublicExponent(jwtRsaSsaPssPublicKey.getParameters().getPublicExponent()).setSigHashType(hashTypeForAlgorithm(jwtRsaSsaPssPublicKey.getParameters().getAlgorithm())).setMgf1HashType(hashTypeForAlgorithm(jwtRsaSsaPssPublicKey.getParameters().getAlgorithm())).setSaltLengthBytes(saltLengthForPssAlgorithm(jwtRsaSsaPssPublicKey.getParameters().getAlgorithm())).setVariant(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.NO_PREFIX).build()).setModulus(jwtRsaSsaPssPublicKey.getModulus()).build();
    }

    static com.google.crypto.tink.jwt.JwtPublicKeyVerify createFullPrimitive(final com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) throws java.security.GeneralSecurityException {
        final com.google.crypto.tink.PublicKeyVerify create = com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.create(toRsaSsaPssPublicKey(jwtRsaSsaPssPublicKey));
        return new com.google.crypto.tink.jwt.JwtPublicKeyVerify() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPssVerifyKeyManager.1
            @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerify
            public com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.jwt.JwtFormat.Parts splitSignedCompact = com.google.crypto.tink.jwt.JwtFormat.splitSignedCompact(str);
                com.google.crypto.tink.PublicKeyVerify.this.verify(splitSignedCompact.signatureOrMac, splitSignedCompact.unsignedCompact.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                com.google.gson.JsonObject parseJson = com.google.crypto.tink.jwt.JsonUtil.parseJson(splitSignedCompact.header);
                com.google.crypto.tink.jwt.JwtFormat.validateHeader(parseJson, jwtRsaSsaPssPublicKey.getParameters().getAlgorithm().getStandardName(), jwtRsaSsaPssPublicKey.getKid(), jwtRsaSsaPssPublicKey.getParameters().allowKidAbsent());
                return jwtValidator.validate(com.google.crypto.tink.jwt.RawJwt.fromJsonPayload(com.google.crypto.tink.jwt.JwtFormat.getTypeHeader(parseJson), splitSignedCompact.payload));
            }
        };
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";
    }

    private JwtRsaSsaPssVerifyKeyManager() {
    }
}

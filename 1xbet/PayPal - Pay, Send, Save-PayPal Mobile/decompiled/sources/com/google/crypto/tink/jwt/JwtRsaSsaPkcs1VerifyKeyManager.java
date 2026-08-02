package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JwtRsaSsaPkcs1VerifyKeyManager {
    static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey, com.google.crypto.tink.jwt.JwtPublicKeyVerify> PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.createFullPrimitive((com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey) key);
        }
    }, com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.class, com.google.crypto.tink.jwt.JwtPublicKeyVerify.class);

    private static com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashTypeForAlgorithm(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS256)) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS384)) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA384;
        }
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS512)) {
            return com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512;
        }
        throw new java.security.GeneralSecurityException("unknown algorithm ".concat(java.lang.String.valueOf(algorithm)));
    }

    static com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey toRsaSsaPkcs1PublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.builder().setParameters(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.builder().setModulusSizeBits(jwtRsaSsaPkcs1PublicKey.getParameters().getModulusSizeBits()).setPublicExponent(jwtRsaSsaPkcs1PublicKey.getParameters().getPublicExponent()).setHashType(hashTypeForAlgorithm(jwtRsaSsaPkcs1PublicKey.getParameters().getAlgorithm())).setVariant(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.NO_PREFIX).build()).setModulus(jwtRsaSsaPkcs1PublicKey.getModulus()).build();
    }

    static com.google.crypto.tink.jwt.JwtPublicKeyVerify createFullPrimitive(final com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) throws java.security.GeneralSecurityException {
        final com.google.crypto.tink.PublicKeyVerify create = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.create(toRsaSsaPkcs1PublicKey(jwtRsaSsaPkcs1PublicKey));
        return new com.google.crypto.tink.jwt.JwtPublicKeyVerify() { // from class: com.google.crypto.tink.jwt.JwtRsaSsaPkcs1VerifyKeyManager.1
            @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerify
            public com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator) throws java.security.GeneralSecurityException {
                com.google.crypto.tink.jwt.JwtFormat.Parts splitSignedCompact = com.google.crypto.tink.jwt.JwtFormat.splitSignedCompact(str);
                com.google.crypto.tink.PublicKeyVerify.this.verify(splitSignedCompact.signatureOrMac, splitSignedCompact.unsignedCompact.getBytes(java.nio.charset.StandardCharsets.US_ASCII));
                com.google.gson.JsonObject parseJson = com.google.crypto.tink.jwt.JsonUtil.parseJson(splitSignedCompact.header);
                com.google.crypto.tink.jwt.JwtFormat.validateHeader(parseJson, jwtRsaSsaPkcs1PublicKey.getParameters().getAlgorithm().getStandardName(), jwtRsaSsaPkcs1PublicKey.getKid(), jwtRsaSsaPkcs1PublicKey.getParameters().allowKidAbsent());
                return jwtValidator.validate(com.google.crypto.tink.jwt.RawJwt.fromJsonPayload(com.google.crypto.tink.jwt.JwtFormat.getTypeHeader(parseJson), splitSignedCompact.payload));
            }
        };
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
    }

    private JwtRsaSsaPkcs1VerifyKeyManager() {
    }
}

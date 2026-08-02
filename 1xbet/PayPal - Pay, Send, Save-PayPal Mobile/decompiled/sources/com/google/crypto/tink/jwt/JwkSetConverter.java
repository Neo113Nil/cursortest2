package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwkSetConverter {
    public static java.lang.String fromPublicKeysetHandle(com.google.crypto.tink.KeysetHandle keysetHandle) throws java.io.IOException, java.security.GeneralSecurityException {
        com.google.crypto.tink.KeysetHandle build = com.google.crypto.tink.KeysetHandle.newBuilder(keysetHandle).build();
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        for (int i = 0; i < build.size(); i++) {
            com.google.crypto.tink.KeysetHandle.Entry at = build.getAt(i);
            if (at.getStatus() == com.google.crypto.tink.KeyStatus.ENABLED) {
                com.google.crypto.tink.Key key = at.getKey();
                if (key instanceof com.google.crypto.tink.jwt.JwtEcdsaPublicKey) {
                    jsonArray.add(convertJwtEcdsaKey((com.google.crypto.tink.jwt.JwtEcdsaPublicKey) key));
                } else if (key instanceof com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey) {
                    jsonArray.add(convertJwtRsaSsaPkcs1Key((com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey) key));
                } else if (key instanceof com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey) {
                    jsonArray.add(convertJwtRsaSsaPssKey((com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey) key));
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported key with parameters ");
                    sb.append(key.getParameters());
                    throw new java.security.GeneralSecurityException(sb.toString());
                }
            }
        }
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.add(org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, jsonArray);
        return jsonObject.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r4.equals("ES") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.crypto.tink.KeysetHandle toPublicKeysetHandle(java.lang.String str) throws java.io.IOException, java.security.GeneralSecurityException {
        try {
            com.google.gson.JsonObject asJsonObject = com.google.crypto.tink.internal.JsonParser.parse(str).getAsJsonObject();
            com.google.crypto.tink.KeysetHandle.Builder newBuilder = com.google.crypto.tink.KeysetHandle.newBuilder();
            java.util.Iterator<com.google.gson.JsonElement> it = asJsonObject.get(org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME).getAsJsonArray().iterator();
            while (true) {
                char c = 0;
                if (it.hasNext()) {
                    com.google.gson.JsonObject asJsonObject2 = it.next().getAsJsonObject();
                    java.lang.String substring = getStringItem(asJsonObject2, "alg").substring(0, 2);
                    substring.hashCode();
                    int hashCode = substring.hashCode();
                    if (hashCode != 2222) {
                        if (hashCode != 2563) {
                            if (hashCode == 2625 && substring.equals("RS")) {
                                c = 2;
                            }
                            c = 65535;
                        } else {
                            if (substring.equals("PS")) {
                                c = 1;
                            }
                            c = 65535;
                        }
                    }
                    if (c == 0) {
                        newBuilder.addEntry(com.google.crypto.tink.KeysetHandle.importKey(convertToEcdsaKey(asJsonObject2)).withRandomId());
                    } else if (c == 1) {
                        newBuilder.addEntry(com.google.crypto.tink.KeysetHandle.importKey(convertToRsaSsaPssKey(asJsonObject2)).withRandomId());
                    } else if (c == 2) {
                        newBuilder.addEntry(com.google.crypto.tink.KeysetHandle.importKey(convertToRsaSsaPkcs1Key(asJsonObject2)).withRandomId());
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("unexpected alg value: ");
                        sb.append(getStringItem(asJsonObject2, "alg"));
                        throw new java.security.GeneralSecurityException(sb.toString());
                    }
                } else {
                    if (newBuilder.size() <= 0) {
                        throw new java.security.GeneralSecurityException("empty keyset");
                    }
                    newBuilder.getAt(0).makePrimary();
                    return newBuilder.build();
                }
            }
        } catch (java.io.IOException | java.lang.IllegalStateException e) {
            throw new java.security.GeneralSecurityException("JWK set is invalid JSON", e);
        }
    }

    private static com.google.gson.JsonObject convertJwtEcdsaKey(com.google.crypto.tink.jwt.JwtEcdsaPublicKey jwtEcdsaPublicKey) throws java.security.GeneralSecurityException {
        java.lang.String str;
        java.lang.String str2;
        int i;
        com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm algorithm = jwtEcdsaPublicKey.getParameters().getAlgorithm();
        if (algorithm.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256)) {
            str = org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P256_CURVE_AND_SHA256;
            str2 = org.jose4j.keys.EllipticCurves.P_256;
            i = 32;
        } else if (algorithm.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384)) {
            str = org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P384_CURVE_AND_SHA384;
            str2 = org.jose4j.keys.EllipticCurves.P_384;
            i = 48;
        } else if (algorithm.equals(com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512)) {
            str = org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P521_CURVE_AND_SHA512;
            str2 = org.jose4j.keys.EllipticCurves.P_521;
            i = 66;
        } else {
            throw new java.security.GeneralSecurityException("unknown algorithm");
        }
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("kty", "EC");
        jsonObject.addProperty("crv", str2);
        java.math.BigInteger affineX = jwtEcdsaPublicKey.getPublicPoint().getAffineX();
        java.math.BigInteger affineY = jwtEcdsaPublicKey.getPublicPoint().getAffineY();
        jsonObject.addProperty("x", com.google.crypto.tink.subtle.Base64.urlSafeEncode(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(affineX, i)));
        jsonObject.addProperty("y", com.google.crypto.tink.subtle.Base64.urlSafeEncode(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(affineY, i)));
        jsonObject.addProperty("use", org.jose4j.jwk.Use.SIGNATURE);
        jsonObject.addProperty("alg", str);
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        jsonArray.add("verify");
        jsonObject.add("key_ops", jsonArray);
        java.util.Optional<java.lang.String> kid = jwtEcdsaPublicKey.getKid();
        if (kid.isPresent()) {
            jsonObject.addProperty("kid", kid.get());
        }
        return jsonObject;
    }

    private static byte[] base64urlUInt(java.math.BigInteger bigInteger) {
        if (bigInteger.equals(java.math.BigInteger.ZERO)) {
            return new byte[]{0};
        }
        return com.google.crypto.tink.internal.BigIntegerEncoding.toUnsignedBigEndianBytes(bigInteger);
    }

    private static com.google.gson.JsonObject convertJwtRsaSsaPkcs1Key(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey) throws java.security.GeneralSecurityException {
        java.lang.String standardName = jwtRsaSsaPkcs1PublicKey.getParameters().getAlgorithm().getStandardName();
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("kty", "RSA");
        jsonObject.addProperty("n", com.google.crypto.tink.subtle.Base64.urlSafeEncode(base64urlUInt(jwtRsaSsaPkcs1PublicKey.getModulus())));
        jsonObject.addProperty("e", com.google.crypto.tink.subtle.Base64.urlSafeEncode(base64urlUInt(jwtRsaSsaPkcs1PublicKey.getParameters().getPublicExponent())));
        jsonObject.addProperty("use", org.jose4j.jwk.Use.SIGNATURE);
        jsonObject.addProperty("alg", standardName);
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        jsonArray.add("verify");
        jsonObject.add("key_ops", jsonArray);
        java.util.Optional<java.lang.String> kid = jwtRsaSsaPkcs1PublicKey.getKid();
        if (kid.isPresent()) {
            jsonObject.addProperty("kid", kid.get());
        }
        return jsonObject;
    }

    private static com.google.gson.JsonObject convertJwtRsaSsaPssKey(com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) throws java.security.GeneralSecurityException {
        java.lang.String standardName = jwtRsaSsaPssPublicKey.getParameters().getAlgorithm().getStandardName();
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        jsonObject.addProperty("kty", "RSA");
        jsonObject.addProperty("n", com.google.crypto.tink.subtle.Base64.urlSafeEncode(base64urlUInt(jwtRsaSsaPssPublicKey.getModulus())));
        jsonObject.addProperty("e", com.google.crypto.tink.subtle.Base64.urlSafeEncode(base64urlUInt(jwtRsaSsaPssPublicKey.getParameters().getPublicExponent())));
        jsonObject.addProperty("use", org.jose4j.jwk.Use.SIGNATURE);
        jsonObject.addProperty("alg", standardName);
        com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
        jsonArray.add("verify");
        jsonObject.add("key_ops", jsonArray);
        java.util.Optional<java.lang.String> kid = jwtRsaSsaPssPublicKey.getKid();
        if (kid.isPresent()) {
            jsonObject.addProperty("kid", kid.get());
        }
        return jsonObject;
    }

    private static java.lang.String getStringItem(com.google.gson.JsonObject jsonObject, java.lang.String str) throws java.security.GeneralSecurityException {
        if (!jsonObject.has(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" not found");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (!jsonObject.get(str).isJsonPrimitive() || !jsonObject.get(str).getAsJsonPrimitive().isString()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" is not a string");
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        return jsonObject.get(str).getAsString();
    }

    private static void expectStringItem(com.google.gson.JsonObject jsonObject, java.lang.String str, java.lang.String str2) throws java.security.GeneralSecurityException {
        java.lang.String stringItem = getStringItem(jsonObject, str);
        if (stringItem.equals(str2)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unexpected ");
        sb.append(str);
        sb.append(" value: ");
        sb.append(stringItem);
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    private static void validateUseIsSig(com.google.gson.JsonObject jsonObject) throws java.security.GeneralSecurityException {
        if (jsonObject.has("use")) {
            expectStringItem(jsonObject, "use", org.jose4j.jwk.Use.SIGNATURE);
        }
    }

    private static void validateKeyOpsIsVerify(com.google.gson.JsonObject jsonObject) throws java.security.GeneralSecurityException {
        if (jsonObject.has("key_ops")) {
            if (!jsonObject.get("key_ops").isJsonArray()) {
                throw new java.security.GeneralSecurityException("key_ops is not an array");
            }
            com.google.gson.JsonArray asJsonArray = jsonObject.get("key_ops").getAsJsonArray();
            if (asJsonArray.size() != 1) {
                throw new java.security.GeneralSecurityException("key_ops must contain exactly one element");
            }
            if (!asJsonArray.get(0).isJsonPrimitive() || !asJsonArray.get(0).getAsJsonPrimitive().isString()) {
                throw new java.security.GeneralSecurityException("key_ops is not a string");
            }
            if (asJsonArray.get(0).getAsString().equals("verify")) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unexpected keyOps value: ");
            sb.append(asJsonArray.get(0).getAsString());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
    }

    private static com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey convertToRsaSsaPkcs1Key(com.google.gson.JsonObject jsonObject) throws java.security.GeneralSecurityException {
        char c;
        com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm algorithm;
        java.lang.String stringItem = getStringItem(jsonObject, "alg");
        stringItem.hashCode();
        int hashCode = stringItem.hashCode();
        if (hashCode == 78251122) {
            if (stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA256)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 78252174) {
            if (hashCode == 78253877 && stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA512)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA384)) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            algorithm = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS256;
        } else if (c == 1) {
            algorithm = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS384;
        } else if (c == 2) {
            algorithm = com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.Algorithm.RS512;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Rsa Algorithm: ");
            sb.append(getStringItem(jsonObject, "alg"));
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (jsonObject.has("p") || jsonObject.has("q") || jsonObject.has("dp") || jsonObject.has("dq") || jsonObject.has("d") || jsonObject.has("qi")) {
            throw new java.lang.UnsupportedOperationException("importing RSA private keys is not implemented");
        }
        expectStringItem(jsonObject, "kty", "RSA");
        validateUseIsSig(jsonObject);
        validateKeyOpsIsVerify(jsonObject);
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, com.google.crypto.tink.subtle.Base64.urlSafeDecode(getStringItem(jsonObject, "e")));
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, com.google.crypto.tink.subtle.Base64.urlSafeDecode(getStringItem(jsonObject, "n")));
        if (jsonObject.has("kid")) {
            return com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.builder().setParameters(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(bigInteger2.bitLength()).setPublicExponent(bigInteger).setAlgorithm(algorithm).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.CUSTOM).build()).setModulus(bigInteger2).setCustomKid(getStringItem(jsonObject, "kid")).build();
        }
        return com.google.crypto.tink.jwt.JwtRsaSsaPkcs1PublicKey.builder().setParameters(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.builder().setModulusSizeBits(bigInteger2.bitLength()).setPublicExponent(bigInteger).setAlgorithm(algorithm).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPkcs1Parameters.KidStrategy.IGNORED).build()).setModulus(bigInteger2).build();
    }

    private static com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey convertToRsaSsaPssKey(com.google.gson.JsonObject jsonObject) throws java.security.GeneralSecurityException {
        char c;
        com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm algorithm;
        java.lang.String stringItem = getStringItem(jsonObject, "alg");
        stringItem.hashCode();
        int hashCode = stringItem.hashCode();
        if (hashCode == 76404080) {
            if (stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA256)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 76405132) {
            if (hashCode == 76406835 && stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA512)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA384)) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            algorithm = com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS256;
        } else if (c == 1) {
            algorithm = com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS384;
        } else if (c == 2) {
            algorithm = com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.Algorithm.PS512;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Rsa Algorithm: ");
            sb.append(getStringItem(jsonObject, "alg"));
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (jsonObject.has("p") || jsonObject.has("q") || jsonObject.has("dq") || jsonObject.has("dq") || jsonObject.has("d") || jsonObject.has("qi")) {
            throw new java.lang.UnsupportedOperationException("importing RSA private keys is not implemented");
        }
        expectStringItem(jsonObject, "kty", "RSA");
        validateUseIsSig(jsonObject);
        validateKeyOpsIsVerify(jsonObject);
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, com.google.crypto.tink.subtle.Base64.urlSafeDecode(getStringItem(jsonObject, "e")));
        java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, com.google.crypto.tink.subtle.Base64.urlSafeDecode(getStringItem(jsonObject, "n")));
        if (jsonObject.has("kid")) {
            return com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey.builder().setParameters(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.builder().setModulusSizeBits(bigInteger2.bitLength()).setPublicExponent(bigInteger).setAlgorithm(algorithm).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.CUSTOM).build()).setModulus(bigInteger2).setCustomKid(getStringItem(jsonObject, "kid")).build();
        }
        return com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey.builder().setParameters(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.builder().setModulusSizeBits(bigInteger2.bitLength()).setPublicExponent(bigInteger).setAlgorithm(algorithm).setKidStrategy(com.google.crypto.tink.jwt.JwtRsaSsaPssParameters.KidStrategy.IGNORED).build()).setModulus(bigInteger2).build();
    }

    private static com.google.crypto.tink.jwt.JwtEcdsaPublicKey convertToEcdsaKey(com.google.gson.JsonObject jsonObject) throws java.security.GeneralSecurityException {
        char c;
        com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm algorithm;
        java.lang.String stringItem = getStringItem(jsonObject, "alg");
        stringItem.hashCode();
        int hashCode = stringItem.hashCode();
        if (hashCode == 66245349) {
            if (stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P256_CURVE_AND_SHA256)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 66246401) {
            if (hashCode == 66248104 && stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P521_CURVE_AND_SHA512)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (stringItem.equals(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P384_CURVE_AND_SHA384)) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            expectStringItem(jsonObject, "crv", org.jose4j.keys.EllipticCurves.P_256);
            algorithm = com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES256;
        } else if (c == 1) {
            expectStringItem(jsonObject, "crv", org.jose4j.keys.EllipticCurves.P_384);
            algorithm = com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES384;
        } else if (c == 2) {
            expectStringItem(jsonObject, "crv", org.jose4j.keys.EllipticCurves.P_521);
            algorithm = com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm.ES512;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Ecdsa Algorithm: ");
            sb.append(getStringItem(jsonObject, "alg"));
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (jsonObject.has("d")) {
            throw new java.lang.UnsupportedOperationException("importing ECDSA private keys is not implemented");
        }
        expectStringItem(jsonObject, "kty", "EC");
        validateUseIsSig(jsonObject);
        validateKeyOpsIsVerify(jsonObject);
        java.security.spec.ECPoint eCPoint = new java.security.spec.ECPoint(new java.math.BigInteger(1, com.google.crypto.tink.subtle.Base64.urlSafeDecode(getStringItem(jsonObject, "x"))), new java.math.BigInteger(1, com.google.crypto.tink.subtle.Base64.urlSafeDecode(getStringItem(jsonObject, "y"))));
        if (jsonObject.has("kid")) {
            return com.google.crypto.tink.jwt.JwtEcdsaPublicKey.builder().setParameters(com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.CUSTOM).setAlgorithm(algorithm).build()).setPublicPoint(eCPoint).setCustomKid(getStringItem(jsonObject, "kid")).build();
        }
        return com.google.crypto.tink.jwt.JwtEcdsaPublicKey.builder().setParameters(com.google.crypto.tink.jwt.JwtEcdsaParameters.builder().setKidStrategy(com.google.crypto.tink.jwt.JwtEcdsaParameters.KidStrategy.IGNORED).setAlgorithm(algorithm).build()).setPublicPoint(eCPoint).build();
    }

    @java.lang.Deprecated
    public static java.lang.String fromKeysetHandle(com.google.crypto.tink.KeysetHandle keysetHandle, com.google.crypto.tink.tinkkey.KeyAccess keyAccess) throws java.io.IOException, java.security.GeneralSecurityException {
        return fromPublicKeysetHandle(keysetHandle);
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetHandle toKeysetHandle(java.lang.String str, com.google.crypto.tink.tinkkey.KeyAccess keyAccess) throws java.io.IOException, java.security.GeneralSecurityException {
        return toPublicKeysetHandle(str);
    }

    private JwkSetConverter() {
    }
}

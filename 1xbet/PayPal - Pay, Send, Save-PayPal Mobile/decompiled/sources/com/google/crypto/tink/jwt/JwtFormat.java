package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JwtFormat {
    static boolean isValidUrlsafeBase64Char(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c < 'A' || c > 'Z') {
            return (c >= '0' && c <= '9') || c == '-' || c == '_';
        }
        return true;
    }

    static class Parts {
        java.lang.String header;
        java.lang.String payload;
        byte[] signatureOrMac;
        java.lang.String unsignedCompact;

        Parts(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3) {
            this.unsignedCompact = str;
            this.signatureOrMac = bArr;
            this.header = str2;
            this.payload = str3;
        }
    }

    private JwtFormat() {
    }

    static void validateUtf8(byte[] bArr) throws com.google.crypto.tink.jwt.JwtInvalidException {
        try {
            com.google.crypto.tink.internal.Util.UTF_8.newDecoder().decode(java.nio.ByteBuffer.wrap(bArr));
        } catch (java.nio.charset.CharacterCodingException e) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException(e.getMessage());
        }
    }

    static byte[] strictUrlSafeDecode(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        for (int i = 0; i < str.length(); i++) {
            if (!isValidUrlsafeBase64Char(str.charAt(i))) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid encoding");
            }
        }
        try {
            return com.google.crypto.tink.subtle.Base64.urlSafeDecode(str);
        } catch (java.lang.IllegalArgumentException e) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid encoding: ".concat(java.lang.String.valueOf(e)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void validateAlgorithm(java.lang.String str) throws java.security.InvalidAlgorithmParameterException {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case 66245349:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P256_CURVE_AND_SHA256)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 66246401:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P384_CURVE_AND_SHA384)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 66248104:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.ECDSA_USING_P521_CURVE_AND_SHA512)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 69015912:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA256)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 69016964:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA384)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 69018667:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA512)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 76404080:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA256)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 76405132:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA384)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 76406835:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_PSS_USING_SHA512)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 78251122:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA256)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 78252174:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA384)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 78253877:
                if (str.equals(org.jose4j.jws.AlgorithmIdentifiers.RSA_USING_SHA512)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
                return;
            default:
                throw new java.security.InvalidAlgorithmParameterException("invalid algorithm: ".concat(java.lang.String.valueOf(str)));
        }
    }

    static java.lang.String createHeader(java.lang.String str, java.util.Optional<java.lang.String> optional, java.util.Optional<java.lang.String> optional2) throws java.security.InvalidAlgorithmParameterException {
        validateAlgorithm(str);
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        if (optional2.isPresent()) {
            jsonObject.addProperty("kid", optional2.get());
        }
        jsonObject.addProperty("alg", str);
        if (optional.isPresent()) {
            jsonObject.addProperty("typ", optional.get());
        }
        return com.google.crypto.tink.subtle.Base64.urlSafeEncode(jsonObject.toString().getBytes(com.google.crypto.tink.internal.Util.UTF_8));
    }

    private static void validateKidInHeader(java.lang.String str, com.google.gson.JsonObject jsonObject) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (!getStringHeader(jsonObject, "kid").equals(str)) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid kid in header");
        }
    }

    static void validateHeader(com.google.gson.JsonObject jsonObject, java.lang.String str, java.util.Optional<java.lang.String> optional, boolean z) throws java.security.GeneralSecurityException {
        java.lang.String stringHeader = getStringHeader(jsonObject, "alg");
        if (!stringHeader.equals(str)) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("invalid algorithm; expected %s, got %s", str, stringHeader));
        }
        if (jsonObject.has("crit")) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("all tokens with crit headers are rejected");
        }
        boolean has = jsonObject.has("kid");
        if (has || !z) {
            if (!has && !z) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException("missing kid in header");
            }
            if (optional.isPresent() && !getStringHeader(jsonObject, "kid").equals(optional.get())) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid kid in header");
            }
        }
    }

    static void validateHeader(java.lang.String str, java.util.Optional<java.lang.String> optional, java.util.Optional<java.lang.String> optional2, com.google.gson.JsonObject jsonObject) throws java.security.InvalidAlgorithmParameterException, com.google.crypto.tink.jwt.JwtInvalidException {
        validateAlgorithm(str);
        java.lang.String stringHeader = getStringHeader(jsonObject, "alg");
        if (!stringHeader.equals(str)) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("invalid algorithm; expected %s, got %s", str, stringHeader));
        }
        if (jsonObject.has("crit")) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("all tokens with crit headers are rejected");
        }
        if (optional.isPresent() && optional2.isPresent()) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("custom_kid can only be set for RAW keys.");
        }
        boolean has = jsonObject.has("kid");
        if (optional.isPresent()) {
            if (!has) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException("missing kid in header");
            }
            validateKidInHeader(optional.get(), jsonObject);
        }
        if (optional2.isPresent() && has) {
            validateKidInHeader(optional2.get(), jsonObject);
        }
    }

    static java.util.Optional<java.lang.String> getTypeHeader(com.google.gson.JsonObject jsonObject) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (jsonObject.has("typ")) {
            return java.util.Optional.of(getStringHeader(jsonObject, "typ"));
        }
        return java.util.Optional.empty();
    }

    static java.lang.String getStringHeader(com.google.gson.JsonObject jsonObject, java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (!jsonObject.has(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("header ");
            sb.append(str);
            sb.append(" does not exist");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
        if (!jsonObject.get(str).isJsonPrimitive() || !jsonObject.get(str).getAsJsonPrimitive().isString()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("header ");
            sb2.append(str);
            sb2.append(" is not a string");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
        }
        return jsonObject.get(str).getAsString();
    }

    static java.lang.String decodeHeader(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        byte[] strictUrlSafeDecode = strictUrlSafeDecode(str);
        validateUtf8(strictUrlSafeDecode);
        return new java.lang.String(strictUrlSafeDecode, com.google.crypto.tink.internal.Util.UTF_8);
    }

    static java.lang.String encodePayload(java.lang.String str) {
        return com.google.crypto.tink.subtle.Base64.urlSafeEncode(str.getBytes(com.google.crypto.tink.internal.Util.UTF_8));
    }

    static java.lang.String decodePayload(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        byte[] strictUrlSafeDecode = strictUrlSafeDecode(str);
        validateUtf8(strictUrlSafeDecode);
        return new java.lang.String(strictUrlSafeDecode, com.google.crypto.tink.internal.Util.UTF_8);
    }

    static java.lang.String encodeSignature(byte[] bArr) {
        return com.google.crypto.tink.subtle.Base64.urlSafeEncode(bArr);
    }

    static byte[] decodeSignature(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        return strictUrlSafeDecode(str);
    }

    static java.util.Optional<java.lang.String> getKid(int i, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (outputPrefixType == com.google.crypto.tink.proto.OutputPrefixType.RAW) {
            return java.util.Optional.empty();
        }
        if (outputPrefixType == com.google.crypto.tink.proto.OutputPrefixType.TINK) {
            return java.util.Optional.of(com.google.crypto.tink.subtle.Base64.urlSafeEncode(java.nio.ByteBuffer.allocate(4).putInt(i).array()));
        }
        throw new com.google.crypto.tink.jwt.JwtInvalidException("unsupported output prefix type");
    }

    static java.util.Optional<java.lang.Integer> getKeyId(java.lang.String str) {
        byte[] urlSafeDecode = com.google.crypto.tink.subtle.Base64.urlSafeDecode(str);
        if (urlSafeDecode.length != 4) {
            return java.util.Optional.empty();
        }
        return java.util.Optional.of(java.lang.Integer.valueOf(java.nio.ByteBuffer.wrap(urlSafeDecode).getInt()));
    }

    static com.google.crypto.tink.jwt.JwtFormat.Parts splitSignedCompact(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        validateASCII(str);
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        java.lang.String substring = str.substring(0, lastIndexOf);
        byte[] decodeSignature = decodeSignature(str.substring(lastIndexOf + 1));
        int indexOf = substring.indexOf(46);
        if (indexOf < 0) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        java.lang.String substring2 = substring.substring(0, indexOf);
        java.lang.String substring3 = substring.substring(indexOf + 1);
        if (substring3.indexOf(46) > 0) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("only tokens in JWS compact serialization format are supported");
        }
        return new com.google.crypto.tink.jwt.JwtFormat.Parts(substring, decodeSignature, decodeHeader(substring2), decodePayload(substring3));
    }

    static java.lang.String createUnsignedCompact(java.lang.String str, java.util.Optional<java.lang.String> optional, com.google.crypto.tink.jwt.RawJwt rawJwt) throws java.security.InvalidAlgorithmParameterException, com.google.crypto.tink.jwt.JwtInvalidException {
        java.lang.String jsonPayload = rawJwt.getJsonPayload();
        java.util.Optional of = rawJwt.hasTypeHeader() ? java.util.Optional.of(rawJwt.getTypeHeader()) : java.util.Optional.empty();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(createHeader(str, of, optional));
        sb.append(".");
        sb.append(encodePayload(jsonPayload));
        return sb.toString();
    }

    static java.lang.String createSignedCompact(java.lang.String str, byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(encodeSignature(bArr));
        return sb.toString();
    }

    static void validateASCII(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) & 128) > 0) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException("Non ascii character");
            }
        }
    }
}

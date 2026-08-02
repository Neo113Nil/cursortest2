package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
final class JsonUtil {
    static boolean isValidString(java.lang.String str) {
        return com.google.crypto.tink.internal.JsonParser.isValidString(str);
    }

    static com.google.gson.JsonObject parseJson(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        try {
            return com.google.crypto.tink.internal.JsonParser.parse(str).getAsJsonObject();
        } catch (com.google.gson.JsonParseException | java.io.IOException | java.lang.IllegalStateException e) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid JSON: ".concat(java.lang.String.valueOf(e)));
        }
    }

    static com.google.gson.JsonArray parseJsonArray(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        try {
            return com.google.crypto.tink.internal.JsonParser.parse(str).getAsJsonArray();
        } catch (com.google.gson.JsonParseException | java.io.IOException | java.lang.IllegalStateException e) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid JSON: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private JsonUtil() {
    }
}

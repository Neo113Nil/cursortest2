package com.payair.logic.jwt;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\u001a)\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010"}, d2 = {"T", "", "encodedMessage", "Ljava/lang/Class;", "encodeToClass", "decodeBase64Json", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "", "objectToEncode", "encodeObjectToBase64", "(Ljava/lang/Object;)Ljava/lang/String;", "", "byteArray", "encodeStringToBase64", "([B)Ljava/lang/String;", "CHARACTER_DOT", "Ljava/lang/String;", "SCOPE_PROVISION", "SCOPE_REGISTER", "SCOPE_UPDATE_UNLOCK_KEYS"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class JWTKt {
    public static final java.lang.String CHARACTER_DOT = ".";
    public static final java.lang.String SCOPE_PROVISION = "pa:contactless:Provision";
    public static final java.lang.String SCOPE_REGISTER = "pa:contactless:Register";
    public static final java.lang.String SCOPE_UPDATE_UNLOCK_KEYS = "pa:contactless:UpdateUnlockKeys";

    public static final <T> T decodeBase64Json(java.lang.String str, java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        byte[] decodeBase64 = codec.binary.Base64.decodeBase64(str);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeBase64);
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
        return (T) new com.google.gson.Gson().fromJson(new java.lang.String(decodeBase64, charset), (java.lang.Class) cls);
    }

    public static final java.lang.String encodeObjectToBase64(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        java.lang.String obj2 = new com.google.gson.Gson().toJson(obj).toString();
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "Parsing object:\n".concat(java.lang.String.valueOf(obj2)), null, null, 6, null);
        byte[] bytes = obj2.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return encodeStringToBase64(bytes);
    }

    public static final java.lang.String encodeStringToBase64(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return codec.binary.Base64.encodeBase64URLSafeString(bArr).toString();
    }
}

package com.paypal.oslo.feature.identity.devicebinding.security.utils;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "generateNonce", "()Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NonceUtilsKt {
    public static final java.lang.String generateNonce() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        java.lang.String format = simpleDateFormat.format(new java.util.Date());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        byte[] bytes = java.lang.Long.toUnsignedString(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(kotlin.UInt.m23470constructorimpl(secureRandom.nextInt()) & 4294967295L) << 32) | kotlin.ULong.m23494constructorimpl(4294967295L & kotlin.UInt.m23470constructorimpl(secureRandom.nextInt())))).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(format);
        sb.append(encodeToString);
        return sb.toString();
    }
}

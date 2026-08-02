package com.adobe.marketing.mobile.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/util/StringEncoder;", "", "<init>", "()V", "", "input", "sha2hash", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class StringEncoder {
    public static final int $stable = 0;
    public static final com.adobe.marketing.mobile.util.StringEncoder INSTANCE = new com.adobe.marketing.mobile.util.StringEncoder();

    private StringEncoder() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String sha2hash(java.lang.String input) {
        java.lang.String str = input;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = input.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
            for (byte b : digest) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(b & 255)}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                sb.append(format);
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to create SHA-256 hash for input: '");
            sb2.append(input);
            sb2.append("', Error: ");
            sb2.append(e);
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "StringEncoder", sb2.toString(), new java.lang.Object[0]);
            return null;
        }
    }
}

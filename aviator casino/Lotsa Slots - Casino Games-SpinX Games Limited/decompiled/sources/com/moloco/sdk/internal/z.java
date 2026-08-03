package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class z {
    public static final java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return com.moloco.sdk.internal.k.a(digest);
    }
}

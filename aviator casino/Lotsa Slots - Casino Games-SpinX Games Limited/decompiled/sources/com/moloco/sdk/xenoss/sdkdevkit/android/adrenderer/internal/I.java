package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class I {
    public static final java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3449f.a(digest);
    }

    public static final java.lang.String b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.net.URI uri = new java.net.URI(str);
        java.lang.String uri2 = new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "run(...)");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
        byte[] bytes = uri2.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3449f.a(digest);
    }
}

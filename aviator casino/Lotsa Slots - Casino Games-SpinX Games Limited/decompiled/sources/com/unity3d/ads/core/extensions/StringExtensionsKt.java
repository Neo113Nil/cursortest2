package com.unity3d.ads.core.extensions;

/* compiled from: StringExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"getSHA256Hash", "", "guessMimeType", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StringExtensionsKt {
    public static final java.lang.String getSHA256Hash(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        java.lang.String hex = okio.ByteString.of(java.util.Arrays.copyOf(bytes, bytes.length)).sha256().hex();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hex, "bytes.sha256().hex()");
        return hex;
    }

    public static final java.lang.String guessMimeType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.net.URLConnection.guessContentTypeFromName(str);
    }
}

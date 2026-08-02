package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "urlEncode", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExtensionsKt {
    public static final java.lang.String urlEncode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String encode = java.net.URLEncoder.encode(str, kotlin.text.Charsets.UTF_8.name());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "");
        return encode;
    }
}

package com.ironsource;

/* loaded from: classes5.dex */
final class H4 implements com.ironsource.Q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.H4 f5738a = new com.ironsource.H4();

    private H4() {
    }

    @Override // com.ironsource.Q3
    public java.io.InputStream a(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.io.InputStream openStream = new java.net.URL(url).openStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openStream, "URL(url).openStream()");
        return openStream;
    }
}

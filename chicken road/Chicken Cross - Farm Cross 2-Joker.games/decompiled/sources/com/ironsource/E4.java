package com.ironsource;

import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class E4 implements N3 {

    /* renamed from: a, reason: collision with root package name */
    public static final E4 f7609a = new E4();

    private E4() {
    }

    @Override // com.ironsource.N3
    public InputStream a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream openStream = new URL(url).openStream();
        Intrinsics.checkNotNullExpressionValue(openStream, "URL(url).openStream()");
        return openStream;
    }
}

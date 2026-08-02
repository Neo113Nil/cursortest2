package com.bbflight.background_downloader;

import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class Q implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ Q(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$onPageFinished$2;
        switch (this.a) {
            case 0:
                U it = (U) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.b.t);
            default:
                lambda$onPageFinished$2 = WebViewClientProxyApi.WebViewClientImpl.lambda$onPageFinished$2((Result) obj);
                return lambda$onPageFinished$2;
        }
    }
}

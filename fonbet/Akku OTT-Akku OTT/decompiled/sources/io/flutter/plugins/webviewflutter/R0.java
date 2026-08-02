package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.time.InstantKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class R0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ R0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$shouldOverrideUrlLoading$8;
        boolean parseIso$lambda$10;
        switch (this.a) {
            case 0:
                lambda$shouldOverrideUrlLoading$8 = WebViewClientProxyApi.WebViewClientImpl.lambda$shouldOverrideUrlLoading$8((Result) obj);
                return lambda$shouldOverrideUrlLoading$8;
            default:
                parseIso$lambda$10 = InstantKt.parseIso$lambda$10(((Character) obj).charValue());
                return Boolean.valueOf(parseIso$lambda$10);
        }
    }
}

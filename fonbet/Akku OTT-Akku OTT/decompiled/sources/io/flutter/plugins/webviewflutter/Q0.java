package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.time.InstantKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Q0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ Q0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$onReceivedHttpAuthRequest$12;
        boolean parseIso$lambda$8;
        switch (this.a) {
            case 0:
                lambda$onReceivedHttpAuthRequest$12 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedHttpAuthRequest$12((Result) obj);
                return lambda$onReceivedHttpAuthRequest$12;
            default:
                parseIso$lambda$8 = InstantKt.parseIso$lambda$8(((Character) obj).charValue());
                return Boolean.valueOf(parseIso$lambda$8);
        }
    }
}

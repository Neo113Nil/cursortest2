package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.time.InstantKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class O0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ O0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$onHideCustomView$2;
        boolean parseIso$lambda$2;
        switch (this.a) {
            case 0:
                lambda$onHideCustomView$2 = WebChromeClientProxyApi.WebChromeClientImpl.lambda$onHideCustomView$2((Result) obj);
                return lambda$onHideCustomView$2;
            default:
                parseIso$lambda$2 = InstantKt.parseIso$lambda$2(((Character) obj).charValue());
                return Boolean.valueOf(parseIso$lambda$2);
        }
    }
}

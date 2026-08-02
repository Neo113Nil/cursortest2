package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class Y0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ Y0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$doUpdateVisitedHistory$10;
        switch (this.a) {
            case 0:
                lambda$doUpdateVisitedHistory$10 = WebViewClientProxyApi.WebViewClientImpl.lambda$doUpdateVisitedHistory$10((Result) obj);
                return lambda$doUpdateVisitedHistory$10;
            default:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof kotlinx.coroutines.I) {
                    return (kotlinx.coroutines.I) element;
                }
                return null;
        }
    }
}

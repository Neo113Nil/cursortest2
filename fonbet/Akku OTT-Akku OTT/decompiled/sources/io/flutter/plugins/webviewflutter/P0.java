package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.time.InstantKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class P0 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ P0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$onFormResubmission$14;
        boolean parseIso$lambda$4;
        switch (this.a) {
            case 0:
                lambda$onFormResubmission$14 = WebViewClientProxyApi.WebViewClientImpl.lambda$onFormResubmission$14((Result) obj);
                return lambda$onFormResubmission$14;
            default:
                parseIso$lambda$4 = InstantKt.parseIso$lambda$4(((Character) obj).charValue());
                return Boolean.valueOf(parseIso$lambda$4);
        }
    }
}

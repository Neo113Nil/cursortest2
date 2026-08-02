package androidx.datastore.core;

import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.io.File;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterProcessCoordinator _init_$lambda$0;
        Unit lambda$onReceivedLoginRequest$22;
        switch (this.a) {
            case 0:
                _init_$lambda$0 = FileStorage._init_$lambda$0((File) obj);
                return _init_$lambda$0;
            default:
                lambda$onReceivedLoginRequest$22 = WebViewClientProxyApi.WebViewClientImpl.lambda$onReceivedLoginRequest$22((Result) obj);
                return lambda$onReceivedLoginRequest$22;
        }
    }
}

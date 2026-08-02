package androidx.datastore;

import android.content.Context;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List dataStore$lambda$0;
        Unit lambda$onPermissionRequest$6;
        switch (this.a) {
            case 0:
                dataStore$lambda$0 = DataStoreDelegateKt.dataStore$lambda$0((Context) obj);
                return dataStore$lambda$0;
            default:
                lambda$onPermissionRequest$6 = WebChromeClientProxyApi.WebChromeClientImpl.lambda$onPermissionRequest$6((Result) obj);
                return lambda$onPermissionRequest$6;
        }
    }
}

package androidx.media3.common.util;

import android.webkit.WebView;
import com.google.common.util.concurrent.u;
import com.google.common.util.concurrent.x;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Util.lambda$transformFutureAsync$2((u) this.b, (x) this.c, (com.google.common.util.concurrent.h) this.d);
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) this.b).lambda$onLoadResource$17((WebView) this.c, (String) this.d);
                break;
        }
    }
}

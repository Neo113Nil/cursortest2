package androidx.webkit;

import android.content.Context;
import android.webkit.WebView;
import androidx.media3.exoplayer.audio.i;
import androidx.webkit.WebViewCompat;
import com.tekartik.sqflite.u;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                WebViewCompat.lambda$startUpWebView$3((WebViewStartUpConfig) obj3, (WebViewCompat.WebViewStartUpCallback) obj2, (Context) obj);
                break;
            case 1:
                com.tekartik.sqflite.d dVar = (com.tekartik.sqflite.d) obj;
                HashMap hashMap = u.c;
                com.tekartik.sqflite.operation.c cVar = new com.tekartik.sqflite.operation.c((MethodCall) obj3, (MethodChannel.Result) obj2);
                dVar.k(cVar, new i(2, dVar, cVar));
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) obj3).lambda$onPageFinished$3((WebView) obj2, (String) obj);
                break;
        }
    }
}

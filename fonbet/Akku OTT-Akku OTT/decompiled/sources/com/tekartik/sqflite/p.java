package com.tekartik.sqflite;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i) {
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
                d dVar = (d) obj;
                HashMap hashMap = u.c;
                com.tekartik.sqflite.operation.c cVar = new com.tekartik.sqflite.operation.c((MethodCall) obj3, (MethodChannel.Result) obj2);
                dVar.k(cVar, new androidx.fragment.app.strictmode.b(2, dVar, cVar));
                break;
            default:
                ((WebViewClientProxyApi.WebViewClientImpl) obj3).lambda$shouldOverrideUrlLoading$9((WebView) obj2, (WebResourceRequest) obj);
                break;
        }
    }
}

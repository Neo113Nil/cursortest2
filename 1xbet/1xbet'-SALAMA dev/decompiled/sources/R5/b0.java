package R5;

import android.webkit.WebView;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f6132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f6133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f6134d;

    public /* synthetic */ b0(e0 e0Var, WebView webView, String str, int i7) {
        this.f6131a = i7;
        this.f6132b = e0Var;
        this.f6133c = webView;
        this.f6134d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6131a) {
            case 0:
                C0410f c0410f = new C0410f(3);
                e0 e0Var = this.f6132b;
                T t7 = e0Var.f6159a;
                WebView webView = this.f6133c;
                String str = this.f6134d;
                t7.getClass();
                t6.h.e(e0Var, "pigeon_instanceArg");
                t6.h.e(webView, "webViewArg");
                t6.h.e(str, "urlArg");
                I4.j jVar = t7.f6101a;
                jVar.getClass();
                A5.f fVar = (A5.f) jVar.f3678b;
                new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", jVar.a(), (Object) null, 1).L(p050g6.i.M0(e0Var, webView, str), new O(5, c0410f));
                break;
            case 1:
                C0410f c0410f2 = new C0410f(3);
                e0 e0Var2 = this.f6132b;
                T t8 = e0Var2.f6159a;
                WebView webView2 = this.f6133c;
                String str2 = this.f6134d;
                t8.getClass();
                t6.h.e(e0Var2, "pigeon_instanceArg");
                t6.h.e(webView2, "webViewArg");
                t6.h.e(str2, "urlArg");
                I4.j jVar2 = t8.f6101a;
                jVar2.getClass();
                A5.f fVar2 = (A5.f) jVar2.f3678b;
                new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", jVar2.a(), (Object) null, 1).L(p050g6.i.M0(e0Var2, webView2, str2), new O(0, c0410f2));
                break;
            case 2:
                C0410f c0410f3 = new C0410f(3);
                e0 e0Var3 = this.f6132b;
                T t9 = e0Var3.f6159a;
                WebView webView3 = this.f6133c;
                String str3 = this.f6134d;
                t9.getClass();
                t6.h.e(e0Var3, "pigeon_instanceArg");
                t6.h.e(webView3, "viewArg");
                t6.h.e(str3, "urlArg");
                I4.j jVar3 = t9.f6101a;
                jVar3.getClass();
                A5.f fVar3 = (A5.f) jVar3.f3678b;
                new F0(fVar3, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", jVar3.a(), (Object) null, 1).L(p050g6.i.M0(e0Var3, webView3, str3), new O(3, c0410f3));
                break;
            case 3:
                C0410f c0410f4 = new C0410f(3);
                e0 e0Var4 = this.f6132b;
                T t10 = e0Var4.f6159a;
                WebView webView4 = this.f6133c;
                String str4 = this.f6134d;
                t10.getClass();
                t6.h.e(e0Var4, "pigeon_instanceArg");
                t6.h.e(webView4, "webViewArg");
                t6.h.e(str4, "urlArg");
                I4.j jVar4 = t10.f6101a;
                jVar4.getClass();
                A5.f fVar4 = (A5.f) jVar4.f3678b;
                new F0(fVar4, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", jVar4.a(), (Object) null, 1).L(p050g6.i.M0(e0Var4, webView4, str4), new O(9, c0410f4));
                break;
            default:
                C0410f c0410f5 = new C0410f(3);
                e0 e0Var5 = this.f6132b;
                T t11 = e0Var5.f6159a;
                WebView webView5 = this.f6133c;
                String str5 = this.f6134d;
                t11.getClass();
                t6.h.e(e0Var5, "pigeon_instanceArg");
                t6.h.e(webView5, "viewArg");
                t6.h.e(str5, "urlArg");
                I4.j jVar5 = t11.f6101a;
                jVar5.getClass();
                A5.f fVar5 = (A5.f) jVar5.f3678b;
                new F0(fVar5, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", jVar5.a(), (Object) null, 1).L(p050g6.i.M0(e0Var5, webView5, str5), new O(8, c0410f5));
                break;
        }
    }
}

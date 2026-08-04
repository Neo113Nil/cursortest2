package R5;

import android.webkit.WebView;
import io.sentry.IScopes;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6149e;

    public /* synthetic */ c0(int i7, Object obj, Object obj2, Object obj3, boolean z4) {
        this.f6145a = i7;
        this.f6147c = obj;
        this.f6148d = obj2;
        this.f6149e = obj3;
        this.f6146b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6145a) {
            case 0:
                C0410f c0410f = new C0410f(3);
                e0 e0Var = (e0) this.f6147c;
                T t7 = e0Var.f6159a;
                WebView webView = (WebView) this.f6148d;
                String str = (String) this.f6149e;
                boolean z4 = this.f6146b;
                t7.getClass();
                t6.h.e(e0Var, "pigeon_instanceArg");
                t6.h.e(webView, "webViewArg");
                t6.h.e(str, "urlArg");
                I4.j jVar = t7.f6101a;
                jVar.getClass();
                A5.f fVar = (A5.f) jVar.f3678b;
                new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", jVar.a(), (Object) null, 1).L(p050g6.i.M0(e0Var, webView, str, Boolean.valueOf(z4)), new O(1, c0410f));
                break;
            default:
                ((SystemEventsBreadcrumbsIntegration) this.f6147c).lambda$registerReceiver$0((IScopes) this.f6148d, (SentryAndroidOptions) this.f6149e, this.f6146b);
                break;
        }
    }
}

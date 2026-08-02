package E4;

import B4.C0070n;
import B4.EnumC0071o;
import B4.h0;
import R5.C0410f;
import R5.T;
import R5.e0;
import a.AbstractC0603a;
import android.content.Context;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g6.AbstractC1160i;
import io.sentry.ILogger;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import w1.F0;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2217c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2220f;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f2215a = i7;
        this.f2216b = obj;
        this.f2217c = obj2;
        this.f2218d = obj3;
        this.f2219e = obj4;
        this.f2220f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 3;
        Object obj = this.f2220f;
        Object obj2 = this.f2218d;
        Object obj3 = this.f2217c;
        Object obj4 = this.f2216b;
        Object obj5 = this.f2219e;
        switch (this.f2215a) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                Context context = (Context) obj2;
                z zVar = (z) obj5;
                K4.k kVar = (K4.k) obj;
                t tVar = (t) obj4;
                tVar.getClass();
                try {
                    tVar.a(context, (C4.e) Tasks.await(taskCompletionSource.getTask()), zVar, kVar);
                    return;
                } catch (InterruptedException | ExecutionException e7) {
                    throw new RuntimeException(e7);
                }
            case 1:
                H5.m mVar = (H5.m) obj3;
                String str = (String) obj2;
                String str2 = (String) obj5;
                E5.r rVar = (E5.r) obj;
                HashMap hashMap = H5.e.f3360y;
                H5.e eVar = (H5.e) obj4;
                try {
                    C0070n d7 = H5.e.a(mVar).d(str);
                    h0 h0Var = (h0) eVar.f3365d.get(str2);
                    if (h0Var == null) {
                        rVar.a(new Exception("Transaction.getDocument(): No transaction handler exists for ID: " + str2));
                    } else {
                        rVar.success(AbstractC0603a.r0(h0Var.a(d7), EnumC0071o.f1181a));
                    }
                    return;
                } catch (Exception e8) {
                    Y4.D.R(rVar, e8);
                    return;
                }
            case 2:
                C0410f c0410f = new C0410f(i7);
                e0 e0Var = (e0) obj4;
                T t7 = e0Var.f6159a;
                WebView webView = (WebView) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                t7.getClass();
                t6.h.e(e0Var, "pigeon_instanceArg");
                t6.h.e(webView, "viewArg");
                t6.h.e(str3, "realmArg");
                t6.h.e(str4, "argsArg");
                I4.j jVar = t7.f6101a;
                jVar.getClass();
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", jVar.a(), (Object) null, 1).L(AbstractC1160i.M0(e0Var, webView, str3, (String) obj5, str4), new R5.O(4, c0410f));
                return;
            case 3:
                C0410f c0410f2 = new C0410f(i7);
                e0 e0Var2 = (e0) obj4;
                T t8 = e0Var2.f6159a;
                WebView webView2 = (WebView) obj3;
                HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                String str5 = (String) obj5;
                String str6 = (String) obj;
                t8.getClass();
                t6.h.e(e0Var2, "pigeon_instanceArg");
                t6.h.e(webView2, "webViewArg");
                t6.h.e(httpAuthHandler, "handlerArg");
                t6.h.e(str5, "hostArg");
                t6.h.e(str6, "realmArg");
                I4.j jVar2 = t8.f6101a;
                jVar2.getClass();
                new F0((A5.f) jVar2.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", jVar2.a(), (Object) null, 1).L(AbstractC1160i.M0(e0Var2, webView2, httpAuthHandler, str5, str6), new R5.O(11, c0410f2));
                return;
            default:
                ViewHierarchyEventProcessor.lambda$snapshotViewHierarchy$0((AtomicReference) obj4, (View) obj3, (List) obj2, (CountDownLatch) obj5, (ILogger) obj);
                return;
        }
    }
}

package E4;

import A1.C0043s0;
import A1.RunnableC0032m0;
import B4.AbstractC0060d;
import B4.C0057a;
import B4.C0058b;
import B4.C0059c;
import B4.Y;
import E5.C0199q;
import F2.C0247p;
import G4.C0282o;
import R5.C0410f;
import R5.e0;
import U5.c0;
import Y4.A0;
import Y4.C0582k0;
import Y4.C0584l0;
import Y4.P;
import Y4.Q;
import Y4.S;
import Y4.T;
import Y4.U;
import Y4.V;
import Y4.W;
import Y4.X;
import Y4.Z;
import Y4.v0;
import android.graphics.Canvas;
import android.net.http.SslError;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.C0884t;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.SentryOptions;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.EnvelopeFileObserverIntegration;
import io.sentry.android.core.internal.util.FirstDrawDoneListener;
import io.sentry.android.core.internal.util.ScreenshotUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import p018c2.C0779z;
import p155w1.F0;
import p155w1.P2;

/* JADX INFO: renamed from: E4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0181n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2211e;

    public /* synthetic */ RunnableC0181n(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f2207a = i7;
        this.f2209c = obj;
        this.f2210d = obj2;
        this.f2211e = obj3;
        this.f2208b = obj4;
    }

    /* JADX WARN: Type inference failed for: r2v47, types: [c2.J, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Task taskForException;
        I i7;
        int i8 = 12;
        int i9 = 2;
        int i10 = 3;
        switch (this.f2207a) {
            case 0:
                t tVar = (t) this.f2209c;
                C c3 = (C) this.f2210d;
                Y<AbstractC0060d> y4 = (Y) this.f2211e;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2208b;
                C0043s0 c0043s0 = tVar.f2237i.f2112b;
                if (c0043s0.f552b) {
                    K4.j jVar = (K4.j) c0043s0.f556f;
                    P2 p5 = jVar.f4024a;
                    synchronized (c3) {
                        try {
                            if (c3.f2093d == null) {
                                c3.f2093d = c3.j(c3.f2090a);
                            }
                            i7 = c3.f2093d;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    A0 a0W = p5.w(i7);
                    HashMap map = new HashMap();
                    Y4.Y yX = Z.x();
                    v0 v0VarZ = a0W.z();
                    yX.d();
                    Z.v((Z) yX.f12096b, v0VarZ);
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet = new HashSet();
                    int i11 = 1;
                    for (AbstractC0060d abstractC0060d : y4) {
                        if (!hashSet.contains(abstractC0060d.f1148c)) {
                            String str = abstractC0060d.f1148c;
                            hashSet.add(str);
                            StringBuilder sb = new StringBuilder("aggregate_");
                            int i12 = i11 + 1;
                            sb.append(i11);
                            String string = sb.toString();
                            map.put(string, str);
                            T tZ = X.z();
                            C0582k0 c0582k0Y = C0584l0.y();
                            String strA = abstractC0060d.a();
                            c0582k0Y.d();
                            C0584l0.v((C0584l0) c0582k0Y.f12096b, strA);
                            C0584l0 c0584l0 = (C0584l0) c0582k0Y.b();
                            if (abstractC0060d instanceof C0058b) {
                                U uV = U.v();
                                tZ.d();
                                X.v((X) tZ.f12096b, uV);
                            } else if (abstractC0060d instanceof C0059c) {
                                V vW = W.w();
                                vW.d();
                                W.v((W) vW.f12096b, c0584l0);
                                W w7 = (W) vW.b();
                                tZ.d();
                                X.w((X) tZ.f12096b, w7);
                            } else {
                                if (!(abstractC0060d instanceof C0057a)) {
                                    throw new RuntimeException("Unsupported aggregation");
                                }
                                Q qW = S.w();
                                qW.d();
                                S.v((S) qW.f12096b, c0584l0);
                                S s7 = (S) qW.b();
                                tZ.d();
                                X.x((X) tZ.f12096b, s7);
                            }
                            tZ.d();
                            X.y((X) tZ.f12096b, string);
                            arrayList.add((X) tZ.b());
                            i11 = i12;
                        }
                    }
                    yX.d();
                    Z.w((Z) yX.f12096b, arrayList);
                    Z z4 = (Z) yX.b();
                    Y4.N nY = Y4.O.y();
                    String strY = a0W.y();
                    nY.d();
                    Y4.O.v((Y4.O) nY.f12096b, strY);
                    nY.d();
                    Y4.O.w((Y4.O) nY.f12096b, z4);
                    K4.r rVar = jVar.f4026c;
                    H2.r rVarD = Y4.D.f7691c;
                    if (rVarD == null) {
                        synchronized (Y4.D.class) {
                            try {
                                rVarD = Y4.D.f7691c;
                                if (rVarD == null) {
                                    C0282o c0282oC = H2.r.c();
                                    c0282oC.f3012d = c0.f6470b;
                                    c0282oC.f3013e = H2.r.b("google.firestore.v1.Firestore", "RunAggregationQuery");
                                    c0282oC.f3009a = true;
                                    Y4.O oX = Y4.O.x();
                                    C0884t c0884t = p016b6.c.f10155a;
                                    c0282oC.f3010b = new p016b6.b(oX);
                                    c0282oC.f3011c = new p016b6.b(P.v());
                                    rVarD = c0282oC.d();
                                    Y4.D.f7691c = rVarD;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    Y4.O o7 = (Y4.O) nY.b();
                    rVar.getClass();
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    C0247p c0247p = rVar.f4056d;
                    ((Task) c0247p.f2706a).continueWithTask(((L4.f) c0247p.f2707b).f4359a, new B1.c(12, c0247p, rVarD)).addOnCompleteListener(rVar.f4053a.f4359a, new K4.l(rVar, taskCompletionSource2, o7, 2));
                    taskForException = taskCompletionSource2.getTask().continueWith(jVar.f4025b.f4359a, new B1.c(11, jVar, map));
                    break;
                } else {
                    taskForException = Tasks.forException(new B4.I("Failed to get result from server.", B4.H.UNAVAILABLE));
                }
                taskForException.addOnSuccessListener(new q(0, taskCompletionSource)).addOnFailureListener(new r(0, taskCompletionSource));
                return;
            case 1:
                F5.i iVar = (F5.i) this.f2210d;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f2208b;
                HashMap map2 = F5.c.f2760c;
                F5.c cVar = (F5.c) this.f2209c;
                cVar.getClass();
                try {
                    String str2 = iVar.f2768a;
                    com.google.android.gms.common.internal.D.f(str2, "ApiKey must be set.");
                    String str3 = iVar.f2769b;
                    com.google.android.gms.common.internal.D.f(str3, "ApplicationId must be set.");
                    Y3.l lVar = new Y3.l(str3, str2, iVar.f2773f, iVar.f2776i, iVar.f2770c, iVar.f2774g, iVar.f2771d);
                    try {
                        Looper.prepare();
                        break;
                    } catch (Exception unused) {
                    }
                    String str4 = iVar.f2772e;
                    String str5 = (String) this.f2211e;
                    if (str4 != null) {
                        F5.c.f2760c.put(str5, str4);
                    }
                    Y3.i iVarI = Y3.i.i(lVar, cVar.f2761a, str5);
                    TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC0032m0(cVar, iVarI, taskCompletionSource4, 6));
                    taskCompletionSource3.setResult((F5.j) Tasks.await(taskCompletionSource4.getTask()));
                    return;
                } catch (Exception e7) {
                    taskCompletionSource3.setException(e7);
                    return;
                }
            case 2:
                H5.m mVar = (H5.m) this.f2209c;
                String str6 = (String) this.f2210d;
                C0199q c0199q = (C0199q) this.f2211e;
                H5.s sVar = (H5.s) this.f2208b;
                try {
                    B4.Z z7 = (B4.Z) Tasks.await(H5.e.a(mVar).f(str6));
                    if (z7 == null) {
                        c0199q.a(new NullPointerException("Named query has not been found. Please check it has been loaded properly via loadBundle()."));
                    } else {
                        c0199q.success(p003a.a.s0((B4.c0) Tasks.await(z7.c(p003a.a.k0(sVar.f3403a))), p003a.a.j0(sVar.f3404b)));
                    }
                    return;
                } catch (Exception e8) {
                    Y4.D.R(c0199q, e8);
                    return;
                }
            case 3:
                C0410f c0410f = new C0410f(i10);
                e0 e0Var = (e0) this.f2209c;
                R5.T t7 = e0Var.f6159a;
                WebView webView = (WebView) this.f2210d;
                Message message = (Message) this.f2211e;
                Message message2 = (Message) this.f2208b;
                t7.getClass();
                t6.h.e(e0Var, "pigeon_instanceArg");
                t6.h.e(webView, "viewArg");
                t6.h.e(message, "dontResendArg");
                t6.h.e(message2, "resendArg");
                I4.j jVar2 = t7.f6101a;
                jVar2.getClass();
                new F0((A5.f) jVar2.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", jVar2.a(), (Object) null, 1).L(p050g6.i.M0(e0Var, webView, message, message2), new R5.O(i8, c0410f));
                return;
            case 4:
                C0410f c0410f2 = new C0410f(i10);
                e0 e0Var2 = (e0) this.f2209c;
                R5.T t8 = e0Var2.f6159a;
                WebView webView2 = (WebView) this.f2210d;
                SslErrorHandler sslErrorHandler = (SslErrorHandler) this.f2211e;
                SslError sslError = (SslError) this.f2208b;
                t8.getClass();
                t6.h.e(e0Var2, "pigeon_instanceArg");
                t6.h.e(webView2, "viewArg");
                t6.h.e(sslErrorHandler, "handlerArg");
                t6.h.e(sslError, "errorArg");
                I4.j jVar3 = t8.f6101a;
                jVar3.getClass();
                new F0((A5.f) jVar3.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", jVar3.a(), (Object) null, 1).L(p050g6.i.M0(e0Var2, webView2, sslErrorHandler, sslError), new R5.O(13, c0410f2));
                return;
            case 5:
                C0410f c0410f3 = new C0410f(i10);
                e0 e0Var3 = (e0) this.f2209c;
                R5.T t9 = e0Var3.f6159a;
                t9.getClass();
                WebView webView3 = (WebView) this.f2210d;
                t6.h.e(webView3, "webViewArg");
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.f2211e;
                t6.h.e(webResourceRequest, "requestArg");
                WebResourceError webResourceError = (WebResourceError) this.f2208b;
                t6.h.e(webResourceError, "errorArg");
                I4.j jVar4 = t9.f6101a;
                jVar4.getClass();
                new F0((A5.f) jVar4.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", jVar4.a(), (Object) null, 1).L(p050g6.i.M0(e0Var3, webView3, webResourceRequest, webResourceError), new R5.M(c0410f3, 4));
                return;
            case 6:
                C0410f c0410f4 = new C0410f(i10);
                e0 e0Var4 = (e0) this.f2209c;
                R5.T t10 = e0Var4.f6159a;
                WebView webView4 = (WebView) this.f2210d;
                WebResourceRequest webResourceRequest2 = (WebResourceRequest) this.f2211e;
                WebResourceResponse webResourceResponse = (WebResourceResponse) this.f2208b;
                t10.getClass();
                t6.h.e(e0Var4, "pigeon_instanceArg");
                t6.h.e(webView4, "webViewArg");
                t6.h.e(webResourceRequest2, "requestArg");
                t6.h.e(webResourceResponse, "responseArg");
                I4.j jVar5 = t10.f6101a;
                jVar5.getClass();
                new F0((A5.f) jVar5.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", jVar5.a(), (Object) null, 1).L(p050g6.i.M0(e0Var4, webView4, webResourceRequest2, webResourceResponse), new R5.O(i9, c0410f4));
                return;
            case 7:
                this.f2210d.r(((p018c2.I) this.f2209c).f10179a, (p018c2.D) this.f2211e, (C0779z) this.f2208b);
                return;
            case 8:
                ((A5.p) ((A5.p) this.f2209c).f679b).error((String) this.f2210d, (String) this.f2211e, this.f2208b);
                return;
            case 9:
                ((EnvelopeFileObserverIntegration) this.f2209c).lambda$register$0((IScopes) this.f2210d, (SentryOptions) this.f2211e, (String) this.f2208b);
                return;
            case 10:
                FirstDrawDoneListener.lambda$registerForNextDraw$0((Window) this.f2209c, (Window.Callback) this.f2210d, (Runnable) this.f2211e, (BuildInfoProvider) this.f2208b);
                return;
            default:
                ScreenshotUtils.lambda$captureScreenshot$1((View) this.f2209c, (Canvas) this.f2210d, (ILogger) this.f2211e, (CountDownLatch) this.f2208b);
                return;
        }
    }
}

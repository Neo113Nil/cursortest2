package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.internal.js.AppMetricaInitializerJsInterface;
import io.appmetrica.analytics.internal.js.AppMetricaJsInterface;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817s1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0946x0 f8271a;

    /* renamed from: b, reason: collision with root package name */
    public final Io f8272b;

    /* renamed from: c, reason: collision with root package name */
    public final C0860ti f8273c;

    /* renamed from: d, reason: collision with root package name */
    public final L7 f8274d;

    /* renamed from: e, reason: collision with root package name */
    public final C0656ll f8275e;
    public final I2 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0606jn f8276g;

    /* renamed from: h, reason: collision with root package name */
    public final C0398bl f8277h;

    public C0817s1(C0946x0 c0946x0, I2 i22, C0656ll c0656ll, Io io2, C0606jn c0606jn, C0860ti c0860ti, L7 l7, C0398bl c0398bl) {
        this.f8271a = c0946x0;
        this.f8272b = io2;
        this.f8273c = c0860ti;
        this.f8274d = l7;
        this.f = i22;
        this.f8276g = c0606jn;
        this.f8275e = c0656ll;
        this.f8277h = c0398bl;
    }

    public static IHandlerExecutor c() {
        return C0587j4.l().f7572c.a();
    }

    public final void a(Context context, AppMetricaConfig appMetricaConfig) {
        I2 i22 = this.f;
        i22.f.a(context);
        i22.f6058b.a(appMetricaConfig);
        C0606jn c0606jn = this.f8276g;
        Context applicationContext = context.getApplicationContext();
        c0606jn.f7670e.a(applicationContext);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(appMetricaConfig.apiKey);
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, Boolean.TRUE)).booleanValue()) {
            orCreatePublicLogger.info("Session auto tracking enabled", new Object[0]);
            c0606jn.f7669d.a();
        } else {
            orCreatePublicLogger.info("Session auto tracking disabled", new Object[0]);
        }
        c0606jn.f7666a.getClass();
        C0920w0 a3 = C0920w0.a(applicationContext);
        a3.f8539d.a(appMetricaConfig, a3);
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new F0.a(this, context, appMetricaConfig, 8));
        this.f8271a.getClass();
        C0946x0.b();
    }

    public final String b() {
        this.f8271a.getClass();
        C0920w0 c0920w0 = C0920w0.f8534e;
        if (c0920w0 == null) {
            return null;
        }
        return c0920w0.f().e();
    }

    public final C0777qc d() {
        this.f8271a.getClass();
        return C0920w0.f8534e.f().i();
    }

    public final void e() {
        d().f8150a.a(this.f8277h.a());
    }

    public final void f() {
        this.f.f6057a.a(null);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new U0(this));
    }

    public final void c(Activity activity) {
        this.f.f6057a.a(null);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0481f1(this, activity));
    }

    public final void b(Context context, AppMetricaConfig appMetricaConfig) {
        C0946x0 c0946x0 = this.f8271a;
        Context applicationContext = context.getApplicationContext();
        c0946x0.getClass();
        C0920w0 a3 = C0920w0.a(applicationContext);
        a3.f().b(this.f8274d.a(appMetricaConfig));
        Context context2 = a3.f8536a;
        ((G9) C0587j4.l().f7572c.a()).execute(new RunnableC0895v1(context2));
    }

    public final void e(String str) {
        this.f.getClass();
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new S0(this, str));
    }

    public final void d(String str) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6065j.a(str);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new N0(this, str));
    }

    public C0817s1() {
        this(C0587j4.l().d(), new Io());
    }

    public final void c(String str, String str2) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6074s.a(str);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0688n1(this, str, str2));
    }

    public C0817s1(C0946x0 c0946x0, Io io2) {
        this(c0946x0, new I2(c0946x0), new C0656ll(c0946x0), io2, new C0606jn(c0946x0, io2), C0860ti.a(), C0587j4.l().j(), C0587j4.l().o());
    }

    public final void d(String str, String str2) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        if (i22.f6070o.a(str).f8320a) {
            this.f8276g.getClass();
            IHandlerExecutor c3 = c();
            ((G9) c3).f5983b.post(new RunnableC0404c1(this, str, str2));
        }
    }

    public final void b(String str) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6074s.a(str);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0662m1(this, str));
    }

    public final void c(boolean z3) {
        this.f.getClass();
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new P0(this, z3));
    }

    public final void a(Activity activity) {
        this.f.f6057a.a(null);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0636l1(this, activity));
    }

    public final void b(Activity activity) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6059c.a(activity);
        this.f8276g.getClass();
        Intent a3 = C0606jn.a(activity);
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new K0(this, a3));
    }

    public final void c(String str) {
        if (this.f8275e.a((Void) null).f8320a && this.f.f6069n.a(str).f8320a) {
            this.f8276g.getClass();
            IHandlerExecutor c3 = c();
            ((G9) c3).f5983b.post(new RunnableC0430d1(this, str));
        }
    }

    public final void a(Application application) {
        this.f.f6061e.a(application);
        this.f8276g.f7668c.a(application);
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new G0.m(21, this));
    }

    public final void b(boolean z3) {
        this.f.getClass();
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new R0(this, z3));
    }

    public final void b(String str, String str2) {
        this.f.f6067l.a(str);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0352a1(this, str, str2));
    }

    public final void a(String str, Map<String, Object> map) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6074s.a(str);
        this.f8276g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0714o1(this, str, listFromMap));
    }

    public final void b(Object... objArr) {
        this.f.f6057a.a(null);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new com.startapp.sdk.ads.nativead.k(1, objArr));
    }

    public final void a(String str, Throwable th) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6075t.a(str);
        this.f8276g.getClass();
        if (th == null) {
            th = new W1();
            th.fillInStackTrace();
        }
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0740p1(this, str, th));
    }

    public final void b(Context context) {
        this.f.f.a(context);
        this.f8276g.f7670e.a(context);
        this.f8271a.getClass();
        C0920w0.a(context);
    }

    public final void a(String str, String str2, Throwable th) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6076u.a(str);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0766q1(this, str, str2, th));
    }

    public final void a(Throwable th) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6077v.a(th);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0791r1(this, th));
    }

    public final void a(String str) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6064i.a(str);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new L0(this, str));
    }

    public final void a(Intent intent) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6060d.a(intent);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new M0(this, intent));
    }

    public final void a(Location location) {
        this.f.getClass();
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new O0(this, location));
    }

    public final void a(boolean z3) {
        this.f.getClass();
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new Q0(this, z3));
    }

    public final void a(UserProfile userProfile) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6078w.a(userProfile);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new T0(this, userProfile));
    }

    public final void a(Revenue revenue) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6079x.a(revenue);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new V0(this, revenue));
    }

    public final void a(AdRevenue adRevenue) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.y.a(adRevenue);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new W0(this, adRevenue));
    }

    public final void a(ECommerceEvent eCommerceEvent) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6080z.a(eCommerceEvent);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new X0(this, eCommerceEvent));
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6062g.a(deferredDeeplinkParametersListener);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new Y0(this, deferredDeeplinkParametersListener));
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6062g.a(deferredDeeplinkListener);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new Z0(this, deferredDeeplinkListener));
    }

    public final Ya a(Context context, String str) {
        I2 i22 = this.f;
        i22.f.a(context);
        i22.f6066k.a(str);
        C0606jn c0606jn = this.f8276g;
        c0606jn.f7670e.a(context.getApplicationContext());
        return this.f8273c.a(context.getApplicationContext(), str);
    }

    public final void a(Context context, ReporterConfig reporterConfig) {
        I2 i22 = this.f;
        i22.f.a(context);
        i22.f6063h.a(reporterConfig);
        C0606jn c0606jn = this.f8276g;
        c0606jn.f7670e.a(context.getApplicationContext());
        C0860ti c0860ti = this.f8273c;
        Context applicationContext = context.getApplicationContext();
        if (((C0653li) c0860ti.f8370a.get(reporterConfig.apiKey)) == null) {
            synchronized (c0860ti.f8370a) {
                try {
                    if (((C0653li) c0860ti.f8370a.get(reporterConfig.apiKey)) == null) {
                        String str = reporterConfig.apiKey;
                        IHandlerExecutor a3 = C0587j4.l().f7572c.a();
                        c0860ti.f8371b.getClass();
                        if (C0920w0.f8534e == null) {
                            ((G9) a3).f5983b.post(new RunnableC0808ri(c0860ti, applicationContext));
                        }
                        C0653li c0653li = new C0653li(applicationContext.getApplicationContext(), str, new C0946x0());
                        c0860ti.f8370a.put(str, c0653li);
                        c0653li.a(reporterConfig);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(WebView webView) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6068m.a(webView);
        Io io2 = this.f8276g.f7667b;
        io2.getClass();
        try {
            if (webView.getSettings().getJavaScriptEnabled()) {
                webView.addJavascriptInterface(new AppMetricaJsInterface(this), "AppMetrica");
                webView.addJavascriptInterface(new AppMetricaInitializerJsInterface(this), "AppMetricaInitializer");
                Fo fo = new Fo();
                synchronized (io2) {
                    try {
                        PublicLogger publicLogger = io2.f6132b;
                        if (publicLogger == null) {
                            io2.f6131a.add(fo);
                        } else {
                            fo.consume(publicLogger);
                        }
                    } finally {
                    }
                }
            } else {
                io2.a(new Go());
            }
        } catch (Throwable th) {
            io2.a(new Ho(th));
        }
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0378b1(this));
    }

    public final IdentifiersResult a(Context context) {
        this.f.f.a(context);
        C0606jn c0606jn = this.f8276g;
        Context applicationContext = context.getApplicationContext();
        c0606jn.f7670e.a(applicationContext);
        c0606jn.f.a(applicationContext);
        return C0587j4.l().a(context.getApplicationContext()).a();
    }

    public final void a(String str, String str2) {
        this.f.getClass();
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0455e1(this, str, str2));
    }

    public final void a() {
        this.f.getClass();
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0507g1(this));
    }

    public final void a(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        I2 i22 = this.f;
        i22.f.a(context);
        i22.f6071p.a(startupParamsCallback);
        C0606jn c0606jn = this.f8276g;
        c0606jn.f7670e.a(context.getApplicationContext());
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0533h1(this, context, startupParamsCallback, list));
    }

    public final void a(AnrListener anrListener) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6072q.a(anrListener);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0559i1(this, anrListener));
    }

    public final void a(ExternalAttribution externalAttribution) {
        I2 i22 = this.f;
        i22.f6057a.a(null);
        i22.f6073r.a(externalAttribution);
        this.f8276g.getClass();
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0584j1(this, externalAttribution));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        ModuleAdRevenueProcessor b3 = C0587j4.l().m().b();
        if (b3 != null) {
            b3.process(objArr);
        }
    }

    public final void a(Map<Thread, StackTraceElement[]> map) {
        this.f.f6056A.a(map);
        this.f8276g.getClass();
        List listFromMap = CollectionUtils.getListFromMap(map);
        IHandlerExecutor c3 = c();
        ((G9) c3).f5983b.post(new RunnableC0610k1(this, listFromMap));
    }

    public static Pa a(C0817s1 c0817s1) {
        return c0817s1.d().f8150a;
    }
}

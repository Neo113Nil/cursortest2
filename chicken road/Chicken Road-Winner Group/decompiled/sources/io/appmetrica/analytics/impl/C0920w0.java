package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import b0.CallableC0160f;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920w0 implements InterfaceC0362ab {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0920w0 f8534e = null;
    public static volatile boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f8535g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8536a;

    /* renamed from: b, reason: collision with root package name */
    public final C0790r0 f8537b;

    /* renamed from: c, reason: collision with root package name */
    public final FutureTask f8538c;

    /* renamed from: d, reason: collision with root package name */
    public final Ia f8539d;

    public C0920w0(Context context) {
        this.f8536a = context;
        C0790r0 c3 = C0587j4.l().c();
        this.f8537b = c3;
        this.f8539d = c3.a(context, C0587j4.l().g());
        this.f8538c = new FutureTask(new CallableC0160f(2, this));
    }

    public static C0920w0 a(Context context) {
        C0920w0 c0920w0;
        C0920w0 c0920w02 = f8534e;
        if (c0920w02 != null) {
            return c0920w02;
        }
        synchronized (C0920w0.class) {
            try {
                c0920w0 = f8534e;
                if (c0920w0 == null) {
                    c0920w0 = new C0920w0(context);
                    c0920w0.j();
                    C0587j4.l().f7572c.a().execute(new RunnableC0894v0(c0920w0));
                    f8534e = c0920w0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0920w0;
    }

    public static void b(boolean z3) {
        c().a(z3, true);
    }

    public static void clearAppEnvironment() {
        c().clearAppEnvironment();
    }

    public static synchronized boolean k() {
        boolean z3;
        synchronized (C0920w0.class) {
            z3 = f;
        }
        return z3;
    }

    public static boolean l() {
        return f8535g;
    }

    public static synchronized boolean m() {
        boolean z3;
        synchronized (C0920w0.class) {
            C0920w0 c0920w0 = f8534e;
            if (c0920w0 != null && c0920w0.f8538c.isDone()) {
                z3 = c0920w0.f().i() != null;
            }
        }
        return z3;
    }

    public static synchronized void n() {
        synchronized (C0920w0.class) {
            f8534e = null;
            f = false;
            f8535g = false;
        }
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        c().putAppEnvironmentValue(str, str2);
    }

    public static synchronized void q() {
        synchronized (C0920w0.class) {
            f = true;
        }
    }

    public static void r() {
        f8535g = true;
    }

    public static C0920w0 s() {
        return f8534e;
    }

    public static void setDataSendingEnabled(boolean z3) {
        c().setDataSendingEnabled(z3);
    }

    public static void setUserProfileID(String str) {
        c().setUserProfileID(str);
    }

    public final void c(AppMetricaConfig appMetricaConfig) {
        this.f8539d.a(appMetricaConfig, this);
    }

    public final void d(AppMetricaConfig appMetricaConfig) {
        f().b(appMetricaConfig);
        C0587j4.l().f7572c.a().execute(new RunnableC0895v1(this.f8536a));
    }

    public final String e() {
        return f().e();
    }

    public final Ja f() {
        try {
            return (Ja) this.f8538c.get();
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Map<String, String> g() {
        return f().g();
    }

    public final AdvIdentifiersResult h() {
        return f().h();
    }

    public final C0777qc i() {
        return f().i();
    }

    public final void j() {
        Z3 z3 = C0587j4.l().f7572c;
        G0.m mVar = new G0.m(22, this);
        z3.f6890a.getClass();
        new InterruptionSafeThread(mVar, "IAA-INIT_CORE-" + Gd.f5987a.incrementAndGet()).start();
    }

    public final void o() {
        C0587j4.l().f7586r.a(this.f8536a);
        new C0433d4(this.f8536a).a(this.f8536a);
        C0587j4.l().a(this.f8536a).a();
        this.f8538c.run();
    }

    public final Ja p() {
        Ja ja;
        C0790r0 c0790r0 = this.f8537b;
        Context context = this.f8536a;
        Ia ia = this.f8539d;
        synchronized (c0790r0) {
            try {
                if (c0790r0.f8184d == null) {
                    if (c0790r0.a(context)) {
                        c0790r0.f8184d = new C0();
                    } else {
                        c0790r0.f8184d = new A0(context, ia);
                    }
                }
                ja = c0790r0.f8184d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ja;
    }

    public final void b(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        f().a(appMetricaLibraryAdapterConfig);
        C0587j4.l().f7572c.a().execute(new RunnableC0895v1(this.f8536a));
    }

    public final Ya c(ReporterConfig reporterConfig) {
        return f().c(reporterConfig);
    }

    public static Oc c() {
        if (m()) {
            return f8534e.f();
        }
        return C0587j4.l().f7571b;
    }

    public final C0464ea d() {
        return f().d();
    }

    public final C0639l4 b() {
        return this.f8539d.a();
    }

    public static void a(Location location) {
        c().a(location);
    }

    public static void a(boolean z3) {
        c().a(z3);
    }

    public static void a(String str, String str2) {
        c().a(str, str2);
    }

    public static void a(String str) {
        c().a(str);
    }

    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        f().a(deferredDeeplinkParametersListener);
    }

    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        f().a(deferredDeeplinkListener);
    }

    public final void a(ReporterConfig reporterConfig) {
        f().a(reporterConfig);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        f().a(startupParamsCallback, list);
    }

    public static synchronized void a(C0920w0 c0920w0) {
        synchronized (C0920w0.class) {
            f8534e = c0920w0;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0362ab
    public final Za a() {
        return f().a();
    }
}

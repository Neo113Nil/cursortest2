package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class A0 implements Ja {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5653a;

    /* renamed from: b, reason: collision with root package name */
    public final Ia f5654b;

    /* renamed from: c, reason: collision with root package name */
    public final C0366af f5655c;

    /* renamed from: d, reason: collision with root package name */
    public final Sl f5656d;

    /* renamed from: e, reason: collision with root package name */
    public final C0729og f5657e;
    public final Gf f;

    /* renamed from: g, reason: collision with root package name */
    public final C0731oi f5658g;

    /* renamed from: h, reason: collision with root package name */
    public final Bi f5659h;

    /* renamed from: i, reason: collision with root package name */
    public final L7 f5660i;

    /* renamed from: j, reason: collision with root package name */
    public final C0398bl f5661j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C0777qc f5662k;

    /* renamed from: l, reason: collision with root package name */
    public final C0661m0 f5663l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5664m;

    public A0(Context context, Ia ia) {
        this.f5653a = context;
        this.f5654b = ia;
        C0366af b3 = C0587j4.l().b(context);
        this.f5655c = b3;
        ArrayList a3 = C1009zd.a();
        C0587j4 l3 = C0587j4.l();
        l3.m().a(new S3(context));
        B0.a(context).a(a3);
        Gf a4 = B0.a(context, B0.a(ia.b(), this));
        this.f = a4;
        L7 j3 = l3.j();
        this.f5660i = j3;
        Bi a5 = B0.a(a4, context, ia.getDefaultExecutor());
        this.f5659h = a5;
        j3.a(a5);
        Sl a6 = B0.a(context, a5, b3, ia.b());
        this.f5656d = a6;
        a5.a(a6);
        this.f5657e = B0.a(a5, b3, ia.b());
        this.f5658g = B0.a(context, a4, a5, ia.b(), a6);
        this.f5661j = l3.o();
        this.f5663l = new C0661m0(b3);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final Ya c(ReporterConfig reporterConfig) {
        return this.f5658g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final C0464ea d() {
        return this.f5656d.e();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final String e() {
        return this.f5656d.d();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final Map<String, String> g() {
        return this.f5656d.b();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final AdvIdentifiersResult h() {
        return this.f5656d.a();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final C0777qc i() {
        return this.f5662k;
    }

    public final Pa j() {
        C0777qc c0777qc = this.f5662k;
        kotlin.jvm.internal.j.b(c0777qc);
        return c0777qc.f8150a;
    }

    public final C0731oi k() {
        return this.f5658g;
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void setDataSendingEnabled(boolean z3) {
        j().setDataSendingEnabled(z3);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C0661m0 c0661m0 = this.f5663l;
        C0868u0 c0868u0 = c0661m0.f7831b;
        c0868u0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c0868u0.f8378a.b() && kotlin.jvm.internal.j.a(c0868u0.f8379b.f7612a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f = c0661m0.f7830a.f();
        if (f != null) {
            if (f.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new C0996z0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z3;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a3 = a(orCreateMainPublicLogger, appMetricaConfig, new C0971y0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a3 || this.f5664m) {
            z3 = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z3 = true;
        }
        if (a3 || z3) {
            this.f5655c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a3) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z3) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f5664m = true;
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.H6
    public final void a(int i3, Bundle bundle) {
        this.f5656d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f5657e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f5657e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(ReporterConfig reporterConfig) {
        this.f5658g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f5656d.a(startupParamsCallback, list, AbstractC0698nb.c(this.f.f5992a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Dc dc, boolean z3) {
        if (this.f5662k == null) {
            a(publicLogger, appMetricaConfig, z3);
            this.f5657e.a();
            C0725oc a3 = dc.a();
            G7 g7 = new G7(a3);
            C0777qc c0777qc = new C0777qc(a3, g7);
            this.f5654b.c().a(g7);
            this.f5662k = c0777qc;
            C0847t5 c0847t5 = this.f5661j.f7065b;
            synchronized (c0847t5) {
                try {
                    c0847t5.f8329a = a3;
                    Iterator it = c0847t5.f8330b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0546he) it.next()).consume(a3);
                    }
                    c0847t5.f8330b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        dc.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z3) {
        Boolean bool = appMetricaConfig.logs;
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(bool)) {
            publicLogger.setEnabled(true);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(true);
        } else {
            publicLogger.setEnabled(false);
            PublicLogger.Companion.getAnonymousInstance().setEnabled(false);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.crashReporting, bool2)).booleanValue()) {
            this.f5654b.d().a(this.f5653a, appMetricaConfig, this);
            this.f5654b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f5654b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f5661j.a();
        } else {
            C0398bl c0398bl = this.f5661j;
            synchronized (c0398bl) {
                if (c0398bl.f7069g) {
                    c0398bl.f7064a.unregisterListener(c0398bl.f7066c, ActivityEvent.RESUMED);
                    c0398bl.f7064a.unregisterListener(c0398bl.f7067d, ActivityEvent.PAUSED);
                    c0398bl.f7069g = false;
                }
            }
        }
        this.f.d(appMetricaConfig);
        Sl sl = this.f5656d;
        sl.f6615e = publicLogger;
        sl.b(appMetricaConfig.customHosts);
        Sl sl2 = this.f5656d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        sl2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f5656d.a(str);
        if (str != null) {
            this.f5656d.b("api");
        }
        this.f5659h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z3));
        this.f5656d.i();
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z3) {
        j().a(z3);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z3, boolean z4) {
        j().a(z3, z4);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.InterfaceC0362ab
    public final Za a() {
        return this.f5658g;
    }
}

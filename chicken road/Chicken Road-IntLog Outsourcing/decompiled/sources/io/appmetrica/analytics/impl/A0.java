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
    public final Context f6481a;

    /* renamed from: b, reason: collision with root package name */
    public final Ia f6482b;

    /* renamed from: c, reason: collision with root package name */
    public final C0515af f6483c;

    /* renamed from: d, reason: collision with root package name */
    public final Sl f6484d;

    /* renamed from: e, reason: collision with root package name */
    public final C0878og f6485e;

    /* renamed from: f, reason: collision with root package name */
    public final Gf f6486f;

    /* renamed from: g, reason: collision with root package name */
    public final C0880oi f6487g;

    /* renamed from: h, reason: collision with root package name */
    public final Bi f6488h;

    /* renamed from: i, reason: collision with root package name */
    public final L7 f6489i;

    /* renamed from: j, reason: collision with root package name */
    public final C0547bl f6490j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C0926qc f6491k;

    /* renamed from: l, reason: collision with root package name */
    public final C0810m0 f6492l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6493m;

    public A0(Context context, Ia ia) {
        this.f6481a = context;
        this.f6482b = ia;
        C0515af b6 = C0736j4.l().b(context);
        this.f6483c = b6;
        ArrayList a6 = C1158zd.a();
        C0736j4 l2 = C0736j4.l();
        l2.m().a(new S3(context));
        B0.a(context).a(a6);
        Gf a7 = B0.a(context, B0.a(ia.b(), this));
        this.f6486f = a7;
        L7 j2 = l2.j();
        this.f6489i = j2;
        Bi a8 = B0.a(a7, context, ia.getDefaultExecutor());
        this.f6488h = a8;
        j2.a(a8);
        Sl a9 = B0.a(context, a8, b6, ia.b());
        this.f6484d = a9;
        a8.a(a9);
        this.f6485e = B0.a(a8, b6, ia.b());
        this.f6487g = B0.a(context, a7, a8, ia.b(), a9);
        this.f6490j = l2.o();
        this.f6492l = new C0810m0(b6);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final Ya c(ReporterConfig reporterConfig) {
        return this.f6487g.b(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void clearAppEnvironment() {
        j().clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final C0613ea d() {
        return this.f6484d.e();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final String e() {
        return this.f6484d.d();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final Map<String, String> g() {
        return this.f6484d.b();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final AdvIdentifiersResult h() {
        return this.f6484d.a();
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final C0926qc i() {
        return this.f6491k;
    }

    public final Pa j() {
        C0926qc c0926qc = this.f6491k;
        kotlin.jvm.internal.i.b(c0926qc);
        return c0926qc.f9092a;
    }

    public final C0880oi k() {
        return this.f6487g;
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void putAppEnvironmentValue(String str, String str2) {
        j().putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void setDataSendingEnabled(boolean z) {
        j().setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void setUserProfileID(String str) {
        j().setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        Boolean bool;
        C0810m0 c0810m0 = this.f6492l;
        C1017u0 c1017u0 = c0810m0.f8756b;
        c1017u0.getClass();
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder("629a824d-c717-4ba5-bc0f-3f3968554d01");
        if (c1017u0.f9329a.b() && kotlin.jvm.internal.i.a(c1017u0.f9330b.f8527a, Boolean.TRUE)) {
            newConfigBuilder.handleFirstActivationAsUpdate(true);
        }
        Boolean bool2 = appMetricaLibraryAdapterConfig.advIdentifiersTracking;
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        newConfigBuilder.withAdvIdentifiersTracking(bool2.booleanValue());
        AppMetricaConfig build = newConfigBuilder.build();
        AppMetricaConfig.Builder f3 = c0810m0.f8755a.f();
        if (f3 != null) {
            if (f3.build().advIdentifiersTracking == null && (bool = build.advIdentifiersTracking) != null) {
                f3.withAdvIdentifiersTracking(bool.booleanValue());
            }
            build = f3.build();
        }
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        if (a(mainPublicOrAnonymousLogger, build, new C1145z0(this, build, mainPublicOrAnonymousLogger), false)) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica in anonymous mode", new Object[0]);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void b(AppMetricaConfig appMetricaConfig) {
        boolean z;
        PublicLogger orCreateMainPublicLogger = LoggerStorage.getOrCreateMainPublicLogger(appMetricaConfig.apiKey);
        boolean a6 = a(orCreateMainPublicLogger, appMetricaConfig, new C1120y0(this, appMetricaConfig, orCreateMainPublicLogger), true);
        if (a6 || this.f6493m) {
            z = false;
        } else {
            a(orCreateMainPublicLogger, appMetricaConfig, true);
            z = true;
        }
        if (a6 || z) {
            this.f6483c.a(appMetricaConfig);
        } else {
            orCreateMainPublicLogger.warning("AppMetrica SDK already has been activated", new Object[0]);
        }
        if (a6) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Activate AppMetrica with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        if (z) {
            ImportantLogger.INSTANCE.info("AppMetrica", "Upgrade AppMetrica anonymous mode to normal with APIKey " + ApiKeyUtils.createPartialApiKey(appMetricaConfig.apiKey), new Object[0]);
        }
        this.f6493m = true;
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.H6
    public final void a(int i2, Bundle bundle) {
        this.f6484d.b(bundle, null);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f6485e.a(deferredDeeplinkParametersListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f6485e.a(deferredDeeplinkListener);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(ReporterConfig reporterConfig) {
        this.f6487g.a(reporterConfig);
    }

    @Override // io.appmetrica.analytics.impl.Ja
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        this.f6484d.a(startupParamsCallback, list, AbstractC0847nb.c(this.f6486f.f6837a.getAsString("PROCESS_CFG_CLIDS")));
    }

    public final boolean a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, Dc dc, boolean z) {
        if (this.f6491k == null) {
            a(publicLogger, appMetricaConfig, z);
            this.f6485e.a();
            C0874oc a6 = dc.a();
            G7 g7 = new G7(a6);
            C0926qc c0926qc = new C0926qc(a6, g7);
            this.f6482b.c().a(g7);
            this.f6491k = c0926qc;
            C0996t5 c0996t5 = this.f6490j.f7951b;
            synchronized (c0996t5) {
                try {
                    c0996t5.f9277a = a6;
                    Iterator it = c0996t5.f9278b.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0695he) it.next()).consume(a6);
                    }
                    c0996t5.f9278b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        dc.a();
        return false;
    }

    public final void a(PublicLogger publicLogger, AppMetricaConfig appMetricaConfig, boolean z) {
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
            this.f6482b.d().a(this.f6481a, appMetricaConfig, this);
            this.f6482b.d().b();
            publicLogger.info("Register application crash handler", new Object[0]);
        } else {
            this.f6482b.d().a();
            publicLogger.info("Disable all crash handlers", new Object[0]);
        }
        if (((Boolean) WrapUtils.getOrDefault(appMetricaConfig.sessionsAutoTrackingEnabled, bool2)).booleanValue()) {
            this.f6490j.a();
        } else {
            C0547bl c0547bl = this.f6490j;
            synchronized (c0547bl) {
                if (c0547bl.f7956g) {
                    c0547bl.f7950a.unregisterListener(c0547bl.f7952c, ActivityEvent.RESUMED);
                    c0547bl.f7950a.unregisterListener(c0547bl.f7953d, ActivityEvent.PAUSED);
                    c0547bl.f7956g = false;
                }
            }
        }
        this.f6486f.d(appMetricaConfig);
        Sl sl = this.f6484d;
        sl.f7484e = publicLogger;
        sl.b(appMetricaConfig.customHosts);
        Sl sl2 = this.f6484d;
        Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        sl2.a(obj instanceof Map ? (Map) obj : null);
        String str = (String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        this.f6484d.a(str);
        if (str != null) {
            this.f6484d.b("api");
        }
        this.f6488h.a(appMetricaConfig.locationTracking, appMetricaConfig.dataSendingEnabled, appMetricaConfig.advIdentifiersTracking, Boolean.valueOf(z));
        this.f6484d.i();
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        j().a(location);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z) {
        j().a(z);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z, boolean z5) {
        j().a(z, z5);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        j().a(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        j().a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ja, io.appmetrica.analytics.impl.InterfaceC0511ab
    public final Za a() {
        return this.f6487g;
    }
}

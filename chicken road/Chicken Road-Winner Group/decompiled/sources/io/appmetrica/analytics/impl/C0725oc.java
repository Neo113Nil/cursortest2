package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725oc extends Q2 implements Pa {

    /* renamed from: s, reason: collision with root package name */
    public static final Long f7989s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final Gn f7990p;

    /* renamed from: q, reason: collision with root package name */
    public final C1008zc f7991q;

    /* renamed from: r, reason: collision with root package name */
    public final C0751pc f7992r;

    public C0725oc(C1008zc c1008zc) {
        super(c1008zc.b(), c1008zc.i(), c1008zc.h(), c1008zc.d(), c1008zc.f(), c1008zc.j(), c1008zc.g(), c1008zc.c(), c1008zc.a(), c1008zc.e());
        this.f7990p = new Gn(new C0520ge("Referral url"));
        this.f7991q = c1008zc;
        this.f7992r = new C0751pc(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0635l0 c0635l0) {
        if (c0635l0.f7729b) {
            clearAppEnvironment();
        }
        List<String> list = c0635l0.f7728a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f6442b.f6383b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.f6443c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            Id id = this.f7991q.f8672c;
            Context context = this.f6441a;
            id.f6104d = new F0(this.f6442b.f6383b.getApiKey(), id.f6101a.f5992a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, id.f6101a.f5992a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), id.f6101a.f5992a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f6442b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = id.f6102b;
                G0 g02 = id.f6103c;
                F0 f0 = id.f6104d;
                if (f0 == null) {
                    kotlin.jvm.internal.j.g("nativeCrashMetadata");
                    throw null;
                }
                g02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, G0.a(f0)));
            }
        }
        C0751pc c0751pc = this.f7992r;
        synchronized (c0751pc) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c0751pc.f8066a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c0751pc.f8067b.a(c0751pc.f8066a);
                } else {
                    c0751pc.f8067b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void b(Activity activity) {
        if (this.f7991q.f8677i.a(activity, EnumC0738p.PAUSED)) {
            this.f6443c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C0689n2 c0689n2 = this.f7991q.f8675g;
            synchronized (c0689n2) {
                for (C0663m2 c0663m2 : c0689n2.f7907a) {
                    if (!c0663m2.f7837d) {
                        c0663m2.f7837d = true;
                        c0663m2.f7835b.executeDelayed(c0663m2.f7838e, c0663m2.f7836c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c() {
        C0751pc c0751pc = this.f7992r;
        synchronized (c0751pc) {
            c0751pc.f8067b.a(c0751pc.f8066a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final List<String> f() {
        return this.f6442b.f6382a.b();
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final void k() {
        super.k();
        C0587j4.l().m().c();
    }

    public final void l() {
        Bi bi = this.f6447h;
        bi.f5774c.a(this.f6442b.f6382a);
        C0689n2 c0689n2 = this.f7991q.f8675g;
        C0699nc c0699nc = new C0699nc(this);
        long longValue = f7989s.longValue();
        synchronized (c0689n2) {
            c0689n2.a(c0699nc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c(String str) {
        this.f7990p.a(str);
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "referral");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.FALSE);
        String b3 = AbstractC0698nb.b(hashMap);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(b3, "", 8208, 0, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6443c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(String str, boolean z3) {
        this.f6443c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z3));
        String b3 = AbstractC0698nb.b(hashMap);
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(b3, "", 8208, 0, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(EnumC0686n enumC0686n) {
        if (enumC0686n == EnumC0686n.f7898b) {
            this.f6443c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f6443c.warning("Could not enable activity auto tracking. " + enumC0686n.f7902a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(Activity activity) {
        if (this.f7991q.f8677i.a(activity, EnumC0738p.RESUMED)) {
            this.f6443c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C0689n2 c0689n2 = this.f7991q.f8675g;
            synchronized (c0689n2) {
                for (C0663m2 c0663m2 : c0689n2.f7907a) {
                    if (c0663m2.f7837d) {
                        c0663m2.f7837d = false;
                        c0663m2.f7835b.remove(c0663m2.f7838e);
                        C0725oc c0725oc = c0663m2.f7834a.f7933a;
                        c0725oc.f6447h.f5774c.b(c0725oc.f6442b.f6382a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        this.f6442b.f6383b.setManualLocation(location);
        this.f6443c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z3) {
        this.f6442b.f6383b.setLocationTracking(z3);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z3, boolean z4) {
        this.f6443c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z3));
        this.f6442b.f6383b.setAdvIdentifiersTracking(z3, z4);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(Io io2) {
        PublicLogger publicLogger = this.f6443c;
        synchronized (io2) {
            io2.f6132b = publicLogger;
        }
        Iterator it = io2.f6131a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        io2.f6131a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(AnrListener anrListener) {
        this.f7992r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(ExternalAttribution externalAttribution) {
        this.f6443c.info("External attribution received: %s", externalAttribution);
        Bi bi = this.f6447h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(bytes, "", 42, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        super.a(str, str2);
        Id id = this.f7991q.f8672c;
        String d3 = this.f6442b.d();
        F0 f0 = id.f6104d;
        if (f0 != null) {
            F0 f02 = new F0(f0.f5920a, f0.f5921b, f0.f5922c, f0.f5923d, f0.f5924e, d3);
            id.f6104d = f02;
            NativeCrashClientModule nativeCrashClientModule = id.f6102b;
            id.f6103c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(G0.a(f02));
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        this.f6443c.info("Add auto collected data subscriber: %s", str);
        this.f6442b.f6383b.addAutoCollectedDataSubscriber(str);
    }
}

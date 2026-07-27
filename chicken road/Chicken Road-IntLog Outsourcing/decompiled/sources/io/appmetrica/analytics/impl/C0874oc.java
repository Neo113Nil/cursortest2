package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
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
public final class C0874oc extends Q2 implements Pa {

    /* renamed from: s, reason: collision with root package name */
    public static final Long f8920s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* renamed from: p, reason: collision with root package name */
    public final Gn f8921p;

    /* renamed from: q, reason: collision with root package name */
    public final C1157zc f8922q;

    /* renamed from: r, reason: collision with root package name */
    public final C0900pc f8923r;

    public C0874oc(C1157zc c1157zc) {
        super(c1157zc.b(), c1157zc.i(), c1157zc.h(), c1157zc.d(), c1157zc.f(), c1157zc.j(), c1157zc.g(), c1157zc.c(), c1157zc.a(), c1157zc.e());
        this.f8921p = new Gn(new C0669ge("Referral url"));
        this.f8922q = c1157zc;
        this.f8923r = new C0900pc(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C0784l0 c0784l0) {
        if (c0784l0.f8650b) {
            clearAppEnvironment();
        }
        List<String> list = c0784l0.f8649a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f7300b.f7239b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean booleanValue = bool.booleanValue();
        this.f7301c.info("native crash reporting enabled: %b", bool);
        if (booleanValue) {
            Id id = this.f8922q.f9633c;
            Context context = this.f7299a;
            id.f6954d = new F0(this.f7300b.f7239b.getApiKey(), id.f6951a.f6837a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, id.f6951a.f6837a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), id.f6951a.f6837a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f7300b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = id.f6952b;
                G0 g02 = id.f6953c;
                F0 f02 = id.f6954d;
                if (f02 == null) {
                    kotlin.jvm.internal.i.l("nativeCrashMetadata");
                    throw null;
                }
                g02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, G0.a(f02)));
            }
        }
        C0900pc c0900pc = this.f8923r;
        synchronized (c0900pc) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c0900pc.f9002a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c0900pc.f9003b.a(c0900pc.f9002a);
                } else {
                    c0900pc.f9003b.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void b(Activity activity) {
        if (this.f8922q.f9639i.a(activity, EnumC0887p.PAUSED)) {
            this.f7301c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C0838n2 c0838n2 = this.f8922q.f9637g;
            synchronized (c0838n2) {
                for (C0812m2 c0812m2 : c0838n2.f8835a) {
                    if (!c0812m2.f8762d) {
                        c0812m2.f8762d = true;
                        c0812m2.f8760b.executeDelayed(c0812m2.f8763e, c0812m2.f8761c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c() {
        C0900pc c0900pc = this.f8923r;
        synchronized (c0900pc) {
            c0900pc.f9003b.a(c0900pc.f9002a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final List<String> f() {
        return this.f7300b.f7238a.b();
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final void k() {
        super.k();
        C0736j4.l().m().c();
    }

    public final void l() {
        Bi bi = this.f7306h;
        bi.f6607c.a(this.f7300b.f7238a);
        C0838n2 c0838n2 = this.f8922q.f9637g;
        C0848nc c0848nc = new C0848nc(this);
        long longValue = f8920s.longValue();
        synchronized (c0838n2) {
            c0838n2.a(c0848nc, longValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c(String str) {
        this.f8921p.a(str);
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewManager.EVENT_TYPE_KEY, "referral");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.FALSE);
        String b6 = AbstractC0847nb.b(hashMap);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(b6, "", 8208, 0, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        this.f7301c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(String str, boolean z) {
        this.f7301c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewManager.EVENT_TYPE_KEY, "open");
        hashMap.put("link", str);
        hashMap.put("auto", Boolean.valueOf(z));
        String b6 = AbstractC0847nb.b(hashMap);
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(b6, "", 8208, 0, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(EnumC0835n enumC0835n) {
        if (enumC0835n == EnumC0835n.f8826b) {
            this.f7301c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f7301c.warning("Could not enable activity auto tracking. " + enumC0835n.f8830a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(Activity activity) {
        if (this.f8922q.f9639i.a(activity, EnumC0887p.RESUMED)) {
            this.f7301c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C0838n2 c0838n2 = this.f8922q.f9637g;
            synchronized (c0838n2) {
                for (C0812m2 c0812m2 : c0838n2.f8835a) {
                    if (c0812m2.f8762d) {
                        c0812m2.f8762d = false;
                        c0812m2.f8760b.remove(c0812m2.f8763e);
                        C0874oc c0874oc = c0812m2.f8759a.f8863a;
                        c0874oc.f7306h.f6607c.b(c0874oc.f7300b.f7238a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(Location location) {
        this.f7300b.f7239b.setManualLocation(location);
        this.f7301c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z) {
        this.f7300b.f7239b.setLocationTracking(z);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z, boolean z5) {
        this.f7301c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z));
        this.f7300b.f7239b.setAdvIdentifiersTracking(z, z5);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(Io io2) {
        PublicLogger publicLogger = this.f7301c;
        synchronized (io2) {
            io2.f6983b = publicLogger;
        }
        Iterator it = io2.f6982a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        io2.f6982a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(AnrListener anrListener) {
        this.f8923r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(ExternalAttribution externalAttribution) {
        this.f7301c.info("External attribution received: %s", externalAttribution);
        Bi bi = this.f7306h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(bytes, "", 42, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        super.a(str, str2);
        Id id = this.f8922q.f9633c;
        String d6 = this.f7300b.d();
        F0 f02 = id.f6954d;
        if (f02 != null) {
            F0 f03 = new F0(f02.f6761a, f02.f6762b, f02.f6763c, f02.f6764d, f02.f6765e, d6);
            id.f6954d = f03;
            NativeCrashClientModule nativeCrashClientModule = id.f6952b;
            id.f6953c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(G0.a(f03));
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(String str) {
        this.f7301c.info("Add auto collected data subscriber: %s", str);
        this.f7300b.f7239b.addAutoCollectedDataSubscriber(str);
    }
}

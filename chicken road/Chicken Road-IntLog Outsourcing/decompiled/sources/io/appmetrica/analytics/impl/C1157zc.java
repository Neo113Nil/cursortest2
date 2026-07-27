package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157zc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9631a;

    /* renamed from: b, reason: collision with root package name */
    public final Bi f9632b;

    /* renamed from: c, reason: collision with root package name */
    public final Id f9633c;

    /* renamed from: d, reason: collision with root package name */
    public final T9 f9634d;

    /* renamed from: e, reason: collision with root package name */
    public final I8 f9635e;

    /* renamed from: f, reason: collision with root package name */
    public final Kh f9636f;

    /* renamed from: g, reason: collision with root package name */
    public final C0838n2 f9637g;

    /* renamed from: h, reason: collision with root package name */
    public final C1126y6 f9638h;

    /* renamed from: i, reason: collision with root package name */
    public final C0913q f9639i;

    /* renamed from: j, reason: collision with root package name */
    public final Oe f9640j;

    /* renamed from: k, reason: collision with root package name */
    public final Tn f9641k;

    /* renamed from: l, reason: collision with root package name */
    public final Jg f9642l;

    /* renamed from: m, reason: collision with root package name */
    public final C6 f9643m;

    /* renamed from: n, reason: collision with root package name */
    public final C0578d0 f9644n;

    public C1157zc(Context context, Gf gf, Bi bi, Sl sl) {
        this.f9631a = context;
        this.f9632b = bi;
        this.f9633c = new Id(gf);
        T9 t9 = new T9(context);
        this.f9634d = t9;
        I8 i8 = new I8(new C1064vl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f9635e = i8;
        this.f9636f = new Kh(gf, new CounterConfiguration(CounterConfigurationReporterType.MAIN), i8);
        this.f9637g = new C0838n2();
        this.f9638h = C0736j4.l().n();
        this.f9639i = new C0913q();
        this.f9640j = new Oe(t9);
        this.f9641k = new Tn();
        this.f9642l = new Jg();
        this.f9643m = new C6();
        this.f9644n = new C0578d0();
    }

    public final C0578d0 a() {
        return this.f9644n;
    }

    public final Context b() {
        return this.f9631a;
    }

    public final C6 c() {
        return this.f9643m;
    }

    public final T9 d() {
        return this.f9634d;
    }

    public final Oe e() {
        return this.f9640j;
    }

    public final C1126y6 f() {
        return this.f9638h;
    }

    public final Jg g() {
        return this.f9642l;
    }

    public final Kh h() {
        return this.f9636f;
    }

    public final Bi i() {
        return this.f9632b;
    }

    public final Tn j() {
        return this.f9641k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f9636f.f7239b.applyFromConfig(appMetricaConfig);
        Kh kh = this.f9636f;
        String str = appMetricaConfig.userProfileID;
        synchronized (kh) {
            kh.f7040f = str;
        }
        Kh kh2 = this.f9636f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        kh2.f7038d = new C1160zf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}

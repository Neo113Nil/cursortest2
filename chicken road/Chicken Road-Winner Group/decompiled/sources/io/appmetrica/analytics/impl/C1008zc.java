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
public final class C1008zc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8670a;

    /* renamed from: b, reason: collision with root package name */
    public final Bi f8671b;

    /* renamed from: c, reason: collision with root package name */
    public final Id f8672c;

    /* renamed from: d, reason: collision with root package name */
    public final T9 f8673d;

    /* renamed from: e, reason: collision with root package name */
    public final I8 f8674e;
    public final Kh f;

    /* renamed from: g, reason: collision with root package name */
    public final C0689n2 f8675g;

    /* renamed from: h, reason: collision with root package name */
    public final C0977y6 f8676h;

    /* renamed from: i, reason: collision with root package name */
    public final C0764q f8677i;

    /* renamed from: j, reason: collision with root package name */
    public final Oe f8678j;

    /* renamed from: k, reason: collision with root package name */
    public final Tn f8679k;

    /* renamed from: l, reason: collision with root package name */
    public final Jg f8680l;

    /* renamed from: m, reason: collision with root package name */
    public final C6 f8681m;

    /* renamed from: n, reason: collision with root package name */
    public final C0429d0 f8682n;

    public C1008zc(Context context, Gf gf, Bi bi, Sl sl) {
        this.f8670a = context;
        this.f8671b = bi;
        this.f8672c = new Id(gf);
        T9 t9 = new T9(context);
        this.f8673d = t9;
        I8 i8 = new I8(new C0915vl(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment"));
        this.f8674e = i8;
        this.f = new Kh(gf, new CounterConfiguration(CounterConfigurationReporterType.MAIN), i8);
        this.f8675g = new C0689n2();
        this.f8676h = C0587j4.l().n();
        this.f8677i = new C0764q();
        this.f8678j = new Oe(t9);
        this.f8679k = new Tn();
        this.f8680l = new Jg();
        this.f8681m = new C6();
        this.f8682n = new C0429d0();
    }

    public final C0429d0 a() {
        return this.f8682n;
    }

    public final Context b() {
        return this.f8670a;
    }

    public final C6 c() {
        return this.f8681m;
    }

    public final T9 d() {
        return this.f8673d;
    }

    public final Oe e() {
        return this.f8678j;
    }

    public final C0977y6 f() {
        return this.f8676h;
    }

    public final Jg g() {
        return this.f8680l;
    }

    public final Kh h() {
        return this.f;
    }

    public final Bi i() {
        return this.f8671b;
    }

    public final Tn j() {
        return this.f8679k;
    }

    public final void a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        publicLogger.info("Update config with value " + appMetricaConfig.toJson(), new Object[0]);
        this.f.f6383b.applyFromConfig(appMetricaConfig);
        Kh kh = this.f;
        String str = appMetricaConfig.userProfileID;
        synchronized (kh) {
            kh.f = str;
        }
        Kh kh2 = this.f;
        PreloadInfo preloadInfo = appMetricaConfig.preloadInfo;
        Boolean bool = (Boolean) appMetricaConfig.additionalConfig.get("YMM_preloadInfoAutoTracking");
        kh2.f6185d = new C1011zf(preloadInfo, publicLogger, bool != null ? bool.booleanValue() : false);
        StringBuilder sb = new StringBuilder("Actual session timeout is ");
        Integer num = appMetricaConfig.sessionTimeout;
        if (num == null) {
            num = 10;
        }
        sb.append(num.intValue());
        publicLogger.info(sb.toString(), new Object[0]);
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628q0 implements io.appmetrica.analytics.impl.Ba {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f6667a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f6668b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0321e4 f6669c = new io.appmetrica.analytics.impl.C0321e4();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f6670d = f().getHandler();

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.S1 f6671e = new io.appmetrica.analytics.impl.S1();

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0483kb f6672f = new io.appmetrica.analytics.impl.C0483kb();

    public C0628q0(android.content.Context context, io.appmetrica.analytics.impl.R3 r3) {
        this.f6667a = context;
        this.f6668b = r3.a();
        io.appmetrica.analytics.logger.common.BaseReleaseLogger.init(context);
        f().execute(new io.appmetrica.analytics.impl.Yo());
        a().a();
        io.appmetrica.analytics.impl.F3.a().onCreate();
    }

    public static final void e() {
        io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + io.appmetrica.analytics.coreutils.internal.StringUtils.capitalize("release") + " type, Version 8.0.0, API Level " + io.appmetrica.analytics.AppMetrica.getLibraryApiLevel() + ", Dated 30.12.2025.", new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final io.appmetrica.analytics.impl.C0321e4 a() {
        return this.f6669c;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final android.os.Handler b() {
        return this.f6670d;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final io.appmetrica.analytics.impl.S1 c() {
        return this.f6671e;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final io.appmetrica.analytics.impl.C0483kb d() {
        return this.f6672f;
    }

    public final io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor f() {
        return this.f6668b;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor getDefaultExecutor() {
        return this.f6668b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.impl.Ta ta) {
        try {
            if (!io.appmetrica.analytics.impl.C0835y0.f7127g) {
                if (appMetricaConfig != null) {
                    java.lang.Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = java.lang.Boolean.TRUE;
                    }
                    if (!bool.booleanValue()) {
                        this.f6672f.a();
                        if (appMetricaConfig != null) {
                            java.lang.Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                            if (bool2 == null) {
                                bool2 = java.lang.Boolean.TRUE;
                            }
                            if (!bool2.booleanValue()) {
                                this.f6671e.c();
                                if (appMetricaConfig != null) {
                                    io.appmetrica.analytics.impl.C0835y0.f7127g = true;
                                }
                            }
                        }
                        this.f6671e.b();
                        if (appMetricaConfig != null) {
                        }
                    }
                }
                this.f6672f.c();
                this.f6672f.b();
                if (appMetricaConfig != null) {
                    this.f6672f.a(this.f6667a, appMetricaConfig, ta);
                }
                if (appMetricaConfig != null) {
                }
                this.f6671e.b();
                if (appMetricaConfig != null) {
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}

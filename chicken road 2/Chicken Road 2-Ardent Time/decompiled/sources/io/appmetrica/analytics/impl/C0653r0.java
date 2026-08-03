package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653r0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Yn f6706a;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.lang.Boolean f6707b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Ba f6708c;

    /* renamed from: d, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Ca f6709d;

    public C0653r0() {
        this(new io.appmetrica.analytics.impl.Yn());
    }

    public final synchronized io.appmetrica.analytics.impl.Ba a(android.content.Context context, io.appmetrica.analytics.impl.R3 r3) {
        try {
            if (this.f6708c == null) {
                if (a(context)) {
                    this.f6708c = new io.appmetrica.analytics.impl.C0757v0();
                } else {
                    this.f6708c = new io.appmetrica.analytics.impl.C0628q0(context, r3);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f6708c;
    }

    public C0653r0(io.appmetrica.analytics.impl.Yn yn) {
        this.f6706a = yn;
    }

    public final boolean a(android.content.Context context) {
        java.lang.Boolean bool = this.f6707b;
        if (bool == null) {
            synchronized (this) {
                try {
                    bool = this.f6707b;
                    if (bool == null) {
                        this.f6706a.getClass();
                        boolean a2 = io.appmetrica.analytics.impl.Yn.a(context);
                        bool = java.lang.Boolean.valueOf(!a2);
                        this.f6707b = bool;
                        if (!a2) {
                            io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new java.lang.Object[0]);
                        }
                    }
                } finally {
                }
            }
        }
        return bool.booleanValue();
    }
}

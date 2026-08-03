package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.identifiers.impl.e f3868a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.l f3869b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f3870c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f3871d;

    public f(io.appmetrica.analytics.identifiers.impl.e eVar, s1.l lVar, java.lang.String str, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager) {
        this.f3868a = eVar;
        this.f3869b = lVar;
        this.f3870c = str;
        this.f3871d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(android.content.Context context) {
        android.os.IBinder iBinder;
        io.appmetrica.analytics.identifiers.impl.e eVar;
        if (this.f3871d.resolveService(context, this.f3868a.f3865a, 0) == null) {
            throw new io.appmetrica.analytics.identifiers.impl.l(B1.a.j(new java.lang.StringBuilder("could not resolve "), this.f3870c, " services"));
        }
        try {
            eVar = this.f3868a;
        } catch (java.lang.Throwable unused) {
        }
        if (context.bindService(eVar.f3865a, eVar, 1)) {
            io.appmetrica.analytics.identifiers.impl.e eVar2 = this.f3868a;
            if (eVar2.f3866b == null) {
                synchronized (eVar2.f3867c) {
                    if (eVar2.f3866b == null) {
                        try {
                            eVar2.f3867c.wait(3000L);
                        } catch (java.lang.InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f3866b;
            if (iBinder == null) {
                return this.f3869b.invoke(iBinder);
            }
            throw new io.appmetrica.analytics.identifiers.impl.g(B1.a.j(new java.lang.StringBuilder("could not bind to "), this.f3870c, " services"));
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(android.content.Context context) {
        try {
            this.f3868a.a(context);
        } catch (java.lang.Throwable unused) {
        }
    }

    public f(android.content.Intent intent, s1.l lVar, java.lang.String str) {
        this(new io.appmetrica.analytics.identifiers.impl.e(intent, str), lVar, str, new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager());
    }
}

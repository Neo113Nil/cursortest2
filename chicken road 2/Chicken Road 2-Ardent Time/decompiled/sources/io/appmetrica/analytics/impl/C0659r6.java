package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659r6 implements io.appmetrica.analytics.impl.Cf {

    /* renamed from: b, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.C0634q6 f6719b = new io.appmetrica.analytics.impl.C0634q6();

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Cf f6720a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0659r6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Cf
    public final java.lang.String a() {
        return this.f6720a.a();
    }

    public final boolean b() {
        try {
            java.lang.String a2 = this.f6720a.a();
            if (a2 != null && a2.length() > 0) {
                return !y1.g.M(a2, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            return false;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public C0659r6(io.appmetrica.analytics.impl.Cf cf) {
        this.f6720a = cf;
    }

    public final boolean a(java.lang.String str) {
        try {
            java.lang.String a2 = this.f6720a.a();
            if (a2 == null || a2.length() <= 0) {
                return false;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(str);
            return y1.o.F(a2, sb.toString());
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0659r6(io.appmetrica.analytics.impl.Cf cf, int i2, kotlin.jvm.internal.e eVar) {
        this(cf);
        if ((i2 & 1) != 0) {
            f6719b.getClass();
            cf = io.appmetrica.analytics.impl.C0634q6.a();
        }
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0848yd extends io.appmetrica.analytics.impl.Xe implements io.appmetrica.analytics.impl.InterfaceC0752ul {
    public AbstractC0848yd(io.appmetrica.analytics.impl.Ha ha, java.lang.String str) {
        super(ha, str);
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        return this.f5302a.getString(f(str), str2);
    }

    public final io.appmetrica.analytics.impl.InterfaceC0752ul d(java.lang.String str, java.lang.String str2) {
        return (io.appmetrica.analytics.impl.InterfaceC0752ul) b(f(str), str2);
    }

    public final boolean e(java.lang.String str) {
        return this.f5302a.a(f(str));
    }

    public abstract java.lang.String f(java.lang.String str);

    public io.appmetrica.analytics.impl.InterfaceC0752ul g(java.lang.String str) {
        return (io.appmetrica.analytics.impl.InterfaceC0752ul) d(f(str));
    }

    public AbstractC0848yd(io.appmetrica.analytics.impl.Ha ha) {
        this(ha, null);
    }

    public final io.appmetrica.analytics.impl.InterfaceC0752ul d(java.lang.String str, int i2) {
        return (io.appmetrica.analytics.impl.InterfaceC0752ul) b(f(str), i2);
    }

    public final int c(java.lang.String str, int i2) {
        return this.f5302a.getInt(f(str), i2);
    }

    public final io.appmetrica.analytics.impl.InterfaceC0752ul d(java.lang.String str, long j2) {
        return (io.appmetrica.analytics.impl.InterfaceC0752ul) b(f(str), j2);
    }

    public final io.appmetrica.analytics.impl.InterfaceC0752ul d(java.lang.String str, boolean z2) {
        return (io.appmetrica.analytics.impl.InterfaceC0752ul) b(f(str), z2);
    }

    public final long c(java.lang.String str, long j2) {
        return this.f5302a.getLong(f(str), j2);
    }

    public final boolean c(java.lang.String str, boolean z2) {
        return this.f5302a.getBoolean(f(str), z2);
    }
}

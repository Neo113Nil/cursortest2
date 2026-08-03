package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865z4 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fb f7176a;

    public C0865z4() {
        this(io.appmetrica.analytics.impl.C0560na.k().l());
    }

    public static io.appmetrica.analytics.impl.E4 a(io.appmetrica.analytics.impl.C0813x4 c0813x4) {
        return new io.appmetrica.analytics.impl.E4(new io.appmetrica.analytics.impl.C4(c0813x4), c0813x4);
    }

    public C0865z4(io.appmetrica.analytics.impl.Fb fb) {
        this.f7176a = fb;
    }

    public final io.appmetrica.analytics.impl.C0521ln a(io.appmetrica.analytics.impl.C0813x4 c0813x4, io.appmetrica.analytics.impl.Am am) {
        io.appmetrica.analytics.impl.C0521ln c0521ln = new io.appmetrica.analytics.impl.C0521ln(c0813x4, new io.appmetrica.analytics.impl.Ig(am));
        io.appmetrica.analytics.impl.Fb fb = this.f7176a;
        synchronized (fb) {
            fb.f4289c.add(c0521ln);
        }
        return c0521ln;
    }
}

package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class F2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ff f4283a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ea f4284b;

    public F2(io.appmetrica.analytics.impl.Ff ff, io.appmetrica.analytics.impl.Ea ea) {
        this.f4283a = ff;
        this.f4284b = ea;
    }

    public final boolean a(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.E2 e2) {
        java.util.Iterator it = ((io.appmetrica.analytics.impl.V8) this.f4283a.a(p5.f4816d)).f5133a.iterator();
        while (it.hasNext()) {
            if (e2.a(it.next(), p5)) {
                return true;
            }
        }
        return false;
    }

    public final io.appmetrica.analytics.impl.Ff b() {
        return this.f4283a;
    }

    public final io.appmetrica.analytics.impl.Ea a() {
        return this.f4284b;
    }
}

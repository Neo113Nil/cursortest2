package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Kn {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.E3 f4557a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Do f4558b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle f4559c;

    public Kn(io.appmetrica.analytics.coreapi.internal.control.Toggle toggle) {
        io.appmetrica.analytics.impl.E3 e3 = new io.appmetrica.analytics.impl.E3(io.appmetrica.analytics.impl.C0560na.k().y());
        this.f4557a = e3;
        io.appmetrica.analytics.impl.Do r12 = new io.appmetrica.analytics.impl.Do();
        this.f4558b = r12;
        this.f4559c = new io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle(i1.AbstractC0191j.H(e3, r12, toggle == null ? new io.appmetrica.analytics.impl.C0781vo() : toggle), "loc-def");
    }
}

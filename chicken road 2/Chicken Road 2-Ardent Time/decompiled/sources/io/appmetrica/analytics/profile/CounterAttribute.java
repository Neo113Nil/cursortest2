package io.appmetrica.analytics.profile;

/* loaded from: classes.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.C0711t6 f7456a;

    public CounterAttribute(java.lang.String str, io.appmetrica.analytics.impl.C0639qb c0639qb, io.appmetrica.analytics.impl.Gb gb) {
        this.f7456a = new io.appmetrica.analytics.impl.C0711t6(str, c0639qb, gb);
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withDelta(double d2) {
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Q5(this.f7456a.f6845c, d2));
    }
}

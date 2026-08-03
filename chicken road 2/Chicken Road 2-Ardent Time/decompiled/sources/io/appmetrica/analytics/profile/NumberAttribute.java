package io.appmetrica.analytics.profile;

/* loaded from: classes.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.C0711t6 f7466a;

    public NumberAttribute(java.lang.String str, io.appmetrica.analytics.impl.C0639qb c0639qb, io.appmetrica.analytics.impl.Gb gb) {
        this.f7466a = new io.appmetrica.analytics.impl.C0711t6(str, c0639qb, gb);
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValue(double d2) {
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.C0357fe(this.f7466a.f6845c, d2, new io.appmetrica.analytics.impl.C0639qb(), new io.appmetrica.analytics.impl.C0683s4(new io.appmetrica.analytics.impl.Gb(new io.appmetrica.analytics.impl.C0528m4(100)))));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValueIfUndefined(double d2) {
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.C0357fe(this.f7466a.f6845c, d2, new io.appmetrica.analytics.impl.C0639qb(), new io.appmetrica.analytics.impl.Xk(new io.appmetrica.analytics.impl.Gb(new io.appmetrica.analytics.impl.C0528m4(100)))));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValueReset() {
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Bi(1, this.f7466a.f6845c, new io.appmetrica.analytics.impl.C0639qb(), new io.appmetrica.analytics.impl.Gb(new io.appmetrica.analytics.impl.C0528m4(100))));
    }
}

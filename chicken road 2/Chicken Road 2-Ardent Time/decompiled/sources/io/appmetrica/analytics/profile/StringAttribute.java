package io.appmetrica.analytics.profile;

/* loaded from: classes.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.Ln f7467a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.C0711t6 f7468b;

    public StringAttribute(java.lang.String str, io.appmetrica.analytics.impl.Xm xm, io.appmetrica.analytics.impl.InterfaceC0703so interfaceC0703so, io.appmetrica.analytics.impl.InterfaceC0448j2 interfaceC0448j2) {
        this.f7468b = new io.appmetrica.analytics.impl.C0711t6(str, interfaceC0703so, interfaceC0448j2);
        this.f7467a = xm;
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValue(java.lang.String str) {
        io.appmetrica.analytics.impl.C0711t6 c0711t6 = this.f7468b;
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Ym(c0711t6.f6845c, str, this.f7467a, c0711t6.f6843a, new io.appmetrica.analytics.impl.C0683s4(c0711t6.f6844b)));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValueIfUndefined(java.lang.String str) {
        io.appmetrica.analytics.impl.C0711t6 c0711t6 = this.f7468b;
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Ym(c0711t6.f6845c, str, this.f7467a, c0711t6.f6843a, new io.appmetrica.analytics.impl.Xk(c0711t6.f6844b)));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withValueReset() {
        io.appmetrica.analytics.impl.C0711t6 c0711t6 = this.f7468b;
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Bi(0, c0711t6.f6845c, c0711t6.f6843a, c0711t6.f6844b));
    }
}

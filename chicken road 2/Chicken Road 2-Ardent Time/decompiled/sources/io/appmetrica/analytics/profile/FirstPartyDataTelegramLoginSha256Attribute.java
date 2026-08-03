package io.appmetrica.analytics.profile;

/* loaded from: classes.dex */
public class FirstPartyDataTelegramLoginSha256Attribute {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.C0711t6 f7461a = new io.appmetrica.analytics.impl.C0711t6("appmetrica_1pd_telegram_sha256", new io.appmetrica.analytics.impl.C0222a8(), new io.appmetrica.analytics.impl.Gb(new io.appmetrica.analytics.impl.C0528m4(100)));

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.Yk f7462b;

    public FirstPartyDataTelegramLoginSha256Attribute(io.appmetrica.analytics.impl.Yk yk) {
        this.f7462b = yk;
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withTelegramLoginValues(java.lang.String... strArr) {
        return withTelegramLoginValues(java.util.Arrays.asList(strArr));
    }

    public io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo> withTelegramLoginValues(java.lang.Iterable<java.lang.String> iterable) {
        java.lang.String str = this.f7461a.f6845c;
        java.util.ArrayList a2 = this.f7462b.a(iterable);
        io.appmetrica.analytics.impl.Xm xm = new io.appmetrica.analytics.impl.Xm(200, "First party data telegram logins attribute", io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance());
        io.appmetrica.analytics.impl.C0711t6 c0711t6 = this.f7461a;
        return new io.appmetrica.analytics.profile.UserProfileUpdate<>(new io.appmetrica.analytics.impl.Wm(str, a2, 10, xm, c0711t6.f6843a, new io.appmetrica.analytics.impl.C0683s4(c0711t6.f6844b)));
    }
}

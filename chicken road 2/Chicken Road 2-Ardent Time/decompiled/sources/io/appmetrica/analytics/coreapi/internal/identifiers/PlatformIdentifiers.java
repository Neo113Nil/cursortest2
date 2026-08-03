package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public final class PlatformIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter f3665a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider f3666b;

    public PlatformIdentifiers(io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider appSetIdProvider) {
        this.f3665a = simpleAdvertisingIdGetter;
        this.f3666b = appSetIdProvider;
    }

    public static /* synthetic */ io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers copy$default(io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers platformIdentifiers, io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider appSetIdProvider, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f3665a;
        }
        if ((i2 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f3666b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter component1() {
        return this.f3665a;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider component2() {
        return this.f3666b;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers copy(io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider appSetIdProvider) {
        return new io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers)) {
            return false;
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers platformIdentifiers = (io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers) obj;
        return kotlin.jvm.internal.i.a(this.f3665a, platformIdentifiers.f3665a) && kotlin.jvm.internal.i.a(this.f3666b, platformIdentifiers.f3666b);
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f3665a;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider getAppSetIdProvider() {
        return this.f3666b;
    }

    public int hashCode() {
        return this.f3666b.hashCode() + (this.f3665a.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f3665a + ", appSetIdProvider=" + this.f3666b + ')';
    }
}

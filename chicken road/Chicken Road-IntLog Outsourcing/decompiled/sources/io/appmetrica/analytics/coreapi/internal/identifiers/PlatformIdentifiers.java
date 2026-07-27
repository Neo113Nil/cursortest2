package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleAdvertisingIdGetter f6168a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdProvider f6169b;

    public PlatformIdentifiers(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        this.f6168a = simpleAdvertisingIdGetter;
        this.f6169b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f6168a;
        }
        if ((i2 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f6169b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public final SimpleAdvertisingIdGetter component1() {
        return this.f6168a;
    }

    public final AppSetIdProvider component2() {
        return this.f6169b;
    }

    public final PlatformIdentifiers copy(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return i.a(this.f6168a, platformIdentifiers.f6168a) && i.a(this.f6169b, platformIdentifiers.f6169b);
    }

    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f6168a;
    }

    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f6169b;
    }

    public int hashCode() {
        return this.f6169b.hashCode() + (this.f6168a.hashCode() * 31);
    }

    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f6168a + ", appSetIdProvider=" + this.f6169b + ')';
    }
}

package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class PlatformIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleAdvertisingIdGetter f5349a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdProvider f5350b;

    public PlatformIdentifiers(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        this.f5349a = simpleAdvertisingIdGetter;
        this.f5350b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f5349a;
        }
        if ((i3 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f5350b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public final SimpleAdvertisingIdGetter component1() {
        return this.f5349a;
    }

    public final AppSetIdProvider component2() {
        return this.f5350b;
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
        return j.a(this.f5349a, platformIdentifiers.f5349a) && j.a(this.f5350b, platformIdentifiers.f5350b);
    }

    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f5349a;
    }

    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f5350b;
    }

    public int hashCode() {
        return this.f5350b.hashCode() + (this.f5349a.hashCode() * 31);
    }

    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f5349a + ", appSetIdProvider=" + this.f5350b + ')';
    }
}

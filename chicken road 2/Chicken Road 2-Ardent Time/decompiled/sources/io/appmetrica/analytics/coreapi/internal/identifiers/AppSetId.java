package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3659a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope f3660b;

    public AppSetId(java.lang.String str, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope appSetIdScope) {
        this.f3659a = str;
        this.f3660b = appSetIdScope;
    }

    public static /* synthetic */ io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId copy$default(io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId appSetId, java.lang.String str, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope appSetIdScope, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = appSetId.f3659a;
        }
        if ((i2 & 2) != 0) {
            appSetIdScope = appSetId.f3660b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    public final java.lang.String component1() {
        return this.f3659a;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope component2() {
        return this.f3660b;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId copy(java.lang.String str, io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope appSetIdScope) {
        return new io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId(str, appSetIdScope);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId)) {
            return false;
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId appSetId = (io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId) obj;
        return kotlin.jvm.internal.i.a(this.f3659a, appSetId.f3659a) && this.f3660b == appSetId.f3660b;
    }

    public final java.lang.String getId() {
        return this.f3659a;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope getScope() {
        return this.f3660b;
    }

    public int hashCode() {
        java.lang.String str = this.f3659a;
        return this.f3660b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public java.lang.String toString() {
        return "AppSetId(id=" + this.f3659a + ", scope=" + this.f3660b + ')';
    }
}

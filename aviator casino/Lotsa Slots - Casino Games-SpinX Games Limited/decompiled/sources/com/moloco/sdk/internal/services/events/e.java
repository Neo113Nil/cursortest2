package com.moloco.sdk.internal.services.events;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7274a;
    public final boolean b;
    public final java.lang.String c;
    public final java.lang.String d;

    public e(boolean z, boolean z2, java.lang.String appForegroundUrl, java.lang.String appBackgroundUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f7274a = z;
        this.b = z2;
        this.c = appForegroundUrl;
        this.d = appBackgroundUrl;
    }

    public final boolean a() {
        return this.f7274a;
    }

    public final boolean b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final java.lang.String e() {
        return this.d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.events.e)) {
            return false;
        }
        com.moloco.sdk.internal.services.events.e eVar = (com.moloco.sdk.internal.services.events.e) obj;
        return this.f7274a == eVar.f7274a && this.b == eVar.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, eVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, eVar.d);
    }

    public final java.lang.String f() {
        return this.c;
    }

    public final boolean g() {
        return this.f7274a;
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        return (((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7274a) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public java.lang.String toString() {
        return "UserEventConfig(eventReportingEnabled=" + this.f7274a + ", userTrackingEnabled=" + this.b + ", appForegroundUrl=" + this.c + ", appBackgroundUrl=" + this.d + ')';
    }

    public final com.moloco.sdk.internal.services.events.e a(boolean z, boolean z2, java.lang.String appForegroundUrl, java.lang.String appBackgroundUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        return new com.moloco.sdk.internal.services.events.e(z, z2, appForegroundUrl, appBackgroundUrl);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.events.e a(com.moloco.sdk.internal.services.events.e eVar, boolean z, boolean z2, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = eVar.f7274a;
        }
        if ((i & 2) != 0) {
            z2 = eVar.b;
        }
        if ((i & 4) != 0) {
            str = eVar.c;
        }
        if ((i & 8) != 0) {
            str2 = eVar.d;
        }
        return eVar.a(z, z2, str, str2);
    }
}

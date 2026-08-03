package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class AppVersionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3671a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3672b;

    public AppVersionInfo(java.lang.String str, java.lang.String str2) {
        this.f3671a = str;
        this.f3672b = str2;
    }

    public static /* synthetic */ io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo copy$default(io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo appVersionInfo, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = appVersionInfo.f3671a;
        }
        if ((i2 & 2) != 0) {
            str2 = appVersionInfo.f3672b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final java.lang.String component1() {
        return this.f3671a;
    }

    public final java.lang.String component2() {
        return this.f3672b;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo copy(java.lang.String str, java.lang.String str2) {
        return new io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo(str, str2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo)) {
            return false;
        }
        io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo appVersionInfo = (io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo) obj;
        return kotlin.jvm.internal.i.a(this.f3671a, appVersionInfo.f3671a) && kotlin.jvm.internal.i.a(this.f3672b, appVersionInfo.f3672b);
    }

    public final java.lang.String getAppBuildNumber() {
        return this.f3672b;
    }

    public final java.lang.String getAppVersionName() {
        return this.f3671a;
    }

    public int hashCode() {
        return this.f3672b.hashCode() + (this.f3671a.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "AppVersionInfo(appVersionName=" + this.f3671a + ", appBuildNumber=" + this.f3672b + ')';
    }
}

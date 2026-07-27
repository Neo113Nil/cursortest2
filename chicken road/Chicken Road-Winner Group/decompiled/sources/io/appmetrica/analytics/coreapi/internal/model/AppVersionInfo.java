package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class AppVersionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f5355a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5356b;

    public AppVersionInfo(String str, String str2) {
        this.f5355a = str;
        this.f5356b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appVersionInfo.f5355a;
        }
        if ((i3 & 2) != 0) {
            str2 = appVersionInfo.f5356b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f5355a;
    }

    public final String component2() {
        return this.f5356b;
    }

    public final AppVersionInfo copy(String str, String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return j.a(this.f5355a, appVersionInfo.f5355a) && j.a(this.f5356b, appVersionInfo.f5356b);
    }

    public final String getAppBuildNumber() {
        return this.f5356b;
    }

    public final String getAppVersionName() {
        return this.f5355a;
    }

    public int hashCode() {
        return this.f5356b.hashCode() + (this.f5355a.hashCode() * 31);
    }

    public String toString() {
        return "AppVersionInfo(appVersionName=" + this.f5355a + ", appBuildNumber=" + this.f5356b + ')';
    }
}

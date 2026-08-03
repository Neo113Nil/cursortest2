package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class SdkEnvironment {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo f3677a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3678b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.model.ScreenInfo f3679c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.model.SdkInfo f3680d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f3681e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.List f3682f;

    public SdkEnvironment(io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo appVersionInfo, java.lang.String str, io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo, io.appmetrica.analytics.coreapi.internal.model.SdkInfo sdkInfo, java.lang.String str2, java.util.List<java.lang.String> list) {
        this.f3677a = appVersionInfo;
        this.f3678b = str;
        this.f3679c = screenInfo;
        this.f3680d = sdkInfo;
        this.f3681e = str2;
        this.f3682f = list;
    }

    public static /* synthetic */ io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment copy$default(io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment, io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo appVersionInfo, java.lang.String str, io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo, io.appmetrica.analytics.coreapi.internal.model.SdkInfo sdkInfo, java.lang.String str2, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f3677a;
        }
        if ((i2 & 2) != 0) {
            str = sdkEnvironment.f3678b;
        }
        java.lang.String str3 = str;
        if ((i2 & 4) != 0) {
            screenInfo = sdkEnvironment.f3679c;
        }
        io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo2 = screenInfo;
        if ((i2 & 8) != 0) {
            sdkInfo = sdkEnvironment.f3680d;
        }
        io.appmetrica.analytics.coreapi.internal.model.SdkInfo sdkInfo2 = sdkInfo;
        if ((i2 & 16) != 0) {
            str2 = sdkEnvironment.f3681e;
        }
        java.lang.String str4 = str2;
        if ((i2 & 32) != 0) {
            list = sdkEnvironment.f3682f;
        }
        return sdkEnvironment.copy(appVersionInfo, str3, screenInfo2, sdkInfo2, str4, list);
    }

    public final io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo component1() {
        return this.f3677a;
    }

    public final java.lang.String component2() {
        return this.f3678b;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.ScreenInfo component3() {
        return this.f3679c;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.SdkInfo component4() {
        return this.f3680d;
    }

    public final java.lang.String component5() {
        return this.f3681e;
    }

    public final java.util.List<java.lang.String> component6() {
        return this.f3682f;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment copy(io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo appVersionInfo, java.lang.String str, io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo, io.appmetrica.analytics.coreapi.internal.model.SdkInfo sdkInfo, java.lang.String str2, java.util.List<java.lang.String> list) {
        return new io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment)) {
            return false;
        }
        io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment sdkEnvironment = (io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment) obj;
        return kotlin.jvm.internal.i.a(this.f3677a, sdkEnvironment.f3677a) && kotlin.jvm.internal.i.a(this.f3678b, sdkEnvironment.f3678b) && kotlin.jvm.internal.i.a(this.f3679c, sdkEnvironment.f3679c) && kotlin.jvm.internal.i.a(this.f3680d, sdkEnvironment.f3680d) && kotlin.jvm.internal.i.a(this.f3681e, sdkEnvironment.f3681e) && kotlin.jvm.internal.i.a(this.f3682f, sdkEnvironment.f3682f);
    }

    public final java.lang.String getAppFramework() {
        return this.f3678b;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo getAppVersionInfo() {
        return this.f3677a;
    }

    public final java.lang.String getDeviceType() {
        return this.f3681e;
    }

    public final java.util.List<java.lang.String> getLocales() {
        return this.f3682f;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.ScreenInfo getScreenInfo() {
        return this.f3679c;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.SdkInfo getSdkInfo() {
        return this.f3680d;
    }

    public int hashCode() {
        return this.f3682f.hashCode() + B1.a.e(this.f3681e, (this.f3680d.hashCode() + ((this.f3679c.hashCode() + B1.a.e(this.f3678b, this.f3677a.hashCode() * 31, 31)) * 31)) * 31, 31);
    }

    public java.lang.String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f3677a + ", appFramework=" + this.f3678b + ", screenInfo=" + this.f3679c + ", sdkInfo=" + this.f3680d + ", deviceType=" + this.f3681e + ", locales=" + this.f3682f + ')';
    }
}

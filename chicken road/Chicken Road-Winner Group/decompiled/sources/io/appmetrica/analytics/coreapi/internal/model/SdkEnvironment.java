package io.appmetrica.analytics.coreapi.internal.model;

import java.util.List;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class SdkEnvironment {

    /* renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f5361a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5362b;

    /* renamed from: c, reason: collision with root package name */
    private final ScreenInfo f5363c;

    /* renamed from: d, reason: collision with root package name */
    private final SdkInfo f5364d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5365e;
    private final List f;

    public SdkEnvironment(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        this.f5361a = appVersionInfo;
        this.f5362b = str;
        this.f5363c = screenInfo;
        this.f5364d = sdkInfo;
        this.f5365e = str2;
        this.f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f5361a;
        }
        if ((i3 & 2) != 0) {
            str = sdkEnvironment.f5362b;
        }
        if ((i3 & 4) != 0) {
            screenInfo = sdkEnvironment.f5363c;
        }
        if ((i3 & 8) != 0) {
            sdkInfo = sdkEnvironment.f5364d;
        }
        if ((i3 & 16) != 0) {
            str2 = sdkEnvironment.f5365e;
        }
        if ((i3 & 32) != 0) {
            list = sdkEnvironment.f;
        }
        String str3 = str2;
        List list2 = list;
        return sdkEnvironment.copy(appVersionInfo, str, screenInfo, sdkInfo, str3, list2);
    }

    public final AppVersionInfo component1() {
        return this.f5361a;
    }

    public final String component2() {
        return this.f5362b;
    }

    public final ScreenInfo component3() {
        return this.f5363c;
    }

    public final SdkInfo component4() {
        return this.f5364d;
    }

    public final String component5() {
        return this.f5365e;
    }

    public final List<String> component6() {
        return this.f;
    }

    public final SdkEnvironment copy(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return j.a(this.f5361a, sdkEnvironment.f5361a) && j.a(this.f5362b, sdkEnvironment.f5362b) && j.a(this.f5363c, sdkEnvironment.f5363c) && j.a(this.f5364d, sdkEnvironment.f5364d) && j.a(this.f5365e, sdkEnvironment.f5365e) && j.a(this.f, sdkEnvironment.f);
    }

    public final String getAppFramework() {
        return this.f5362b;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.f5361a;
    }

    public final String getDeviceType() {
        return this.f5365e;
    }

    public final List<String> getLocales() {
        return this.f;
    }

    public final ScreenInfo getScreenInfo() {
        return this.f5363c;
    }

    public final SdkInfo getSdkInfo() {
        return this.f5364d;
    }

    public int hashCode() {
        return this.f.hashCode() + ((this.f5365e.hashCode() + ((this.f5364d.hashCode() + ((this.f5363c.hashCode() + ((this.f5362b.hashCode() + (this.f5361a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f5361a + ", appFramework=" + this.f5362b + ", screenInfo=" + this.f5363c + ", sdkInfo=" + this.f5364d + ", deviceType=" + this.f5365e + ", locales=" + this.f + ')';
    }
}

package io.appmetrica.analytics.coreapi.internal.model;

import B0.o;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkEnvironment {

    /* renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f6180a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6181b;

    /* renamed from: c, reason: collision with root package name */
    private final ScreenInfo f6182c;

    /* renamed from: d, reason: collision with root package name */
    private final SdkInfo f6183d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6184e;

    /* renamed from: f, reason: collision with root package name */
    private final List f6185f;

    public SdkEnvironment(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        this.f6180a = appVersionInfo;
        this.f6181b = str;
        this.f6182c = screenInfo;
        this.f6183d = sdkInfo;
        this.f6184e = str2;
        this.f6185f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            appVersionInfo = sdkEnvironment.f6180a;
        }
        if ((i2 & 2) != 0) {
            str = sdkEnvironment.f6181b;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            screenInfo = sdkEnvironment.f6182c;
        }
        ScreenInfo screenInfo2 = screenInfo;
        if ((i2 & 8) != 0) {
            sdkInfo = sdkEnvironment.f6183d;
        }
        SdkInfo sdkInfo2 = sdkInfo;
        if ((i2 & 16) != 0) {
            str2 = sdkEnvironment.f6184e;
        }
        String str4 = str2;
        if ((i2 & 32) != 0) {
            list = sdkEnvironment.f6185f;
        }
        return sdkEnvironment.copy(appVersionInfo, str3, screenInfo2, sdkInfo2, str4, list);
    }

    public final AppVersionInfo component1() {
        return this.f6180a;
    }

    public final String component2() {
        return this.f6181b;
    }

    public final ScreenInfo component3() {
        return this.f6182c;
    }

    public final SdkInfo component4() {
        return this.f6183d;
    }

    public final String component5() {
        return this.f6184e;
    }

    public final List<String> component6() {
        return this.f6185f;
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
        return i.a(this.f6180a, sdkEnvironment.f6180a) && i.a(this.f6181b, sdkEnvironment.f6181b) && i.a(this.f6182c, sdkEnvironment.f6182c) && i.a(this.f6183d, sdkEnvironment.f6183d) && i.a(this.f6184e, sdkEnvironment.f6184e) && i.a(this.f6185f, sdkEnvironment.f6185f);
    }

    public final String getAppFramework() {
        return this.f6181b;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.f6180a;
    }

    public final String getDeviceType() {
        return this.f6184e;
    }

    public final List<String> getLocales() {
        return this.f6185f;
    }

    public final ScreenInfo getScreenInfo() {
        return this.f6182c;
    }

    public final SdkInfo getSdkInfo() {
        return this.f6183d;
    }

    public int hashCode() {
        return this.f6185f.hashCode() + o.f(this.f6184e, (this.f6183d.hashCode() + ((this.f6182c.hashCode() + o.f(this.f6181b, this.f6180a.hashCode() * 31, 31)) * 31)) * 31, 31);
    }

    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f6180a + ", appFramework=" + this.f6181b + ", screenInfo=" + this.f6182c + ", sdkInfo=" + this.f6183d + ", deviceType=" + this.f6184e + ", locales=" + this.f6185f + ')';
    }
}

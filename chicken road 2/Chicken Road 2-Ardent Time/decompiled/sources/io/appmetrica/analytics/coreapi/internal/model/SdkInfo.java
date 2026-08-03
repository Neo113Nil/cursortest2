package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class SdkInfo {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3683a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3684b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f3685c;

    public SdkInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f3683a = str;
        this.f3684b = str2;
        this.f3685c = str3;
    }

    public static /* synthetic */ io.appmetrica.analytics.coreapi.internal.model.SdkInfo copy$default(io.appmetrica.analytics.coreapi.internal.model.SdkInfo sdkInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = sdkInfo.f3683a;
        }
        if ((i2 & 2) != 0) {
            str2 = sdkInfo.f3684b;
        }
        if ((i2 & 4) != 0) {
            str3 = sdkInfo.f3685c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    public final java.lang.String component1() {
        return this.f3683a;
    }

    public final java.lang.String component2() {
        return this.f3684b;
    }

    public final java.lang.String component3() {
        return this.f3685c;
    }

    public final io.appmetrica.analytics.coreapi.internal.model.SdkInfo copy(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new io.appmetrica.analytics.coreapi.internal.model.SdkInfo(str, str2, str3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreapi.internal.model.SdkInfo)) {
            return false;
        }
        io.appmetrica.analytics.coreapi.internal.model.SdkInfo sdkInfo = (io.appmetrica.analytics.coreapi.internal.model.SdkInfo) obj;
        return kotlin.jvm.internal.i.a(this.f3683a, sdkInfo.f3683a) && kotlin.jvm.internal.i.a(this.f3684b, sdkInfo.f3684b) && kotlin.jvm.internal.i.a(this.f3685c, sdkInfo.f3685c);
    }

    public final java.lang.String getSdkBuildNumber() {
        return this.f3684b;
    }

    public final java.lang.String getSdkBuildType() {
        return this.f3685c;
    }

    public final java.lang.String getSdkVersionName() {
        return this.f3683a;
    }

    public int hashCode() {
        return this.f3685c.hashCode() + B1.a.e(this.f3684b, this.f3683a.hashCode() * 31, 31);
    }

    public java.lang.String toString() {
        return "SdkInfo(sdkVersionName=" + this.f3683a + ", sdkBuildNumber=" + this.f3684b + ", sdkBuildType=" + this.f3685c + ')';
    }
}

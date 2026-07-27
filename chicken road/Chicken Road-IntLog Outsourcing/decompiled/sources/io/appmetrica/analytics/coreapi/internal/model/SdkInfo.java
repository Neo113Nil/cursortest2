package io.appmetrica.analytics.coreapi.internal.model;

import B0.o;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SdkInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f6186a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6187b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6188c;

    public SdkInfo(String str, String str2, String str3) {
        this.f6186a = str;
        this.f6187b = str2;
        this.f6188c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sdkInfo.f6186a;
        }
        if ((i2 & 2) != 0) {
            str2 = sdkInfo.f6187b;
        }
        if ((i2 & 4) != 0) {
            str3 = sdkInfo.f6188c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f6186a;
    }

    public final String component2() {
        return this.f6187b;
    }

    public final String component3() {
        return this.f6188c;
    }

    public final SdkInfo copy(String str, String str2, String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        return i.a(this.f6186a, sdkInfo.f6186a) && i.a(this.f6187b, sdkInfo.f6187b) && i.a(this.f6188c, sdkInfo.f6188c);
    }

    public final String getSdkBuildNumber() {
        return this.f6187b;
    }

    public final String getSdkBuildType() {
        return this.f6188c;
    }

    public final String getSdkVersionName() {
        return this.f6186a;
    }

    public int hashCode() {
        return this.f6188c.hashCode() + o.f(this.f6187b, this.f6186a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkInfo(sdkVersionName=");
        sb.append(this.f6186a);
        sb.append(", sdkBuildNumber=");
        sb.append(this.f6187b);
        sb.append(", sdkBuildType=");
        return o.l(sb, this.f6188c, ')');
    }
}

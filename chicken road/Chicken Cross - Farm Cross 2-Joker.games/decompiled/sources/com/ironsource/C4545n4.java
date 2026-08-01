package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4545n4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8449a;
    private final String b;
    private final String c;
    private final String d;

    public C4545n4() {
        this(null, null, null, null, 15, null);
    }

    public final String a() {
        return this.f8449a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4545n4)) {
            return false;
        }
        C4545n4 c4545n4 = (C4545n4) obj;
        return Intrinsics.areEqual(this.f8449a, c4545n4.f8449a) && Intrinsics.areEqual(this.b, c4545n4.b) && Intrinsics.areEqual(this.c, c4545n4.c) && Intrinsics.areEqual(this.d, c4545n4.d);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.f8449a;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.f8449a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f8449a + ", customRewardedVideoAdapterName=" + this.b + ", customInterstitialAdapterName=" + this.c + ", customBannerAdapterName=" + this.d + ")";
    }

    public C4545n4(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.f8449a = customNetworkAdapterName;
        this.b = customRewardedVideoAdapterName;
        this.c = customInterstitialAdapterName;
        this.d = customBannerAdapterName;
    }

    public final C4545n4 a(String customNetworkAdapterName, String customRewardedVideoAdapterName, String customInterstitialAdapterName, String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new C4545n4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public static /* synthetic */ C4545n4 a(C4545n4 c4545n4, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4545n4.f8449a;
        }
        if ((i & 2) != 0) {
            str2 = c4545n4.b;
        }
        if ((i & 4) != 0) {
            str3 = c4545n4.c;
        }
        if ((i & 8) != 0) {
            str4 = c4545n4.d;
        }
        return c4545n4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C4545n4(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}

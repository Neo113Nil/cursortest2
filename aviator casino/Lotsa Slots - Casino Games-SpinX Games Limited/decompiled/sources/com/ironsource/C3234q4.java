package com.ironsource;

/* renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3234q4 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6569a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final java.lang.String d;

    public C3234q4() {
        this(null, null, null, null, 15, null);
    }

    public final java.lang.String a() {
        return this.f6569a;
    }

    public final java.lang.String b() {
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
        if (!(obj instanceof com.ironsource.C3234q4)) {
            return false;
        }
        com.ironsource.C3234q4 c3234q4 = (com.ironsource.C3234q4) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6569a, c3234q4.f6569a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3234q4.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3234q4.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c3234q4.d);
    }

    public final java.lang.String f() {
        return this.c;
    }

    public final java.lang.String g() {
        return this.f6569a;
    }

    public final java.lang.String h() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.f6569a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public java.lang.String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f6569a + ", customRewardedVideoAdapterName=" + this.b + ", customInterstitialAdapterName=" + this.c + ", customBannerAdapterName=" + this.d + ")";
    }

    public C3234q4(java.lang.String customNetworkAdapterName, java.lang.String customRewardedVideoAdapterName, java.lang.String customInterstitialAdapterName, java.lang.String customBannerAdapterName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.f6569a = customNetworkAdapterName;
        this.b = customRewardedVideoAdapterName;
        this.c = customInterstitialAdapterName;
        this.d = customBannerAdapterName;
    }

    public final com.ironsource.C3234q4 a(java.lang.String customNetworkAdapterName, java.lang.String customRewardedVideoAdapterName, java.lang.String customInterstitialAdapterName, java.lang.String customBannerAdapterName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new com.ironsource.C3234q4(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public static /* synthetic */ com.ironsource.C3234q4 a(com.ironsource.C3234q4 c3234q4, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3234q4.f6569a;
        }
        if ((i & 2) != 0) {
            str2 = c3234q4.b;
        }
        if ((i & 4) != 0) {
            str3 = c3234q4.c;
        }
        if ((i & 8) != 0) {
            str4 = c3234q4.d;
        }
        return c3234q4.a(str, str2, str3, str4);
    }

    public /* synthetic */ C3234q4(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}

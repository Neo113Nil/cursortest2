package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class k {
    public static final int m = 8;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7238a;
    public final com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings b;
    public final com.moloco.sdk.internal.services.bidtoken.providers.r c;
    public final com.moloco.sdk.internal.services.bidtoken.providers.d d;
    public final com.moloco.sdk.internal.services.bidtoken.providers.t e;
    public final com.moloco.sdk.internal.services.bidtoken.providers.h f;
    public final com.moloco.sdk.internal.services.AbstractC3432c g;
    public final com.moloco.sdk.internal.services.bidtoken.providers.n h;
    public final com.moloco.sdk.internal.services.bidtoken.providers.f i;
    public final com.moloco.sdk.internal.services.bidtoken.providers.a j;
    public final com.moloco.sdk.internal.services.bidtoken.providers.p k;
    public final com.moloco.sdk.internal.services.bidtoken.providers.x l;

    public k(boolean z, com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings privacySettings, com.moloco.sdk.internal.services.bidtoken.providers.r memoryInfo, com.moloco.sdk.internal.services.bidtoken.providers.d appDirInfo, com.moloco.sdk.internal.services.bidtoken.providers.t networkInfoSignal, com.moloco.sdk.internal.services.bidtoken.providers.h batteryInfoSignal, com.moloco.sdk.internal.services.AbstractC3432c adDataSignal, com.moloco.sdk.internal.services.bidtoken.providers.n deviceSignal, com.moloco.sdk.internal.services.bidtoken.providers.f audioSignal, com.moloco.sdk.internal.services.bidtoken.providers.a accessibilitySignal, com.moloco.sdk.internal.services.bidtoken.providers.p ilrdSignal, com.moloco.sdk.internal.services.bidtoken.providers.x testConfigSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appDirInfo, "appDirInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDataSignal, "adDataSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSignal, "deviceSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSignal, "audioSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testConfigSignal, "testConfigSignal");
        this.f7238a = z;
        this.b = privacySettings;
        this.c = memoryInfo;
        this.d = appDirInfo;
        this.e = networkInfoSignal;
        this.f = batteryInfoSignal;
        this.g = adDataSignal;
        this.h = deviceSignal;
        this.i = audioSignal;
        this.j = accessibilitySignal;
        this.k = ilrdSignal;
        this.l = testConfigSignal;
    }

    public final boolean a() {
        return this.f7238a;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.a b() {
        return this.j;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.p c() {
        return this.k;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.x d() {
        return this.l;
    }

    public final com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.k)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.providers.k kVar = (com.moloco.sdk.internal.services.bidtoken.providers.k) obj;
        return this.f7238a == kVar.f7238a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, kVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, kVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, kVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, kVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, kVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, kVar.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, kVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, kVar.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, kVar.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, kVar.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, kVar.l);
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.r f() {
        return this.c;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.d g() {
        return this.d;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.t h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((((((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7238a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.h i() {
        return this.f;
    }

    public final com.moloco.sdk.internal.services.AbstractC3432c j() {
        return this.g;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.n k() {
        return this.h;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.f l() {
        return this.i;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.a m() {
        return this.j;
    }

    public final com.moloco.sdk.internal.services.AbstractC3432c n() {
        return this.g;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.d o() {
        return this.d;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.f p() {
        return this.i;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.h q() {
        return this.f;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.n r() {
        return this.h;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.p s() {
        return this.k;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.r t() {
        return this.c;
    }

    public java.lang.String toString() {
        return "ClientSignals(sdkInitialized=" + this.f7238a + ", privacySettings=" + this.b + ", memoryInfo=" + this.c + ", appDirInfo=" + this.d + ", networkInfoSignal=" + this.e + ", batteryInfoSignal=" + this.f + ", adDataSignal=" + this.g + ", deviceSignal=" + this.h + ", audioSignal=" + this.i + ", accessibilitySignal=" + this.j + ", ilrdSignal=" + this.k + ", testConfigSignal=" + this.l + ')';
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.t u() {
        return this.e;
    }

    public final com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings v() {
        return this.b;
    }

    public final boolean w() {
        return this.f7238a;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.x x() {
        return this.l;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.k a(boolean z, com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings privacySettings, com.moloco.sdk.internal.services.bidtoken.providers.r memoryInfo, com.moloco.sdk.internal.services.bidtoken.providers.d appDirInfo, com.moloco.sdk.internal.services.bidtoken.providers.t networkInfoSignal, com.moloco.sdk.internal.services.bidtoken.providers.h batteryInfoSignal, com.moloco.sdk.internal.services.AbstractC3432c adDataSignal, com.moloco.sdk.internal.services.bidtoken.providers.n deviceSignal, com.moloco.sdk.internal.services.bidtoken.providers.f audioSignal, com.moloco.sdk.internal.services.bidtoken.providers.a accessibilitySignal, com.moloco.sdk.internal.services.bidtoken.providers.p ilrdSignal, com.moloco.sdk.internal.services.bidtoken.providers.x testConfigSignal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appDirInfo, "appDirInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDataSignal, "adDataSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSignal, "deviceSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioSignal, "audioSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testConfigSignal, "testConfigSignal");
        return new com.moloco.sdk.internal.services.bidtoken.providers.k(z, privacySettings, memoryInfo, appDirInfo, networkInfoSignal, batteryInfoSignal, adDataSignal, deviceSignal, audioSignal, accessibilitySignal, ilrdSignal, testConfigSignal);
    }
}

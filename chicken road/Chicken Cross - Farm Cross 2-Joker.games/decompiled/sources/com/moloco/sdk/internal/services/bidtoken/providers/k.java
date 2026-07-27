package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.AbstractC4802c;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class k {
    public static final int m = 8;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10759a;
    public final MolocoPrivacy.PrivacySettings b;
    public final r c;
    public final d d;
    public final t e;
    public final h f;
    public final AbstractC4802c g;
    public final n h;
    public final f i;
    public final a j;
    public final p k;
    public final x l;

    public k(boolean z, MolocoPrivacy.PrivacySettings privacySettings, r memoryInfo, d appDirInfo, t networkInfoSignal, h batteryInfoSignal, AbstractC4802c adDataSignal, n deviceSignal, f audioSignal, a accessibilitySignal, p ilrdSignal, x testConfigSignal) {
        Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        Intrinsics.checkNotNullParameter(appDirInfo, "appDirInfo");
        Intrinsics.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        Intrinsics.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        Intrinsics.checkNotNullParameter(adDataSignal, "adDataSignal");
        Intrinsics.checkNotNullParameter(deviceSignal, "deviceSignal");
        Intrinsics.checkNotNullParameter(audioSignal, "audioSignal");
        Intrinsics.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        Intrinsics.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        Intrinsics.checkNotNullParameter(testConfigSignal, "testConfigSignal");
        this.f10759a = z;
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
        return this.f10759a;
    }

    public final a b() {
        return this.j;
    }

    public final p c() {
        return this.k;
    }

    public final x d() {
        return this.l;
    }

    public final MolocoPrivacy.PrivacySettings e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10759a == kVar.f10759a && Intrinsics.areEqual(this.b, kVar.b) && Intrinsics.areEqual(this.c, kVar.c) && Intrinsics.areEqual(this.d, kVar.d) && Intrinsics.areEqual(this.e, kVar.e) && Intrinsics.areEqual(this.f, kVar.f) && Intrinsics.areEqual(this.g, kVar.g) && Intrinsics.areEqual(this.h, kVar.h) && Intrinsics.areEqual(this.i, kVar.i) && Intrinsics.areEqual(this.j, kVar.j) && Intrinsics.areEqual(this.k, kVar.k) && Intrinsics.areEqual(this.l, kVar.l);
    }

    public final r f() {
        return this.c;
    }

    public final d g() {
        return this.d;
    }

    public final t h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.f10759a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode();
    }

    public final h i() {
        return this.f;
    }

    public final AbstractC4802c j() {
        return this.g;
    }

    public final n k() {
        return this.h;
    }

    public final f l() {
        return this.i;
    }

    public final a m() {
        return this.j;
    }

    public final AbstractC4802c n() {
        return this.g;
    }

    public final d o() {
        return this.d;
    }

    public final f p() {
        return this.i;
    }

    public final h q() {
        return this.f;
    }

    public final n r() {
        return this.h;
    }

    public final p s() {
        return this.k;
    }

    public final r t() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientSignals(sdkInitialized=");
        sb.append(this.f10759a).append(", privacySettings=").append(this.b).append(", memoryInfo=").append(this.c).append(", appDirInfo=").append(this.d).append(", networkInfoSignal=").append(this.e).append(", batteryInfoSignal=").append(this.f).append(", adDataSignal=").append(this.g).append(", deviceSignal=").append(this.h).append(", audioSignal=").append(this.i).append(", accessibilitySignal=").append(this.j).append(", ilrdSignal=").append(this.k).append(", testConfigSignal=");
        sb.append(this.l).append(')');
        return sb.toString();
    }

    public final t u() {
        return this.e;
    }

    public final MolocoPrivacy.PrivacySettings v() {
        return this.b;
    }

    public final boolean w() {
        return this.f10759a;
    }

    public final x x() {
        return this.l;
    }

    public final k a(boolean z, MolocoPrivacy.PrivacySettings privacySettings, r memoryInfo, d appDirInfo, t networkInfoSignal, h batteryInfoSignal, AbstractC4802c adDataSignal, n deviceSignal, f audioSignal, a accessibilitySignal, p ilrdSignal, x testConfigSignal) {
        Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        Intrinsics.checkNotNullParameter(memoryInfo, "memoryInfo");
        Intrinsics.checkNotNullParameter(appDirInfo, "appDirInfo");
        Intrinsics.checkNotNullParameter(networkInfoSignal, "networkInfoSignal");
        Intrinsics.checkNotNullParameter(batteryInfoSignal, "batteryInfoSignal");
        Intrinsics.checkNotNullParameter(adDataSignal, "adDataSignal");
        Intrinsics.checkNotNullParameter(deviceSignal, "deviceSignal");
        Intrinsics.checkNotNullParameter(audioSignal, "audioSignal");
        Intrinsics.checkNotNullParameter(accessibilitySignal, "accessibilitySignal");
        Intrinsics.checkNotNullParameter(ilrdSignal, "ilrdSignal");
        Intrinsics.checkNotNullParameter(testConfigSignal, "testConfigSignal");
        return new k(z, privacySettings, memoryInfo, appDirInfo, networkInfoSignal, batteryInfoSignal, adDataSignal, deviceSignal, audioSignal, accessibilitySignal, ilrdSignal, testConfigSignal);
    }
}

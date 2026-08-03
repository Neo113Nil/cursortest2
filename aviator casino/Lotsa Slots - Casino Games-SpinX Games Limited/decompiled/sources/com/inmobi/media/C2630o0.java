package com.inmobi.media;

/* renamed from: com.inmobi.media.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2630o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5363a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final com.inmobi.media.AbstractC2551l1 i;
    public final java.lang.String j;
    public final java.util.LinkedHashMap k;
    public final java.lang.Boolean l;
    public final com.inmobi.ads.WatermarkData m;
    public final com.inmobi.media.ads.network.common.model.AdQualityControl n;
    public final byte o;
    public final java.util.LinkedHashSet p;
    public final java.lang.String q;
    public final java.lang.String r;
    public final com.inmobi.media.C2781ti s;
    public final com.inmobi.media.C2799u9 t;

    public C2630o0(java.lang.String str, boolean z, long j, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.inmobi.media.AbstractC2551l1 abstractC2551l1, java.lang.String str6, java.util.LinkedHashMap linkedHashMap, java.lang.Boolean bool, com.inmobi.ads.WatermarkData watermarkData, com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl, byte b, java.util.LinkedHashSet linkedHashSet, java.lang.String str7, java.lang.String landingScheme, com.inmobi.media.C2781ti c2781ti, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.f5363a = str;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = abstractC2551l1;
        this.j = str6;
        this.k = linkedHashMap;
        this.l = bool;
        this.m = watermarkData;
        this.n = adQualityControl;
        this.o = b;
        this.p = linkedHashSet;
        this.q = str7;
        this.r = landingScheme;
        this.s = c2781ti;
        this.t = c2799u9;
    }

    public static com.inmobi.media.C2630o0 a(com.inmobi.media.C2630o0 c2630o0, com.inmobi.media.C2781ti c2781ti, int i) {
        java.lang.String str = c2630o0.f5363a;
        boolean z = c2630o0.b;
        long j = c2630o0.c;
        boolean z2 = c2630o0.d;
        java.lang.String str2 = c2630o0.e;
        java.lang.String str3 = c2630o0.f;
        java.lang.String str4 = c2630o0.g;
        java.lang.String str5 = c2630o0.h;
        java.lang.String str6 = c2630o0.j;
        java.util.LinkedHashMap linkedHashMap = c2630o0.k;
        java.lang.Boolean bool = c2630o0.l;
        com.inmobi.ads.WatermarkData watermarkData = (i & 4096) != 0 ? c2630o0.m : null;
        com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl = c2630o0.n;
        byte b = c2630o0.o;
        java.util.LinkedHashSet linkedHashSet = c2630o0.p;
        java.lang.String str7 = c2630o0.q;
        java.lang.String landingScheme = c2630o0.r;
        com.inmobi.media.C2781ti c2781ti2 = (i & 524288) != 0 ? c2630o0.s : c2781ti;
        com.inmobi.media.C2799u9 c2799u9 = c2630o0.t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        return new com.inmobi.media.C2630o0(str, z, j, z2, str2, str3, str4, str5, null, str6, linkedHashMap, bool, watermarkData, adQualityControl, b, linkedHashSet, str7, landingScheme, c2781ti2, c2799u9);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2630o0)) {
            return false;
        }
        com.inmobi.media.C2630o0 c2630o0 = (com.inmobi.media.C2630o0) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5363a, c2630o0.f5363a) && this.b == c2630o0.b && this.c == c2630o0.c && this.d == c2630o0.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c2630o0.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c2630o0.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c2630o0.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, c2630o0.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, c2630o0.i) && kotlin.jvm.internal.Intrinsics.areEqual(this.j, c2630o0.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, c2630o0.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, c2630o0.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.m, c2630o0.m) && kotlin.jvm.internal.Intrinsics.areEqual(this.n, c2630o0.n) && this.o == c2630o0.o && kotlin.jvm.internal.Intrinsics.areEqual(this.p, c2630o0.p) && kotlin.jvm.internal.Intrinsics.areEqual(this.q, c2630o0.q) && kotlin.jvm.internal.Intrinsics.areEqual(this.r, c2630o0.r) && kotlin.jvm.internal.Intrinsics.areEqual(this.s, c2630o0.s) && kotlin.jvm.internal.Intrinsics.areEqual(this.t, c2630o0.t);
    }

    public final int hashCode() {
        java.lang.String str = this.f5363a;
        int m = (kotlin.UByte$$ExternalSyntheticBackport0.m(this.d) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.c) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        java.lang.String str2 = this.e;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f;
        int hashCode2 = (this.g.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        java.lang.String str4 = this.h;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.inmobi.media.AbstractC2551l1 abstractC2551l1 = this.i;
        int hashCode4 = (hashCode3 + (abstractC2551l1 == null ? 0 : abstractC2551l1.hashCode())) * 31;
        java.lang.String str5 = this.j;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.util.LinkedHashMap linkedHashMap = this.k;
        int hashCode6 = (this.l.hashCode() + ((hashCode5 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31)) * 31;
        com.inmobi.ads.WatermarkData watermarkData = this.m;
        int hashCode7 = (hashCode6 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl = this.n;
        int hashCode8 = (this.p.hashCode() + ((this.o + ((hashCode7 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31)) * 31;
        java.lang.String str6 = this.q;
        int hashCode9 = (this.r.hashCode() + ((kotlin.UByte$$ExternalSyntheticBackport0.m(false) + ((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        com.inmobi.media.C2781ti c2781ti = this.s;
        int hashCode10 = (hashCode9 + (c2781ti == null ? 0 : c2781ti.hashCode())) * 31;
        com.inmobi.media.C2799u9 c2799u9 = this.t;
        return kotlin.UByte$$ExternalSyntheticBackport0.m(-1L) + ((hashCode10 + (c2799u9 != null ? c2799u9.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5363a;
        boolean z = this.b;
        long j = this.c;
        boolean z2 = this.d;
        java.lang.String str2 = this.e;
        java.lang.String str3 = this.f;
        java.lang.String str4 = this.g;
        java.lang.String str5 = this.h;
        com.inmobi.media.AbstractC2551l1 abstractC2551l1 = this.i;
        java.lang.String str6 = this.j;
        java.util.LinkedHashMap linkedHashMap = this.k;
        java.lang.Boolean bool = this.l;
        com.inmobi.ads.WatermarkData watermarkData = this.m;
        com.inmobi.media.ads.network.common.model.AdQualityControl adQualityControl = this.n;
        byte b = this.o;
        return "AdMetaData(adType=" + str + ", isImmersiveMode=" + z + ", placementId=" + j + ", allowAutoRedirection=" + z2 + ", creativeId=" + str2 + ", creativeType=" + str3 + ", markupTypeAdUnit=" + str4 + ", adSize=" + str5 + ", adPodHandler=" + abstractC2551l1 + ", contentURL=" + str6 + ", telemetryManagerMap=" + linkedHashMap + ", isHardwareAccelerationDisabled=" + bool + ", watermarkData=" + watermarkData + ", adQualityControl=" + adQualityControl + ", placementType=" + ((int) b) + ", viewabilityTrackers=" + this.p + ", impressionId=" + this.q + ", isInAppBrowser=false, landingScheme=" + this.r + ", renderViewMetaData=" + this.s + ", logger=" + this.t + ", viewTouchTimestamp=-1)";
    }
}

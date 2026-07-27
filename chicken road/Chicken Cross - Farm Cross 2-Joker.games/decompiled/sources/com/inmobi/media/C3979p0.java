package com.inmobi.media;

import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3979p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7296a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final AbstractC3923n1 i;
    public final String j;
    public final LinkedHashMap k;
    public final Boolean l;
    public final WatermarkData m;
    public final AdQualityControl n;
    public final byte o;
    public final LinkedHashSet p;
    public final String q;
    public final String r;
    public final Ij s;
    public final Z9 t;

    public C3979p0(String str, boolean z, long j, boolean z2, String str2, String str3, String str4, String str5, AbstractC3923n1 abstractC3923n1, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b, LinkedHashSet linkedHashSet, String str7, String landingScheme, Ij ij, Z9 z9) {
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.f7296a = str;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = abstractC3923n1;
        this.j = str6;
        this.k = linkedHashMap;
        this.l = bool;
        this.m = watermarkData;
        this.n = adQualityControl;
        this.o = b;
        this.p = linkedHashSet;
        this.q = str7;
        this.r = landingScheme;
        this.s = ij;
        this.t = z9;
    }

    public static C3979p0 a(C3979p0 c3979p0, Ij ij, int i) {
        String str = c3979p0.f7296a;
        boolean z = c3979p0.b;
        long j = c3979p0.c;
        boolean z2 = c3979p0.d;
        String str2 = c3979p0.e;
        String str3 = c3979p0.f;
        String str4 = c3979p0.g;
        String str5 = c3979p0.h;
        String str6 = c3979p0.j;
        LinkedHashMap linkedHashMap = c3979p0.k;
        Boolean bool = c3979p0.l;
        WatermarkData watermarkData = (i & 4096) != 0 ? c3979p0.m : null;
        AdQualityControl adQualityControl = c3979p0.n;
        byte b = c3979p0.o;
        LinkedHashSet linkedHashSet = c3979p0.p;
        String str7 = c3979p0.q;
        String landingScheme = c3979p0.r;
        Ij ij2 = (i & 524288) != 0 ? c3979p0.s : ij;
        Z9 z9 = c3979p0.t;
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        return new C3979p0(str, z, j, z2, str2, str3, str4, str5, null, str6, linkedHashMap, bool, watermarkData, adQualityControl, b, linkedHashSet, str7, landingScheme, ij2, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3979p0)) {
            return false;
        }
        C3979p0 c3979p0 = (C3979p0) obj;
        return Intrinsics.areEqual(this.f7296a, c3979p0.f7296a) && this.b == c3979p0.b && this.c == c3979p0.c && this.d == c3979p0.d && Intrinsics.areEqual(this.e, c3979p0.e) && Intrinsics.areEqual(this.f, c3979p0.f) && Intrinsics.areEqual(this.g, c3979p0.g) && Intrinsics.areEqual(this.h, c3979p0.h) && Intrinsics.areEqual(this.i, c3979p0.i) && Intrinsics.areEqual(this.j, c3979p0.j) && Intrinsics.areEqual(this.k, c3979p0.k) && Intrinsics.areEqual(this.l, c3979p0.l) && Intrinsics.areEqual(this.m, c3979p0.m) && Intrinsics.areEqual(this.n, c3979p0.n) && this.o == c3979p0.o && Intrinsics.areEqual(this.p, c3979p0.p) && Intrinsics.areEqual(this.q, c3979p0.q) && Intrinsics.areEqual(this.r, c3979p0.r) && Intrinsics.areEqual(this.s, c3979p0.s) && Intrinsics.areEqual(this.t, c3979p0.t);
    }

    public final int hashCode() {
        String str = this.f7296a;
        int hashCode = (Boolean.hashCode(this.d) + ((Long.hashCode(this.c) + ((Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC3923n1 abstractC3923n1 = this.i;
        int hashCode5 = (hashCode4 + (abstractC3923n1 == null ? 0 : abstractC3923n1.hashCode())) * 31;
        String str5 = this.j;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.k;
        int hashCode7 = (this.l.hashCode() + ((hashCode6 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31)) * 31;
        WatermarkData watermarkData = this.m;
        int hashCode8 = (hashCode7 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.n;
        int hashCode9 = (this.p.hashCode() + ((Byte.hashCode(this.o) + ((hashCode8 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31)) * 31;
        String str6 = this.q;
        int hashCode10 = (this.r.hashCode() + ((Boolean.hashCode(false) + ((hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        Ij ij = this.s;
        int hashCode11 = (hashCode10 + (ij == null ? 0 : ij.hashCode())) * 31;
        Z9 z9 = this.t;
        return Long.hashCode(-1L) + ((hashCode11 + (z9 != null ? z9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f7296a;
        boolean z = this.b;
        long j = this.c;
        boolean z2 = this.d;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        AbstractC3923n1 abstractC3923n1 = this.i;
        String str6 = this.j;
        LinkedHashMap linkedHashMap = this.k;
        Boolean bool = this.l;
        WatermarkData watermarkData = this.m;
        AdQualityControl adQualityControl = this.n;
        byte b = this.o;
        return "AdMetaData(adType=" + str + ", isImmersiveMode=" + z + ", placementId=" + j + ", allowAutoRedirection=" + z2 + ", creativeId=" + str2 + ", creativeType=" + str3 + ", markupTypeAdUnit=" + str4 + ", adSize=" + str5 + ", adPodHandler=" + abstractC3923n1 + ", contentURL=" + str6 + ", telemetryManagerMap=" + linkedHashMap + ", isHardwareAccelerationDisabled=" + bool + ", watermarkData=" + watermarkData + ", adQualityControl=" + adQualityControl + ", placementType=" + ((int) b) + ", viewabilityTrackers=" + this.p + ", impressionId=" + this.q + ", isInAppBrowser=false, landingScheme=" + this.r + ", renderViewMetaData=" + this.s + ", logger=" + this.t + ", viewTouchTimestamp=-1)";
    }
}

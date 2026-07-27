package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fb extends g2 implements ec, r {
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;
    public final Mediation j;
    public final String k;
    public final Long l;
    public final zb m;
    public final Integer n;
    public final String o;
    public final String p;
    public final Long q;
    public final Long r;

    public fb(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Long l, String str5, Mediation mediation, String str6, Long l2, zb zbVar, Integer num, String str7, String str8, Long l3, Long l4) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = l;
        this.i = str5;
        this.j = mediation;
        this.k = str6;
        this.l = l2;
        this.m = zbVar;
        this.n = num;
        this.o = str7;
        this.p = str8;
        this.q = l3;
        this.r = l4;
    }

    @Override // com.chartboost.sdk.impl.jh
    public String a() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.g2, com.chartboost.sdk.impl.jh
    public String c() {
        return this.k;
    }

    @Override // com.chartboost.sdk.impl.r
    public List e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return Intrinsics.areEqual(this.b, fbVar.b) && Intrinsics.areEqual(this.c, fbVar.c) && Intrinsics.areEqual(this.d, fbVar.d) && Intrinsics.areEqual(this.e, fbVar.e) && Intrinsics.areEqual(this.f, fbVar.f) && Intrinsics.areEqual(this.g, fbVar.g) && Intrinsics.areEqual(this.h, fbVar.h) && Intrinsics.areEqual(this.i, fbVar.i) && Intrinsics.areEqual(this.j, fbVar.j) && Intrinsics.areEqual(this.k, fbVar.k) && Intrinsics.areEqual(this.l, fbVar.l) && this.m == fbVar.m && Intrinsics.areEqual(this.n, fbVar.n) && Intrinsics.areEqual(this.o, fbVar.o) && Intrinsics.areEqual(this.p, fbVar.p) && Intrinsics.areEqual(this.q, fbVar.q) && Intrinsics.areEqual(this.r, fbVar.r);
    }

    @Override // com.chartboost.sdk.impl.g2
    public Map g() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String l;
        Pair pair = TuplesKt.to("CB_ERROR", fc.a(this.d, this.g));
        String str6 = this.e;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str6);
        String str8 = this.f;
        if (str8 == null) {
            str8 = "";
        }
        Pair pair3 = TuplesKt.to("CB_ERROR_CONSTANT", str8);
        Long l2 = this.h;
        if (l2 == null || (str = l2.toString()) == null) {
            str = "";
        }
        Pair pair4 = TuplesKt.to("CB_LATENCY", str);
        String str9 = this.i;
        if (str9 == null) {
            str9 = "";
        }
        Pair pair5 = TuplesKt.to("CB_BASE64_ADM", str9);
        Long l3 = this.l;
        if (l3 == null || (str2 = l3.toString()) == null) {
            str2 = "";
        }
        Pair pair6 = TuplesKt.to("CB_MEDIA_SELECTION_LATENCY", str2);
        zb zbVar = this.m;
        if (zbVar == null || (str3 = zbVar.b()) == null) {
            str3 = "";
        }
        Pair pair7 = TuplesKt.to("CB_MEDIA_SELECTION_MODE", str3);
        Integer num = this.n;
        if (num == null || (str4 = num.toString()) == null) {
            str4 = "";
        }
        Pair pair8 = TuplesKt.to("CB_MEDIA_SELECTION_FAILURES", str4);
        String str10 = this.o;
        if (str10 == null) {
            str10 = "";
        }
        Pair pair9 = TuplesKt.to("CB_MEDIA_SELECTION_MIME", str10);
        String str11 = this.p;
        if (str11 == null) {
            str11 = "";
        }
        Pair pair10 = TuplesKt.to("CB_PLAYBACK_MODE", str11);
        Long l4 = this.q;
        if (l4 == null || (str5 = l4.toString()) == null) {
            str5 = "";
        }
        Pair pair11 = TuplesKt.to("CB_PROGRESSIVE_DOWNLOAD_DURATION_MS", str5);
        Long l5 = this.r;
        if (l5 != null && (l = l5.toString()) != null) {
            str7 = l;
        }
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, TuplesKt.to("CB_VIDEO_LOAD_DURATION_MS", str7)), fc.a(this)), s.a(this));
    }

    @Override // com.chartboost.sdk.impl.ec
    public Mediation getMediation() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = ((this.b.hashCode() * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.h;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.i;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Mediation mediation = this.j;
        int hashCode8 = (hashCode7 + (mediation == null ? 0 : mediation.hashCode())) * 31;
        String str6 = this.k;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.l;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        zb zbVar = this.m;
        int hashCode11 = (hashCode10 + (zbVar == null ? 0 : zbVar.hashCode())) * 31;
        Integer num = this.n;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.o;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.p;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l3 = this.q;
        int hashCode15 = (hashCode14 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.r;
        return hashCode15 + (l4 != null ? l4.hashCode() : 0);
    }

    public String toString() {
        return "LoadEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", errorString=" + this.d + ", errorCode=" + this.e + ", errorConstant=" + this.f + ", errorCauseDescription=" + this.g + ", duration=" + this.h + ", adm=" + this.i + ", mediation=" + this.j + ", logContext=" + this.k + ", mediaSelectionLatencyMs=" + this.l + ", mediaSelectionMode=" + this.m + ", mediaSelectionFailures=" + this.n + ", mediaSelectionMimeType=" + this.o + ", playbackMode=" + this.p + ", progressiveDownloadDurationMs=" + this.q + ", videoRenderableLoadDurationMs=" + this.r + ")";
    }
}

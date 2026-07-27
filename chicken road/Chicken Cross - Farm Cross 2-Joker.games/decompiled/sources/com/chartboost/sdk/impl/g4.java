package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g4 extends g2 implements ec, r {
    public final String b;
    public final List c;
    public final q4 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final Long l;
    public final Mediation m;

    public /* synthetic */ g4(String str, List list, q4 q4Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, q4Var, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : l, mediation);
    }

    @Override // com.chartboost.sdk.impl.jh
    public String a() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.r
    public List e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return Intrinsics.areEqual(this.b, g4Var.b) && Intrinsics.areEqual(this.c, g4Var.c) && this.d == g4Var.d && Intrinsics.areEqual(this.e, g4Var.e) && Intrinsics.areEqual(this.f, g4Var.f) && Intrinsics.areEqual(this.g, g4Var.g) && Intrinsics.areEqual(this.h, g4Var.h) && Intrinsics.areEqual(this.i, g4Var.i) && Intrinsics.areEqual(this.j, g4Var.j) && Intrinsics.areEqual(this.k, g4Var.k) && Intrinsics.areEqual(this.l, g4Var.l) && Intrinsics.areEqual(this.m, g4Var.m);
    }

    @Override // com.chartboost.sdk.impl.g2
    public Map g() {
        String l;
        Pair pair = TuplesKt.to("CB_CLICK_TYPE", this.d.b());
        Pair pair2 = TuplesKt.to("CB_CLICK_URL", this.e);
        Pair pair3 = TuplesKt.to("CB_CLICK_DEEPLINK_URL", this.f);
        Pair pair4 = TuplesKt.to("CB_CLICK_FALLBACK_URL", this.g);
        Pair pair5 = TuplesKt.to("CB_ERROR", fc.a(this.h, this.k));
        String str = this.i;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Pair pair6 = TuplesKt.to("CB_ERROR_CODE", str);
        String str3 = this.j;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair7 = TuplesKt.to("CB_ERROR_CONSTANT", str3);
        Long l2 = this.l;
        if (l2 != null && (l = l2.toString()) != null) {
            str2 = l;
        }
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to("CB_LATENCY", str2)), fc.a(this)), s.a(this));
    }

    @Override // com.chartboost.sdk.impl.ec
    public Mediation getMediation() {
        return this.m;
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.l;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Mediation mediation = this.m;
        return hashCode9 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "ClickEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", clickType=" + this.d + ", clickUrl=" + this.e + ", deeplinkUrl=" + this.f + ", fallbackUrl=" + this.g + ", errorString=" + this.h + ", errorCode=" + this.i + ", errorConstant=" + this.j + ", errorCauseDescription=" + this.k + ", latency=" + this.l + ", mediation=" + this.m + ")";
    }

    public g4(String auctionId, List impressionIds, q4 clickType, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        Intrinsics.checkNotNullParameter(clickType, "clickType");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = clickType;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = l;
        this.m = mediation;
    }
}

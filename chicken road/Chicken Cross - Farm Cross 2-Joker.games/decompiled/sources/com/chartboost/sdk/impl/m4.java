package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.l4;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m4 extends g2 implements ec, r {
    public final String b;
    public final List c;
    public final q4 d;
    public final String e;
    public final String f;
    public final String g;
    public final l4.d h;
    public final l4.c i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Long n;
    public final Mediation o;

    public m4(String auctionId, List impressionIds, q4 clickType, String str, String str2, String str3, l4.d dVar, l4.c cVar, String str4, String str5, String str6, String str7, Long l, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        Intrinsics.checkNotNullParameter(clickType, "clickType");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = clickType;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = dVar;
        this.i = cVar;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = l;
        this.o = mediation;
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
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return Intrinsics.areEqual(this.b, m4Var.b) && Intrinsics.areEqual(this.c, m4Var.c) && this.d == m4Var.d && Intrinsics.areEqual(this.e, m4Var.e) && Intrinsics.areEqual(this.f, m4Var.f) && Intrinsics.areEqual(this.g, m4Var.g) && this.h == m4Var.h && this.i == m4Var.i && Intrinsics.areEqual(this.j, m4Var.j) && Intrinsics.areEqual(this.k, m4Var.k) && Intrinsics.areEqual(this.l, m4Var.l) && Intrinsics.areEqual(this.m, m4Var.m) && Intrinsics.areEqual(this.n, m4Var.n) && Intrinsics.areEqual(this.o, m4Var.o);
    }

    @Override // com.chartboost.sdk.impl.g2
    public Map g() {
        String str;
        String str2;
        String l;
        Pair pair = TuplesKt.to("CB_CLICK_TYPE", this.d.b());
        Pair pair2 = TuplesKt.to("CB_CLICK_URL", this.e);
        Pair pair3 = TuplesKt.to("CB_CLICK_DEEPLINK_URL", this.f);
        Pair pair4 = TuplesKt.to("CB_CLICK_FALLBACK_URL", this.g);
        l4.d dVar = this.h;
        String str3 = "";
        if (dVar == null || (str = dVar.b()) == null) {
            str = "";
        }
        Pair pair5 = TuplesKt.to("CB_CLICK_SOURCE", str);
        l4.c cVar = this.i;
        if (cVar == null || (str2 = cVar.b()) == null) {
            str2 = "";
        }
        Pair pair6 = TuplesKt.to("CB_CLICK_METHOD", str2);
        Pair pair7 = TuplesKt.to("CB_ERROR", fc.a(this.j, this.m));
        String str4 = this.k;
        if (str4 == null) {
            str4 = "";
        }
        Pair pair8 = TuplesKt.to("CB_ERROR_CODE", str4);
        String str5 = this.l;
        if (str5 == null) {
            str5 = "";
        }
        Pair pair9 = TuplesKt.to("CB_ERROR_CONSTANT", str5);
        Long l2 = this.n;
        if (l2 != null && (l = l2.toString()) != null) {
            str3 = l;
        }
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, TuplesKt.to("CB_LATENCY", str3)), fc.a(this)), s.a(this));
    }

    @Override // com.chartboost.sdk.impl.ec
    public Mediation getMediation() {
        return this.o;
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        l4.d dVar = this.h;
        int hashCode5 = (hashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        l4.c cVar = this.i;
        int hashCode6 = (hashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str4 = this.j;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.n;
        int hashCode11 = (hashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        Mediation mediation = this.o;
        return hashCode11 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "ClickResultEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", clickType=" + this.d + ", clickUrl=" + this.e + ", deeplinkUrl=" + this.f + ", fallbackUrl=" + this.g + ", clickSource=" + this.h + ", clickMethod=" + this.i + ", errorString=" + this.j + ", errorCode=" + this.k + ", errorConstant=" + this.l + ", errorCauseDescription=" + this.m + ", latency=" + this.n + ", mediation=" + this.o + ")";
    }
}

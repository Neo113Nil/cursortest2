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
public final class z6 extends g2 implements ec, r {
    public final String b;
    public final List c;
    public final a7 d;
    public final r5 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Mediation j;

    public /* synthetic */ z6(String str, List list, a7 a7Var, r5 r5Var, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, a7Var, (i & 8) != 0 ? null : r5Var, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, mediation);
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
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return Intrinsics.areEqual(this.b, z6Var.b) && Intrinsics.areEqual(this.c, z6Var.c) && this.d == z6Var.d && this.e == z6Var.e && Intrinsics.areEqual(this.f, z6Var.f) && Intrinsics.areEqual(this.g, z6Var.g) && Intrinsics.areEqual(this.h, z6Var.h) && Intrinsics.areEqual(this.i, z6Var.i) && Intrinsics.areEqual(this.j, z6Var.j);
    }

    @Override // com.chartboost.sdk.impl.g2
    public Map g() {
        Pair pair = TuplesKt.to("CB_ENGAGEMENT_TYPE", this.d.b());
        r5 r5Var = this.e;
        Pair pair2 = TuplesKt.to("CB_CTA_TYPE", r5Var != null ? r5Var.b() : null);
        Pair pair3 = TuplesKt.to("CB_ERROR", fc.a(this.f, this.i));
        String str = this.g;
        if (str == null) {
            str = "";
        }
        Pair pair4 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.h;
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), fc.a(this)), s.a(this));
    }

    @Override // com.chartboost.sdk.impl.ec
    public Mediation getMediation() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        r5 r5Var = this.e;
        int hashCode2 = (hashCode + (r5Var == null ? 0 : r5Var.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.j;
        return hashCode6 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "EngagementEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", engagementType=" + this.d + ", ctaType=" + this.e + ", errorString=" + this.f + ", errorCode=" + this.g + ", errorConstant=" + this.h + ", errorCauseDescription=" + this.i + ", mediation=" + this.j + ")";
    }

    public z6(String auctionId, List impressionIds, a7 engagementType, r5 r5Var, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        Intrinsics.checkNotNullParameter(engagementType, "engagementType");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = engagementType;
        this.e = r5Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = mediation;
    }
}

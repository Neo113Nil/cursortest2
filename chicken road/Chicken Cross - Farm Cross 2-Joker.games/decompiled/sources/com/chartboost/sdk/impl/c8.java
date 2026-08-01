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
public final class c8 extends g2 implements ec, r {
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Mediation h;
    public final String i;

    public /* synthetic */ c8(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, mediation, (i & 128) != 0 ? null : str6);
    }

    @Override // com.chartboost.sdk.impl.jh
    public String a() {
        return this.b;
    }

    @Override // com.chartboost.sdk.impl.g2, com.chartboost.sdk.impl.jh
    public String c() {
        return this.i;
    }

    @Override // com.chartboost.sdk.impl.r
    public List e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return Intrinsics.areEqual(this.b, c8Var.b) && Intrinsics.areEqual(this.c, c8Var.c) && Intrinsics.areEqual(this.d, c8Var.d) && Intrinsics.areEqual(this.e, c8Var.e) && Intrinsics.areEqual(this.f, c8Var.f) && Intrinsics.areEqual(this.g, c8Var.g) && Intrinsics.areEqual(this.h, c8Var.h) && Intrinsics.areEqual(this.i, c8Var.i);
    }

    @Override // com.chartboost.sdk.impl.g2
    public Map g() {
        Pair pair = TuplesKt.to("CB_ERROR", fc.a(this.d, this.g));
        String str = this.e;
        if (str == null) {
            str = "";
        }
        Pair pair2 = TuplesKt.to("CB_ERROR_CODE", str);
        String str2 = this.f;
        return MapsKt.plus(MapsKt.plus(MapsKt.mapOf(pair, pair2, TuplesKt.to("CB_ERROR_CONSTANT", str2 != null ? str2 : "")), fc.a(this)), s.a(this));
    }

    @Override // com.chartboost.sdk.impl.ec
    public Mediation getMediation() {
        return this.h;
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
        Mediation mediation = this.h;
        int hashCode6 = (hashCode5 + (mediation == null ? 0 : mediation.hashCode())) * 31;
        String str5 = this.i;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ExpirationEventPayload(auctionId=" + this.b + ", impressionIds=" + this.c + ", errorString=" + this.d + ", errorCode=" + this.e + ", errorConstant=" + this.f + ", errorCauseDescription=" + this.g + ", mediation=" + this.h + ", logContext=" + this.i + ")";
    }

    public c8(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation, String str5) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.b = auctionId;
        this.c = impressionIds;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = mediation;
        this.i = str5;
    }
}

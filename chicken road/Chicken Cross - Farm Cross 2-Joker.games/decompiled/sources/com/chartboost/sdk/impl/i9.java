package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i9 {

    /* renamed from: a, reason: collision with root package name */
    public final ni f4805a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;

    public i9(ni trackingState, String str, String str2, String str3, String str4, Integer num, String str5) {
        Intrinsics.checkNotNullParameter(trackingState, "trackingState");
        this.f4805a = trackingState;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
        this.g = str5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.e;
    }

    public final Integer e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj;
        return this.f4805a == i9Var.f4805a && Intrinsics.areEqual(this.b, i9Var.b) && Intrinsics.areEqual(this.c, i9Var.c) && Intrinsics.areEqual(this.d, i9Var.d) && Intrinsics.areEqual(this.e, i9Var.e) && Intrinsics.areEqual(this.f, i9Var.f) && Intrinsics.areEqual(this.g, i9Var.g);
    }

    public final ni f() {
        return this.f4805a;
    }

    public final String g() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.f4805a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "IdentityBodyFields(trackingState=" + this.f4805a + ", identifiers=" + this.b + ", uuid=" + this.c + ", gaid=" + this.d + ", setId=" + this.e + ", setIdScope=" + this.f + ", instanceId=" + this.g + ")";
    }

    public /* synthetic */ i9(ni niVar, String str, String str2, String str3, String str4, Integer num, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ni.c : niVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, (i & 64) == 0 ? str5 : null);
    }
}

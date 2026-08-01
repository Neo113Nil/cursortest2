package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4727a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final List m;
    public final List n;
    public final f9 o;
    public final List p;

    public d9(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List staticResources, List iFrameResources, List htmlResources, f9 f9Var, List iconViewTracking) {
        Intrinsics.checkNotNullParameter(staticResources, "staticResources");
        Intrinsics.checkNotNullParameter(iFrameResources, "iFrameResources");
        Intrinsics.checkNotNullParameter(htmlResources, "htmlResources");
        Intrinsics.checkNotNullParameter(iconViewTracking, "iconViewTracking");
        this.f4727a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = staticResources;
        this.m = iFrameResources;
        this.n = htmlResources;
        this.o = f9Var;
        this.p = iconViewTracking;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        return Intrinsics.areEqual(this.f4727a, d9Var.f4727a) && Intrinsics.areEqual(this.b, d9Var.b) && Intrinsics.areEqual(this.c, d9Var.c) && Intrinsics.areEqual(this.d, d9Var.d) && Intrinsics.areEqual(this.e, d9Var.e) && Intrinsics.areEqual(this.f, d9Var.f) && Intrinsics.areEqual(this.g, d9Var.g) && Intrinsics.areEqual(this.h, d9Var.h) && Intrinsics.areEqual(this.i, d9Var.i) && Intrinsics.areEqual(this.j, d9Var.j) && Intrinsics.areEqual(this.k, d9Var.k) && Intrinsics.areEqual(this.l, d9Var.l) && Intrinsics.areEqual(this.m, d9Var.m) && Intrinsics.areEqual(this.n, d9Var.n) && Intrinsics.areEqual(this.o, d9Var.o) && Intrinsics.areEqual(this.p, d9Var.p);
    }

    public int hashCode() {
        String str = this.f4727a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        int hashCode11 = (((((((hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31;
        f9 f9Var = this.o;
        return ((hashCode11 + (f9Var != null ? f9Var.hashCode() : 0)) * 31) + this.p.hashCode();
    }

    public String toString() {
        return "Icon(program=" + this.f4727a + ", width=" + this.b + ", height=" + this.c + ", xPosition=" + this.d + ", yPosition=" + this.e + ", duration=" + this.f + ", offset=" + this.g + ", apiFramework=" + this.h + ", pxratio=" + this.i + ", altText=" + this.j + ", hoverText=" + this.k + ", staticResources=" + this.l + ", iFrameResources=" + this.m + ", htmlResources=" + this.n + ", iconClicks=" + this.o + ", iconViewTracking=" + this.p + ")";
    }
}

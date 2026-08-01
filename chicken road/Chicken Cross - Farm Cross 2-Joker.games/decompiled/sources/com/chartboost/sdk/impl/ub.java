package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ub {

    /* renamed from: a, reason: collision with root package name */
    public final String f5031a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final Double f;

    public ub(String mimeType, Integer num, Integer num2, Integer num3, String url, Double d) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f5031a = mimeType;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = url;
        this.f = d;
    }

    public final Integer a() {
        return this.d;
    }

    public final Integer b() {
        return this.c;
    }

    public final String c() {
        return this.f5031a;
    }

    public final String d() {
        return this.e;
    }

    public final Double e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return Intrinsics.areEqual(this.f5031a, ubVar.f5031a) && Intrinsics.areEqual(this.b, ubVar.b) && Intrinsics.areEqual(this.c, ubVar.c) && Intrinsics.areEqual(this.d, ubVar.d) && Intrinsics.areEqual(this.e, ubVar.e) && Intrinsics.areEqual((Object) this.f, (Object) ubVar.f);
    }

    public final Integer f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.f5031a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (((hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.e.hashCode()) * 31;
        Double d = this.f;
        return hashCode4 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "MediaFile(mimeType=" + this.f5031a + ", width=" + this.b + ", height=" + this.c + ", bitrate=" + this.d + ", url=" + this.e + ", weight=" + this.f + ")";
    }
}

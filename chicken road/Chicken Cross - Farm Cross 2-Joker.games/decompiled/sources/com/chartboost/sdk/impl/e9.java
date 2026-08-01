package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e9 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4750a;
    public final Integer b;
    public final String c;
    public final eh d;

    public e9(Integer num, Integer num2, String str, eh ehVar) {
        this.f4750a = num;
        this.b = num2;
        this.c = str;
        this.d = ehVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        return Intrinsics.areEqual(this.f4750a, e9Var.f4750a) && Intrinsics.areEqual(this.b, e9Var.b) && Intrinsics.areEqual(this.c, e9Var.c) && Intrinsics.areEqual(this.d, e9Var.d);
    }

    public int hashCode() {
        Integer num = this.f4750a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        eh ehVar = this.d;
        return hashCode3 + (ehVar != null ? ehVar.hashCode() : 0);
    }

    public String toString() {
        return "IconClickFallbackImage(width=" + this.f4750a + ", height=" + this.b + ", altText=" + this.c + ", staticResource=" + this.d + ")";
    }
}

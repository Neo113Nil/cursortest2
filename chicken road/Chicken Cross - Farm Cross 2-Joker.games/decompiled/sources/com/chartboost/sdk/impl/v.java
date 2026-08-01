package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5035a;
    public final Integer b;

    public v(Integer num, Integer num2) {
        this.f5035a = num;
        this.b = num2;
    }

    public final Integer a() {
        return this.b;
    }

    public final Integer b() {
        return this.f5035a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f5035a, vVar.f5035a) && Intrinsics.areEqual(this.b, vVar.b);
    }

    public int hashCode() {
        Integer num = this.f5035a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "AdLoadConfig(widthDp=" + this.f5035a + ", heightDp=" + this.b + ")";
    }

    public /* synthetic */ v(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}

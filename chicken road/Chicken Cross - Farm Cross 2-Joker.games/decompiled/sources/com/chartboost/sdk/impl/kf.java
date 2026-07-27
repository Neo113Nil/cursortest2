package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kf {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4843a;
    public final Integer b;
    public final String c;
    public final rd d;

    public kf(Integer num, Integer num2, String str, rd openRTBConnectionType) {
        Intrinsics.checkNotNullParameter(openRTBConnectionType, "openRTBConnectionType");
        this.f4843a = num;
        this.b = num2;
        this.c = str;
        this.d = openRTBConnectionType;
    }

    public final Integer a() {
        return this.f4843a;
    }

    public final Integer b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final rd d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf)) {
            return false;
        }
        kf kfVar = (kf) obj;
        return Intrinsics.areEqual(this.f4843a, kfVar.f4843a) && Intrinsics.areEqual(this.b, kfVar.b) && Intrinsics.areEqual(this.c, kfVar.c) && this.d == kfVar.d;
    }

    public int hashCode() {
        Integer num = this.f4843a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ReachabilityBodyFields(cellularConnectionType=" + this.f4843a + ", connectionTypeFromActiveNetwork=" + this.b + ", detailedConnectionType=" + this.c + ", openRTBConnectionType=" + this.d + ")";
    }
}

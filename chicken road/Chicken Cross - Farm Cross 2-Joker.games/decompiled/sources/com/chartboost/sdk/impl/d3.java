package com.chartboost.sdk.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4722a;
    public final byte[] b;

    public d3(int i, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f4722a = i;
        this.b = data;
    }

    public final byte[] a() {
        return this.b;
    }

    public final int b() {
        return this.f4722a;
    }

    public final boolean c() {
        int i = this.f4722a;
        return i >= 200 && i < 300;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.f4722a == d3Var.f4722a && Intrinsics.areEqual(this.b, d3Var.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f4722a) * 31) + Arrays.hashCode(this.b);
    }

    public String toString() {
        return "CBNetworkServerResponse(statusCode=" + this.f4722a + ", data=" + Arrays.toString(this.b) + ")";
    }
}

package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f4807a;
    public final d0 b;
    public final CBError c;
    public final long d;
    public final long e;

    public ib(p1 appRequest, d0 d0Var, CBError cBError, long j, long j2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.f4807a = appRequest;
        this.b = d0Var;
        this.c = cBError;
        this.d = j;
        this.e = j2;
    }

    public final d0 a() {
        return this.b;
    }

    public final CBError b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return Intrinsics.areEqual(this.f4807a, ibVar.f4807a) && Intrinsics.areEqual(this.b, ibVar.b) && Intrinsics.areEqual(this.c, ibVar.c) && this.d == ibVar.d && this.e == ibVar.e;
    }

    public int hashCode() {
        int hashCode = this.f4807a.hashCode() * 31;
        d0 d0Var = this.b;
        int hashCode2 = (hashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        CBError cBError = this.c;
        return ((((hashCode2 + (cBError != null ? cBError.hashCode() : 0)) * 31) + Long.hashCode(this.d)) * 31) + Long.hashCode(this.e);
    }

    public String toString() {
        return "LoadResult(appRequest=" + this.f4807a + ", adUnit=" + this.b + ", error=" + this.c + ", requestResponseCodeNs=" + this.d + ", readDataNs=" + this.e + ")";
    }

    public /* synthetic */ ib(p1 p1Var, d0 d0Var, CBError cBError, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(p1Var, (i & 2) != 0 ? null : d0Var, (i & 4) == 0 ? cBError : null, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? j2 : 0L);
    }
}

package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    public final df f4694a;
    public final Function0 b;

    public bf(df target, Function0 onReached) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onReached, "onReached");
        this.f4694a = target;
        this.b = onReached;
    }

    public final Function0 a() {
        return this.b;
    }

    public final df b() {
        return this.f4694a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return Intrinsics.areEqual(this.f4694a, bfVar.f4694a) && Intrinsics.areEqual(this.b, bfVar.b);
    }

    public int hashCode() {
        return (this.f4694a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ProgressEvent(target=" + this.f4694a + ", onReached=" + this.b + ")";
    }
}

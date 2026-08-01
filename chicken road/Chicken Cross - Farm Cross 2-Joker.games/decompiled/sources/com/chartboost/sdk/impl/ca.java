package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public final w2 f4708a;
    public final CBError.Impression b;

    public ca(w2 w2Var, CBError.Impression impression) {
        this.f4708a = w2Var;
        this.b = impression;
    }

    public final CBError.Impression a() {
        return this.b;
    }

    public final w2 b() {
        return this.f4708a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return Intrinsics.areEqual(this.f4708a, caVar.f4708a) && this.b == caVar.b;
    }

    public int hashCode() {
        w2 w2Var = this.f4708a;
        int hashCode = (w2Var == null ? 0 : w2Var.hashCode()) * 31;
        CBError.Impression impression = this.b;
        return hashCode + (impression != null ? impression.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionHolder(impression=" + this.f4708a + ", error=" + this.b + ")";
    }
}

package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4888a;
    public final qi b;

    public n5(String str, qi qiVar) {
        this.f4888a = str;
        this.b = qiVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return Intrinsics.areEqual(this.f4888a, n5Var.f4888a) && Intrinsics.areEqual(this.b, n5Var.b);
    }

    public int hashCode() {
        String str = this.f4888a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        qi qiVar = this.b;
        return hashCode + (qiVar != null ? qiVar.hashCode() : 0);
    }

    public String toString() {
        return "CreativeExtension(type=" + this.f4888a + ", universalAdId=" + this.b + ")";
    }
}

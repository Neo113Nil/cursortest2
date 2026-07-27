package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qi {

    /* renamed from: a, reason: collision with root package name */
    public final String f4986a;
    public final String b;

    public qi(String str, String str2) {
        this.f4986a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi)) {
            return false;
        }
        qi qiVar = (qi) obj;
        return Intrinsics.areEqual(this.f4986a, qiVar.f4986a) && Intrinsics.areEqual(this.b, qiVar.b);
    }

    public int hashCode() {
        String str = this.f4986a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UniversalAdId(idRegistry=" + this.f4986a + ", value=" + this.b + ")";
    }
}

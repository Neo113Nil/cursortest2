package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4836a;
    public final Boolean b;

    public k3(String url, Boolean bool) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f4836a = url;
        this.b = bool;
    }

    public final Boolean a() {
        return this.b;
    }

    public final String b() {
        return this.f4836a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return Intrinsics.areEqual(this.f4836a, k3Var.f4836a) && Intrinsics.areEqual(this.b, k3Var.b);
    }

    public int hashCode() {
        int hashCode = this.f4836a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "CBUrl(url=" + this.f4836a + ", shouldDismiss=" + this.b + ")";
    }
}

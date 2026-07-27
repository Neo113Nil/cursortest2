package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5086a;
    public final List b;

    public y4(String str, List companionAds) {
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        this.f5086a = str;
        this.b = companionAds;
    }

    public final y4 a(String str, List companionAds) {
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        return new y4(str, companionAds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return Intrinsics.areEqual(this.f5086a, y4Var.f5086a) && Intrinsics.areEqual(this.b, y4Var.b);
    }

    public int hashCode() {
        String str = this.f5086a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompanionAds(required=" + this.f5086a + ", companionAds=" + this.b + ")";
    }

    public static /* synthetic */ y4 a(y4 y4Var, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = y4Var.f5086a;
        }
        if ((i & 2) != 0) {
            list = y4Var.b;
        }
        return y4Var.a(str, list);
    }

    public final List a() {
        return this.b;
    }
}

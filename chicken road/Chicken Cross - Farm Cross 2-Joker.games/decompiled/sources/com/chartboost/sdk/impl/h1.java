package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final ni f4786a;
    public final String b;

    public h1(ni advertisingIDState, String str) {
        Intrinsics.checkNotNullParameter(advertisingIDState, "advertisingIDState");
        this.f4786a = advertisingIDState;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final ni b() {
        return this.f4786a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f4786a == h1Var.f4786a && Intrinsics.areEqual(this.b, h1Var.b);
    }

    public int hashCode() {
        int hashCode = this.f4786a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AdvertisingIDHolder(advertisingIDState=" + this.f4786a + ", advertisingID=" + this.b + ")";
    }
}

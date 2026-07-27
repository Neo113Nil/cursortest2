package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.al;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gj {

    /* renamed from: a, reason: collision with root package name */
    public final String f4783a;
    public final List b;
    public final List c;
    public final List d;
    public final Set e;

    public gj(String str, List ads, List aggregatedTrackingEvents, List aggregatedAdVerifications, Set viewabilityVendors) {
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        Intrinsics.checkNotNullParameter(viewabilityVendors, "viewabilityVendors");
        this.f4783a = str;
        this.b = ads;
        this.c = aggregatedTrackingEvents;
        this.d = aggregatedAdVerifications;
        this.e = viewabilityVendors;
    }

    public final List a() {
        return this.b;
    }

    public final List b() {
        return this.d;
    }

    public final List c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj)) {
            return false;
        }
        gj gjVar = (gj) obj;
        return Intrinsics.areEqual(this.f4783a, gjVar.f4783a) && Intrinsics.areEqual(this.b, gjVar.b) && Intrinsics.areEqual(this.c, gjVar.c) && Intrinsics.areEqual(this.d, gjVar.d) && Intrinsics.areEqual(this.e, gjVar.e);
    }

    public int hashCode() {
        String str = this.f4783a;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "Vast(version=" + this.f4783a + ", ads=" + this.b + ", aggregatedTrackingEvents=" + this.c + ", aggregatedAdVerifications=" + this.d + ", viewabilityVendors=" + this.e + ")";
    }

    public /* synthetic */ gj(String str, List list, List list2, List list3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, list3, (i & 16) != 0 ? al.b.a(al.e, list3, null, 2, null) : set);
    }
}

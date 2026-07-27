package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pj {

    /* renamed from: a, reason: collision with root package name */
    public final jj f4963a;
    public final int b;
    public final int c;
    public final Set d;
    public final List e;
    public final List f;

    public pj(jj vastFetcher, int i, int i2, Set visitedWrapperUris, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        Intrinsics.checkNotNullParameter(visitedWrapperUris, "visitedWrapperUris");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        this.f4963a = vastFetcher;
        this.b = i;
        this.c = i2;
        this.d = visitedWrapperUris;
        this.e = aggregatedTrackingEvents;
        this.f = aggregatedAdVerifications;
    }

    public final pj a(jj vastFetcher, int i, int i2, Set visitedWrapperUris, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        Intrinsics.checkNotNullParameter(vastFetcher, "vastFetcher");
        Intrinsics.checkNotNullParameter(visitedWrapperUris, "visitedWrapperUris");
        Intrinsics.checkNotNullParameter(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.checkNotNullParameter(aggregatedAdVerifications, "aggregatedAdVerifications");
        return new pj(vastFetcher, i, i2, visitedWrapperUris, aggregatedTrackingEvents, aggregatedAdVerifications);
    }

    public final List b() {
        return this.e;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public final Set e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj)) {
            return false;
        }
        pj pjVar = (pj) obj;
        return Intrinsics.areEqual(this.f4963a, pjVar.f4963a) && this.b == pjVar.b && this.c == pjVar.c && Intrinsics.areEqual(this.d, pjVar.d) && Intrinsics.areEqual(this.e, pjVar.e) && Intrinsics.areEqual(this.f, pjVar.f);
    }

    public int hashCode() {
        return (((((((((this.f4963a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "VastParsingContext(vastFetcher=" + this.f4963a + ", maxWrapperDepth=" + this.b + ", currentDepth=" + this.c + ", visitedWrapperUris=" + this.d + ", aggregatedTrackingEvents=" + this.e + ", aggregatedAdVerifications=" + this.f + ")";
    }

    public static /* synthetic */ pj a(pj pjVar, jj jjVar, int i, int i2, Set set, List list, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            jjVar = pjVar.f4963a;
        }
        if ((i3 & 2) != 0) {
            i = pjVar.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = pjVar.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            set = pjVar.d;
        }
        Set set2 = set;
        if ((i3 & 16) != 0) {
            list = pjVar.e;
        }
        List list3 = list;
        if ((i3 & 32) != 0) {
            list2 = pjVar.f;
        }
        return pjVar.a(jjVar, i4, i5, set2, list3, list2);
    }

    public final List a() {
        return this.f;
    }

    public /* synthetic */ pj(jj jjVar, int i, int i2, Set set, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(jjVar, i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? SetsKt.emptySet() : set, (i3 & 16) != 0 ? new ArrayList() : list, (i3 & 32) != 0 ? new ArrayList() : list2);
    }
}

package com.chartboost.sdk.impl;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ii {
    public static final a g = new a(null);
    public static final AtomicLong h = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f4813a;
    public final String b;
    public final int c;
    public final String d;
    public final Map e;
    public final long f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }

        public final long a() {
            return ii.h.incrementAndGet();
        }
    }

    public ii(String str, String str2, int i, String str3, Map extras, long j) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f4813a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = extras;
        this.f = j;
    }

    public final ii a(String str, String str2, int i, String str3, Map extras, long j) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new ii(str, str2, i, str3, extras, j);
    }

    public final String b() {
        return this.f4813a;
    }

    public final Map c() {
        return this.e;
    }

    public final int d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii)) {
            return false;
        }
        ii iiVar = (ii) obj;
        return Intrinsics.areEqual(this.f4813a, iiVar.f4813a) && Intrinsics.areEqual(this.b, iiVar.b) && this.c == iiVar.c && Intrinsics.areEqual(this.d, iiVar.d) && Intrinsics.areEqual(this.e, iiVar.e) && this.f == iiVar.f;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        String str = this.f4813a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.c)) * 31;
        String str3 = this.d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + Long.hashCode(this.f);
    }

    public String toString() {
        return "TrackingEvent(event=" + this.f4813a + ", url=" + this.b + ", level=" + this.c + ", offset=" + this.d + ", extras=" + this.e + ", instanceId=" + this.f + ")";
    }

    public static /* synthetic */ ii a(ii iiVar, String str, String str2, int i, String str3, Map map, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iiVar.f4813a;
        }
        if ((i2 & 2) != 0) {
            str2 = iiVar.b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = iiVar.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = iiVar.d;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            map = iiVar.e;
        }
        Map map2 = map;
        if ((i2 & 32) != 0) {
            j = iiVar.f;
        }
        return iiVar.a(str, str4, i3, str5, map2, j);
    }

    public /* synthetic */ ii(String str, String str2, int i, String str3, Map map, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? MapsKt.emptyMap() : map, (i2 & 32) != 0 ? g.a() : j);
    }
}

package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Fd {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f7630a;
    private final Map<String, List<String>> b;
    private final Map<String, List<String>> c;
    private final Map<String, List<String>> d;

    public Fd() {
        this(null, null, null, null, 15, null);
    }

    public final Map<String, List<String>> a() {
        return this.f7630a;
    }

    public final Map<String, List<String>> b() {
        return this.b;
    }

    public final Map<String, List<String>> c() {
        return this.c;
    }

    public final Map<String, List<String>> d() {
        return this.d;
    }

    public final Map<String, List<String>> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fd)) {
            return false;
        }
        Fd fd = (Fd) obj;
        return Intrinsics.areEqual(this.f7630a, fd.f7630a) && Intrinsics.areEqual(this.b, fd.b) && Intrinsics.areEqual(this.c, fd.c) && Intrinsics.areEqual(this.d, fd.d);
    }

    public final Map<String, List<String>> f() {
        return this.b;
    }

    public final Map<String, List<String>> g() {
        return this.d;
    }

    public final Map<String, List<String>> h() {
        return this.f7630a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.f7630a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.b;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.c;
        int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.d;
        return hashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderOrder2(rewarded=" + this.f7630a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Fd(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        this.f7630a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public final Fd a(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        return new Fd(map, map2, map3, map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fd a(Fd fd, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = fd.f7630a;
        }
        if ((i & 2) != 0) {
            map2 = fd.b;
        }
        if ((i & 4) != 0) {
            map3 = fd.c;
        }
        if ((i & 8) != 0) {
            map4 = fd.d;
        }
        return fd.a(map, map2, map3, map4);
    }

    public /* synthetic */ Fd(Map map, Map map2, Map map3, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4);
    }
}

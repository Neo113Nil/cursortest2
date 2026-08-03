package com.ironsource;

/* loaded from: classes5.dex */
public final class Gd {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f5726a;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> b;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> c;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> d;

    public Gd() {
        this(null, null, null, null, 15, null);
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> a() {
        return this.f5726a;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> b() {
        return this.b;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> c() {
        return this.c;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> d() {
        return this.d;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Gd)) {
            return false;
        }
        com.ironsource.Gd gd = (com.ironsource.Gd) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5726a, gd.f5726a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, gd.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, gd.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, gd.d);
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f() {
        return this.b;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> g() {
        return this.d;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> h() {
        return this.f5726a;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.f5726a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map2 = this.b;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map3 = this.c;
        int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map4 = this.d;
        return hashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ProviderOrder2(rewarded=" + this.f5726a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Gd(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map2, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map3, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map4) {
        this.f5726a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public final com.ironsource.Gd a(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map2, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map3, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map4) {
        return new com.ironsource.Gd(map, map2, map3, map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.Gd a(com.ironsource.Gd gd, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = gd.f5726a;
        }
        if ((i & 2) != 0) {
            map2 = gd.b;
        }
        if ((i & 4) != 0) {
            map3 = gd.c;
        }
        if ((i & 8) != 0) {
            map4 = gd.d;
        }
        return gd.a(map, map2, map3, map4);
    }

    public /* synthetic */ Gd(java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4);
    }
}

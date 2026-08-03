package com.ironsource;

/* renamed from: com.ironsource.c2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2981c2 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6167a;
    private final boolean b;
    private boolean c;
    private java.lang.String d;
    private java.util.Map<java.lang.String, ? extends java.lang.Object> e;
    private com.ironsource.C2963b2 f;
    private java.util.Map<java.lang.String, java.lang.Object> g;

    public C2981c2(java.lang.String name, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.f6167a = name;
        this.b = z;
        this.d = "";
        this.e = kotlin.collections.MapsKt.emptyMap();
        this.g = new java.util.HashMap();
    }

    public final java.lang.String a() {
        return this.f6167a;
    }

    public final boolean b() {
        return this.b;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> c() {
        return this.g;
    }

    public final com.ironsource.C2963b2 d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C2981c2)) {
            return false;
        }
        com.ironsource.C2981c2 c2981c2 = (com.ironsource.C2981c2) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6167a, c2981c2.f6167a) && this.b == c2981c2.b;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> f() {
        return this.e;
    }

    public final java.lang.String g() {
        return this.f6167a;
    }

    public final java.lang.String h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f6167a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean i() {
        return this.c;
    }

    public java.lang.String toString() {
        return "AuctionInstanceInfo(name=" + this.f6167a + ", bidder=" + this.b + ")";
    }

    public final com.ironsource.C2981c2 a(java.lang.String name, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.ironsource.C2981c2(name, z);
    }

    public final void b(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.e = map;
    }

    public static /* synthetic */ com.ironsource.C2981c2 a(com.ironsource.C2981c2 c2981c2, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2981c2.f6167a;
        }
        if ((i & 2) != 0) {
            z = c2981c2.b;
        }
        return c2981c2.a(str, z);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void a(com.ironsource.C2963b2 c2963b2) {
        this.f = c2963b2;
    }

    public final void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.g = map;
    }
}

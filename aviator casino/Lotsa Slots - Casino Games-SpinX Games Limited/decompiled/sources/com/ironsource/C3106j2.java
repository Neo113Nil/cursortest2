package com.ironsource;

/* renamed from: com.ironsource.j2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3106j2 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6319a;
    private final boolean b;
    private boolean c;
    private java.lang.String d;
    private java.util.Map<java.lang.String, ? extends java.lang.Object> e;
    private com.ironsource.C2963b2 f;
    private java.util.Map<java.lang.String, java.lang.Object> g;

    public C3106j2(java.lang.String name, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.f6319a = name;
        this.b = z;
        this.d = "";
        this.e = kotlin.collections.MapsKt.emptyMap();
        this.g = new java.util.HashMap();
    }

    public final java.lang.String a() {
        return this.f6319a;
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
        if (!(obj instanceof com.ironsource.C3106j2)) {
            return false;
        }
        com.ironsource.C3106j2 c3106j2 = (com.ironsource.C3106j2) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6319a, c3106j2.f6319a) && this.b == c3106j2.b;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> f() {
        return this.e;
    }

    public final java.lang.String g() {
        return this.f6319a;
    }

    public final java.lang.String h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f6319a.hashCode() * 31;
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
        return "AuctionRequestInstanceInfo(name=" + this.f6319a + ", bidder=" + this.b + ")";
    }

    public final com.ironsource.C3106j2 a(java.lang.String name, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.ironsource.C3106j2(name, z);
    }

    public final void b(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.e = map;
    }

    public static /* synthetic */ com.ironsource.C3106j2 a(com.ironsource.C3106j2 c3106j2, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3106j2.f6319a;
        }
        if ((i & 2) != 0) {
            z = c3106j2.b;
        }
        return c3106j2.a(str, z);
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

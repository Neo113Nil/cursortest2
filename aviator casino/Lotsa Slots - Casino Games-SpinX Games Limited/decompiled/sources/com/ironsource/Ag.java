package com.ironsource;

/* loaded from: classes5.dex */
public final class Ag {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5619a;
    private final boolean b;
    private final boolean c;

    public Ag(boolean z, boolean z2, boolean z3) {
        this.f5619a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.f5619a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.f5619a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Ag)) {
            return false;
        }
        com.ironsource.Ag ag = (com.ironsource.Ag) obj;
        return this.f5619a == ag.f5619a && this.b == ag.b && this.c == ag.c;
    }

    public final boolean f() {
        return this.b;
    }

    public final org.json.JSONObject g() {
        org.json.JSONObject put = new org.json.JSONObject().put(com.ironsource.C3023e8.k, this.f5619a).put(com.ironsource.C3023e8.l, this.b).put(com.ironsource.C3023e8.m, this.c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f5619a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.c;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public java.lang.String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f5619a + ", isWindowVisible=" + this.b + ", isShown=" + this.c + ")";
    }

    public final com.ironsource.Ag a(boolean z, boolean z2, boolean z3) {
        return new com.ironsource.Ag(z, z2, z3);
    }

    public static /* synthetic */ com.ironsource.Ag a(com.ironsource.Ag ag, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = ag.f5619a;
        }
        if ((i & 2) != 0) {
            z2 = ag.b;
        }
        if ((i & 4) != 0) {
            z3 = ag.c;
        }
        return ag.a(z, z2, z3);
    }
}

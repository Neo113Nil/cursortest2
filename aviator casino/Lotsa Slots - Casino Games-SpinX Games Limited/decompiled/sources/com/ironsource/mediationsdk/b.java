package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.q.d f6404a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public b(com.ironsource.mediationsdk.q.d sdkState, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        this.f6404a = sdkState;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final com.ironsource.mediationsdk.q.d a() {
        return this.f6404a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final com.ironsource.mediationsdk.q.d e() {
        return this.f6404a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.mediationsdk.b)) {
            return false;
        }
        com.ironsource.mediationsdk.b bVar = (com.ironsource.mediationsdk.b) obj;
        return this.f6404a == bVar.f6404a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.c;
    }

    public final boolean h() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f6404a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.d;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public java.lang.String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f6404a + ", isRetryForMoreThan15Secs=" + this.b + ", isDemandOnlyInitRequested=" + this.c + ", isAdUnitInitRequested=" + this.d + ")";
    }

    public final com.ironsource.mediationsdk.b a(com.ironsource.mediationsdk.q.d sdkState, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        return new com.ironsource.mediationsdk.b(sdkState, z, z2, z3);
    }

    public static /* synthetic */ com.ironsource.mediationsdk.b a(com.ironsource.mediationsdk.b bVar, com.ironsource.mediationsdk.q.d dVar, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dVar = bVar.f6404a;
        }
        if ((i & 2) != 0) {
            z = bVar.b;
        }
        if ((i & 4) != 0) {
            z2 = bVar.c;
        }
        if ((i & 8) != 0) {
            z3 = bVar.d;
        }
        return bVar.a(dVar, z, z2, z3);
    }
}

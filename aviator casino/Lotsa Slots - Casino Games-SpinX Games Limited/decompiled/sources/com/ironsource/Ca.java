package com.ironsource;

/* loaded from: classes5.dex */
public final class Ca {

    /* renamed from: a, reason: collision with root package name */
    private final long f5657a;
    private final long b;
    private final boolean c;

    public Ca(long j, long j2, boolean z) {
        this.f5657a = j;
        this.b = j2;
        this.c = z;
    }

    public final long a() {
        return this.f5657a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.f5657a;
    }

    public final long e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Ca)) {
            return false;
        }
        com.ironsource.Ca ca = (com.ironsource.Ca) obj;
        return this.f5657a == ca.f5657a && this.b == ca.b && this.c == ca.c;
    }

    public final boolean f() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m = ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f5657a) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return m + i;
    }

    public java.lang.String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.f5657a + ", visibilityCheckerInterval=" + this.b + ", isAutoRefreshEnabled=" + this.c + ")";
    }

    public final com.ironsource.Ca a(long j, long j2, boolean z) {
        return new com.ironsource.Ca(j, j2, z);
    }

    public static /* synthetic */ com.ironsource.Ca a(com.ironsource.Ca ca, long j, long j2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = ca.f5657a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = ca.b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = ca.c;
        }
        return ca.a(j3, j4, z);
    }
}

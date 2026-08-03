package com.ironsource;

/* loaded from: classes5.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f5763a;

    public J0(long j) {
        this.f5763a = j;
    }

    public final long a() {
        return this.f5763a;
    }

    public final long b() {
        return this.f5763a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.J0) && this.f5763a == ((com.ironsource.J0) obj).f5763a;
    }

    public int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f5763a);
    }

    public java.lang.String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f5763a + ")";
    }

    public final com.ironsource.J0 a(long j) {
        return new com.ironsource.J0(j);
    }

    public static /* synthetic */ com.ironsource.J0 a(com.ironsource.J0 j0, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = j0.f5763a;
        }
        return j0.a(j);
    }
}

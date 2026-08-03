package com.ironsource;

/* loaded from: classes5.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.C3247r0.a f5762a;

    public J(com.ironsource.C3247r0.a performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        this.f5762a = performance;
    }

    public final com.ironsource.C3247r0.a a() {
        return this.f5762a;
    }

    public final com.ironsource.C3247r0.a b() {
        return this.f5762a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.J) && this.f5762a == ((com.ironsource.J) obj).f5762a;
    }

    public int hashCode() {
        return this.f5762a.hashCode();
    }

    public java.lang.String toString() {
        return "AdInstancePerformance(performance=" + this.f5762a + ")";
    }

    public final com.ironsource.J a(com.ironsource.C3247r0.a performance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        return new com.ironsource.J(performance);
    }

    public final void b(com.ironsource.C3247r0.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f5762a = aVar;
    }

    public static /* synthetic */ com.ironsource.J a(com.ironsource.J j, com.ironsource.C3247r0.a aVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            aVar = j.f5762a;
        }
        return j.a(aVar);
    }
}

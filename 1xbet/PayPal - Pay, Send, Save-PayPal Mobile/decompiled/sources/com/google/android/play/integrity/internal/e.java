package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class e extends com.google.android.play.integrity.internal.f {

    /* renamed from: a, reason: collision with root package name */
    private final int f3854a;
    private final long b;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.play.integrity.internal.f)) {
            return false;
        }
        com.google.android.play.integrity.internal.f fVar = (com.google.android.play.integrity.internal.f) obj;
        return this.f3854a == fVar.a() && this.b == fVar.b();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EventRecord{eventType=");
        sb.append(this.f3854a);
        sb.append(", eventTimestamp=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f3854a ^ 1000003) * 1000003);
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.b;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f3854a;
    }

    e(int i, long j) {
        this.f3854a = i;
        this.b = j;
    }
}

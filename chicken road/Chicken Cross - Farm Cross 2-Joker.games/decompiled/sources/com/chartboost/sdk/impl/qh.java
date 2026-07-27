package com.chartboost.sdk.impl;

/* loaded from: classes4.dex */
public final class qh {

    /* renamed from: a, reason: collision with root package name */
    public final long f4985a;
    public final long b;
    public final long c;

    public qh(long j, long j2, long j3) {
        this.f4985a = j;
        this.b = j2;
        this.c = j3;
    }

    public final long a() {
        return this.f4985a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh)) {
            return false;
        }
        qh qhVar = (qh) obj;
        return this.f4985a == qhVar.f4985a && this.b == qhVar.b && this.c == qhVar.c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f4985a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c);
    }

    public String toString() {
        return "TimeSourceBodyFields(currentTimeMillis=" + this.f4985a + ", nanoTime=" + this.b + ", uptimeMillis=" + this.c + ")";
    }
}

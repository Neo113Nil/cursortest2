package com.ironsource;

/* loaded from: classes6.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f7670a;

    public I0(long j) {
        this.f7670a = j;
    }

    public final long a() {
        return this.f7670a;
    }

    public final long b() {
        return this.f7670a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I0) && this.f7670a == ((I0) obj).f7670a;
    }

    public int hashCode() {
        return Long.hashCode(this.f7670a);
    }

    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f7670a + ")";
    }

    public final I0 a(long j) {
        return new I0(j);
    }

    public static /* synthetic */ I0 a(I0 i0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = i0.f7670a;
        }
        return i0.a(j);
    }
}

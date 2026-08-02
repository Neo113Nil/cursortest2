package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class GG {

    /* renamed from: a, reason: collision with root package name */
    public final int f9187a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9188b;

    public GG(int i, boolean z3) {
        this.f9187a = i;
        this.f9188b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GG.class != obj.getClass()) {
            return false;
        }
        GG gg = (GG) obj;
        return this.f9187a == gg.f9187a && this.f9188b == gg.f9188b;
    }

    public final int hashCode() {
        return (this.f9187a * 31) + (this.f9188b ? 1 : 0);
    }
}

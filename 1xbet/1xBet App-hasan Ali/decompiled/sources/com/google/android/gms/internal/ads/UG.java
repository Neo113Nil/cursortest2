package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class UG {

    /* renamed from: a, reason: collision with root package name */
    public final long f11767a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11768b;

    public UG(long j5, long j6) {
        this.f11767a = j5;
        this.f11768b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UG)) {
            return false;
        }
        UG ug = (UG) obj;
        return this.f11767a == ug.f11767a && this.f11768b == ug.f11768b;
    }

    public final int hashCode() {
        return (((int) this.f11767a) * 31) + ((int) this.f11768b);
    }
}

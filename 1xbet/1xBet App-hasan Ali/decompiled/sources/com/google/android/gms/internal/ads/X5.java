package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class X5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12150a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12151b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12152c;

    public X5(int i, long j5, String str) {
        this.f12150a = j5;
        this.f12151b = str;
        this.f12152c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof X5)) {
            X5 x5 = (X5) obj;
            if (x5.f12150a == this.f12150a && x5.f12152c == this.f12152c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f12150a;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final int f12383a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12384b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12385c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12386d;

    public Z(int i, int i5, int i6, byte[] bArr) {
        this.f12383a = i;
        this.f12384b = bArr;
        this.f12385c = i5;
        this.f12386d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass()) {
            Z z3 = (Z) obj;
            if (this.f12383a == z3.f12383a && this.f12385c == z3.f12385c && this.f12386d == z3.f12386d && Arrays.equals(this.f12384b, z3.f12384b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f12384b) + (this.f12383a * 31)) * 31) + this.f12385c) * 31) + this.f12386d;
    }
}

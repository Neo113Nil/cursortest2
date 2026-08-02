package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.zC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1869zC extends BC {
    @Override // com.google.android.gms.internal.ads.BC
    public final byte W0(long j5) {
        return Memory.peekByte((int) j5);
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final double Z0(long j5, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f7794k).getLong(obj, j5));
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final float a1(long j5, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f7794k).getInt(obj, j5));
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void c1(long j5, byte[] bArr, long j6, long j7) {
        Memory.peekByteArray((int) j5, bArr, (int) j6, (int) j7);
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void e1(Object obj, long j5, boolean z3) {
        if (CC.f7977h) {
            CC.c(obj, j5, z3 ? (byte) 1 : (byte) 0);
        } else {
            CC.d(obj, j5, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void f1(Object obj, long j5, byte b3) {
        if (CC.f7977h) {
            CC.c(obj, j5, b3);
        } else {
            CC.d(obj, j5, b3);
        }
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void g1(Object obj, long j5, double d5) {
        ((Unsafe) this.f7794k).putLong(obj, j5, Double.doubleToLongBits(d5));
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final void i1(Object obj, long j5, float f) {
        ((Unsafe) this.f7794k).putInt(obj, j5, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final boolean j1(long j5, Object obj) {
        return CC.f7977h ? CC.o(j5, obj) : CC.p(j5, obj);
    }
}

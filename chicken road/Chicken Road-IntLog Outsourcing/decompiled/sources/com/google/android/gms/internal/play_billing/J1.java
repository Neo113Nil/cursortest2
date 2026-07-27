package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class J1 extends L1 {
    public J1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final double a(long j2, Object obj) {
        return Double.longBitsToDouble(this.f5077a.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final float b(long j2, Object obj) {
        return Float.intBitsToFloat(this.f5077a.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final void c(Object obj, long j2, boolean z) {
        if (M1.f5085g) {
            M1.b(obj, j2, z ? (byte) 1 : (byte) 0);
        } else {
            M1.c(obj, j2, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final void d(Object obj, long j2, byte b6) {
        if (M1.f5085g) {
            M1.b(obj, j2, b6);
        } else {
            M1.c(obj, j2, b6);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final void e(Object obj, long j2, double d6) {
        this.f5077a.putLong(obj, j2, Double.doubleToLongBits(d6));
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final void f(Object obj, long j2, float f3) {
        this.f5077a.putInt(obj, j2, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.play_billing.L1
    public final boolean g(long j2, Object obj) {
        return M1.f5085g ? M1.q(j2, obj) : M1.r(j2, obj);
    }
}

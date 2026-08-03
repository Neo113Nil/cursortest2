package com.google.android.gms.internal.ads;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzet$$ExternalSyntheticBackport0 {
    public static /* synthetic */ int m(byte b) {
        return b & 255;
    }

    public static /* synthetic */ int m(int i, int i2) {
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ int m(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long m(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ boolean m(sun.misc.Unsafe unsafe, java.lang.Object obj, long j, java.lang.Object obj2, java.lang.Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}

package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzid {
    public static void zza(boolean z4, String str, long j, long j3) {
        if (z4) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j3 + ")");
    }

    public static void zzb(boolean z4) {
        if (!z4) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}

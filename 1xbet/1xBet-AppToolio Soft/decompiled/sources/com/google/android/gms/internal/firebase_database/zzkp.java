package com.google.android.gms.internal.firebase_database;

import java.util.Random;

/* loaded from: classes.dex */
public final class zzkp {
    private static final Random zzun = new Random();
    private static long zzuo = 0;
    private static final int[] zzup = new int[12];

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static synchronized String zzo(long j) {
        String sb;
        synchronized (zzkp.class) {
            boolean z = j == zzuo;
            zzuo = j;
            char[] cArr = new char[8];
            StringBuilder sb2 = new StringBuilder(20);
            for (int i = 7; i >= 0; i--) {
                cArr[i] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int) (j % 64));
                j /= 64;
            }
            sb2.append(cArr);
            if (z) {
                for (int i2 = 11; i2 >= 0; i2--) {
                    if (zzup[i2] != 63) {
                        zzup[i2] = zzup[i2] + 1;
                        break;
                    }
                    zzup[i2] = 0;
                }
            } else {
                for (int i3 = 0; i3 < 12; i3++) {
                    zzup[i3] = zzun.nextInt(64);
                }
            }
            for (int i4 = 0; i4 < 12; i4++) {
                sb2.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(zzup[i4]));
            }
            sb = sb2.toString();
        }
        return sb;
    }
}

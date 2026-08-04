package com.google.android.gms.internal.common;

import org.jspecify.nullness.NullMarked;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
@NullMarked
public final class zzah {
    public static Object[] zza(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException(k.d(i8, "at index "));
            }
        }
        return objArr;
    }
}

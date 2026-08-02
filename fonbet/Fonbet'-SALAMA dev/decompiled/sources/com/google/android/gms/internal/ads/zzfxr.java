package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
public final class zzfxr {
    public static Object zza(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(k.d(i7, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            zza(objArr[i8], i8);
        }
        return objArr;
    }
}

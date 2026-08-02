package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzcr {
    static java.lang.Object zza(@javax.annotation.CheckForNull java.lang.Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("at index " + i);
    }

    static java.lang.Object[] zzb(java.lang.Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}

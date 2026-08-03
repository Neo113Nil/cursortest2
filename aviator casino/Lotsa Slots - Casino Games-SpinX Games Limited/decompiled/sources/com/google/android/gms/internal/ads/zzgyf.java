package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgyf {
    static java.lang.Object[] zza(java.lang.Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zzb(objArr[i2], i2);
        }
        return objArr;
    }

    static java.lang.Object zzb(java.lang.Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 9);
        sb.append("at index ");
        sb.append(i);
        throw new java.lang.NullPointerException(sb.toString());
    }
}

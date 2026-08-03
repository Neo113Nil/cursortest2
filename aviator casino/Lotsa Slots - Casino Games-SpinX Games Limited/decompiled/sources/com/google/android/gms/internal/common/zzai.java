package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes4.dex */
public final class zzai {
    static java.lang.Object[] zza(java.lang.Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new java.lang.NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}

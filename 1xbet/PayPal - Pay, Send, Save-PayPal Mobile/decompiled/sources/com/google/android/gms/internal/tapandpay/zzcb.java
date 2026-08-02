package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzcb {
    static java.lang.Object zza(java.lang.Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 9);
        sb.append("at index ");
        sb.append(i);
        throw new java.lang.NullPointerException(sb.toString());
    }
}

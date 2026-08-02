package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
final class zzbd {
    static void zza(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null key in entry: null=".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj2))));
        }
        if (obj2 != null) {
            return;
        }
        throw new java.lang.NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}

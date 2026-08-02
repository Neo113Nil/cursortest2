package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
final class zzi {
    static void zza(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            java.util.Objects.toString(obj2);
            throw new java.lang.NullPointerException("null key in entry: null=".concat(java.lang.String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new java.lang.NullPointerException("null value in entry: " + obj + "=null");
    }
}

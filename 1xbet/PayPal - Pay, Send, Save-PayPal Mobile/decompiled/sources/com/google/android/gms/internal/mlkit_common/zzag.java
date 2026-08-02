package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
final class zzag {
    private final java.lang.Object zza;
    private final java.lang.Object zzb;
    private final java.lang.Object zzc;

    final java.lang.IllegalArgumentException zza() {
        java.lang.Object obj = this.zzc;
        java.lang.Object obj2 = this.zzb;
        java.lang.Object obj3 = this.zza;
        return new java.lang.IllegalArgumentException("Multiple entries with same key: " + java.lang.String.valueOf(obj3) + "=" + java.lang.String.valueOf(obj2) + " and " + java.lang.String.valueOf(obj3) + "=" + java.lang.String.valueOf(obj));
    }

    zzag(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }
}

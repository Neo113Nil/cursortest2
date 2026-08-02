package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzrq {
    int zza;
    final int zzb;
    com.google.android.libraries.places.internal.zzrq zzc;
    final java.util.Map zzd = new java.util.HashMap(0);

    zzrq(int i, int i2, com.google.android.libraries.places.internal.zzrq zzrqVar) {
        if (i > i2) {
            throw new java.lang.IllegalArgumentException();
        }
        this.zza = i;
        this.zzb = i2;
        this.zzc = null;
    }

    public final java.lang.String toString() {
        int identityHashCode = java.lang.System.identityHashCode(this);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(identityHashCode).length() + 4);
        sb.append("Node");
        sb.append(identityHashCode);
        return sb.toString();
    }
}

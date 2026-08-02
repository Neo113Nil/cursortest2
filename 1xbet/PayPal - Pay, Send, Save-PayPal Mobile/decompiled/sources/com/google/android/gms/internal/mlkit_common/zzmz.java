package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzmz {
    private com.google.android.gms.internal.mlkit_common.zznl zza;
    private java.lang.Long zzb;
    private com.google.android.gms.internal.mlkit_common.zzmu zzc;
    private java.lang.Long zzd;
    private com.google.android.gms.internal.mlkit_common.zzna zze;
    private java.lang.Long zzf;

    public final com.google.android.gms.internal.mlkit_common.zzmz zze(java.lang.Long l) {
        this.zzd = java.lang.Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzmz zzg(java.lang.Long l) {
        this.zzb = java.lang.Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zznc zzi() {
        return new com.google.android.gms.internal.mlkit_common.zznc(this, null);
    }

    public final com.google.android.gms.internal.mlkit_common.zzmz zzf(com.google.android.gms.internal.mlkit_common.zznl zznlVar) {
        this.zza = zznlVar;
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzmz zzd(com.google.android.gms.internal.mlkit_common.zzmu zzmuVar) {
        this.zzc = zzmuVar;
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzmz zzc(com.google.android.gms.internal.mlkit_common.zzna zznaVar) {
        this.zze = zznaVar;
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzmz zzb(java.lang.Long l) {
        this.zzf = l;
        return this;
    }
}

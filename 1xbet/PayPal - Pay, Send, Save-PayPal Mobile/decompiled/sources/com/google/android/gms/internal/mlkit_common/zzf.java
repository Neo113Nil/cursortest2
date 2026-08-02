package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zzf {
    private final com.google.android.gms.internal.mlkit_common.zzac zza = new com.google.android.gms.internal.mlkit_common.zzac();
    private java.lang.Boolean zzb;

    private zzf() {
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zza(com.google.android.gms.internal.mlkit_common.zzk zzkVar) {
        com.google.android.gms.internal.mlkit_common.zzt.zzc(this.zzb, "Must call internal() or external() before appending rules.");
        this.zza.zzb(zzkVar);
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zzb() {
        com.google.android.gms.internal.mlkit_common.zzt.zze(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = false;
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzf zzc() {
        com.google.android.gms.internal.mlkit_common.zzt.zze(this.zzb == null, "A SourcePolicy can only set internal() or external() once.");
        this.zzb = true;
        return this;
    }

    public final com.google.android.gms.internal.mlkit_common.zzh zzd() {
        com.google.android.gms.internal.mlkit_common.zzt.zzc(this.zzb, "Must call internal() or external() when building a SourcePolicy.");
        return new com.google.android.gms.internal.mlkit_common.zzh(this.zzb.booleanValue(), false, this.zza.zzc(), null);
    }

    /* synthetic */ zzf(com.google.android.gms.internal.mlkit_common.zze zzeVar) {
    }
}

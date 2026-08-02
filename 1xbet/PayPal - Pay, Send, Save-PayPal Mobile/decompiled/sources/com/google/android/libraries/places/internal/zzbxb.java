package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxb {
    private final com.google.android.libraries.places.internal.zzblm zza;
    private com.google.android.libraries.places.internal.zzbjn zzb;
    private boolean zzc = false;
    private com.google.android.libraries.places.internal.zzbjo zzd = com.google.android.libraries.places.internal.zzbjo.zza(com.google.android.libraries.places.internal.zzbjn.IDLE);

    public zzbxb(com.google.android.libraries.places.internal.zzblm zzblmVar, com.google.android.libraries.places.internal.zzbjn zzbjnVar) {
        this.zza = zzblmVar;
        this.zzb = zzbjnVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjn zze() {
        return this.zzd.zzc();
    }

    final /* synthetic */ void zzi(com.google.android.libraries.places.internal.zzbjo zzbjoVar) {
        this.zzd = zzbjoVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjo zzh() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjn zzg() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzblm zzf() {
        return this.zza;
    }

    final /* synthetic */ void zzd(com.google.android.libraries.places.internal.zzbjn zzbjnVar) {
        boolean z;
        this.zzb = zzbjnVar;
        if (zzbjnVar == com.google.android.libraries.places.internal.zzbjn.READY || zzbjnVar == com.google.android.libraries.places.internal.zzbjn.TRANSIENT_FAILURE) {
            z = true;
        } else if (zzbjnVar != com.google.android.libraries.places.internal.zzbjn.IDLE) {
            return;
        } else {
            z = false;
        }
        this.zzc = z;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final com.google.android.libraries.places.internal.zzbjn zzb() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzblm zza() {
        return this.zza;
    }
}

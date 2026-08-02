package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbut extends com.google.android.libraries.places.internal.zzbkd {
    private final com.google.android.libraries.places.internal.zzbkq zza;
    private final com.google.android.libraries.places.internal.zzbit zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.libraries.places.internal.zzbml zzd;
    private final com.google.android.libraries.places.internal.zzbjs zze;
    private com.google.android.libraries.places.internal.zzbis zzf;
    private com.google.android.libraries.places.internal.zzbix zzg;

    zzbut(com.google.android.libraries.places.internal.zzbkq zzbkqVar, com.google.android.libraries.places.internal.zzbit zzbitVar, java.util.concurrent.Executor executor, com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        this.zza = zzbkqVar;
        this.zzb = zzbitVar;
        this.zzd = zzbmlVar;
        executor = zzbisVar.zzj() != null ? zzbisVar.zzj() : executor;
        this.zzc = executor;
        this.zzf = zzbisVar.zze(executor);
        this.zze = com.google.android.libraries.places.internal.zzbjs.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbkd, com.google.android.libraries.places.internal.zzbix
    public final void zza(com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        com.google.android.libraries.places.internal.zzblh zzblhVar;
        com.google.android.libraries.places.internal.zzbix zzbixVar;
        com.google.android.libraries.places.internal.zzbis zzbisVar = this.zzf;
        zzblhVar = com.google.android.libraries.places.internal.zzbvr.zzi;
        com.google.android.libraries.places.internal.zzbml zzbmlVar = this.zzd;
        com.google.android.libraries.places.internal.zzbkp zza = this.zza.zza(new com.google.android.libraries.places.internal.zzbxk(zzbmlVar, zzbmgVar, zzbisVar, zzblhVar));
        com.google.android.libraries.places.internal.zzbnp zza2 = zza.zza();
        if (!zza2.zzj()) {
            this.zzc.execute(new com.google.android.libraries.places.internal.zzbus(this, zzbiwVar, com.google.android.libraries.places.internal.zzbsz.zzi(zza2)));
            zzbixVar = com.google.android.libraries.places.internal.zzbvr.zzaj;
            this.zzg = zzbixVar;
            return;
        }
        com.google.android.libraries.places.internal.zzbvz zze = ((com.google.android.libraries.places.internal.zzbwb) zza.zzb()).zze(zzbmlVar);
        if (zze != null) {
            this.zzf = this.zzf.zzh(com.google.android.libraries.places.internal.zzbvz.zza, zze);
        }
        com.google.android.libraries.places.internal.zzbix zza3 = this.zzb.zza(zzbmlVar, this.zzf);
        this.zzg = zza3;
        zza3.zza(zzbiwVar, zzbmgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbnd, com.google.android.libraries.places.internal.zzbix
    public final void zze(@javax.annotation.Nullable java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        com.google.android.libraries.places.internal.zzbix zzbixVar = this.zzg;
        if (zzbixVar != null) {
            zzbixVar.zze(str, th);
        }
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjs zzg() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbkd, com.google.android.libraries.places.internal.zzbnd
    protected final com.google.android.libraries.places.internal.zzbix zzf() {
        return this.zzg;
    }
}

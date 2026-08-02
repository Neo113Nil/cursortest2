package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvk extends com.google.android.libraries.places.internal.zzbqu {
    final com.google.android.libraries.places.internal.zzbjs zza;
    final com.google.android.libraries.places.internal.zzbml zzb;
    final com.google.android.libraries.places.internal.zzbis zzc;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvl zzd;
    private final long zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbvk(com.google.android.libraries.places.internal.zzbvl zzbvlVar, com.google.android.libraries.places.internal.zzbjs zzbjsVar, com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbis zzbisVar) {
        super(zzbvlVar.zza.zzp(zzbisVar), zzbvlVar.zza.zzw(), zzbisVar.zzb());
        java.util.Objects.requireNonNull(zzbvlVar);
        this.zzd = zzbvlVar;
        this.zza = zzbjsVar;
        this.zzb = zzbmlVar;
        this.zzc = zzbisVar;
        this.zze = java.lang.System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.zzbqu
    protected final void zzg() {
        com.google.android.libraries.places.internal.zzbvj zzbvjVar = new com.google.android.libraries.places.internal.zzbvj(this);
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = this.zzd.zza.zze;
        zzbnxVar.zzb(zzbvjVar);
        zzbnxVar.zza();
    }

    final void zzl() {
        com.google.android.libraries.places.internal.zzbjs zzb = this.zza.zzb();
        try {
            com.google.android.libraries.places.internal.zzbix zze = this.zzd.zze(this.zzb, this.zzc.zzh(com.google.android.libraries.places.internal.zzbje.zza, java.lang.Long.valueOf(java.lang.System.nanoTime() - this.zze)));
            this.zza.zzc(zzb);
            java.lang.Runnable zzf = zzf(zze);
            if (zzf != null) {
                com.google.android.libraries.places.internal.zzbvl zzbvlVar = this.zzd;
                zzbvlVar.zza.zzp(this.zzc).execute(new com.google.android.libraries.places.internal.zzbvi(this, zzf));
            } else {
                com.google.android.libraries.places.internal.zzbvl zzbvlVar2 = this.zzd;
                com.google.android.libraries.places.internal.zzbvj zzbvjVar = new com.google.android.libraries.places.internal.zzbvj(this);
                com.google.android.libraries.places.internal.zzbnx zzbnxVar = zzbvlVar2.zza.zze;
                zzbnxVar.zzb(zzbvjVar);
                zzbnxVar.zza();
            }
        } catch (java.lang.Throwable th) {
            this.zza.zzc(zzb);
            throw th;
        }
    }
}

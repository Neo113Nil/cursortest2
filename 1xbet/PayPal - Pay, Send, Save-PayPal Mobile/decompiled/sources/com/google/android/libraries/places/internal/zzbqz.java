package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
final class zzbqz extends com.google.android.libraries.places.internal.zzbrt {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrb zza;
    private final com.google.android.libraries.places.internal.zzblj zzb;
    private final com.google.android.libraries.places.internal.zzbjs zzc;
    private final com.google.android.libraries.places.internal.zzbje[] zzd;
    private volatile com.google.android.libraries.places.internal.zzbnp zze;

    /* synthetic */ zzbqz(com.google.android.libraries.places.internal.zzbrb zzbrbVar, com.google.android.libraries.places.internal.zzblj zzbljVar, com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbrbVar);
        this.zza = zzbrbVar;
        this.zzc = com.google.android.libraries.places.internal.zzbjs.zza();
        this.zzb = zzbljVar;
        this.zzd = zzbjeVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbrt
    protected final void zze(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        int i = 0;
        while (true) {
            com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr = this.zzd;
            if (i >= zzbjeVarArr.length) {
                return;
            }
            com.google.android.libraries.places.internal.zzbje zzbjeVar = zzbjeVarArr[i];
            i++;
        }
    }

    final /* synthetic */ java.lang.Runnable zzg(com.google.android.libraries.places.internal.zzbpo zzbpoVar, java.lang.String str) {
        com.google.android.libraries.places.internal.zzbjs zzb = this.zzc.zzb();
        try {
            com.google.android.libraries.places.internal.zzblj zzbljVar = this.zzb;
            com.google.android.libraries.places.internal.zzbpl zzb2 = zzbpoVar.zzb(zzbljVar.zzc(), zzbljVar.zzb(), zzbljVar.zza(), this.zzd);
            this.zzc.zzc(zzb);
            return zzo(zzb2);
        } catch (java.lang.Throwable th) {
            this.zzc.zzc(zzb);
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbrt, com.google.android.libraries.places.internal.zzbpl
    public final void zzl(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        super.zzl(zzbnpVar);
        com.google.android.libraries.places.internal.zzbrb zzbrbVar = this.zza;
        synchronized (zzbrbVar.zzh()) {
            if (zzbrbVar.zzk() != null) {
                boolean remove = zzbrbVar.zzn().remove(this);
                if (!zzbrbVar.zzf() && remove) {
                    zzbrbVar.zzi().zzb(zzbrbVar.zzj());
                    if (zzbrbVar.zzo().zzb != null) {
                        zzbrbVar.zzi().zzb(zzbrbVar.zzk());
                        zzbrbVar.zzl(null);
                    }
                }
            }
        }
        this.zza.zzi().zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbrt, com.google.android.libraries.places.internal.zzbpl
    public final void zzn(com.google.android.libraries.places.internal.zzbtf zzbtfVar) {
        if (this.zzb.zza().zzk()) {
            zzbtfVar.zza("wait_for_ready");
            com.google.android.libraries.places.internal.zzbnp zzbnpVar = this.zze;
            if (zzbnpVar != null && !zzbnpVar.zzj()) {
                zzbtfVar.zzb("Last Pick Failure", zzbnpVar);
            }
        }
        super.zzn(zzbtfVar);
    }

    final /* synthetic */ void zzj(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zze = zzbnpVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbje[] zzi() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzblj zzh() {
        return this.zzb;
    }
}

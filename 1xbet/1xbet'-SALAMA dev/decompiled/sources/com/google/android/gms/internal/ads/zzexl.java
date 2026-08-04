package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzexl implements zzexw {
    private zzctw zza;

    @Override // com.google.android.gms.internal.ads.zzexw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzctw zzd() {
        return this.zza;
    }

    public final synchronized I3.b zzb(zzexx zzexxVar, zzexv zzexvVar, zzctw zzctwVar) {
        zzcra zzcraVarZzb;
        try {
            if (zzctwVar != null) {
                this.zza = zzctwVar;
            } else {
                this.zza = (zzctw) zzexvVar.zza(zzexxVar.zzb).zzh();
            }
            zzcraVarZzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzcraVarZzb.zzh(zzcraVarZzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* bridge */ /* synthetic */ I3.b zzc(zzexx zzexxVar, zzexv zzexvVar, Object obj) {
        return zzb(zzexxVar, zzexvVar, null);
    }
}

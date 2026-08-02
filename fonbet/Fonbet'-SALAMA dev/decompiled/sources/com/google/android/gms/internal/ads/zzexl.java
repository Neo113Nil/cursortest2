package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzexl implements zzexw {
    private zzctw zza;

    @Override // com.google.android.gms.internal.ads.zzexw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzctw zzd() {
        return this.zza;
    }

    public final synchronized I3.b zzb(zzexx zzexxVar, zzexv zzexvVar, zzctw zzctwVar) {
        zzcra zzb;
        try {
            if (zzctwVar != null) {
                this.zza = zzctwVar;
            } else {
                this.zza = (zzctw) zzexvVar.zza(zzexxVar.zzb).zzh();
            }
            zzb = this.zza.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzb.zzh(zzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* bridge */ /* synthetic */ I3.b zzc(zzexx zzexxVar, zzexv zzexvVar, Object obj) {
        return zzb(zzexxVar, zzexvVar, null);
    }
}

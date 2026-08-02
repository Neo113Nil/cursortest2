package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzexm implements zzexw {
    private final zzexw zza;
    private zzctw zzb;

    public zzexm(zzexw zzexwVar) {
        this.zza = zzexwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzctw zzd() {
        return this.zzb;
    }

    public final synchronized I3.b zzb(zzexx zzexxVar, zzexv zzexvVar, zzctw zzctwVar) {
        zzbuo zzbuoVar;
        this.zzb = zzctwVar;
        if (zzctwVar == null || (zzbuoVar = zzexxVar.zza) == null) {
            return ((zzexl) this.zza).zzb(zzexxVar, zzexvVar, zzctwVar);
        }
        zzcra zzb = zzctwVar.zzb();
        return zzb.zzh(zzb.zzj(zzgbc.zzh(zzbuoVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* bridge */ /* synthetic */ I3.b zzc(zzexx zzexxVar, zzexv zzexvVar, Object obj) {
        return zzb(zzexxVar, zzexvVar, null);
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzexi implements zzexw {
    private final zzfcn zza;
    private final Executor zzb;
    private final zzgay zzc = new zzexg(this);

    public zzexi(zzfcn zzfcnVar, Executor executor) {
        this.zza = zzfcnVar;
        this.zzb = executor;
    }

    public static /* synthetic */ I3.b zza(zzexi zzexiVar, zzctw zzctwVar, zzexq zzexqVar) {
        zzfcn zzfcnVar = zzexiVar.zza;
        zzfcx zzfcxVar = zzexqVar.zzb;
        zzbuo zzbuoVar = zzexqVar.zza;
        zzfcw zzb = zzfcnVar.zzb(zzfcxVar);
        if (zzb != null && zzbuoVar != null) {
            zzgbc.zzr(zzctwVar.zzb().zzg(zzbuoVar), zzexiVar.zzc, zzexiVar.zzb);
        }
        return zzgbc.zzh(new zzexh(zzfcxVar, zzbuoVar, zzb));
    }

    public final I3.b zzb(zzexx zzexxVar, zzexv zzexvVar, final zzctw zzctwVar) {
        return (zzgat) zzgbc.zze((zzgat) zzgbc.zzn(zzgat.zzu(new zzexs(this.zza, zzctwVar, this.zzb).zzc()), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzexi.zza(zzexi.this, zzctwVar, (zzexq) obj);
            }
        }, this.zzb), Exception.class, new zzexf(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* bridge */ /* synthetic */ I3.b zzc(zzexx zzexxVar, zzexv zzexvVar, Object obj) {
        return zzb(zzexxVar, zzexvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}

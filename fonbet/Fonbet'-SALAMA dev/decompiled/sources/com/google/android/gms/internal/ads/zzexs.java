package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzexs {
    private final zzfcn zza;
    private final zzctw zzb;
    private final Executor zzc;
    private zzexq zzd;

    public zzexs(zzfcn zzfcnVar, zzctw zzctwVar, Executor executor) {
        this.zza = zzfcnVar;
        this.zzb = zzctwVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfcx zze() {
        zzfba zzf = this.zzb.zzf();
        return this.zza.zzc(zzf.zzd, zzf.zzf, zzf.zzj);
    }

    public final I3.b zzc() {
        I3.b bVar;
        zzexq zzexqVar = this.zzd;
        if (zzexqVar != null) {
            return zzgbc.zzh(zzexqVar);
        }
        if (((Boolean) zzbef.zza.zze()).booleanValue()) {
            bVar = (zzgat) zzgbc.zze((zzgat) zzgbc.zzm(zzgat.zzu(this.zzb.zzb().zzf(this.zza.zza())), new zzexp(this), this.zzc), zzdxc.class, new zzexo(this), this.zzc);
        } else {
            zzexq zzexqVar2 = new zzexq(null, zze(), null);
            this.zzd = zzexqVar2;
            bVar = zzgbc.zzh(zzexqVar2);
        }
        return zzgbc.zzm(bVar, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzexn
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return (zzexq) obj;
            }
        }, this.zzc);
    }
}

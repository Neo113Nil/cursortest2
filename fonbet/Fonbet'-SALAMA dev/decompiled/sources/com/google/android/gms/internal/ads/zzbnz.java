package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbnz {
    private final zzbnc zza;
    private I3.b zzb;

    public zzbnz(zzbnc zzbncVar) {
        this.zza = zzbncVar;
    }

    private final void zzd() {
        if (this.zzb == null) {
            final zzbzf zzbzfVar = new zzbzf();
            this.zzb = zzbzfVar;
            this.zza.zzb(null).zzj(new zzbzj() { // from class: com.google.android.gms.internal.ads.zzbnw
                @Override // com.google.android.gms.internal.ads.zzbzj
                public final void zza(Object obj) {
                    zzbzf.this.zzc((zzbnd) obj);
                }
            }, new zzbzh() { // from class: com.google.android.gms.internal.ads.zzbnx
                @Override // com.google.android.gms.internal.ads.zzbzh
                public final void zza() {
                    zzbzf.this.zzd(new zzbnf("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzboc zza(String str, zzbnj zzbnjVar, zzbni zzbniVar) {
        zzd();
        return new zzboc(this.zzb, "google.afma.activeView.handleUpdate", zzbnjVar, zzbniVar);
    }

    public final void zzb(final String str, final zzbiz zzbizVar) {
        zzd();
        this.zzb = zzgbc.zzn(this.zzb, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzbny
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                zzbnd zzbndVar = (zzbnd) obj;
                zzbndVar.zzq(str, zzbizVar);
                return zzgbc.zzh(zzbndVar);
            }
        }, zzbza.zzg);
    }

    public final void zzc(final String str, final zzbiz zzbizVar) {
        this.zzb = zzgbc.zzm(this.zzb, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbnv
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                zzbnd zzbndVar = (zzbnd) obj;
                zzbndVar.zzr(str, zzbizVar);
                return zzbndVar;
            }
        }, zzbza.zzg);
    }
}

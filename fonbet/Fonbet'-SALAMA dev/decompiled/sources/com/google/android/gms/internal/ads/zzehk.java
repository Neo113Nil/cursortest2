package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzehk implements zzebr {
    private final zzbct zza;
    private final zzgbn zzb;
    private final zzffe zzc;
    private final zzeht zzd;

    public zzehk(zzffe zzffeVar, zzgbn zzgbnVar, zzbct zzbctVar, zzeht zzehtVar) {
        this.zzc = zzffeVar;
        this.zzb = zzgbnVar;
        this.zza = zzbctVar;
        this.zzd = zzehtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(zzfar zzfarVar, zzfaf zzfafVar) {
        zzbzf zzbzfVar = new zzbzf();
        zzehp zzehpVar = new zzehp();
        zzehpVar.zzd(new zzehj(this, zzbzfVar, zzfarVar, zzfafVar, zzehpVar));
        zzfak zzfakVar = zzfafVar.zzs;
        final zzbco zzbcoVar = new zzbco(zzehpVar, zzfakVar.zzb, zzfakVar.zza);
        zzfey zzfeyVar = zzfey.CUSTOM_RENDER_SYN;
        return zzfeo.zzd(new zzfej() { // from class: com.google.android.gms.internal.ads.zzehi
            @Override // com.google.android.gms.internal.ads.zzfej
            public final void zza() {
                zzehk.this.zza.zze(zzbcoVar);
            }
        }, this.zzb, zzfeyVar, this.zzc).zzb(zzfey.CUSTOM_RENDER_ACK).zzd(zzbzfVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        zzfak zzfakVar;
        return (this.zza == null || (zzfakVar = zzfafVar.zzs) == null || zzfakVar.zza == null) ? false : true;
    }
}

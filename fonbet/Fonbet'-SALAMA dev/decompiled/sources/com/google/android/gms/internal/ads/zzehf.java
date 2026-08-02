package com.google.android.gms.internal.ads;

import F2.I0;
import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class zzehf implements zzebr {
    private final Context zza;
    private final zzcot zzb;
    private final zzbct zzc;
    private final zzgbn zzd;
    private final zzffe zze;

    public zzehf(Context context, zzcot zzcotVar, zzffe zzffeVar, zzgbn zzgbnVar, zzbct zzbctVar) {
        this.zza = context;
        this.zzb = zzcotVar;
        this.zze = zzffeVar;
        this.zzd = zzgbnVar;
        this.zzc = zzbctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(zzfar zzfarVar, zzfaf zzfafVar) {
        zzehd zzehdVar = new zzehd(this, new View(this.zza), null, new zzcpu() { // from class: com.google.android.gms.internal.ads.zzehb
            @Override // com.google.android.gms.internal.ads.zzcpu
            public final I0 zza() {
                return null;
            }
        }, (zzfag) zzfafVar.zzu.get(0));
        zzcnq zza = this.zzb.zza(new zzcqm(zzfarVar, zzfafVar, null), zzehdVar);
        zzehe zzm = zza.zzm();
        zzfak zzfakVar = zzfafVar.zzs;
        final zzbco zzbcoVar = new zzbco(zzm, zzfakVar.zzb, zzfakVar.zza);
        zzfey zzfeyVar = zzfey.CUSTOM_RENDER_SYN;
        return zzfeo.zzd(new zzfej() { // from class: com.google.android.gms.internal.ads.zzehc
            @Override // com.google.android.gms.internal.ads.zzfej
            public final void zza() {
                zzehf.this.zzc.zze(zzbcoVar);
            }
        }, this.zzd, zzfeyVar, this.zze).zzb(zzfey.CUSTOM_RENDER_ACK).zzd(zzgbc.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        zzfak zzfakVar;
        return (this.zzc == null || (zzfakVar = zzfafVar.zzs) == null || zzfakVar.zza == null) ? false : true;
    }
}

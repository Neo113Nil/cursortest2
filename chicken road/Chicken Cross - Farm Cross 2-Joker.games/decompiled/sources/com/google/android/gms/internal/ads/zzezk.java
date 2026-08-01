package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzezk implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzezk(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzezk zza(zziof zziofVar, zziof zziofVar2) {
        return new zzezk(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgxw zzh;
        zzfai zzb = ((zzfak) this.zza).zzb();
        Context zza = ((zzcok) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmY)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (com.google.android.gms.ads.internal.util.zzs.zzE(zza)) {
                zzh = zzgxw.zzi(zzb);
                zzioe.zzb(zzh);
                return zzh;
            }
        }
        zzh = zzgxw.zzh();
        zzioe.zzb(zzh);
        return zzh;
    }
}

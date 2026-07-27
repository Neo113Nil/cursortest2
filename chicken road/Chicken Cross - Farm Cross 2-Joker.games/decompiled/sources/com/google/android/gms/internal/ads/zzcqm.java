package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcqm implements zzeih {
    final zziof zza;
    final zziof zzb;
    private final zzcpp zzc;
    private final zzcqm zzd = this;

    zzcqm(zzcpp zzcppVar, Context context) {
        this.zzc = zzcppVar;
        zzejp zzc = zzejp.zzc(zzcppVar.zzaH);
        this.zza = zzc;
        this.zzb = zzejh.zza(zzcppVar.zzf, zzfoy.zza(), zzcpj.zza, zzcppVar.zzaG, zzc, zzcppVar.zzaI, zzcpg.zza, zzcppVar.zzG, zzcppVar.zzF);
    }

    @Override // com.google.android.gms.internal.ads.zzeih
    public final zzeil zza() {
        zzcpp zzcppVar = this.zzc;
        zziof zziofVar = zzcppVar.zzp;
        zzcod zzI = zzcppVar.zzI();
        return zzeim.zza(zzcok.zzd(zzcppVar.zzI()), zzfpe.zzc(), zzfoy.zzc(), zzinv.zzc(this.zzb), zzcpa.zzd(zzI), this, (zzeaj) zziofVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeih
    public final zzein zzb() {
        return new zzcqn(this.zzc, this.zzd, null);
    }
}

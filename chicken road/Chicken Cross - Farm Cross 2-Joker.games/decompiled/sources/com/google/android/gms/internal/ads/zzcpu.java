package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcpu implements zzfgf {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    private final zzcpp zzg;

    zzcpu(zzcpp zzcppVar, Context context, String str) {
        this.zzg = zzcppVar;
        zzinw zza = zzinx.zza(context);
        this.zza = zza;
        zzinw zza2 = zzinx.zza(str);
        this.zzb = zza2;
        zziof zziofVar = zzcppVar.zzbz;
        zzfiw zzc = zzfiw.zzc(zza, zziofVar, zzcppVar.zzbA);
        this.zzc = zzc;
        zziof zza3 = zzinv.zza(zzfhd.zza(zziofVar));
        this.zzd = zza3;
        zziof zziofVar2 = zzcppVar.zza;
        zziof zziofVar3 = zzcppVar.zzaf;
        zzfly zza4 = zzfly.zza();
        zziof zziofVar4 = zzcppVar.zzi;
        zziof zza5 = zzinv.zza(zzfhf.zza(zza, zziofVar2, zziofVar3, zzc, zza3, zza4, zziofVar4));
        this.zze = zza5;
        this.zzf = zzinv.zza(zzfhl.zza(zziofVar3, zza, zza2, zza5, zza3, zziofVar4, zzcppVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final zzfhk zza() {
        return (zzfhk) this.zzf.zzb();
    }
}

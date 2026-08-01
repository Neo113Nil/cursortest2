package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcqq implements zzfkx {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    final zziof zzg;
    final zziof zzh;
    private final zzcpp zzi;

    zzcqq(zzcpp zzcppVar, Context context, String str) {
        this.zzi = zzcppVar;
        zzinw zza = zzinx.zza(context);
        this.zza = zza;
        zziof zziofVar = zzcppVar.zzbz;
        zzfix zzc = zzfix.zzc(zza, zziofVar, zzcppVar.zzbA);
        this.zzb = zzc;
        zziof zza2 = zzinv.zza(zzfki.zza(zziofVar));
        this.zzc = zza2;
        zziof zza3 = zzinv.zza(zzflu.zza());
        this.zzd = zza3;
        zziof zza4 = zzinv.zza(zzfkr.zza(zza, zzcppVar.zza, zzcppVar.zzaf, zzc, zza2, zzfly.zza(), zza3));
        this.zze = zza4;
        this.zzf = zzinv.zza(zzflb.zza(zza4, zza2, zza3));
        zzinw zzc2 = zzinx.zzc(str);
        this.zzg = zzc2;
        this.zzh = zzinv.zza(zzfkv.zza(zzc2, zza4, zza, zza2, zza3, zzcppVar.zzi, zzcppVar.zzai, zzcppVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final zzfla zza() {
        return (zzfla) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final zzfku zzb() {
        return (zzfku) this.zzh.zzb();
    }
}

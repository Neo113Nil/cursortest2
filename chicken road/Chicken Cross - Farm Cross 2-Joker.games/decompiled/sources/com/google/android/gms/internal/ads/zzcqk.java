package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcqk implements zzfjj {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    final zziof zzg;
    private final zzcpp zzh;

    zzcqk(zzcpp zzcppVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcppVar;
        zzinw zza = zzinx.zza(context);
        this.zza = zza;
        zzinw zza2 = zzinx.zza(zzrVar);
        this.zzb = zza2;
        zzinw zza3 = zzinx.zza(str);
        this.zzc = zza3;
        zziof zziofVar = zzcppVar.zzp;
        zziof zza4 = zzinv.zza(zzeub.zza(zziofVar));
        this.zzd = zza4;
        zziof zza5 = zzinv.zza(zzfki.zza(zzcppVar.zzbz));
        this.zze = zza5;
        zziof zza6 = zzinv.zza(zzfjh.zza(zza, zzcppVar.zza, zzcppVar.zzaf, zza4, zza5, zzfly.zza()));
        this.zzf = zza6;
        this.zzg = zzinv.zza(zzeuj.zza(zza, zza2, zza3, zza6, zza4, zza5, zzcppVar.zzi, zzcppVar.zzai, zziofVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final zzeui zza() {
        return (zzeui) this.zzg.zzb();
    }
}

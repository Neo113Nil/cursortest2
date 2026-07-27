package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcpz implements zzfht {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcpp zzj;

    zzcpz(zzcpp zzcppVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcppVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzinw zza = zzinx.zza(context);
        this.zza = zza;
        zzinw zza2 = zzinx.zza(zzrVar);
        this.zzb = zza2;
        zziof zza3 = zzinv.zza(zzeub.zza(zzcppVar.zzp));
        this.zzc = zza3;
        zziof zza4 = zzinv.zza(zzeug.zza());
        this.zzd = zza4;
        zziof zza5 = zzinv.zza(zzdix.zza());
        this.zze = zza5;
        this.zzf = zzinv.zza(zzfhr.zza(zza, zzcppVar.zza, zza2, zzcppVar.zzaf, zza3, zza4, zzfly.zza(), zza5));
    }

    @Override // com.google.android.gms.internal.ads.zzfht
    public final zzete zza() {
        zzfhq zzfhqVar = (zzfhq) this.zzf.zzb();
        zzeua zzeuaVar = (zzeua) this.zzc.zzb();
        zzcpp zzcppVar = this.zzj;
        zziof zziofVar = zzcppVar.zzp;
        return new zzete(this.zzg, this.zzh, this.zzi, zzfhqVar, zzeuaVar, zzcpa.zzd(zzcppVar.zzI()), (zzeaj) zziofVar.zzb());
    }
}

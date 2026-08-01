package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdos implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;

    private zzdos(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
        this.zzf = zziofVar6;
    }

    public static zzdos zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6) {
        return new zzdos(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdor(((zzdns) this.zza).zzb(), ((zzcok) this.zzb).zza(), (zzcer) this.zzc.zzb(), ((zzdng) this.zzd).zza(), (zzbil.zza.EnumC0234zza) this.zze.zzb(), ((zzczc) this.zzf).zza());
    }
}

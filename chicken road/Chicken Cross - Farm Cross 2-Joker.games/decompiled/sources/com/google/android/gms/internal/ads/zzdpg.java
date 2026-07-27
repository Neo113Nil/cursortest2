package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdpg implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;

    private zzdpg(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
        this.zzf = zziofVar6;
    }

    public static zzdpg zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6) {
        return new zzdpg(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcob zzcobVar = (zzcob) this.zza.zzb();
        zzdcy zza = ((zzddh) this.zzb).zza();
        zzdjp zza2 = ((zzdkk) this.zzc).zza();
        zzdov zza3 = ((zzdox) this.zzd).zza();
        zzdgq zzb = ((zzcwc) this.zze).zzb();
        zzeqb zzeqbVar = (zzeqb) this.zzf.zzb();
        zzcxh zzi = zzcobVar.zzi();
        zzi.zzl(zza.zze());
        zzi.zzm(zza2);
        zzi.zzd(zza3);
        zzi.zzk(new zzesg(null));
        zzi.zzg(new zzcyd(zzb, null));
        zzi.zze(new zzcwa(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeH)).booleanValue()) {
            zzi.zzf(zzeqk.zza(zzeqbVar));
        }
        zzcyo zzd = zzi.zzh().zzd();
        zzioe.zzb(zzd);
        return zzd;
    }
}

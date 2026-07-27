package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbil;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdyj implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;

    private zzdyj(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
    }

    public static zzdyj zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        return new zzdyj(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcok) this.zza).zza();
        final String zzb = ((zzefw) this.zzb).zzb();
        VersionInfoParcel zza2 = ((zzcpa) this.zzc).zza();
        final zzbil.zza.EnumC0234zza enumC0234zza = (zzbil.zza.EnumC0234zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbif zzbifVar = new zzbif(new zzbik(zza));
        zzbil.zzar.zza zzs = zzbil.zzar.zzs();
        zzs.zzc(zza2.buddyApkVersion);
        zzs.zzg(zza2.clientJarVersion);
        zzs.zzk(true != zza2.isClientJar ? 2 : 0);
        final zzbil.zzar zzbu = zzs.zzbu();
        zzbifVar.zzb(new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyi
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzbil.zza.zzb zzcc = zzaVar.zzY().zzcc();
                zzcc.zzc(zzbil.zza.EnumC0234zza.this);
                zzaVar.zzaa(zzcc);
                zzbil.zzm.zza zzcc2 = zzaVar.zzG().zzcc();
                zzcc2.zzd(zzb);
                zzcc2.zzs(zzbu);
                zzaVar.zzI(zzcc2);
                zzaVar.zzh(str);
            }
        });
        return zzbifVar;
    }
}

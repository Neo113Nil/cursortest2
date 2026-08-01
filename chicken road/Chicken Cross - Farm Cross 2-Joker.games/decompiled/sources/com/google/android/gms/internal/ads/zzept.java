package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzept extends zzepq {
    private final zzcob zza;
    private final zzdcy zzb;
    private final zzesg zzc;
    private final zzdjp zzd;
    private final zzdov zze;
    private final zzdgq zzf;
    private final ViewGroup zzg;
    private final zzdiv zzh;
    private final zzeqb zzi;
    private final zzemv zzj;

    public zzept(zzcob zzcobVar, zzdcy zzdcyVar, zzesg zzesgVar, zzdjp zzdjpVar, zzdov zzdovVar, zzdgq zzdgqVar, ViewGroup viewGroup, zzdiv zzdivVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.zza = zzcobVar;
        this.zzb = zzdcyVar;
        this.zzc = zzesgVar;
        this.zzd = zzdjpVar;
        this.zze = zzdovVar;
        this.zzf = zzdgqVar;
        this.zzg = viewGroup;
        this.zzh = zzdivVar;
        this.zzi = zzeqbVar;
        this.zzj = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    protected final ListenableFuture zzc(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzdcy zzdcyVar = this.zzb;
        zzdcyVar.zzb(zzflwVar);
        zzdcyVar.zzc(bundle);
        zzdcyVar.zzd(new zzdcs(zzfloVar, zzfldVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeE)).booleanValue()) {
            zzdcyVar.zzg(this.zzj);
        }
        zzcxh zzi = this.zza.zzi();
        zzi.zzl(zzdcyVar.zze());
        zzi.zzm(this.zzd);
        zzi.zzk(this.zzc);
        zzi.zzd(this.zze);
        zzi.zzg(new zzcyd(this.zzf, this.zzh));
        zzi.zze(new zzcwa(this.zzg));
        zzczp zzc = zzi.zzh().zzc();
        return zzc.zzc(zzc.zzb());
    }
}

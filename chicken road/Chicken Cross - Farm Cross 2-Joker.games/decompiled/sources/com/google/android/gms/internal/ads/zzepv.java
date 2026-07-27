package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzepv extends zzepq {
    private final zzcob zza;
    private final zzdcy zzb;
    private final zzesg zzc;
    private final zzdjp zzd;
    private final zzeqb zze;
    private final zzemv zzf;

    public zzepv(zzcob zzcobVar, zzdcy zzdcyVar, zzesg zzesgVar, zzdjp zzdjpVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.zza = zzcobVar;
        this.zzb = zzdcyVar;
        this.zzc = zzesgVar;
        this.zzd = zzdjpVar;
        this.zze = zzeqbVar;
        this.zzf = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    protected final ListenableFuture zzc(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzdcy zzdcyVar = this.zzb;
        zzdcyVar.zzb(zzflwVar);
        zzdcyVar.zzc(bundle);
        zzdcyVar.zzd(new zzdcs(zzfloVar, zzfldVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeE)).booleanValue()) {
            zzdcyVar.zzg(this.zzf);
        }
        zzdod zzm = this.zza.zzm();
        zzm.zze(zzdcyVar.zze());
        zzm.zzf(this.zzd);
        zzm.zzd(this.zzc);
        zzczp zzb = zzm.zzh().zzb();
        return zzb.zzc(zzb.zzb());
    }
}

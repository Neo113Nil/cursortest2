package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeox extends com.google.android.gms.internal.ads.zzeos {
    private final com.google.android.gms.internal.ads.zzcnj zza;
    private final com.google.android.gms.internal.ads.zzdca zzb;
    private final com.google.android.gms.internal.ads.zzeri zzc;
    private final com.google.android.gms.internal.ads.zzdir zzd;
    private final com.google.android.gms.internal.ads.zzepd zze;
    private final com.google.android.gms.internal.ads.zzelx zzf;

    public zzeox(com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzdca zzdcaVar, com.google.android.gms.internal.ads.zzeri zzeriVar, com.google.android.gms.internal.ads.zzdir zzdirVar, com.google.android.gms.internal.ads.zzepd zzepdVar, com.google.android.gms.internal.ads.zzelx zzelxVar) {
        this.zza = zzcnjVar;
        this.zzb = zzdcaVar;
        this.zzc = zzeriVar;
        this.zzd = zzdirVar;
        this.zze = zzepdVar;
        this.zzf = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeos
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfky zzfkyVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        com.google.android.gms.internal.ads.zzdca zzdcaVar = this.zzb;
        zzdcaVar.zzb(zzfkyVar);
        zzdcaVar.zzc(bundle);
        zzdcaVar.zzd(new com.google.android.gms.internal.ads.zzdbu(zzfkqVar, zzfkfVar, this.zze));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzew)).booleanValue()) {
            zzdcaVar.zzg(this.zzf);
        }
        com.google.android.gms.internal.ads.zzdnf zzm = this.zza.zzm();
        zzm.zze(zzdcaVar.zze());
        zzm.zzf(this.zzd);
        zzm.zzd(this.zzc);
        com.google.android.gms.internal.ads.zzcyx zzb = zzm.zza().zzb();
        return zzb.zzc(zzb.zzb());
    }
}

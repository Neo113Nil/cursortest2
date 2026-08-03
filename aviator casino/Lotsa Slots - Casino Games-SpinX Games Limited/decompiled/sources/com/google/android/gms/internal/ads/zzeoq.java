package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeoq extends com.google.android.gms.internal.ads.zzeos {
    private final com.google.android.gms.internal.ads.zzcnj zza;
    private final com.google.android.gms.internal.ads.zzdnx zzb;
    private final com.google.android.gms.internal.ads.zzdca zzc;
    private final com.google.android.gms.internal.ads.zzdir zzd;
    private final com.google.android.gms.internal.ads.zzepd zze;
    private final com.google.android.gms.internal.ads.zzelx zzf;

    public zzeoq(com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzdnx zzdnxVar, com.google.android.gms.internal.ads.zzdca zzdcaVar, com.google.android.gms.internal.ads.zzdir zzdirVar, com.google.android.gms.internal.ads.zzepd zzepdVar, com.google.android.gms.internal.ads.zzelx zzelxVar) {
        this.zza = zzcnjVar;
        this.zzb = zzdnxVar;
        this.zzc = zzdcaVar;
        this.zzd = zzdirVar;
        this.zze = zzepdVar;
        this.zzf = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeos
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfky zzfkyVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        com.google.android.gms.internal.ads.zzdca zzdcaVar = this.zzc;
        zzdcaVar.zzb(zzfkyVar);
        zzdcaVar.zzc(bundle);
        zzdcaVar.zzd(new com.google.android.gms.internal.ads.zzdbu(zzfkqVar, zzfkfVar, this.zze));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzew)).booleanValue()) {
            zzdcaVar.zzg(this.zzf);
        }
        com.google.android.gms.internal.ads.zzdob zzo = this.zza.zzo();
        zzo.zzf(zzdcaVar.zze());
        zzo.zzg(this.zzd);
        zzo.zze(this.zzb);
        zzo.zzd(new com.google.android.gms.internal.ads.zzcvi(null));
        com.google.android.gms.internal.ads.zzcyx zza = zzo.zza().zza();
        return zza.zzc(zza.zzb());
    }
}

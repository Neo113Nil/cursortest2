package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeov extends com.google.android.gms.internal.ads.zzeos {
    private final com.google.android.gms.internal.ads.zzcnj zza;
    private final com.google.android.gms.internal.ads.zzdca zzb;
    private final com.google.android.gms.internal.ads.zzeri zzc;
    private final com.google.android.gms.internal.ads.zzdir zzd;
    private final com.google.android.gms.internal.ads.zzdnx zze;
    private final com.google.android.gms.internal.ads.zzdfs zzf;
    private final android.view.ViewGroup zzg;
    private final com.google.android.gms.internal.ads.zzdhx zzh;
    private final com.google.android.gms.internal.ads.zzepd zzi;
    private final com.google.android.gms.internal.ads.zzelx zzj;

    public zzeov(com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzdca zzdcaVar, com.google.android.gms.internal.ads.zzeri zzeriVar, com.google.android.gms.internal.ads.zzdir zzdirVar, com.google.android.gms.internal.ads.zzdnx zzdnxVar, com.google.android.gms.internal.ads.zzdfs zzdfsVar, android.view.ViewGroup viewGroup, com.google.android.gms.internal.ads.zzdhx zzdhxVar, com.google.android.gms.internal.ads.zzepd zzepdVar, com.google.android.gms.internal.ads.zzelx zzelxVar) {
        this.zza = zzcnjVar;
        this.zzb = zzdcaVar;
        this.zzc = zzeriVar;
        this.zzd = zzdirVar;
        this.zze = zzdnxVar;
        this.zzf = zzdfsVar;
        this.zzg = viewGroup;
        this.zzh = zzdhxVar;
        this.zzi = zzepdVar;
        this.zzj = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeos
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfky zzfkyVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        com.google.android.gms.internal.ads.zzdca zzdcaVar = this.zzb;
        zzdcaVar.zzb(zzfkyVar);
        zzdcaVar.zzc(bundle);
        zzdcaVar.zzd(new com.google.android.gms.internal.ads.zzdbu(zzfkqVar, zzfkfVar, this.zzi));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzew)).booleanValue()) {
            zzdcaVar.zzg(this.zzj);
        }
        com.google.android.gms.internal.ads.zzcwp zzi = this.zza.zzi();
        zzi.zzl(zzdcaVar.zze());
        zzi.zzm(this.zzd);
        zzi.zzk(this.zzc);
        zzi.zzd(this.zze);
        zzi.zzg(new com.google.android.gms.internal.ads.zzcxl(this.zzf, this.zzh));
        zzi.zze(new com.google.android.gms.internal.ads.zzcvi(this.zzg));
        com.google.android.gms.internal.ads.zzcyx zzc = zzi.zza().zzc();
        return zzc.zzc(zzc.zzb());
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeoz extends com.google.android.gms.internal.ads.zzeos {
    private final com.google.android.gms.internal.ads.zzcnj zza;
    private final com.google.android.gms.internal.ads.zzdca zzb;
    private final com.google.android.gms.internal.ads.zzdir zzc;
    private final com.google.android.gms.internal.ads.zzepd zzd;

    @javax.annotation.Nullable
    private final com.google.android.gms.internal.ads.zzfkr zze;
    private final com.google.android.gms.internal.ads.zzelx zzf;

    public zzeoz(com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzdca zzdcaVar, com.google.android.gms.internal.ads.zzdir zzdirVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzfkr zzfkrVar, com.google.android.gms.internal.ads.zzepd zzepdVar, com.google.android.gms.internal.ads.zzelx zzelxVar) {
        this.zza = zzcnjVar;
        this.zzb = zzdcaVar;
        this.zzc = zzdirVar;
        this.zze = zzfkrVar;
        this.zzd = zzepdVar;
        this.zzf = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeos
    protected final com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfky zzfkyVar, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        com.google.android.gms.internal.ads.zzfkr zzfkrVar;
        com.google.android.gms.internal.ads.zzdca zzdcaVar = this.zzb;
        zzdcaVar.zzb(zzfkyVar);
        zzdcaVar.zzc(bundle);
        zzdcaVar.zzd(new com.google.android.gms.internal.ads.zzdbu(zzfkqVar, zzfkfVar, this.zzd));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzev)).booleanValue() && (zzfkrVar = this.zze) != null) {
            zzdcaVar.zzf(zzfkrVar);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzew)).booleanValue()) {
            zzdcaVar.zzg(this.zzf);
        }
        com.google.android.gms.internal.ads.zzdvq zzp = this.zza.zzp();
        zzp.zzd(zzdcaVar.zze());
        zzp.zze(this.zzc);
        com.google.android.gms.internal.ads.zzcyx zza = zzp.zza().zza();
        return zza.zzc(zza.zzb());
    }
}

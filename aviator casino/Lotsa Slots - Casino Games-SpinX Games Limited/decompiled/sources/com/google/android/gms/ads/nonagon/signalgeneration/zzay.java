package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzay implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;

    private zzay(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
    }

    public static com.google.android.gms.ads.nonagon.signalgeneration.zzay zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.ads.nonagon.signalgeneration.zzay(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzfpk zzfpkVar = (com.google.android.gms.internal.ads.zzfpk) this.zza.zzb();
        com.google.android.gms.ads.nonagon.signalgeneration.zzba zzb = ((com.google.android.gms.ads.nonagon.signalgeneration.zzbb) this.zzb).zzb();
        com.google.android.gms.internal.ads.zzdbw zzb2 = ((com.google.android.gms.internal.ads.zzdbx) this.zzc).zzb();
        com.google.android.gms.internal.ads.zzdln zzdlnVar = (com.google.android.gms.internal.ads.zzdln) this.zzd.zzb();
        com.google.android.gms.internal.ads.zzfor zzi = zzfpkVar.zza(com.google.android.gms.internal.ads.zzfpe.GENERATE_SIGNALS, zzb2.zzb()).zzc(zzb).zzh(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgD)).intValue(), java.util.concurrent.TimeUnit.SECONDS).zzi();
        com.google.android.gms.internal.ads.zzhbw.zzr(zzi, new com.google.android.gms.ads.nonagon.signalgeneration.zzar(zzdlnVar), com.google.android.gms.internal.ads.zzcfr.zza);
        return zzi;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeyi implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzeyi(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzindVar2;
    }

    public static com.google.android.gms.internal.ads.zzeyi zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzeyi(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzgww zzh;
        com.google.android.gms.internal.ads.zzexa zzc = com.google.android.gms.internal.ads.zzexc.zzc();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.zza.zzb();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeY)).booleanValue()) {
            zzh = com.google.android.gms.internal.ads.zzgww.zzi(new com.google.android.gms.internal.ads.zzfaw(zzc, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeZ)).intValue(), scheduledExecutorService));
        } else {
            zzh = com.google.android.gms.internal.ads.zzgww.zzh();
        }
        com.google.android.gms.internal.ads.zzinc.zzb(zzh);
        return zzh;
    }
}

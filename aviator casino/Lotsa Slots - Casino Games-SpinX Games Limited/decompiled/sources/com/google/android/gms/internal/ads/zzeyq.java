package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeyq implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzeyq(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzindVar2;
        this.zzb = zzindVar3;
        this.zzc = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzeyq zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.internal.ads.zzeyq(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzfaw zzfawVar;
        com.google.android.gms.internal.ads.zzfad zzc = com.google.android.gms.internal.ads.zzfaf.zzc();
        com.google.android.gms.internal.ads.zzewy zzewyVar = (com.google.android.gms.internal.ads.zzewy) this.zza.zzb();
        java.util.List list = (java.util.List) this.zzb.zzb();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.zzc.zzb();
        if (list.contains("24")) {
            zzfawVar = new com.google.android.gms.internal.ads.zzfaw(zzewyVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznG)).intValue(), scheduledExecutorService);
        } else {
            zzfawVar = new com.google.android.gms.internal.ads.zzfaw(zzc, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznG)).intValue(), scheduledExecutorService);
        }
        return zzfawVar;
    }
}

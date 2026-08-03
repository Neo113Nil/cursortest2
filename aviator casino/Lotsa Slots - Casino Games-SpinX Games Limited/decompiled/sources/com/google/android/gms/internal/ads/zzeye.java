package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeye implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;

    private zzeye(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzeye zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.internal.ads.zzeye(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzfaw zzfawVar;
        com.google.android.gms.internal.ads.zzewe zzb = ((com.google.android.gms.internal.ads.zzewg) this.zza).zzb();
        com.google.android.gms.internal.ads.zzewy zzewyVar = (com.google.android.gms.internal.ads.zzewy) this.zzb.zzb();
        java.util.List list = (java.util.List) this.zzc.zzb();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("54")) {
            zzfawVar = new com.google.android.gms.internal.ads.zzfaw(zzewyVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznO)).intValue(), scheduledExecutorService);
        } else {
            zzfawVar = new com.google.android.gms.internal.ads.zzfaw(zzb, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznO)).intValue(), scheduledExecutorService);
        }
        return zzfawVar;
    }
}

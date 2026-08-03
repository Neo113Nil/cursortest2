package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcwl implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzcwl(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static com.google.android.gms.internal.ads.zzcwl zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzcwl(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return new com.google.android.gms.internal.ads.zzfaw(((com.google.android.gms.internal.ads.zzewn) this.zza).zzb(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznZ)).intValue(), (java.util.concurrent.ScheduledExecutorService) this.zzb.zzb());
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcvk implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzcvk(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static com.google.android.gms.internal.ads.zzcvk zzc(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        return new com.google.android.gms.internal.ads.zzcvk(zzindVar, zzindVar2, zzindVar3);
    }

    public static com.google.android.gms.internal.ads.zzdfs zzd(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        return new com.google.android.gms.internal.ads.zzdfs(scheduledExecutorService, clock, zzdzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzdfs zzb() {
        return zzd((java.util.concurrent.ScheduledExecutorService) this.zza.zzb(), (com.google.android.gms.common.util.Clock) this.zzb.zzb(), (com.google.android.gms.internal.ads.zzdzl) this.zzc.zzb());
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfdl implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;
    private final com.google.android.gms.internal.ads.zzind zze;

    private zzfdl(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5, com.google.android.gms.internal.ads.zzind zzindVar6, com.google.android.gms.internal.ads.zzind zzindVar7) {
        this.zza = zzindVar2;
        this.zzb = zzindVar3;
        this.zzc = zzindVar5;
        this.zzd = zzindVar6;
        this.zze = zzindVar7;
    }

    public static com.google.android.gms.internal.ads.zzfdl zzc(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5, com.google.android.gms.internal.ads.zzind zzindVar6, com.google.android.gms.internal.ads.zzind zzindVar7) {
        return new com.google.android.gms.internal.ads.zzfdl(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5, zzindVar6, zzindVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzfdj zzb() {
        return new com.google.android.gms.internal.ads.zzfdj(com.google.android.gms.internal.ads.zzcrm.zza(), ((com.google.android.gms.internal.ads.zzcns) this.zza).zza(), (java.util.concurrent.ScheduledExecutorService) this.zzb.zzb(), com.google.android.gms.internal.ads.zzfoa.zzc(), ((com.google.android.gms.internal.ads.zzfer) this.zzc).zzb().intValue(), ((com.google.android.gms.internal.ads.zzfes) this.zzd).zzb().booleanValue(), ((com.google.android.gms.internal.ads.zzfet) this.zze).zzb().booleanValue());
    }
}

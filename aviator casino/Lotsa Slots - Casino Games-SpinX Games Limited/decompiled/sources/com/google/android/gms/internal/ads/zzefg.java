package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzefg implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzefg(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        this.zza = zzindVar;
        this.zzb = zzindVar4;
        this.zzc = zzindVar5;
    }

    public static com.google.android.gms.internal.ads.zzefg zzc(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        return new com.google.android.gms.internal.ads.zzefg(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzeff zzb() {
        return new com.google.android.gms.internal.ads.zzeff((java.util.concurrent.ScheduledExecutorService) this.zza.zzb(), com.google.android.gms.internal.ads.zzfoa.zzc(), com.google.android.gms.internal.ads.zzfog.zzc(), ((com.google.android.gms.internal.ads.zzegf) this.zzb).zzb(), com.google.android.gms.internal.ads.zzimt.zzc(this.zzc));
    }
}

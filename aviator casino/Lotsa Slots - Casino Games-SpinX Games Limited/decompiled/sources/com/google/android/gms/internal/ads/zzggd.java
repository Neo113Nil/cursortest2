package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzggd implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;
    private final com.google.android.gms.internal.ads.zzind zze;

    private zzggd(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
        this.zze = zzindVar5;
    }

    public static com.google.android.gms.internal.ads.zzggd zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        return new com.google.android.gms.internal.ads.zzggd(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzgdf zzgdfVar = (com.google.android.gms.internal.ads.zzgdf) this.zza.zzb();
        com.google.android.gms.internal.ads.zzind zzindVar = this.zzc;
        return new com.google.android.gms.internal.ads.zzggc(zzgdfVar, (com.google.android.gms.internal.ads.zzgfy) this.zzb.zzb(), (com.google.android.gms.internal.ads.zzgfs) zzindVar.zzb(), (java.util.concurrent.ExecutorService) this.zzd.zzb(), (com.google.android.gms.internal.ads.zzgqh) this.zze.zzb());
    }
}

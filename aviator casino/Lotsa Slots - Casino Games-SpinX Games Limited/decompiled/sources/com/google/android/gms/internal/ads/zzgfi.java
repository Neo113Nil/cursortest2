package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgfi implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;
    private final com.google.android.gms.internal.ads.zzind zze;

    private zzgfi(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
        this.zze = zzindVar5;
    }

    public static com.google.android.gms.internal.ads.zzgfi zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        return new com.google.android.gms.internal.ads.zzgfi(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        android.content.Context context = (android.content.Context) this.zza.zzb();
        com.google.android.gms.internal.ads.zzgel zzgelVar = (com.google.android.gms.internal.ads.zzgel) this.zzb.zzb();
        java.util.concurrent.ExecutorService executorService = (java.util.concurrent.ExecutorService) this.zzc.zzb();
        com.google.android.gms.internal.ads.zzgee zzgeeVar = (com.google.android.gms.internal.ads.zzgee) this.zzd.zzb();
        com.google.android.gms.internal.ads.zzgdf zzgdfVar = (com.google.android.gms.internal.ads.zzgdf) this.zze.zzb();
        return new com.google.android.gms.internal.ads.zzgfm(context, zzgelVar, executorService, zzgeeVar, new java.util.Random(), zzgdfVar.zzg().zza(), zzgdfVar.zzg().zzc(), zzgdfVar.zzg().zzd(), zzgdfVar.zzg().zzb(), zzgdfVar.zzd(), zzgdfVar.zzI(), zzgdfVar.zzG() - 1);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgjx implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;

    private zzgjx(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzgjx zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.internal.ads.zzgjx(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzind zzindVar = this.zzd;
        com.google.android.gms.internal.ads.zzind zzindVar2 = this.zzc;
        com.google.android.gms.internal.ads.zzind zzindVar3 = this.zzb;
        com.google.android.gms.internal.ads.zzimo zzc = com.google.android.gms.internal.ads.zzimt.zzc(this.zza);
        com.google.android.gms.internal.ads.zzimo zzc2 = com.google.android.gms.internal.ads.zzimt.zzc(zzindVar3);
        com.google.android.gms.internal.ads.zzimo zzc3 = com.google.android.gms.internal.ads.zzimt.zzc(zzindVar2);
        com.google.android.gms.internal.ads.zzgdf zzgdfVar = (com.google.android.gms.internal.ads.zzgdf) zzindVar.zzb();
        return new com.google.android.gms.internal.ads.zzgjw(zzc, zzc2, zzc3, zzgdfVar.zzk().zza(), zzgdfVar.zzk().zzd());
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgnj implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzgnj(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static com.google.android.gms.internal.ads.zzgnj zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        return new com.google.android.gms.internal.ads.zzgnj(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzind zzindVar = this.zzc;
        com.google.android.gms.internal.ads.zzind zzindVar2 = this.zzb;
        com.google.android.gms.internal.ads.zzimo zzc = com.google.android.gms.internal.ads.zzimt.zzc(this.zza);
        com.google.android.gms.internal.ads.zzimo zzc2 = com.google.android.gms.internal.ads.zzimt.zzc(zzindVar2);
        if (true == ((com.google.android.gms.internal.ads.zzgdf) zzindVar.zzb()).zzu()) {
            zzc = zzc2;
        }
        com.google.android.gms.internal.ads.zzgmw zzgmwVar = (com.google.android.gms.internal.ads.zzgmw) zzc.zzb();
        com.google.android.gms.internal.ads.zzinc.zzb(zzgmwVar);
        return zzgmwVar;
    }
}

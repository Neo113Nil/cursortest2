package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgnk implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzgnk(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static com.google.android.gms.internal.ads.zzgnk zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        return new com.google.android.gms.internal.ads.zzgnk(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.io.File file = (java.io.File) this.zza.zzb();
        com.google.android.gms.internal.ads.zzgfc zzgfcVar = (com.google.android.gms.internal.ads.zzgfc) this.zzb.zzb();
        final com.google.android.gms.internal.ads.zzgqh zzgqhVar = (com.google.android.gms.internal.ads.zzgqh) this.zzc.zzb();
        return zzgfcVar.zza(file, com.google.android.gms.internal.ads.zzgfq.zzh(), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgnd
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzgqh.this.zzd(15308, (java.lang.Throwable) obj);
                return com.google.android.gms.internal.ads.zzgfq.zzh();
            }
        });
    }
}

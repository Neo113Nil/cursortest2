package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcwt implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzcwt(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        this.zza = zzindVar2;
        this.zzb = zzindVar3;
    }

    public static com.google.android.gms.internal.ads.zzcwt zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        return new com.google.android.gms.internal.ads.zzcwt(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        boolean booleanValue = java.lang.Boolean.valueOf(com.google.android.gms.internal.ads.zzcwr.zza()).booleanValue();
        java.lang.Object zzb = ((com.google.android.gms.internal.ads.zzeow) this.zza).zzb();
        java.lang.Object zzb2 = ((com.google.android.gms.internal.ads.zzeqv) this.zzb).zzb();
        if (true != booleanValue) {
            zzb = zzb2;
        }
        return (com.google.android.gms.internal.ads.zzels) zzb;
    }
}

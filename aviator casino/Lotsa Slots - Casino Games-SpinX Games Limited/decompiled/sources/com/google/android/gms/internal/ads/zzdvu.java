package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdvu implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzdvu(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdvu zza(com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzdvu(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza enumC0068zza = ((com.google.android.gms.internal.ads.zzdci) this.zza).zza().zzp.zza == 3 ? com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.REWARDED_INTERSTITIAL : com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.REWARD_BASED_VIDEO_AD;
        com.google.android.gms.internal.ads.zzinc.zzb(enumC0068zza);
        return enumC0068zza;
    }
}

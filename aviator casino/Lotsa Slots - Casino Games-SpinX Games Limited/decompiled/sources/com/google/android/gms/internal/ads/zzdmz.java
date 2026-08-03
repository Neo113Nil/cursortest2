package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdmz implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdmd zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzdmz(com.google.android.gms.internal.ads.zzdmd zzdmdVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzdmdVar;
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdmz zza(com.google.android.gms.internal.ads.zzdmd zzdmdVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzdmz(zzdmdVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return this.zza.zzg((java.util.concurrent.Executor) this.zzb.zzb());
    }
}

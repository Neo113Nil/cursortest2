package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcwf implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzcwf(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzcwf zza(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzcwf(zzcvsVar, zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.Set singleton = java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzdkq((com.google.android.gms.internal.ads.zzcxi) this.zza.zzb(), com.google.android.gms.internal.ads.zzcfr.zzh));
        com.google.android.gms.internal.ads.zzinc.zzb(singleton);
        return singleton;
    }
}

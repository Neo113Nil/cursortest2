package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdmy implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzdmy(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzdmy zza(com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzdmy(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.util.Set singleton = java.util.Collections.singleton(new com.google.android.gms.internal.ads.zzdkq((com.google.android.gms.internal.ads.zzdnr) this.zza.zzb(), com.google.android.gms.internal.ads.zzcfr.zzh));
        com.google.android.gms.internal.ads.zzinc.zzb(singleton);
        return singleton;
    }
}

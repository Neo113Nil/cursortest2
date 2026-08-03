package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzecg implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzecg(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzecg zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzecg(zzindVar, zzindVar2);
    }

    public static com.google.android.gms.internal.ads.zzdkq zzc(com.google.android.gms.internal.ads.zzecf zzecfVar, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.zzdkq(zzecfVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return zzc((com.google.android.gms.internal.ads.zzecf) this.zza.zzb(), com.google.android.gms.internal.ads.zzfoa.zzc());
    }
}

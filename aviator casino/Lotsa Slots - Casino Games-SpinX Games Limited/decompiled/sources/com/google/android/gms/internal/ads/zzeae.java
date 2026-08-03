package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeae implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzeaa zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzeae(com.google.android.gms.internal.ads.zzeaa zzeaaVar, com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzeaaVar;
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzeae zza(com.google.android.gms.internal.ads.zzeaa zzeaaVar, com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzeae(zzeaaVar, zzindVar, zzindVar2);
    }

    public static java.util.Set zzc(com.google.android.gms.internal.ads.zzeaa zzeaaVar, com.google.android.gms.internal.ads.zzeak zzeakVar, java.util.concurrent.Executor executor) {
        java.util.Set zzd = com.google.android.gms.internal.ads.zzeaa.zzd(zzeakVar, executor);
        com.google.android.gms.internal.ads.zzinc.zzb(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return zzc(this.zza, (com.google.android.gms.internal.ads.zzeak) this.zzb.zzb(), com.google.android.gms.internal.ads.zzfoa.zzc());
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcwe implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcvs zza;
    private final com.google.android.gms.internal.ads.zzind zzb;

    private zzcwe(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzcvsVar;
        this.zzb = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzcwe zza(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzcwe(zzcvsVar, zzindVar);
    }

    public static com.google.android.gms.internal.ads.zzdkq zzc(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzcxg zzcxgVar) {
        return new com.google.android.gms.internal.ads.zzdkq(zzcxgVar, com.google.android.gms.internal.ads.zzcfr.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return zzc(this.zza, (com.google.android.gms.internal.ads.zzcxg) this.zzb.zzb());
    }
}

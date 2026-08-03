package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdou implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdop zza;

    private zzdou(com.google.android.gms.internal.ads.zzdop zzdopVar) {
        this.zza = zzdopVar;
    }

    public static com.google.android.gms.internal.ads.zzdou zzc(com.google.android.gms.internal.ads.zzdop zzdopVar) {
        return new com.google.android.gms.internal.ads.zzdou(zzdopVar);
    }

    public static com.google.android.gms.internal.ads.zzdux zzd(com.google.android.gms.internal.ads.zzdop zzdopVar) {
        com.google.android.gms.internal.ads.zzdux zzd = zzdopVar.zzd();
        com.google.android.gms.internal.ads.zzinc.zzb(zzd);
        return zzd;
    }

    public final com.google.android.gms.internal.ads.zzdux zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}

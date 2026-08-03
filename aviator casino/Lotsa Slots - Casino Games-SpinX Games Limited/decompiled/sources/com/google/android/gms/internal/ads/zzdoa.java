package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdoa implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzdnx zza;

    private zzdoa(com.google.android.gms.internal.ads.zzdnx zzdnxVar) {
        this.zza = zzdnxVar;
    }

    public static com.google.android.gms.internal.ads.zzdoa zzc(com.google.android.gms.internal.ads.zzdnx zzdnxVar) {
        return new com.google.android.gms.internal.ads.zzdoa(zzdnxVar);
    }

    public static com.google.android.gms.internal.ads.zzdqd zzd(com.google.android.gms.internal.ads.zzdnx zzdnxVar) {
        com.google.android.gms.internal.ads.zzdqd zza = zzdnxVar.zza();
        com.google.android.gms.internal.ads.zzinc.zzb(zza);
        return zza;
    }

    public final com.google.android.gms.internal.ads.zzdqd zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}

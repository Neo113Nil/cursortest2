package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcxo implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcxl zza;

    private zzcxo(com.google.android.gms.internal.ads.zzcxl zzcxlVar) {
        this.zza = zzcxlVar;
    }

    public static com.google.android.gms.internal.ads.zzcxo zzc(com.google.android.gms.internal.ads.zzcxl zzcxlVar) {
        return new com.google.android.gms.internal.ads.zzcxo(zzcxlVar);
    }

    public static com.google.android.gms.internal.ads.zzdfs zzd(com.google.android.gms.internal.ads.zzcxl zzcxlVar) {
        return zzcxlVar.zza();
    }

    public final com.google.android.gms.internal.ads.zzdfs zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}

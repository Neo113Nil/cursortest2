package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcqg implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcqf zza;

    private zzcqg(com.google.android.gms.internal.ads.zzcqf zzcqfVar) {
        this.zza = zzcqfVar;
    }

    public static com.google.android.gms.internal.ads.zzcqg zzc(com.google.android.gms.internal.ads.zzcqf zzcqfVar) {
        return new com.google.android.gms.internal.ads.zzcqg(zzcqfVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(com.google.android.gms.internal.ads.zzcqf zzcqfVar) {
        return new com.google.android.gms.ads.internal.zza(new com.google.android.gms.internal.ads.zzcik(), new com.google.android.gms.internal.ads.zzchf());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcyn implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcyj zza;

    private zzcyn(com.google.android.gms.internal.ads.zzcyj zzcyjVar) {
        this.zza = zzcyjVar;
    }

    public static com.google.android.gms.internal.ads.zzcyn zzc(com.google.android.gms.internal.ads.zzcyj zzcyjVar) {
        return new com.google.android.gms.internal.ads.zzcyn(zzcyjVar);
    }

    public static com.google.android.gms.internal.ads.zzfkq zzd(com.google.android.gms.internal.ads.zzcyj zzcyjVar) {
        com.google.android.gms.internal.ads.zzfkq zza = zzcyjVar.zza();
        com.google.android.gms.internal.ads.zzinc.zzb(zza);
        return zza;
    }

    public final com.google.android.gms.internal.ads.zzfkq zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        return zzd(this.zza);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhnn implements com.google.android.gms.internal.ads.zzhns {
    private final com.google.android.gms.internal.ads.zziaz zza;
    private final com.google.android.gms.internal.ads.zzhst zzb;

    private zzhnn(com.google.android.gms.internal.ads.zzhst zzhstVar, com.google.android.gms.internal.ads.zziaz zziazVar) {
        this.zzb = zzhstVar;
        this.zza = zziazVar;
    }

    public static com.google.android.gms.internal.ads.zzhnn zza(com.google.android.gms.internal.ads.zzhst zzhstVar) {
        return new com.google.android.gms.internal.ads.zzhnn(zzhstVar, com.google.android.gms.internal.ads.zzhnz.zza(zzhstVar.zza()));
    }

    public static com.google.android.gms.internal.ads.zzhnn zzb(com.google.android.gms.internal.ads.zzhst zzhstVar) throws java.security.GeneralSecurityException {
        return new com.google.android.gms.internal.ads.zzhnn(zzhstVar, com.google.android.gms.internal.ads.zzhnz.zzb(zzhstVar.zza()));
    }

    public final com.google.android.gms.internal.ads.zzhst zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhns
    public final com.google.android.gms.internal.ads.zziaz zzf() {
        return this.zza;
    }
}

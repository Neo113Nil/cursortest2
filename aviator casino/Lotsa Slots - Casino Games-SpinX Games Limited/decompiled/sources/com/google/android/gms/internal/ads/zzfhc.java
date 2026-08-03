package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfhc implements com.google.android.gms.internal.ads.zzfnh {
    public final com.google.android.gms.internal.ads.zzfhv zza;
    public final com.google.android.gms.internal.ads.zzfhx zzb;
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    public final java.lang.String zzd;
    public final java.util.concurrent.Executor zze;
    public final com.google.android.gms.ads.internal.client.zzx zzf;
    public final com.google.android.gms.internal.ads.zzfmx zzg;

    public zzfhc(com.google.android.gms.internal.ads.zzfhv zzfhvVar, com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, java.util.concurrent.Executor executor, com.google.android.gms.ads.internal.client.zzx zzxVar, com.google.android.gms.internal.ads.zzfmx zzfmxVar) {
        this.zza = zzfhvVar;
        this.zzb = zzfhxVar;
        this.zzc = zzmVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzxVar;
        this.zzg = zzfmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnh
    public final java.util.concurrent.Executor zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnh
    public final com.google.android.gms.internal.ads.zzfmx zzb() {
        return this.zzg;
    }
}

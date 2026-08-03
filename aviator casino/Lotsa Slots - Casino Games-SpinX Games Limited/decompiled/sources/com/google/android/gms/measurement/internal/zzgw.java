package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzgw implements java.lang.Runnable {
    private final com.google.android.gms.measurement.internal.zzgv zza;
    private final int zzb;
    private final java.lang.Throwable zzc;
    private final byte[] zzd;
    private final java.lang.String zze;
    private final java.util.Map zzf;

    /* synthetic */ zzgw(java.lang.String str, com.google.android.gms.measurement.internal.zzgv zzgvVar, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map, byte[] bArr2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgvVar);
        this.zza = zzgvVar;
        this.zzb = i;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}

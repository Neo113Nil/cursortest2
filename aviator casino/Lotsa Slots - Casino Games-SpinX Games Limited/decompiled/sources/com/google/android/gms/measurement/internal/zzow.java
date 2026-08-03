package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzow implements com.google.android.gms.measurement.internal.zzgv {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpi zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zzc;

    zzow(com.google.android.gms.measurement.internal.zzpf zzpfVar, java.lang.String str, com.google.android.gms.measurement.internal.zzpi zzpiVar) {
        this.zza = str;
        this.zzb = zzpiVar;
        java.util.Objects.requireNonNull(zzpfVar);
        this.zzc = zzpfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgv
    public final void zza(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        this.zzc.zzQ(this.zza, i, th, bArr, this.zzb);
    }
}

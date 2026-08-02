package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqg implements java.lang.Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ java.lang.String zzb = "CallOptions";
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqu zzc;

    zzbqg(com.google.android.libraries.places.internal.zzbqu zzbquVar, long j, java.lang.String str) {
        this.zza = j;
        java.util.Objects.requireNonNull(zzbquVar);
        this.zzc = zzbquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.zza;
        long abs = java.lang.Math.abs(j) / java.util.concurrent.TimeUnit.SECONDS.toNanos(1L);
        long abs2 = java.lang.Math.abs(j);
        long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(1L);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (j < 0) {
            sb.append("ClientCall started after ");
            sb.append(this.zzb);
            sb.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb.append("Deadline ");
            sb.append(this.zzb);
            sb.append(" was exceeded after ");
        }
        sb.append(abs);
        sb.append(java.lang.String.format(java.util.Locale.US, ".%09d", java.lang.Long.valueOf(abs2 % nanos)));
        sb.append(lib.android.paypal.com.magnessdk.g.n2);
        this.zzc.zzh(com.google.android.libraries.places.internal.zzbnp.zzd.zze(sb.toString()), true);
    }
}

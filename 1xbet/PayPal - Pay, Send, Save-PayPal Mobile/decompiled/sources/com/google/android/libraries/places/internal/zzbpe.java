package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpe implements java.lang.Runnable, com.google.android.libraries.places.internal.zzbjp {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbpk zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private volatile java.util.concurrent.ScheduledFuture zze;
    private volatile boolean zzf;

    zzbpe(com.google.android.libraries.places.internal.zzbpk zzbpkVar, com.google.android.libraries.places.internal.zzbjv zzbjvVar, boolean z) {
        java.util.Objects.requireNonNull(zzbpkVar);
        this.zza = zzbpkVar;
        this.zzb = z;
        if (zzbjvVar == null) {
            this.zzc = false;
            this.zzd = 0L;
        } else {
            this.zzc = true;
            this.zzd = zzbjvVar.zzc(java.util.concurrent.TimeUnit.NANOSECONDS);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzo().zzl(zzc());
    }

    final void zza() {
        if (this.zzf) {
            return;
        }
        if (this.zzc && !this.zzb) {
            com.google.android.libraries.places.internal.zzbpk zzbpkVar = this.zza;
            if (zzbpkVar.zzp() != null) {
                this.zze = zzbpkVar.zzp().schedule(new com.google.android.libraries.places.internal.zzbuf(this), this.zzd, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        }
        com.google.android.libraries.places.internal.zzbpk zzbpkVar2 = this.zza;
        zzbpkVar2.zzl().zzd(this, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        if (this.zzf) {
            zzb();
        }
    }

    final void zzb() {
        this.zzf = true;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.zze;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    final com.google.android.libraries.places.internal.zzbnp zzc() {
        double d;
        double d2;
        long j = this.zzd;
        long abs = java.lang.Math.abs(j) / java.util.concurrent.TimeUnit.SECONDS.toNanos(1L);
        long abs2 = java.lang.Math.abs(j);
        long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(1L);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(true != this.zzb ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(java.lang.String.format(java.util.Locale.US, ".%09d", java.lang.Long.valueOf(abs2 % nanos)));
        sb.append("s. ");
        com.google.android.libraries.places.internal.zzbpk zzbpkVar = this.zza;
        java.lang.Long l = (java.lang.Long) zzbpkVar.zzn().zzi(com.google.android.libraries.places.internal.zzbje.zza);
        java.util.Locale locale = java.util.Locale.US;
        if (l == null) {
            d2 = 0.0d;
        } else {
            double longValue = l.longValue();
            d = com.google.android.libraries.places.internal.zzbpk.zzb;
            d2 = longValue / d;
        }
        sb.append(java.lang.String.format(locale, "Name resolution delay %.9f seconds.", java.lang.Double.valueOf(d2)));
        if (zzbpkVar.zzo() != null) {
            com.google.android.libraries.places.internal.zzbtf zzbtfVar = new com.google.android.libraries.places.internal.zzbtf();
            zzbpkVar.zzo().zzn(zzbtfVar);
            sb.append(" ");
            sb.append(zzbtfVar);
        }
        return com.google.android.libraries.places.internal.zzbnp.zzd.zze(sb.toString());
    }

    final /* synthetic */ long zzd() {
        return this.zzd;
    }
}

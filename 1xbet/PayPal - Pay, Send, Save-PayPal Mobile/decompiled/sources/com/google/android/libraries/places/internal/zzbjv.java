package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbjv implements java.lang.Comparable {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.libraries.places.internal.zzbju zzb = new com.google.android.libraries.places.internal.zzbjt(null);
    private static final long zzc;
    private static final long zzd;
    private static final long zze;
    private final com.google.android.libraries.places.internal.zzbju zzf;
    private final long zzg;
    private volatile boolean zzh;

    static {
        long nanos = java.util.concurrent.TimeUnit.DAYS.toNanos(36500L);
        zzc = nanos;
        zzd = -nanos;
        zze = java.util.concurrent.TimeUnit.SECONDS.toNanos(1L);
    }

    private zzbjv(com.google.android.libraries.places.internal.zzbju zzbjuVar, long j, long j2, boolean z) {
        this.zzf = zzbjuVar;
        long min = java.lang.Math.min(zzc, java.lang.Math.max(zzd, j2));
        this.zzg = j + min;
        this.zzh = min <= 0;
    }

    public static com.google.android.libraries.places.internal.zzbjv zza(long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.libraries.places.internal.zzbju zzbjuVar = zzb;
        java.util.Objects.requireNonNull(timeUnit, "units");
        return new com.google.android.libraries.places.internal.zzbjv(zzbjuVar, java.lang.System.nanoTime(), timeUnit.toNanos(j), true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbjv)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbjv zzbjvVar = (com.google.android.libraries.places.internal.zzbjv) obj;
        return this.zzf == zzbjvVar.zzf && this.zzg == zzbjvVar.zzg;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zzf, java.lang.Long.valueOf(this.zzg));
    }

    public final java.lang.String toString() {
        long zzc2 = zzc(java.util.concurrent.TimeUnit.NANOSECONDS);
        long abs = java.lang.Math.abs(zzc2);
        long j = zze;
        long j2 = abs / j;
        long abs2 = java.lang.Math.abs(zzc2) % j;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (zzc2 < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(java.lang.String.format(java.util.Locale.US, ".%09d", java.lang.Long.valueOf(abs2)));
        }
        sb.append("s from now");
        com.google.android.libraries.places.internal.zzbju zzbjuVar = this.zzf;
        if (zzbjuVar != zzb) {
            java.lang.String obj = zzbjuVar.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj.length() + 10);
            sb2.append(" (ticker=");
            sb2.append(obj);
            sb2.append(")");
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public final boolean zzb() {
        if (!this.zzh) {
            if (this.zzg - java.lang.System.nanoTime() > 0) {
                return false;
            }
            this.zzh = true;
        }
        return true;
    }

    public final long zzc(java.util.concurrent.TimeUnit timeUnit) {
        long nanoTime = java.lang.System.nanoTime();
        if (!this.zzh && this.zzg - nanoTime <= 0) {
            this.zzh = true;
        }
        return timeUnit.convert(this.zzg - nanoTime, java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    @Override // java.lang.Comparable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final int compareTo(com.google.android.libraries.places.internal.zzbjv zzbjvVar) {
        com.google.android.libraries.places.internal.zzbju zzbjuVar = this.zzf;
        com.google.android.libraries.places.internal.zzbju zzbjuVar2 = zzbjvVar.zzf;
        if (zzbjuVar == zzbjuVar2) {
            return java.lang.Long.compare(this.zzg, zzbjvVar.zzg);
        }
        java.lang.String obj = zzbjuVar.toString();
        java.lang.String obj2 = zzbjuVar2.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 14 + obj2.length() + 58);
        sb.append("Tickers (");
        sb.append(obj);
        sb.append(" and ");
        sb.append(obj2);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new java.lang.AssertionError(sb.toString());
    }
}

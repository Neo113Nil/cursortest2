package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
final class zzbzg {
    final int zza;
    final long zzb;
    final long zzc;
    final double zzd;

    @javax.annotation.Nullable
    final java.lang.Long zze;
    final java.util.Set zzf;

    zzbzg(int i, long j, long j2, double d, @javax.annotation.Nullable java.lang.Long l, @javax.annotation.Nonnull java.util.Set set) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = d;
        this.zze = l;
        this.zzf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) set);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbzg)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbzg zzbzgVar = (com.google.android.libraries.places.internal.zzbzg) obj;
        return this.zza == zzbzgVar.zza && this.zzb == zzbzgVar.zzb && this.zzc == zzbzgVar.zzc && java.lang.Double.compare(this.zzd, zzbzgVar.zzd) == 0 && com.google.common.base.Objects.equal(this.zze, zzbzgVar.zze) && com.google.common.base.Objects.equal(this.zzf, zzbzgVar.zzf);
    }

    public final int hashCode() {
        int i = this.zza;
        long j = this.zzb;
        long j2 = this.zzc;
        double d = this.zzd;
        return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), java.lang.Double.valueOf(d), this.zze, this.zzf);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("maxAttempts", this.zza).add("initialBackoffNanos", this.zzb).add("maxBackoffNanos", this.zzc).add("backoffMultiplier", this.zzd).add("perAttemptRecvTimeoutNanos", this.zze).add("retryableStatusCodes", this.zzf).toString();
    }
}

package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbta {
    final int zza;
    final long zzb;
    final java.util.Set zzc;

    zzbta(int i, long j, java.util.Set set) {
        this.zza = i;
        this.zzb = j;
        this.zzc = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) set);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbta zzbtaVar = (com.google.android.libraries.places.internal.zzbta) obj;
        return this.zza == zzbtaVar.zza && this.zzb == zzbtaVar.zzb && com.google.common.base.Objects.equal(this.zzc, zzbtaVar.zzc);
    }

    public final int hashCode() {
        int i = this.zza;
        long j = this.zzb;
        return com.google.common.base.Objects.hashCode(java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j), this.zzc);
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("maxAttempts", this.zza).add("hedgingDelayNanos", this.zzb).add("nonFatalStatusCodes", this.zzc).toString();
    }
}

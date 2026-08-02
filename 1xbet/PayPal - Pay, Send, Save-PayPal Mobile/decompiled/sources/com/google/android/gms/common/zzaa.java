package com.google.android.gms.common;

/* loaded from: classes8.dex */
final class zzaa {
    private java.lang.String zza = null;
    private long zzb = -1;
    private com.google.android.gms.internal.common.zzah zzc = com.google.android.gms.internal.common.zzah.zzj();
    private com.google.android.gms.internal.common.zzah zzd = com.google.android.gms.internal.common.zzah.zzj();

    zzaa() {
    }

    final com.google.android.gms.common.zzaa zzc(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zzc = com.google.android.gms.internal.common.zzah.zzp(list);
        return this;
    }

    final com.google.android.gms.common.zzaa zzd(java.util.List list) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zzd = com.google.android.gms.internal.common.zzah.zzp(list);
        return this;
    }

    final com.google.android.gms.common.zzab zze() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("packageName must be defined");
        }
        if (this.zzb < 0) {
            throw new java.lang.IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new java.lang.IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new com.google.android.gms.common.zzab(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    final com.google.android.gms.common.zzaa zzb(long j) {
        this.zzb = j;
        return this;
    }

    final com.google.android.gms.common.zzaa zza(java.lang.String str) {
        this.zza = str;
        return this;
    }
}

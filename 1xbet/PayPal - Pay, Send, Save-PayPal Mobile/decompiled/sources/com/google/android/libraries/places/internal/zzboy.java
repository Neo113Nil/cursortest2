package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzboy extends com.google.android.libraries.places.internal.zzbsn {
    private final com.google.android.libraries.places.internal.zzbqa zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;
    private volatile com.google.android.libraries.places.internal.zzbnp zzc;
    private com.google.android.libraries.places.internal.zzbnp zzd;

    zzboy(com.google.android.libraries.places.internal.zzboz zzbozVar, com.google.android.libraries.places.internal.zzbqa zzbqaVar, java.lang.String str) {
        java.util.Objects.requireNonNull(zzbozVar);
        this.zzb = new java.util.concurrent.atomic.AtomicInteger(androidx.media3.common.C.RATE_UNSET_INT);
        this.zza = (com.google.android.libraries.places.internal.zzbqa) com.google.common.base.Preconditions.checkNotNull(zzbqaVar, "delegate");
    }

    @Override // com.google.android.libraries.places.internal.zzbsn, com.google.android.libraries.places.internal.zzbpo
    public final com.google.android.libraries.places.internal.zzbpl zzb(com.google.android.libraries.places.internal.zzbml zzbmlVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar, com.google.android.libraries.places.internal.zzbis zzbisVar, com.google.android.libraries.places.internal.zzbje[] zzbjeVarArr) {
        return this.zzb.get() >= 0 ? new com.google.android.libraries.places.internal.zzbsi(this.zzc, com.google.android.libraries.places.internal.zzbpm.PROCESSED, zzbjeVarArr) : this.zza.zzb(zzbmlVar, zzbmgVar, zzbisVar, zzbjeVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbsn, com.google.android.libraries.places.internal.zzbwd
    public final void zzd(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "status");
        synchronized (this) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zzb;
            if (atomicInteger.get() < 0) {
                this.zzc = zzbnpVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
                if (atomicInteger.get() != 0) {
                    return;
                }
                super.zzd(zzbnpVar);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsn, com.google.android.libraries.places.internal.zzbwd
    public final void zze(com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        com.google.common.base.Preconditions.checkNotNull(zzbnpVar, "status");
        synchronized (this) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zzb;
            if (atomicInteger.get() < 0) {
                this.zzc = zzbnpVar;
                atomicInteger.addAndGet(Integer.MAX_VALUE);
            } else if (this.zzd != null) {
                return;
            }
            if (atomicInteger.get() != 0) {
                this.zzd = zzbnpVar;
            } else {
                super.zze(zzbnpVar);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsn
    protected final com.google.android.libraries.places.internal.zzbqa zza() {
        return this.zza;
    }
}

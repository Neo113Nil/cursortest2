package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhbc extends com.google.android.gms.internal.ads.zzhap.zzf {
    private static final com.google.android.gms.internal.ads.zzhaz zzbq;
    private static final com.google.android.gms.internal.ads.zzhce zzbr = new com.google.android.gms.internal.ads.zzhce(com.google.android.gms.internal.ads.zzhbc.class);
    volatile int remainingField;
    volatile java.util.Set<java.lang.Throwable> seenExceptionsField = null;

    static {
        java.lang.Throwable th;
        com.google.android.gms.internal.ads.zzhaz zzhbbVar;
        byte[] bArr = null;
        try {
            zzhbbVar = new com.google.android.gms.internal.ads.zzhba(bArr);
            th = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            zzhbbVar = new com.google.android.gms.internal.ads.zzhbb(bArr);
        }
        zzbq = zzhbbVar;
        if (th != null) {
            zzbr.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzhbc(int i) {
        this.remainingField = i;
    }

    final java.util.Set zzB() {
        java.util.Set<java.lang.Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        zzf(newSetFromMap);
        zzbq.zza(this, null, newSetFromMap);
        return (java.util.Set) java.util.Objects.requireNonNull(this.seenExceptionsField);
    }

    final int zzC() {
        return zzbq.zzb(this);
    }

    abstract void zzf(java.util.Set set);
}

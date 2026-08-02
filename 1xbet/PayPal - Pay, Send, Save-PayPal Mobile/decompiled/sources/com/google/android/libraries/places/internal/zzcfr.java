package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfr {
    private static final com.google.android.libraries.places.internal.zzcfq zza = new com.google.android.libraries.places.internal.zzcfq(new byte[0], 0, 0, false, false);
    private static final int zzb;
    private static final java.util.concurrent.atomic.AtomicReference[] zzc;

    static {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        int highestOneBit = java.lang.Integer.highestOneBit((availableProcessors + availableProcessors) - 1);
        zzb = highestOneBit;
        java.util.concurrent.atomic.AtomicReference[] atomicReferenceArr = new java.util.concurrent.atomic.AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new java.util.concurrent.atomic.AtomicReference();
        }
        zzc = atomicReferenceArr;
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.internal.zzcfq zza() {
        java.util.concurrent.atomic.AtomicReference zzc2 = zzc();
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = zza;
        com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = (com.google.android.libraries.places.internal.zzcfq) zzc2.getAndSet(zzcfqVar);
        if (zzcfqVar2 == zzcfqVar) {
            return new com.google.android.libraries.places.internal.zzcfq();
        }
        if (zzcfqVar2 == null) {
            zzc2.set(null);
            return new com.google.android.libraries.places.internal.zzcfq();
        }
        zzc2.set(zzcfqVar2.zzf);
        zzcfqVar2.zzf = null;
        zzcfqVar2.zzc = 0;
        return zzcfqVar2;
    }

    @kotlin.jvm.JvmStatic
    public static final void zzb(com.google.android.libraries.places.internal.zzcfq zzcfqVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfqVar, "");
        if (zzcfqVar.zzf != null || zzcfqVar.zzg != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (zzcfqVar.zzd) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference zzc2 = zzc();
        com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = zza;
        com.google.android.libraries.places.internal.zzcfq zzcfqVar3 = (com.google.android.libraries.places.internal.zzcfq) zzc2.getAndSet(zzcfqVar2);
        if (zzcfqVar3 != zzcfqVar2) {
            int i = zzcfqVar3 != null ? zzcfqVar3.zzc : 0;
            if (i >= 65536) {
                zzc2.set(zzcfqVar3);
                return;
            }
            zzcfqVar.zzf = zzcfqVar3;
            zzcfqVar.zzb = 0;
            zzcfqVar.zzc = i + 8192;
            zzc2.set(zzcfqVar);
        }
    }

    private static final java.util.concurrent.atomic.AtomicReference zzc() {
        return zzc[(int) (java.lang.Thread.currentThread().getId() & (zzb - 1))];
    }
}

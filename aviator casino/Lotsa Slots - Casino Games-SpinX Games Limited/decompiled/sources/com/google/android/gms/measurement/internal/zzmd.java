package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmd extends com.google.android.gms.measurement.internal.zzgc {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;

    zzmd(com.google.android.gms.measurement.internal.zznk zznkVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zza = atomicReference;
        java.util.Objects.requireNonNull(zznkVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgd
    public final void zze(java.util.List list) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}

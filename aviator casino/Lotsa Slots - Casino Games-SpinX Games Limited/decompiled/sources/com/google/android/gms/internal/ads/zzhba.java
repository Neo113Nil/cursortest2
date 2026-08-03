package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhba extends com.google.android.gms.internal.ads.zzhaz {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zza = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzhbc.class, java.util.Set.class, "seenExceptionsField");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater zzb = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(com.google.android.gms.internal.ads.zzhbc.class, "remainingField");

    private zzhba() {
        throw null;
    }

    /* synthetic */ zzhba(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zza(com.google.android.gms.internal.ads.zzhbc zzhbcVar, java.util.Set set, java.util.Set set2) {
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zza, zzhbcVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final int zzb(com.google.android.gms.internal.ads.zzhbc zzhbcVar) {
        return zzb.decrementAndGet(zzhbcVar);
    }
}

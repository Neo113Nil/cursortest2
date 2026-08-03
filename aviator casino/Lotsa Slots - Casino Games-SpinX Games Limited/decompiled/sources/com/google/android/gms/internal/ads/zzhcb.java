package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhcb extends java.util.concurrent.locks.AbstractOwnableSynchronizer implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzhcd zza;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    final /* synthetic */ void zza(java.lang.Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}

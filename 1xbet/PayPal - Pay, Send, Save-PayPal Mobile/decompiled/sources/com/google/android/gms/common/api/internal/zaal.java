package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zaal implements com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks {
    private final java.lang.ref.WeakReference zaa;
    private final com.google.android.gms.common.api.Api zab;
    private final boolean zac;

    public zaal(com.google.android.gms.common.api.internal.zaaw zaawVar, com.google.android.gms.common.api.Api api, boolean z) {
        this.zaa = new java.lang.ref.WeakReference(zaawVar);
        this.zab = api;
        this.zac = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.api.internal.zabi zabiVar;
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        boolean zaG;
        boolean zaH;
        com.google.android.gms.common.api.internal.zaaw zaawVar = (com.google.android.gms.common.api.internal.zaaw) this.zaa.get();
        if (zaawVar == null) {
            return;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        zabiVar = zaawVar.zaa;
        com.google.android.gms.common.internal.Preconditions.checkState(myLooper == zabiVar.zag.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaawVar.zab;
        lock.lock();
        try {
            zaG = zaawVar.zaG(0);
            if (zaG) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.zaE(connectionResult, this.zab, this.zac);
                }
                zaH = zaawVar.zaH();
                if (zaH) {
                    zaawVar.zaF();
                }
            }
        } finally {
            lock2 = zaawVar.zab;
            lock2.unlock();
        }
    }
}

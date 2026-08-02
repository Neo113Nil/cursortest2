package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zacq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zact zaa;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zacs zacsVar;
        zacsVar = this.zaa.zah;
        zacsVar.zae(new com.google.android.gms.common.ConnectionResult(4));
    }

    zacq(com.google.android.gms.common.api.internal.zact zactVar) {
        this.zaa = zactVar;
    }
}

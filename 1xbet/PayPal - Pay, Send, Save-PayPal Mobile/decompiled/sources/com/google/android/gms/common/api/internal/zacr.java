package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zacr implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.signin.internal.zak zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zact zab;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.internal.zact.zad(this.zab, this.zaa);
    }

    zacr(com.google.android.gms.common.api.internal.zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.zab = zactVar;
        this.zaa = zakVar;
    }
}

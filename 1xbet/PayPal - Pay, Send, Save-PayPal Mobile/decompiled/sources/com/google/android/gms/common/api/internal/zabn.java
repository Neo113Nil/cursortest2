package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zabn implements java.lang.Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabq zab;

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }

    zabn(com.google.android.gms.common.api.internal.zabq zabqVar, int i) {
        this.zab = zabqVar;
        this.zaa = i;
    }
}

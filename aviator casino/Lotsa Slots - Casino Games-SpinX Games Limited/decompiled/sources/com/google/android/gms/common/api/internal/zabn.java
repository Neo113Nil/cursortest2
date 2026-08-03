package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zabn implements java.lang.Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zabq zab;

    zabn(com.google.android.gms.common.api.internal.zabq zabqVar, int i) {
        this.zab = zabqVar;
        this.zaa = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class zzbz implements Runnable {
    private final /* synthetic */ zzby zzlx;

    zzbz(zzby zzbyVar) {
        this.zzlx = zzbyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcb zzcbVar;
        zzcbVar = this.zzlx.zzlw;
        zzcbVar.zzg(new ConnectionResult(4));
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzyz implements Runnable {
    private final /* synthetic */ zzyq zzbvd;

    zzyz(zzyq zzyqVar) {
        this.zzbvd = zzyqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzxt zzxtVar;
        try {
            zzxtVar = this.zzbvd.zzbuu;
            zzxtVar.onAdClosed();
        } catch (RemoteException e) {
            zzane.zzd("#007 Could not call remote method.", e);
        }
    }
}

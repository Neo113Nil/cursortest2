package com.google.android.gms.internal.ads;

import J2.j;
import O2.g;
import android.os.RemoteException;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zzbrv implements g {
    private final zzbgd zza;

    public zzbrv(zzbgd zzbgdVar) {
        this.zza = zzbgdVar;
        try {
            zzbgdVar.zzm();
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(new p105o3.b(view));
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e7) {
            j.e("", e7);
            return false;
        }
    }
}

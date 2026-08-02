package com.google.android.gms.internal.ads;

import J2.j;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzbpi implements L2.b {
    final /* synthetic */ zzblb zza;

    public zzbpi(zzbpp zzbppVar, zzblb zzblbVar) {
        this.zza = zzblbVar;
    }

    public final void onInitializationFailed(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }
}

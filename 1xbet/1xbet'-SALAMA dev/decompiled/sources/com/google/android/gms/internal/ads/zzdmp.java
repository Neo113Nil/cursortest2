package com.google.android.gms.internal.ads;

import F2.I0;
import F2.K0;
import I2.J;
import J2.j;
import android.os.RemoteException;
import p167y2.x;

/* JADX INFO: loaded from: classes.dex */
public final class zzdmp extends x {
    private final zzdhc zza;

    public zzdmp(zzdhc zzdhcVar) {
        this.zza = zzdhcVar;
    }

    private static K0 zza(zzdhc zzdhcVar) {
        I0 i0Zzj = zzdhcVar.zzj();
        if (i0Zzj == null) {
            return null;
        }
        try {
            return i0Zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // p167y2.x
    public final void onVideoEnd() {
        K0 k0Zza = zza(this.zza);
        if (k0Zza == null) {
            return;
        }
        try {
            k0Zza.zze();
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // p167y2.x
    public final void onVideoPause() {
        K0 k0Zza = zza(this.zza);
        if (k0Zza == null) {
            return;
        }
        try {
            k0Zza.zzg();
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // p167y2.x
    public final void onVideoStart() {
        K0 k0Zza = zza(this.zza);
        if (k0Zza == null) {
            return;
        }
        try {
            k0Zza.zzi();
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Unable to call onVideoEnd()", e7);
        }
    }
}

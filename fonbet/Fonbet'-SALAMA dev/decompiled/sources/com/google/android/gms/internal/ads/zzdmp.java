package com.google.android.gms.internal.ads;

import F2.I0;
import F2.K0;
import I2.J;
import J2.j;
import android.os.RemoteException;
import y2.x;

/* loaded from: classes.dex */
public final class zzdmp extends x {
    private final zzdhc zza;

    public zzdmp(zzdhc zzdhcVar) {
        this.zza = zzdhcVar;
    }

    private static K0 zza(zzdhc zzdhcVar) {
        I0 zzj = zzdhcVar.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // y2.x
    public final void onVideoEnd() {
        K0 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zze();
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // y2.x
    public final void onVideoPause() {
        K0 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzg();
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // y2.x
    public final void onVideoStart() {
        K0 zza = zza(this.zza);
        if (zza == null) {
            return;
        }
        try {
            zza.zzi();
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Unable to call onVideoEnd()", e7);
        }
    }
}

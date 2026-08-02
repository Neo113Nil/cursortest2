package com.google.android.gms.internal.ads;

import F2.H0;
import F2.K0;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbpe extends H0 {
    private final Object zza = new Object();
    private volatile K0 zzb;

    @Override // F2.I0
    public final float zze() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final float zzf() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final float zzg() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final K0 zzi() {
        K0 k02;
        synchronized (this.zza) {
            k02 = this.zzb;
        }
        return k02;
    }

    @Override // F2.I0
    public final void zzj(boolean z4) {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final void zzk() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final void zzl() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final void zzm(K0 k02) {
        synchronized (this.zza) {
            this.zzb = k02;
        }
    }

    @Override // F2.I0
    public final void zzn() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final boolean zzo() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final boolean zzq() {
        throw new RemoteException();
    }
}

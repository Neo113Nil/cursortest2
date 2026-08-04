package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import F2.K0;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzdhb extends H0 {
    private final Object zza = new Object();
    private final I0 zzb;
    private final zzbpd zzc;

    public zzdhb(I0 i7, zzbpd zzbpdVar) {
        this.zzb = i7;
        this.zzc = zzbpdVar;
    }

    @Override // F2.I0
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final float zzf() {
        zzbpd zzbpdVar = this.zzc;
        if (zzbpdVar != null) {
            return zzbpdVar.zzg();
        }
        return 0.0f;
    }

    @Override // F2.I0
    public final float zzg() {
        zzbpd zzbpdVar = this.zzc;
        if (zzbpdVar != null) {
            return zzbpdVar.zzh();
        }
        return 0.0f;
    }

    @Override // F2.I0
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final K0 zzi() {
        synchronized (this.zza) {
            try {
                I0 i7 = this.zzb;
                if (i7 == null) {
                    return null;
                }
                return i7.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F2.I0
    public final void zzj(boolean z4) throws RemoteException {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final void zzm(K0 k7) {
        synchronized (this.zza) {
            try {
                I0 i7 = this.zzb;
                if (i7 != null) {
                    i7.zzm(k7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F2.I0
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}

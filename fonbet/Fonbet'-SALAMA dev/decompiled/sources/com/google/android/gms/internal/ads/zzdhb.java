package com.google.android.gms.internal.ads;

import F2.H0;
import F2.I0;
import F2.K0;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzdhb extends H0 {
    private final Object zza = new Object();
    private final I0 zzb;
    private final zzbpd zzc;

    public zzdhb(I0 i02, zzbpd zzbpdVar) {
        this.zzb = i02;
        this.zzc = zzbpdVar;
    }

    @Override // F2.I0
    public final float zze() {
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
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // F2.I0
    public final K0 zzi() {
        synchronized (this.zza) {
            try {
                I0 i02 = this.zzb;
                if (i02 == null) {
                    return null;
                }
                return i02.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
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
            try {
                I0 i02 = this.zzb;
                if (i02 != null) {
                    i02.zzm(k02);
                }
            } catch (Throwable th) {
                throw th;
            }
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

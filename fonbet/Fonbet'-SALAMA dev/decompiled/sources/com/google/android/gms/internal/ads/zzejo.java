package com.google.android.gms.internal.ads;

import F2.F0;
import I2.J;
import J2.j;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzejo {
    private final zzejt zza;
    private final String zzb;
    private F0 zzc;

    public zzejo(zzejt zzejtVar, String str) {
        this.zza = zzejtVar;
        this.zzb = str;
    }

    public final synchronized String zza() {
        F0 f02;
        try {
            f02 = this.zzc;
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
            return null;
        }
        return f02 != null ? f02.zzg() : null;
    }

    public final synchronized String zzb() {
        F0 f02;
        try {
            f02 = this.zzc;
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
            return null;
        }
        return f02 != null ? f02.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, int i7) {
        this.zzc = null;
        zzeju zzejuVar = new zzeju(i7);
        zzejn zzejnVar = new zzejn(this);
        this.zza.zzb(zzmVar, this.zzb, zzejuVar, zzejnVar);
    }

    public final synchronized boolean zze() {
        return this.zza.zza();
    }
}

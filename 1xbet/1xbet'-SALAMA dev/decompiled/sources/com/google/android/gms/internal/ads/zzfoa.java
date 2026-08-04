package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class zzfoa {
    final /* synthetic */ zzfoc zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfoa(zzfoc zzfocVar, byte[] bArr, zzfob zzfobVar) {
        this.zza = zzfocVar;
        this.zzb = bArr;
    }

    public final zzfoa zza(int i7) {
        this.zzd = i7;
        return this;
    }

    public final zzfoa zzb(int i7) {
        this.zzc = i7;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfoc zzfocVar = this.zza;
            if (zzfocVar.zzb) {
                zzfocVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e7) {
            Log.d("GASS", "Clearcut log failed", e7);
        }
    }
}

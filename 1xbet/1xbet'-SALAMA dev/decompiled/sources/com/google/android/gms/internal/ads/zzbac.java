package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.InterfaceC0806b;

/* JADX INFO: loaded from: classes.dex */
final class zzbac implements InterfaceC0806b {
    final /* synthetic */ zzbae zza;

    public zzbac(zzbae zzbaeVar) {
        this.zza = zzbaeVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzbae zzbaeVar = this.zza;
                if (zzbaeVar.zzd != null) {
                    zzbaeVar.zzf = zzbaeVar.zzd.zzq();
                }
            } catch (DeadObjectException e7) {
                int i7 = J.f3546b;
                j.e("Unable to obtain a cache service instance.", e7);
                zzbae.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnectionSuspended(int i7) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}

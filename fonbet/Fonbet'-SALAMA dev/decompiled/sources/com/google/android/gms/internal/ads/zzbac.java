package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.InterfaceC0850b;

/* loaded from: classes.dex */
final class zzbac implements InterfaceC0850b {
    final /* synthetic */ zzbae zza;

    public zzbac(zzbae zzbaeVar) {
        this.zza = zzbaeVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzbah zzbahVar;
        zzbah zzbahVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzbae zzbaeVar = this.zza;
                zzbahVar = zzbaeVar.zzd;
                if (zzbahVar != null) {
                    zzbahVar2 = zzbaeVar.zzd;
                    zzbaeVar.zzf = zzbahVar2.zzq();
                }
            } catch (DeadObjectException e7) {
                int i7 = J.f3546b;
                j.e("Unable to obtain a cache service instance.", e7);
                zzbae.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnectionSuspended(int i7) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}

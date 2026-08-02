package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0851c;

/* loaded from: classes.dex */
final class zzbad implements InterfaceC0851c {
    final /* synthetic */ zzbae zza;

    public zzbad(zzbae zzbaeVar) {
        this.zza = zzbaeVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0851c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzbah zzbahVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                this.zza.zzf = null;
                zzbae zzbaeVar = this.zza;
                zzbahVar = zzbaeVar.zzd;
                if (zzbahVar != null) {
                    zzbaeVar.zzd = null;
                }
                obj2 = this.zza.zzc;
                obj2.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

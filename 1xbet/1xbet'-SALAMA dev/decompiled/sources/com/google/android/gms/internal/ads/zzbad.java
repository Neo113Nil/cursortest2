package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0807c;

/* JADX INFO: loaded from: classes.dex */
final class zzbad implements InterfaceC0807c {
    final /* synthetic */ zzbae zza;

    public zzbad(zzbae zzbaeVar) {
        this.zza = zzbaeVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0807c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            try {
                this.zza.zzf = null;
                zzbae zzbaeVar = this.zza;
                if (zzbaeVar.zzd != null) {
                    zzbaeVar.zzd = null;
                }
                this.zza.zzc.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

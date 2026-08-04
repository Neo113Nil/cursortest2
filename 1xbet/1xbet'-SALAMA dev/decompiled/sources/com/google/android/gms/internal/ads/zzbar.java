package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0807c;

/* JADX INFO: loaded from: classes.dex */
final class zzbar implements InterfaceC0807c {
    final /* synthetic */ zzbzf zza;
    final /* synthetic */ zzbas zzb;

    public zzbar(zzbas zzbasVar, zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
        this.zzb = zzbasVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0807c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}

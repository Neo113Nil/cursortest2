package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0851c;

/* loaded from: classes.dex */
final class zzbar implements InterfaceC0851c {
    final /* synthetic */ zzbzf zza;
    final /* synthetic */ zzbas zzb;

    public zzbar(zzbas zzbasVar, zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
        this.zzb = zzbasVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0851c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}

package com.google.android.gms.internal.ads;

import F2.InterfaceC0261w0;
import I2.J;
import J2.j;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class zzezu implements S2.a {
    final /* synthetic */ InterfaceC0261w0 zza;
    final /* synthetic */ zzezw zzb;

    public zzezu(zzezw zzezwVar, InterfaceC0261w0 interfaceC0261w0) {
        this.zza = interfaceC0261w0;
        this.zzb = zzezwVar;
    }

    @Override // S2.a
    public final void onAdMetadataChanged() {
        if (this.zzb.zzi != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.i("#007 Could not call remote method.", e7);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import F2.O;
import F2.P;
import I2.J;
import J2.j;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzfab implements S2.a {
    final /* synthetic */ P zza;
    final /* synthetic */ zzfac zzb;

    public zzfab(zzfac zzfacVar, P p5) {
        this.zza = p5;
        this.zzb = zzfacVar;
    }

    @Override // S2.a
    public final void onAdMetadataChanged() {
        zzdmu zzdmuVar;
        zzdmuVar = this.zzb.zzd;
        if (zzdmuVar != null) {
            try {
                O o7 = (O) this.zza;
                o7.zzda(1, o7.zza());
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.i("#007 Could not call remote method.", e7);
            }
        }
    }
}

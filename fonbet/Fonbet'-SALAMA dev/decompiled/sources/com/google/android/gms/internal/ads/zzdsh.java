package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.content.Context;
import android.os.RemoteException;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public final class zzdsh implements zzdrr {
    private final long zza;
    private final zzdrw zzb;
    private final zzezw zzc;

    public zzdsh(long j, Context context, zzdrw zzdrwVar, zzcgb zzcgbVar, String str) {
        this.zza = j;
        this.zzb = zzdrwVar;
        zzezy zzv = zzcgbVar.zzv();
        zzv.zzb(context);
        zzv.zza(str);
        this.zzc = zzv.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzf(zzmVar, new zzdsf(this));
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrr
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdsg(this));
            this.zzc.zzm(new BinderC1507b(null));
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        }
    }
}

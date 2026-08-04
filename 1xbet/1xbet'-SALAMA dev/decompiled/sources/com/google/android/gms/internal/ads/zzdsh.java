package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class zzdsh implements zzdrr {
    private final long zza;
    private final zzdrw zzb;
    private final zzezw zzc;

    public zzdsh(long j, Context context, zzdrw zzdrwVar, zzcgb zzcgbVar, String str) {
        this.zza = j;
        this.zzb = zzdrwVar;
        zzezy zzezyVarZzv = zzcgbVar.zzv();
        zzezyVarZzv.zzb(context);
        zzezyVarZzv.zza(str);
        this.zzc = zzezyVarZzv.zzc().zza();
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
            this.zzc.zzm(new p105o3.b(null));
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        }
    }
}

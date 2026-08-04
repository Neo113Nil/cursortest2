package com.google.android.gms.internal.ads;

import F2.F0;
import F2.g1;
import J2.j;
import android.app.Activity;
import android.os.RemoteException;
import p167y2.m;
import p167y2.r;
import p167y2.v;

/* JADX INFO: loaded from: classes.dex */
public final class zzazm extends A2.b {
    m zza;
    private final zzazq zzb;
    private final String zzc;
    private final zzazn zzd = new zzazn();
    private r zze;

    public zzazm(zzazq zzazqVar, String str) {
        this.zzb = zzazqVar;
        this.zzc = str;
    }

    public final String getAdUnitId() {
        return this.zzc;
    }

    public final m getFullScreenContentCallback() {
        return this.zza;
    }

    public final r getOnPaidEventListener() {
        return this.zze;
    }

    @Override // A2.b
    public final v getResponseInfo() {
        F0 f0Zzf;
        try {
            f0Zzf = this.zzb.zzf();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
            f0Zzf = null;
        }
        return new v(f0Zzf);
    }

    @Override // A2.b
    public final void setFullScreenContentCallback(m mVar) {
        this.zza = mVar;
        this.zzd.zzg(mVar);
    }

    @Override // A2.b
    public final void setImmersiveMode(boolean z4) {
        try {
            this.zzb.zzg(z4);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // A2.b
    public final void setOnPaidEventListener(r rVar) {
        this.zze = rVar;
        try {
            this.zzb.zzh(new g1(rVar));
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // A2.b
    public final void show(Activity activity) {
        try {
            this.zzb.zzi(new p105o3.b(activity), this.zzd);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }
}

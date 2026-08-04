package com.google.android.gms.internal.ads;

import J2.j;
import android.os.RemoteException;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
final class zzbqy implements N2.b {
    final /* synthetic */ zzbqq zza;

    public zzbqy(zzbra zzbraVar, zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
    }

    public final void onFailure(C1057a c1057a) {
        try {
            this.zza.zzg(c1057a.b());
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final void onSuccess(String str) {
        try {
            this.zza.zze(str);
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final void onFailure(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }
}

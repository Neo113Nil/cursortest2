package com.google.android.gms.internal.ads;

import J2.j;
import android.os.RemoteException;
import y2.C1797a;

/* loaded from: classes.dex */
final class zzbqy implements N2.b {
    final /* synthetic */ zzbqq zza;

    public zzbqy(zzbra zzbraVar, zzbqq zzbqqVar) {
        this.zza = zzbqqVar;
    }

    public final void onFailure(C1797a c1797a) {
        try {
            this.zza.zzg(c1797a.b());
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

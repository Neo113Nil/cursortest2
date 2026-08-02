package com.google.android.gms.internal.ads;

import J2.j;
import L2.c;
import android.os.RemoteException;
import y2.C1797a;

/* loaded from: classes.dex */
final class zzbqu implements c {
    final /* synthetic */ zzbqe zza;
    final /* synthetic */ zzbou zzb;
    final /* synthetic */ zzbra zzc;

    public zzbqu(zzbra zzbraVar, zzbqe zzbqeVar, zzbou zzbouVar) {
        this.zza = zzbqeVar;
        this.zzb = zzbouVar;
        this.zzc = zzbraVar;
    }

    @Override // L2.c
    public final void onFailure(C1797a c1797a) {
        try {
            this.zza.zzf(c1797a.b());
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final /* synthetic */ Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        j.g("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            j.e("", e7);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new C1797a(0, str, "undefined", null));
    }
}

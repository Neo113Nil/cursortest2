package com.google.android.gms.internal.ads;

import J2.j;
import L2.c;
import android.os.RemoteException;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
final class zzbqt implements c {
    final /* synthetic */ zzbqb zza;
    final /* synthetic */ zzbou zzb;

    public zzbqt(zzbra zzbraVar, zzbqb zzbqbVar, zzbou zzbouVar) {
        this.zza = zzbqbVar;
        this.zzb = zzbouVar;
    }

    @Override // L2.c
    public final void onFailure(C1057a c1057a) {
        try {
            this.zza.zzf(c1057a.b());
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
        onFailure(new C1057a(0, str, "undefined", null));
    }
}

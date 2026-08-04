package com.google.android.gms.internal.ads;

import J2.j;
import L2.c;
import L2.t;
import android.os.RemoteException;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
final class zzbqw implements c {
    final /* synthetic */ zzbqh zza;
    final /* synthetic */ zzbou zzb;

    public zzbqw(zzbra zzbraVar, zzbqh zzbqhVar, zzbou zzbouVar) {
        this.zza = zzbqhVar;
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

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        t tVar = (t) obj;
        if (tVar != null) {
            try {
                this.zza.zzg(new zzbpv(tVar));
            } catch (RemoteException e7) {
                j.e("", e7);
            }
            return new zzbrb(this.zzb);
        }
        j.g("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e8) {
            j.e("", e8);
            return null;
        }
    }

    public final void onFailure(String str) {
        onFailure(new C1057a(0, str, "undefined", null));
    }
}

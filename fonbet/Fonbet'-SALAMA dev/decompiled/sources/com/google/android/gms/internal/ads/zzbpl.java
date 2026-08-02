package com.google.android.gms.internal.ads;

import J2.j;
import L2.c;
import L2.t;
import android.os.RemoteException;
import y2.C1797a;

/* loaded from: classes.dex */
final class zzbpl implements c {
    final /* synthetic */ zzbou zza;
    final /* synthetic */ zzbpp zzb;

    public zzbpl(zzbpp zzbppVar, zzbou zzbouVar) {
        this.zza = zzbouVar;
        this.zzb = zzbppVar;
    }

    @Override // L2.c
    public final void onFailure(C1797a c1797a) {
        Object obj;
        try {
            obj = this.zzb.zza;
            String canonicalName = obj.getClass().getCanonicalName();
            int a2 = c1797a.a();
            String str = c1797a.f18139b;
            j.b(canonicalName + "failed to load mediation ad: ErrorCode = " + a2 + ". ErrorMessage = " + str + ". ErrorDomain = " + c1797a.f18140c);
            this.zza.zzh(c1797a.b());
            this.zza.zzi(c1797a.a(), str);
            this.zza.zzg(c1797a.a());
        } catch (RemoteException e7) {
            j.e("", e7);
        }
    }

    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzg = (t) obj;
            this.zza.zzo();
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        return new zzbpf(this.zza);
    }

    public final void onFailure(String str) {
        onFailure(new C1797a(0, str, "undefined", null));
    }
}

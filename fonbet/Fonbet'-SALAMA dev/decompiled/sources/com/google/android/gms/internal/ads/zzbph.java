package com.google.android.gms.internal.ads;

import J2.j;
import L2.c;
import android.os.RemoteException;
import y2.C1797a;

/* loaded from: classes.dex */
final class zzbph implements c {
    final /* synthetic */ zzbou zza;
    final /* synthetic */ L2.a zzb;
    final /* synthetic */ zzbpp zzc;

    public zzbph(zzbpp zzbppVar, zzbou zzbouVar, L2.a aVar) {
        this.zza = zzbouVar;
        this.zzb = aVar;
        this.zzc = zzbppVar;
    }

    @Override // L2.c
    public final void onFailure(C1797a c1797a) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
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

    public final /* synthetic */ Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        try {
            this.zzc.getClass();
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

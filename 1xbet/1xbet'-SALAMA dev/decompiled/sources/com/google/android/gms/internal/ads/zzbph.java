package com.google.android.gms.internal.ads;

import J2.j;
import L2.c;
import android.os.RemoteException;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
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
    public final void onFailure(C1057a c1057a) {
        try {
            String canonicalName = this.zzb.getClass().getCanonicalName();
            int iA = c1057a.a();
            String str = c1057a.f18145b;
            j.b(canonicalName + "failed to load mediation ad: ErrorCode = " + iA + ". ErrorMessage = " + str + ". ErrorDomain = " + c1057a.f18146c);
            this.zza.zzh(c1057a.b());
            this.zza.zzi(c1057a.a(), str);
            this.zza.zzg(c1057a.a());
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
        onFailure(new C1057a(0, str, "undefined", null));
    }
}

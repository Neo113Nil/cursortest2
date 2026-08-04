package com.google.android.gms.internal.ads;

import E2.o;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes.dex */
final class zzbrf implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbrg zzb;

    public zzbrf(zzbrg zzbrgVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbrgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1009l0 c1009l0 = o.f1952C.f1956b;
        C1009l0.o(this.zzb.zza, this.zza, true, null);
    }
}

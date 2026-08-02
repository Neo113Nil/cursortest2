package com.google.android.gms.internal.ads;

import E2.o;
import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import w1.C1718l0;

/* loaded from: classes.dex */
final class zzbrf implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbrg zzb;

    public zzbrf(zzbrg zzbrgVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = zzbrgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        C1718l0 c1718l0 = o.f1952C.f1956b;
        activity = this.zzb.zza;
        C1718l0.o(activity, this.zza, true, null);
    }
}

package com.google.android.gms.internal.ads;

import F2.M;
import F2.O0;
import J2.j;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
final class zzbhl implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ M zzb;
    final /* synthetic */ zzbhm zzc;

    public zzbhl(zzbhm zzbhmVar, AdManagerAdView adManagerAdView, M m7) {
        this.zza = adManagerAdView;
        this.zzb = m7;
        this.zzc = zzbhmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdManagerAdView adManagerAdView = this.zza;
        M m7 = this.zzb;
        O0 o02 = adManagerAdView.f18174a;
        o02.getClass();
        try {
            InterfaceC1506a zzn = m7.zzn();
            if (zzn != null && ((View) BinderC1507b.t0(zzn)).getParent() == null) {
                o02.f2626l.addView((View) BinderC1507b.t0(zzn));
                o02.f2624i = m7;
                zzbhm.zzc(this.zzc);
                throw null;
            }
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
        j.g("Could not bind.");
    }
}

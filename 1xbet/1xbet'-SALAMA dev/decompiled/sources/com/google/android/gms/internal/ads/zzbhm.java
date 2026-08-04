package com.google.android.gms.internal.ads;

import B2.c;
import F2.M;
import F2.h1;
import J2.d;
import J2.j;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;

/* JADX INFO: loaded from: classes.dex */
public final class zzbhm extends zzbgt {
    private final c zza;

    public zzbhm(c cVar) {
    }

    public static /* bridge */ /* synthetic */ c zzc(zzbhm zzbhmVar) {
        zzbhmVar.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgu
    public final void zze(M m7, p105o3.a aVar) {
        if (m7 == null || aVar == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) p105o3.b.t0(aVar));
        try {
            if (m7.zzi() instanceof h1) {
                h1 h1Var = (h1) m7.zzi();
                adManagerAdView.setAdListener(h1Var != null ? h1Var.f2674a : null);
            }
        } catch (RemoteException e7) {
            j.e("", e7);
        }
        try {
            if (m7.zzj() instanceof zzayl) {
                zzayl zzaylVar = (zzayl) m7.zzj();
                adManagerAdView.setAppEventListener(zzaylVar != null ? zzaylVar.zzb() : null);
            }
        } catch (RemoteException e8) {
            j.e("", e8);
        }
        d.f3805b.post(new zzbhl(this, adManagerAdView, m7));
    }
}

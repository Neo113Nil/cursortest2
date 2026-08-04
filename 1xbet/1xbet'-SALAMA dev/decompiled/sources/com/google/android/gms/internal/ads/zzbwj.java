package com.google.android.gms.internal.ads;

import J2.j;
import W5.AbstractC0486a1;
import android.os.RemoteException;
import com.google.android.gms.common.internal.D;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
public final class zzbwj {
    private final zzbou zza;

    public zzbwj(zzbou zzbouVar) {
        this.zza = zzbouVar;
    }

    public final void onAdClosed() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToShow(C1057a c1057a) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdFailedToShow.");
        StringBuilder sbJ = AbstractC0486a1.j(c1057a.a(), "Mediation ad failed to show: Error Code = ", ". Error Message = ");
        sbJ.append(c1057a.f18145b);
        sbJ.append(" Error Domain = ");
        sbJ.append(c1057a.f18146c);
        j.g(sbJ.toString());
        try {
            this.zza.zzk(c1057a.b());
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdOpened() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onUserEarnedReward() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzu();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoComplete() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onVideoComplete.");
        try {
            this.zza.zzv();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoStart() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onVideoStart.");
        try {
            this.zza.zzz();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void reportAdClicked() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void reportAdImpression() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onUserEarnedReward(S2.b bVar) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzt(new zzbwk(bVar));
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToShow(String str) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdFailedToShow.");
        j.g("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzl(str);
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }
}

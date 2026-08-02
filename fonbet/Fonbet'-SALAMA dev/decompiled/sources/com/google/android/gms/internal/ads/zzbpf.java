package com.google.android.gms.internal.ads;

import J2.j;
import W5.AbstractC0486a1;
import android.os.RemoteException;
import com.google.android.gms.common.internal.D;
import y2.C1797a;

/* loaded from: classes.dex */
public final class zzbpf {
    private final zzbou zza;

    public zzbpf(zzbou zzbouVar) {
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

    public final void onAdFailedToShow(C1797a c1797a) {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdFailedToShow.");
        StringBuilder j = AbstractC0486a1.j(c1797a.a(), "Mediation ad failed to show: Error Code = ", ". Error Message = ");
        j.append(c1797a.f18139b);
        j.append(" Error Domain = ");
        j.append(c1797a.f18140c);
        j.g(j.toString());
        try {
            this.zza.zzk(c1797a.b());
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
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

    public final void onVideoComplete() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onVideoComplete.");
        try {
            this.zza.zzv();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onVideoPause.");
        try {
            this.zza.zzx();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoPlay() {
        D.d("#008 Must be called on the main UI thread.");
        j.b("Adapter called onVideoPlay.");
        try {
            this.zza.zzy();
        } catch (RemoteException e7) {
            j.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoUnmute() {
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

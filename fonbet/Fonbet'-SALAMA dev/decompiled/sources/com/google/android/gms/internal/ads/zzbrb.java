package com.google.android.gms.internal.ads;

import J2.j;
import android.os.RemoteException;
import y2.C1797a;

/* loaded from: classes.dex */
final class zzbrb {
    final zzbou zza;

    public zzbrb(zzbou zzbouVar) {
        this.zza = zzbouVar;
    }

    public final void onAdClosed() {
        try {
            this.zza.zzf();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(C1797a c1797a) {
        try {
            j.g("Mediated ad failed to show: Error Code = " + c1797a.a() + ". Error Message = " + c1797a.f18139b + " Error Domain = " + c1797a.f18140c);
            this.zza.zzk(c1797a.b());
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.zza.zzn();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.zza.zzp();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward() {
        try {
            this.zza.zzu();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.zza.zzw();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        try {
            this.zza.zzx();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoPlay() {
        try {
            this.zza.zzy();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.zza.zzz();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.zza.zze();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.zza.zzm();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(S2.b bVar) {
        try {
            this.zza.zzt(new zzbwk(bVar));
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            j.g("Mediated ad failed to show: " + str);
            this.zza.zzl(str);
        } catch (RemoteException unused) {
        }
    }
}

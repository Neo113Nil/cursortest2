package F2;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends p167y2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2613a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p167y2.d f2614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0 f2615c;

    public N0(O0 o7) {
        this.f2615c = o7;
    }

    @Override // p167y2.d
    public final void onAdClicked() {
        synchronized (this.f2613a) {
            try {
                p167y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p167y2.d
    public final void onAdClosed() {
        synchronized (this.f2613a) {
            try {
                p167y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p167y2.d
    public final void onAdFailedToLoad(p167y2.n nVar) {
        O0 o7 = this.f2615c;
        p167y2.y yVar = o7.f2618c;
        M m7 = o7.f2624i;
        I0 i0Zzl = null;
        if (m7 != null) {
            try {
                i0Zzl = m7.zzl();
            } catch (RemoteException e7) {
                J2.j.i("#007 Could not call remote method.", e7);
            }
        }
        yVar.a(i0Zzl);
        synchronized (this.f2613a) {
            try {
                p167y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdFailedToLoad(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p167y2.d
    public final void onAdImpression() {
        synchronized (this.f2613a) {
            try {
                p167y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p167y2.d
    public final void onAdLoaded() {
        O0 o7 = this.f2615c;
        p167y2.y yVar = o7.f2618c;
        M m7 = o7.f2624i;
        I0 i0Zzl = null;
        if (m7 != null) {
            try {
                i0Zzl = m7.zzl();
            } catch (RemoteException e7) {
                J2.j.i("#007 Could not call remote method.", e7);
            }
        }
        yVar.a(i0Zzl);
        synchronized (this.f2613a) {
            try {
                p167y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p167y2.d
    public final void onAdOpened() {
        synchronized (this.f2613a) {
            try {
                p167y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

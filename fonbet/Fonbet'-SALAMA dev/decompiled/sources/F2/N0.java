package F2;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class N0 extends y2.d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2613a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public y2.d f2614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0 f2615c;

    public N0(O0 o02) {
        this.f2615c = o02;
    }

    @Override // y2.d
    public final void onAdClicked() {
        synchronized (this.f2613a) {
            try {
                y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.d
    public final void onAdClosed() {
        synchronized (this.f2613a) {
            try {
                y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.d
    public final void onAdFailedToLoad(y2.n nVar) {
        O0 o02 = this.f2615c;
        y2.y yVar = o02.f2618c;
        M m7 = o02.f2624i;
        I0 i02 = null;
        if (m7 != null) {
            try {
                i02 = m7.zzl();
            } catch (RemoteException e7) {
                J2.j.i("#007 Could not call remote method.", e7);
            }
        }
        yVar.a(i02);
        synchronized (this.f2613a) {
            try {
                y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdFailedToLoad(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.d
    public final void onAdImpression() {
        synchronized (this.f2613a) {
            try {
                y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.d
    public final void onAdLoaded() {
        O0 o02 = this.f2615c;
        y2.y yVar = o02.f2618c;
        M m7 = o02.f2624i;
        I0 i02 = null;
        if (m7 != null) {
            try {
                i02 = m7.zzl();
            } catch (RemoteException e7) {
                J2.j.i("#007 Could not call remote method.", e7);
            }
        }
        yVar.a(i02);
        synchronized (this.f2613a) {
            try {
                y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y2.d
    public final void onAdOpened() {
        synchronized (this.f2613a) {
            try {
                y2.d dVar = this.f2614b;
                if (dVar != null) {
                    dVar.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

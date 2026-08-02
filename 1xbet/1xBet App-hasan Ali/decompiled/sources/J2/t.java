package J2;

import Q2.C0;
import Q2.K;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0802bc;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2732k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f2733l;

    public /* synthetic */ t(l lVar, int i) {
        this.f2732k = i;
        this.f2733l = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2732k) {
            case 0:
                l lVar = this.f2733l;
                try {
                    C0 c02 = lVar.f2723k;
                    c02.getClass();
                    try {
                        K k5 = (K) c02.i;
                        if (k5 != null) {
                            k5.D();
                            break;
                        }
                    } catch (RemoteException e3) {
                        U2.j.k("#007 Could not call remote method.", e3);
                        return;
                    }
                } catch (IllegalStateException e5) {
                    C0802bc.a(lVar.getContext()).b("BaseAdView.resume", e5);
                    return;
                }
                break;
            case 1:
                l lVar2 = this.f2733l;
                try {
                    C0 c03 = lVar2.f2723k;
                    c03.getClass();
                    try {
                        K k6 = (K) c03.i;
                        if (k6 != null) {
                            k6.v();
                            break;
                        }
                    } catch (RemoteException e6) {
                        U2.j.k("#007 Could not call remote method.", e6);
                        return;
                    }
                } catch (IllegalStateException e7) {
                    C0802bc.a(lVar2.getContext()).b("BaseAdView.destroy", e7);
                    return;
                }
                break;
            default:
                l lVar3 = this.f2733l;
                try {
                    C0 c04 = lVar3.f2723k;
                    c04.getClass();
                    try {
                        K k7 = (K) c04.i;
                        if (k7 != null) {
                            k7.j1();
                            break;
                        }
                    } catch (RemoteException e8) {
                        U2.j.k("#007 Could not call remote method.", e8);
                        return;
                    }
                } catch (IllegalStateException e9) {
                    C0802bc.a(lVar3.getContext()).b("BaseAdView.pause", e9);
                }
                break;
        }
    }
}

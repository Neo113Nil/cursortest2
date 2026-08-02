package com.google.ads.mediation;

import J2.m;
import U2.j;
import W2.l;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0767am;
import com.google.android.gms.internal.ads.C0905dr;
import com.google.android.gms.internal.ads.C1529ro;
import com.google.android.gms.internal.ads.InterfaceC0659Pa;
import m3.v;

/* loaded from: classes.dex */
public final class e extends J2.d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7430k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7431l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7432m;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f7431l = abstractAdViewAdapter;
        this.f7432m = lVar;
    }

    @Override // J2.d
    public void a() {
        switch (this.f7430k) {
            case 0:
                C0905dr c0905dr = (C0905dr) ((l) this.f7432m);
                c0905dr.getClass();
                v.c("#008 Must be called on the main UI thread.");
                j.d("Adapter called onAdClosed.");
                try {
                    ((InterfaceC0659Pa) c0905dr.f13186l).c();
                    break;
                } catch (RemoteException e3) {
                    j.k("#007 Could not call remote method.", e3);
                    return;
                }
        }
    }

    @Override // J2.d
    public final void b(m mVar) {
        switch (this.f7430k) {
            case 0:
                ((C0905dr) ((l) this.f7432m)).l(mVar);
                break;
            default:
                ((BinderC0767am) this.f7432m).z3(BinderC0767am.y3(mVar), (String) this.f7431l);
                break;
        }
    }

    @Override // J2.d
    public void d() {
        switch (this.f7430k) {
            case 0:
                C0905dr c0905dr = (C0905dr) ((l) this.f7432m);
                c0905dr.getClass();
                v.c("#008 Must be called on the main UI thread.");
                a aVar = (a) c0905dr.f13187m;
                if (((C1529ro) c0905dr.f13188n) == null) {
                    if (aVar != null) {
                        if (!aVar.f7424m) {
                            j.d("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                            break;
                        }
                    } else {
                        j.k("#007 Could not call remote method.", null);
                        break;
                    }
                }
                j.d("Adapter called onAdImpression.");
                try {
                    ((InterfaceC0659Pa) c0905dr.f13186l).l();
                    break;
                } catch (RemoteException e3) {
                    j.k("#007 Could not call remote method.", e3);
                    return;
                }
        }
    }

    @Override // J2.d
    public void i() {
        int i = this.f7430k;
    }

    @Override // J2.d
    public void j() {
        switch (this.f7430k) {
            case 0:
                C0905dr c0905dr = (C0905dr) ((l) this.f7432m);
                c0905dr.getClass();
                v.c("#008 Must be called on the main UI thread.");
                j.d("Adapter called onAdOpened.");
                try {
                    ((InterfaceC0659Pa) c0905dr.f13186l).r();
                    break;
                } catch (RemoteException e3) {
                    j.k("#007 Could not call remote method.", e3);
                    return;
                }
        }
    }

    @Override // J2.d
    public void z() {
        switch (this.f7430k) {
            case 0:
                C0905dr c0905dr = (C0905dr) ((l) this.f7432m);
                c0905dr.getClass();
                v.c("#008 Must be called on the main UI thread.");
                a aVar = (a) c0905dr.f13187m;
                if (((C1529ro) c0905dr.f13188n) == null) {
                    if (aVar != null) {
                        if (!aVar.f7425n) {
                            j.d("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                            break;
                        }
                    } else {
                        j.k("#007 Could not call remote method.", null);
                        break;
                    }
                }
                j.d("Adapter called onAdClicked.");
                try {
                    ((InterfaceC0659Pa) c0905dr.f13186l).b();
                    break;
                } catch (RemoteException e3) {
                    j.k("#007 Could not call remote method.", e3);
                    return;
                }
        }
    }

    public e(BinderC0767am binderC0767am, String str) {
        this.f7431l = str;
        this.f7432m = binderC0767am;
    }

    private final void k() {
    }
}

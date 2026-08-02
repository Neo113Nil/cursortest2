package com.google.android.gms.internal.ads;

import android.content.Context;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939eg implements Wh {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13322k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f13323l;

    public /* synthetic */ C0939eg(int i, Object obj) {
        this.f13322k = i;
        this.f13323l = obj;
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void d(Context context) {
        switch (this.f13322k) {
            case 0:
                try {
                    try {
                        ((C0950er) this.f13323l).f13363a.n();
                        return;
                    } catch (Throwable th) {
                        throw new Yq(th);
                    }
                } catch (Yq e3) {
                    U2.j.j("Cannot invoke onDestroy for the mediation adapter.", e3);
                    return;
                }
            default:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f13323l;
                if (interfaceC0677Re != null) {
                    interfaceC0677Re.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void j(Context context) {
        switch (this.f13322k) {
            case 0:
                InterfaceC0638Ma interfaceC0638Ma = ((C0950er) this.f13323l).f13363a;
                try {
                    try {
                        interfaceC0638Ma.K();
                        if (context != null) {
                            try {
                                interfaceC0638Ma.P1(new BinderC2361b(context));
                                return;
                            } catch (Throwable th) {
                                throw new Yq(th);
                            }
                        }
                        return;
                    } finally {
                        Yq yq = new Yq(th);
                    }
                } catch (Yq e3) {
                    U2.j.j("Cannot invoke onResume for the mediation adapter.", e3);
                    return;
                }
            default:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f13323l;
                if (interfaceC0677Re != null) {
                    interfaceC0677Re.onResume();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Wh
    public final void u(Context context) {
        switch (this.f13322k) {
            case 0:
                try {
                    try {
                        ((C0950er) this.f13323l).f13363a.k1();
                        return;
                    } catch (Throwable th) {
                        throw new Yq(th);
                    }
                } catch (Yq e3) {
                    U2.j.j("Cannot invoke onPause for the mediation adapter.", e3);
                    return;
                }
            default:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f13323l;
                if (interfaceC0677Re != null) {
                    interfaceC0677Re.onPause();
                    return;
                }
                return;
        }
    }
}

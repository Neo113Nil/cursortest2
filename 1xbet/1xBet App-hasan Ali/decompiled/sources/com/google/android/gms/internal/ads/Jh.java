package com.google.android.gms.internal.ads;

import Q2.InterfaceC0347a;
import android.os.RemoteException;
import d3.InterfaceC1915a;
import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class Jh implements Ei {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10039k;

    public /* synthetic */ Jh(int i) {
        this.f10039k = i;
    }

    private final void a(Object obj) {
        Do r22 = (Do) ((InterfaceC1254li) obj);
        synchronized (r22) {
            if (r22.f8368l.e()) {
                r22.f8368l.d();
            } else {
                r22.f8368l.c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public final void mo13k(Object obj) {
        switch (this.f10039k) {
            case 0:
                ((InterfaceC0347a) obj).z();
                return;
            case 1:
                ((Qh) obj).a();
                return;
            case 2:
                ((Th) obj).q(AbstractC1803xs.I(11, null, null));
                return;
            case 3:
                ((Vh) obj).t();
                return;
            case 4:
                ((Mh) obj).i();
                return;
            case 5:
                ((Mh) obj).a();
                return;
            case 6:
                ((Mh) obj).p();
                return;
            case 7:
                ((Mh) obj).c();
                return;
            case 8:
                ((Mh) obj).b();
                return;
            case 9:
                ((InterfaceC0808bi) obj).j0();
                return;
            case 10:
                ((InterfaceC1915a) obj).d();
                return;
            case 11:
                ((InterfaceC1031gi) obj).f();
                return;
            case 12:
                ((S2.m) obj).N2();
                return;
            case 13:
                ((S2.m) obj).t1();
                return;
            case 14:
                ((S2.m) obj).Q1();
                return;
            case 15:
                ((S2.m) obj).Z2();
                return;
            case 16:
                ((S2.m) obj).h1();
                return;
            case 17:
                Do r02 = (Do) ((InterfaceC1254li) obj);
                synchronized (r02) {
                    try {
                        if (!r02.f8368l.e()) {
                            C1128iq c1128iq = r02.f8368l;
                            c1128iq.f14002h.p1(c1128iq.f14003j.a());
                            return;
                        }
                        Q2.a1 a1Var = r02.f8372p.f11944b;
                        AbstractC0579Dg abstractC0579Dg = r02.f8375s;
                        if (abstractC0579Dg != null && abstractC0579Dg.g() != null && r02.f8372p.f11957q) {
                            a1Var = AbstractC1668us.g(r02.f8367k, Collections.singletonList(r02.f8375s.g()));
                        }
                        r02.u3(a1Var);
                        Vq vq = r02.f8372p;
                        vq.f11956p = true;
                        try {
                            r02.v3(vq.f11943a);
                        } catch (RemoteException unused) {
                            U2.j.i("Failed to refresh the banner ad.");
                        }
                        r02.f8372p.f11956p = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 18:
                a(obj);
                return;
            case 19:
                ((InterfaceC1613ti) obj).i();
                return;
            case 20:
                ((InterfaceC1703vi) obj).e();
                return;
            case C1639u7.zzm /* 21 */:
                ((InterfaceC1703vi) obj).h();
                return;
            case 22:
                ((Bi) obj).g();
                return;
            case 23:
                ((Di) obj).i();
                return;
            case 24:
                ((Ji) obj).d("MalformedJson");
                return;
            case 25:
                ((Ji) obj).c();
                return;
            case 26:
                ((Ji) obj).b();
                return;
            case 27:
                ((Ki) obj).o();
                return;
            case 28:
                ((Ki) obj).k();
                return;
            default:
                ((Ni) obj).i();
                return;
        }
    }
}

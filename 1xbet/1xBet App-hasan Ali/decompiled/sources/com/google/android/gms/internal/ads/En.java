package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
public final /* synthetic */ class En implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8592c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8594e;
    public final /* synthetic */ Object f;

    public /* synthetic */ En(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f8590a = i;
        this.f8591b = obj;
        this.f8592c = obj2;
        this.f8593d = obj3;
        this.f8594e = obj4;
        this.f = obj5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        C0777aw a5;
        switch (this.f8590a) {
            case 0:
                Uri uri = (Uri) this.f8592c;
                Sq sq = (Sq) this.f8593d;
                Lq lq = (Lq) this.f8594e;
                Nq nq = (Nq) this.f;
                Fn fn = (Fn) this.f8591b;
                fn.getClass();
                try {
                    Intent intent = (Intent) new P.W(6).a().f1749l;
                    intent.setData(uri);
                    S2.e eVar = new S2.e(intent, null);
                    C0634Ld c0634Ld = new C0634Ld();
                    C0608Hf a6 = ((C0622Jf) fn.f9117c).a(new C0905dr(sq, lq, (String) null), new C1390oj(17, new C1390oj(26, fn, c0634Ld), (Object) null));
                    c0634Ld.b(new AdOverlayInfoParcel(eVar, null, (C1076hi) a6.K.d(), null, new U2.a(0, 0, false, false), null, null, nq.f10823b));
                    ((Kq) fn.f9119e).d(2, 3);
                    return AbstractC1400ot.c0(a6.q0());
                } catch (Throwable th) {
                    U2.j.g("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            default:
                C1324n6 c1324n6 = (C1324n6) this.f8591b;
                C1390oj c1390oj = (C1390oj) this.f8592c;
                C1172jq c1172jq = (C1172jq) this.f8593d;
                InterfaceC1576sq interfaceC1576sq = (InterfaceC1576sq) this.f8594e;
                InterfaceC0588Eh interfaceC0588Eh = (InterfaceC0588Eh) this.f;
                C1262lq c1262lq = (C1262lq) obj;
                if (c1262lq != null) {
                    c1324n6.getClass();
                    C1172jq c1172jq2 = new C1172jq(c1172jq.f14165a, c1172jq.f14166b, c1172jq.f14167c, c1172jq.f14168d, c1172jq.f14169e, c1172jq.f, c1262lq.f14432a);
                    if (c1262lq.f14434c != null) {
                        c1324n6.f14582o = null;
                        ((C1245lH) c1324n6.f14580m).g(c1172jq2);
                        return c1324n6.q(c1262lq.f14434c, c1390oj);
                    }
                    C1245lH c1245lH = (C1245lH) c1324n6.f14580m;
                    synchronized (c1245lH) {
                        c1245lH.f14376k = 2;
                        a5 = c1245lH.i() ? null : ((Fs) c1245lH.f14380o).a(c1172jq2);
                    }
                    if (a5 != null) {
                        c1324n6.f14582o = null;
                        return AbstractC1400ot.j0(a5, new N9(14, c1324n6), (Qw) c1324n6.f14583p);
                    }
                    ((C1245lH) c1324n6.f14580m).g(c1172jq2);
                    c1390oj = new C1390oj(29, (InterfaceC1531rq) c1390oj.f14828m, c1262lq.f14433b, false);
                }
                E3.a m5 = ((C0709Wb) c1324n6.f14578k).m(c1390oj, interfaceC1576sq, interfaceC0588Eh);
                c1324n6.f14582o = interfaceC0588Eh;
                return m5;
        }
    }
}

package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395oo implements InterfaceC1259ln {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14851a;

    /* renamed from: b, reason: collision with root package name */
    public final Qw f14852b;

    /* renamed from: c, reason: collision with root package name */
    public final Gr f14853c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14854d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14855e;

    public /* synthetic */ C1395oo(Gr gr, Qw qw, Object obj, Object obj2, int i) {
        this.f14851a = i;
        this.f14853c = gr;
        this.f14852b = qw;
        this.f14855e = obj2;
        this.f14854d = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        Pq pq;
        switch (this.f14851a) {
            case 0:
                return !lq.f10525t.isEmpty();
            default:
                return (((N7) this.f14854d) == null || (pq = lq.f10523s) == null || pq.f11126a == null) ? false : true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.Zh] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        C1394on c1394on;
        switch (this.f14851a) {
            case 0:
                Iterator it = lq.f10525t.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            c1394on = ((InterfaceC1349nn) this.f14854d).a((String) it.next(), lq.f10529v);
                        } catch (Yq unused) {
                        }
                    } else {
                        c1394on = null;
                    }
                }
                C1394on c1394on2 = c1394on;
                if (c1394on2 == null) {
                    return AbstractC1400ot.Z(new Rn("Unable to instantiate mediation adapter class.", 3));
                }
                C0634Ld c0634Ld = new C0634Ld();
                c1394on2.f14850c.Y(new D3.l(c1394on2, c0634Ld));
                if (lq.f10475M) {
                    Bundle bundle = ((Wq) sq.f11595a.f11722l).f12098d.f4969w;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                Dr dr = Dr.f8400x;
                Xp xp = new Xp(2, new m2.g(this, sq, lq, c1394on2, 11, false));
                Mw mw = Gr.f9278d;
                List list = Collections.EMPTY_LIST;
                E3.a d5 = ((C0606Hd) this.f14852b).d(xp);
                Gr gr = this.f14853c;
                C1324n6 c1324n6 = new C1324n6(gr, dr, null, mw, list, d5);
                C1324n6 a5 = gr.a(c1324n6.a(), Dr.f8401y);
                C1537rw j02 = AbstractC1400ot.j0((E3.a) a5.f14582o, new C0581Ea(1, c0634Ld), AbstractC0613Id.f9544g);
                E3.a aVar = (E3.a) a5.f14579l;
                List list2 = (List) a5.f14581n;
                Gr gr2 = (Gr) a5.f14583p;
                C1324n6 c1324n62 = new C1324n6(gr2, a5.f14580m, (String) a5.f14578k, aVar, list2, j02);
                return gr2.a(c1324n62.a(), Dr.f8402z).n(new C1071hd(this, sq, lq, c1394on2, 12)).a();
            default:
                C0634Ld c0634Ld2 = new C0634Ld();
                C1619to c1619to = new C1619to();
                C0375o c0375o = new C0375o(this, c0634Ld2, sq, lq, c1619to, 10, false);
                synchronized (c1619to) {
                    c1619to.f15729k = c0375o;
                }
                Pq pq = lq.f10523s;
                M7 m7 = new M7(c1619to, pq.f11127b, pq.f11126a);
                Dr dr2 = Dr.f8379A;
                C1390oj c1390oj = new C1390oj(28, this, m7);
                Gr gr3 = this.f14853c;
                Qw qw = this.f14852b;
                C1324n6 c1324n63 = new C1324n6(gr3, dr2, null, Gr.f9278d, Collections.EMPTY_LIST, ((C0606Hd) qw).d(new Xp(2, c1390oj)));
                C1324n6 a6 = gr3.a(c1324n63.a(), Dr.f8380B);
                C1537rw j03 = AbstractC1400ot.j0((E3.a) a6.f14582o, new C0581Ea(1, c0634Ld2), AbstractC0613Id.f9544g);
                return new C1324n6((Gr) a6.f14583p, a6.f14580m, (String) a6.f14578k, (E3.a) a6.f14579l, (List) a6.f14581n, j03).a();
        }
    }
}

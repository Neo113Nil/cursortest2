package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Fn implements InterfaceC1259ln {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9115a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9116b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9117c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9118d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9119e;
    public final Object f;

    public Fn(Context context, C0594Ff c0594Ff, Gr gr, Qw qw, N7 n7) {
        this.f9116b = context;
        this.f9117c = c0594Ff;
        this.f = gr;
        this.f9119e = qw;
        this.f9118d = n7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        String str;
        Pq pq;
        switch (this.f9115a) {
            case 0:
                Context context = this.f9116b;
                if ((context instanceof Activity) && Q7.a(context)) {
                    try {
                        str = lq.f10529v.getString("tab_url");
                    } catch (Exception unused) {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                    }
                }
                break;
            default:
                if (((N7) this.f9118d) == null || (pq = lq.f10523s) == null || pq.f11126a == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        String str;
        switch (this.f9115a) {
            case 0:
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Ec)).booleanValue()) {
                    C1390oj a5 = ((C1482ql) this.f).a();
                    a5.k("action", "cstm_tbs_rndr");
                    a5.q();
                }
                try {
                    str = lq.f10529v.getString("tab_url");
                } catch (Exception unused) {
                    str = null;
                }
                return AbstractC1400ot.j0(Mw.f10750l, new En(this, str != null ? Uri.parse(str) : null, sq, lq, (Nq) sq.f11596b.f13762m, 0), (Executor) this.f9118d);
            default:
                C1485qo c1485qo = new C1485qo(new View(this.f9116b), null, new Oi(20), (Mq) lq.f10527u.get(0));
                C0905dr c0905dr = new C0905dr(sq, lq, (String) null);
                C0594Ff c0594Ff = (C0594Ff) this.f9117c;
                C0586Ef c0586Ef = new C0586Ef(c0594Ff.f9016d, c0594Ff.f9019e, c0905dr, c1485qo);
                Kh kh = (Kh) c0586Ef.f8536A.d();
                Uh uh = (Uh) c0586Ef.f8539D.d();
                Wi wi = (Wi) c0586Ef.f8541F.d();
                Ti ti = (Ti) c0586Ef.f8548O.d();
                C1656ug c1656ug = (C1656ug) c0586Ef.f8556n.d();
                C1324n6 c1324n6 = new C1324n6();
                c1324n6.f14583p = new AtomicBoolean(false);
                c1324n6.f14578k = kh;
                c1324n6.f14579l = uh;
                c1324n6.f14580m = wi;
                c1324n6.f14581n = ti;
                c1324n6.f14582o = c1656ug;
                Pq pq = lq.f10523s;
                M7 m7 = new M7(c1324n6, pq.f11127b, pq.f11126a);
                Dr dr = Dr.f8379A;
                Xp xp = new Xp(2, new C0709Wb(27, this, m7));
                Mw mw = Gr.f9278d;
                List list = Collections.EMPTY_LIST;
                E3.a d5 = ((C0606Hd) ((Qw) this.f9119e)).d(xp);
                Gr gr = (Gr) this.f;
                C1324n6 a6 = gr.a(new C1324n6(gr, dr, null, mw, list, d5).a(), Dr.f8380B);
                return new C1324n6((Gr) a6.f14583p, a6.f14580m, (String) a6.f14578k, (E3.a) a6.f14579l, (List) a6.f14581n, AbstractC1400ot.j0((E3.a) a6.f14582o, new C0581Ea(1, AbstractC1400ot.c0(c0586Ef.q0())), AbstractC0613Id.f9544g)).a();
        }
    }

    public Fn(Context context, Executor executor, C0622Jf c0622Jf, Kq kq, C1482ql c1482ql) {
        this.f9116b = context;
        this.f9117c = c0622Jf;
        this.f9118d = executor;
        this.f9119e = kq;
        this.f = c1482ql;
    }
}

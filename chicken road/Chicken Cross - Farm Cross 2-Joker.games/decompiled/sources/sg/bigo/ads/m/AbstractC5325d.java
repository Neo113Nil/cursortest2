package sg.bigo.ads.m;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.AbstractC5164f1;
import sg.bigo.ads.h.E1;
import sg.bigo.ads.h.O1;
import sg.bigo.ads.u.AbstractC5490k;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.m.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5325d extends O1 {
    public final sg.bigo.ads.h.Y i;
    public ViewGroup j;
    public ViewGroup k;
    public TextView l;
    public final sg.bigo.ads.q.o m;
    public final C5322a n;

    public AbstractC5325d(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, qVar);
        this.n = new C5322a(this);
        sg.bigo.ads.P.c e = lVar.e();
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.gp_element"));
        this.i = new sg.bigo.ads.h.Y(a2 != null ? a2.intValue() : 0, 0, e != null ? ((sg.bigo.ads.U0.b) e).U : "");
        this.m = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC5325d a(sg.bigo.ads.C.l lVar, sg.bigo.ads.T0.q qVar, C5485f c5485f, sg.bigo.ads.q.o oVar, boolean z) {
        if (qVar == null || z) {
            return null;
        }
        if (lVar instanceof sg.bigo.ads.E.d) {
            return new f0(lVar, qVar, oVar);
        }
        if (lVar instanceof sg.bigo.ads.Q.d) {
            sg.bigo.ads.Q.d dVar = (sg.bigo.ads.Q.d) lVar;
            if (!dVar.b()) {
                return dVar.c() == 3 ? new y0(lVar, qVar, oVar) : new z0(lVar, qVar, oVar);
            }
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_layout"));
        int intValue = a2 != null ? a2.intValue() : 0;
        switch (intValue) {
            case 6:
                if (c5485f == null) {
                    return null;
                }
                return new C5314S(lVar, intValue, qVar, c5485f, oVar);
            case 7:
                if (c5485f == null) {
                    return null;
                }
                return new C5317V(lVar, intValue, qVar, c5485f, oVar);
            case 8:
                if (c5485f == null) {
                    return null;
                }
                return new C5321Z(lVar, intValue, qVar, c5485f, oVar);
            case 9:
                if (c5485f == null) {
                    return null;
                }
                return new d0(lVar, intValue, qVar, c5485f, oVar);
            case 10:
                if (c5485f == null) {
                    return null;
                }
                return new C5340s(lVar, intValue, qVar, c5485f, oVar);
            case 11:
                if (c5485f == null) {
                    return null;
                }
                return new C5341t(lVar, intValue, qVar, c5485f, oVar);
            case 12:
                if (c5485f == null) {
                    return null;
                }
                return new C5342u(lVar, intValue, qVar, c5485f, oVar);
            case 13:
                if (c5485f == null) {
                    return null;
                }
                return new C5343v(lVar, intValue, qVar, c5485f, oVar);
            case 14:
                return new C5297A(lVar, intValue, qVar, oVar);
            case 15:
                return new C5298B(lVar, intValue, qVar, oVar);
            case 16:
                return new C5301E(lVar, intValue, qVar, oVar);
            case 17:
                return new C5302F(lVar, intValue, qVar, oVar);
            case 18:
                return new C5305I(lVar, intValue, qVar, oVar);
            case 19:
                return new C5306J(lVar, intValue, qVar, oVar);
            case 20:
                return new C5307K(lVar, intValue, qVar, oVar);
            case 21:
                return new C5308L(lVar, intValue, qVar, oVar);
            case 22:
                return new C5309M(lVar, intValue, qVar, oVar);
            case 23:
                return new C5310N(lVar, intValue, qVar, oVar);
            case 24:
                return new C5311O(lVar, intValue, qVar, oVar);
            case 25:
                return new C5312P(lVar, intValue, qVar, oVar);
            default:
                return null;
        }
    }

    public abstract void a(double d);

    public abstract void a(int i, boolean z, boolean z2);

    public abstract void a(View view);

    public final int c(AbstractC5144a1 abstractC5144a1) {
        int i;
        sg.bigo.ads.T0.q qVar = this.e;
        if (qVar == null) {
            return -16736769;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.cta_color"));
        int intValue = a2 != null ? a2.intValue() : 0;
        return (intValue == 3 && d() && (i = O1.b(abstractC5144a1).o) != 0) ? i : AbstractC5164f1.a(this.d, intValue, null);
    }

    public final Pair d(AbstractC5144a1 abstractC5144a1) {
        return Pair.create(Integer.valueOf(c(abstractC5144a1)), Boolean.valueOf(g()));
    }

    public void e(AbstractC5144a1 abstractC5144a1) {
    }

    public abstract int f();

    public abstract void f(AbstractC5144a1 abstractC5144a1);

    public final boolean g() {
        sg.bigo.ads.T0.q qVar = this.e;
        return qVar != null && qVar.b("endpage.is_cta_show_animation") == 1;
    }

    public void h() {
        String str = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) this.d.e())).L;
        TextView textView = (TextView) this.k.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.k.findViewById(R.id.inter_ad_label);
        if (textView != null && TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            if (textView == null || textView2 == null) {
                return;
            }
            textView.setText(str);
            textView.setPadding(AbstractC4963u.a(this.k.getContext(), 4), AbstractC4963u.a(textView.getContext(), 1), AbstractC4963u.a(textView.getContext(), 4), AbstractC4963u.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
        }
    }

    public boolean i() {
        return this instanceof C5340s;
    }

    public boolean j() {
        return this instanceof f0;
    }

    public static boolean a(AbstractC5325d abstractC5325d, sg.bigo.ads.T0.q qVar) {
        if (abstractC5325d != null && abstractC5325d.d()) {
            return true;
        }
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_layout"));
            int intValue = a2 != null ? a2.intValue() : 0;
            if (intValue == 3 || intValue == 4) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        if ((r2 != null ? r2.intValue() : 0) == 1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View a(AbstractC5144a1 abstractC5144a1, ViewGroup viewGroup, int i) {
        String str;
        String str2;
        String str3;
        boolean z;
        sg.bigo.ads.T0.q qVar;
        Integer a2;
        Integer a3;
        if (abstractC5144a1 == null || viewGroup == null) {
            return this.j;
        }
        this.j = viewGroup;
        ViewGroup viewGroup2 = this.k;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        boolean z2 = false;
        ViewGroup viewGroup3 = (ViewGroup) AbstractC4944a.a(viewGroup.getContext(), f(), null, false);
        this.k = viewGroup3;
        this.j.addView(viewGroup3, new ViewGroup.LayoutParams(-1, -1));
        this.l = (TextView) this.k.findViewById(R.id.inter_warning);
        f(abstractC5144a1);
        sg.bigo.ads.K0.X.a(this.k, new C5323b(this));
        a(new RunnableC5324c(this));
        e(abstractC5144a1);
        if (j()) {
            str = "multi_ads_endpage.click_type";
            str2 = "multi_ads_endpage.media_view_clickable_switch";
            str3 = "multi_ads_endpage.other_space_clickable_switch";
        } else {
            str = "endpage.click_type";
            str2 = "endpage.media_view_clickable_switch";
            str3 = "endpage.other_space_clickable_switch";
        }
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        ViewGroup viewGroup4 = this.j;
        ViewGroup viewGroup5 = this.k;
        sg.bigo.ads.T0.q qVar2 = this.e;
        a(abstractC5144a1, viewGroup4, viewGroup5, (E1) null, i, 4, (qVar2 == null || (a3 = sg.bigo.ads.K0.z.a(qVar2.a(str4))) == null) ? 0 : a3.intValue(), this.k);
        h();
        sg.bigo.ads.T0.q qVar3 = this.e;
        int intValue = (qVar3 == null || (a2 = sg.bigo.ads.K0.z.a(qVar3.a(str4))) == null) ? 0 : a2.intValue();
        sg.bigo.ads.T0.q qVar4 = this.e;
        if (qVar4 != null) {
            Integer a4 = sg.bigo.ads.K0.z.a(qVar4.a(str5));
            if ((a4 != null ? a4.intValue() : 0) != 1) {
                z = false;
                qVar = this.e;
                if (qVar != null) {
                    Integer a5 = sg.bigo.ads.K0.z.a(qVar.a(str6));
                }
                z2 = true;
                a(intValue, z, z2);
                O1.b(abstractC5144a1).d().a(this.n);
                return this.k;
            }
        }
        z = true;
        qVar = this.e;
        if (qVar != null) {
        }
        z2 = true;
        a(intValue, z, z2);
        O1.b(abstractC5144a1).d().a(this.n);
        return this.k;
    }

    @Override // sg.bigo.ads.h.O1
    public final int c() {
        int i;
        sg.bigo.ads.T0.q qVar = this.e;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.mediaview_colour"));
            i = a2 != null ? a2.intValue() : 0;
        } else {
            i = 3;
        }
        return AbstractC5490k.a(i);
    }

    public void a(RunnableC5324c runnableC5324c) {
        AbstractC5140Q.a(this.k, this.j, runnableC5324c);
    }
}

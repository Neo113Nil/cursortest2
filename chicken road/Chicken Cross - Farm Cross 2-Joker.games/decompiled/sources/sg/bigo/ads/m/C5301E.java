package sg.bigo.ads.m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5140Q;
import sg.bigo.ads.h.AbstractC5144a1;

/* renamed from: sg.bigo.ads.m.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5301E extends C5297A {
    public View t;
    public RoundedImageView u;

    public C5301E(sg.bigo.ads.C.l lVar, int i, sg.bigo.ads.T0.q qVar, sg.bigo.ads.q.o oVar) {
        super(lVar, i, qVar, oVar);
    }

    @Override // sg.bigo.ads.m.C5297A, sg.bigo.ads.m.AbstractC5325d
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.m.C5297A, sg.bigo.ads.m.AbstractC5325d
    public final void a(int i, boolean z, boolean z2) {
        sg.bigo.ads.C.f.a(this.u, 5);
        if (z) {
            sg.bigo.ads.C.f.a(this.j, this.u, 4, this.d, i);
        } else {
            sg.bigo.ads.C.f.a(this.j, this.u, 4, AbstractC5144a1.p, 0);
        }
        sg.bigo.ads.C.f.a(this.t, 9);
        ViewGroup viewGroup = this.j;
        if (z2) {
            sg.bigo.ads.C.f.a(viewGroup, this.t, 4, this.d, i);
        } else {
            sg.bigo.ads.C.f.a(viewGroup, this.t, 4, AbstractC5144a1.p, 0);
        }
        sg.bigo.ads.T0.q qVar = this.e;
        boolean z3 = true;
        if (qVar != null) {
            Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("endpage.ad_component_clickable_switch"));
            if ((a2 != null ? a2.intValue() : 0) != 1) {
                z3 = false;
            }
        }
        View view = this.o;
        if (view != null) {
            sg.bigo.ads.C.f.a(view, 18);
            if (z3) {
                sg.bigo.ads.C.f.a(this.j, this.o, 8, this.d, i);
            } else {
                sg.bigo.ads.C.f.a(this.j, this.o, 8, AbstractC5144a1.p, 0);
            }
        }
    }

    @Override // sg.bigo.ads.h.O1
    public final boolean d() {
        InterfaceC5087a interfaceC5087a;
        sg.bigo.ads.C.l lVar = this.d;
        if (lVar == null || (interfaceC5087a = (InterfaceC5087a) lVar.e()) == null) {
            return true;
        }
        return ((sg.bigo.ads.U0.k) interfaceC5087a).p();
    }

    @Override // sg.bigo.ads.m.C5297A, sg.bigo.ads.m.AbstractC5325d
    public final int f() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_16_17;
    }

    @Override // sg.bigo.ads.m.C5297A
    public final void l() {
        View view = this.o;
        if (view != null) {
            view.setBackgroundColor(-1);
        }
    }

    @Override // sg.bigo.ads.m.C5297A, sg.bigo.ads.m.AbstractC5325d
    public final void f(AbstractC5144a1 abstractC5144a1) {
        super.f(abstractC5144a1);
        ViewGroup viewGroup = this.k;
        if (viewGroup == null) {
            return;
        }
        this.t = viewGroup.findViewById(R.id.inter_end_page_image_layout);
        this.u = (RoundedImageView) this.k.findViewById(R.id.inter_end_page_image);
        sg.bigo.ads.K0.X.a(this.t, new C5299C(this, abstractC5144a1));
        TextView textView = this.l;
        if (textView != null) {
            sg.bigo.ads.h.T.a(textView, sg.bigo.ads.E0.p.b(-1));
        }
    }

    @Override // sg.bigo.ads.m.C5297A, sg.bigo.ads.m.AbstractC5325d
    public final void a(RunnableC5324c runnableC5324c) {
        AbstractC5140Q.a(this.k, this.j, new RunnableC5300D(this, runnableC5324c));
    }
}

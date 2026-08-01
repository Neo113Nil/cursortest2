package sg.bigo.ads.q;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* renamed from: sg.bigo.ads.q.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5435f extends n {
    public boolean g;
    public final /* synthetic */ ViewGroup h;
    public final /* synthetic */ o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5435f(o oVar, ViewGroup viewGroup, sg.bigo.ads.r.d dVar, ViewGroup viewGroup2) {
        super(viewGroup, dVar);
        this.i = oVar;
        this.h = viewGroup2;
        this.g = false;
    }

    @Override // sg.bigo.ads.q.n
    public final void a(C5430a c5430a) {
        sg.bigo.ads.y.i iVar;
        RealtimeBlurLinearLayout realtimeBlurLinearLayout;
        ViewGroup viewGroup;
        super.a(c5430a);
        if (!this.g || (iVar = this.i.d) == null || (realtimeBlurLinearLayout = c5430a.f13238a) == null || (viewGroup = iVar.l) == null) {
            return;
        }
        Point a2 = X.a(viewGroup, realtimeBlurLinearLayout);
        iVar.s = new Rect(a2.x, a2.y, realtimeBlurLinearLayout.getMeasuredWidth() + a2.x, realtimeBlurLinearLayout.getMeasuredHeight() + a2.y);
        iVar.a(false);
    }

    @Override // sg.bigo.ads.q.n
    public final boolean a() {
        o oVar = this.i;
        if (oVar.e == null) {
            oVar.a(oVar.c, "icon ads is null", 2);
            return false;
        }
        if (oVar.n) {
            oVar.a(oVar.c, "page is Paused", 2);
            return false;
        }
        if (oVar.a()) {
            this.i.c();
            o oVar2 = this.i;
            oVar2.a(oVar2.c, "host ad is destroyed", 2);
            return true;
        }
        List a2 = o.a(this.i.e);
        if (A.a(a2)) {
            this.i.c();
            o oVar3 = this.i;
            oVar3.a(oVar3.c, "icon ads download failed", 2);
            return true;
        }
        boolean d = this.i.c.d();
        if (X.a(this.f13247a) && X.b(this.f13247a)) {
            o oVar4 = this.i;
            Ad ad = oVar4.e;
            if (ad instanceof sg.bigo.ads.Q.e) {
                ((sg.bigo.ads.Q.e) ad).j = 2;
            }
            Context context = this.f13247a.getContext();
            o oVar5 = this.i;
            oVar4.k = C5430a.a(context, oVar5.c, a2, oVar5.r);
            o oVar6 = this.i;
            Ad ad2 = oVar6.e;
            if (ad2 instanceof sg.bigo.ads.Q.e) {
                ((sg.bigo.ads.Q.e) ad2).k = d;
            }
            RealtimeBlurLinearLayout realtimeBlurLinearLayout = oVar6.k.f13238a;
            int a3 = this.b.a();
            if (a3 == 5 || a3 == 6) {
                View findViewById = this.h.findViewById(R.id.inter_icons_bottom_anchor);
                View findViewById2 = this.h.findViewById(R.id.inter_icons_center_anchor);
                if (findViewById != null) {
                    ViewParent parent = findViewById.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).addView(realtimeBlurLinearLayout, findViewById.getLayoutParams());
                    }
                }
                if (findViewById2 != null) {
                    C5430a c5430a = this.i.k;
                    ViewParent parent2 = findViewById2.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent2;
                        viewGroup.post(new l(this, realtimeBlurLinearLayout, viewGroup, findViewById2, c5430a));
                    }
                }
            } else {
                this.g = true;
                a(this.h, realtimeBlurLinearLayout, -234881024, this.i.k);
            }
            o.a(this.i, this.b, 2, a2);
            o oVar7 = this.i;
            oVar7.m = o.a(oVar7, oVar7.c, oVar7.r);
            C5436g c5436g = this.i.m;
            if (c5436g != null) {
                c5436g.e();
            }
        }
        this.i.c();
        return true;
    }
}

package sg.bigo.ads.q;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.R;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.r.C5448a;

/* renamed from: sg.bigo.ads.q.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5434e extends n {
    public final /* synthetic */ int g;
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5434e(o oVar, ViewGroup viewGroup, C5448a c5448a, int i) {
        super(viewGroup, c5448a);
        this.h = oVar;
        this.g = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0081, code lost:
    
        if (r2 == 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0089, code lost:
    
        if (r2 == 2) goto L40;
     */
    @Override // sg.bigo.ads.q.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        ViewGroup viewGroup;
        o oVar = this.h;
        if (oVar.e == null) {
            oVar.a(oVar.b, "icon ads is null", this.g);
            return false;
        }
        if (oVar.n) {
            oVar.a(oVar.b, "page is Paused", this.g);
            return false;
        }
        if (oVar.a()) {
            o oVar2 = this.h;
            oVar2.a(oVar2.b, "host ad is destroyed", this.g);
            this.h.b();
            return true;
        }
        List a2 = o.a(this.h.e);
        if (A.a(a2)) {
            o oVar3 = this.h;
            oVar3.a(oVar3.b, "icon ads download failed", this.g);
            this.h.b();
            return true;
        }
        boolean d = this.h.b.d();
        o oVar4 = this.h;
        int i = this.g;
        if (i != 1) {
            C5448a c5448a = oVar4.b;
            if (c5448a != null && d) {
                int i2 = c5448a.f13264a;
                int i3 = (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) ? i2 : 0;
                if (i == 4) {
                }
                if (i == 8) {
                    if (i3 != 1) {
                    }
                }
            }
            oVar4.a(c5448a, "icon ads can not show in this scene", i);
            this.h.b();
            return true;
        }
        oVar4.getClass();
        if (X.a(this.f13247a) && X.b(this.f13247a)) {
            o oVar5 = this.h;
            int i4 = this.g;
            Ad ad = oVar5.e;
            if (ad instanceof sg.bigo.ads.Q.e) {
                ((sg.bigo.ads.Q.e) ad).j = i4;
            }
            Context context = this.f13247a.getContext();
            o oVar6 = this.h;
            oVar5.j = C5430a.a(context, oVar6.b, a2, oVar6.q);
            o oVar7 = this.h;
            Ad ad2 = oVar7.e;
            if (ad2 instanceof sg.bigo.ads.Q.e) {
                ((sg.bigo.ads.Q.e) ad2).k = d;
            }
            ViewGroup viewGroup2 = this.f13247a;
            oVar7.getClass();
            if (d && (viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.word_icon_container)) != null) {
                viewGroup2 = viewGroup;
            }
            C5430a c5430a = this.h.j;
            a(viewGroup2, c5430a.f13238a, null, c5430a);
            o oVar8 = this.h;
            oVar8.l = o.a(oVar8, oVar8.b, oVar8.q);
            C5436g c5436g = this.h.l;
            if (c5436g != null) {
                c5436g.e();
            }
            o.a(this.h, this.b, this.g, a2);
        }
        this.h.b();
        return true;
    }
}

package sg.bigo.ads.D;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.P.u;
import sg.bigo.ads.api.AdIconView;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.d1.C5065a;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.s0.p;
import sg.bigo.ads.s0.y;
import sg.bigo.ads.s0.z;
import sg.bigo.ads.x1.q;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class h extends sg.bigo.ads.C.l implements z {
    public boolean k0;
    public boolean l0;

    public h(sg.bigo.ads.P.j jVar) {
        super(jVar);
        this.k0 = false;
        this.l0 = false;
    }

    @Override // sg.bigo.ads.e.h
    public final sg.bigo.ads.x1.f a(u uVar, q[] qVarArr, q[] qVarArr2, q[] qVarArr3, q[] qVarArr4) {
        return new sg.bigo.ads.x1.a(uVar, qVarArr, qVarArr2, qVarArr3, qVarArr4, sg.bigo.ads.s1.b.a(this.k.f12482a, (sg.bigo.ads.Q.b) this, true));
    }

    @Override // sg.bigo.ads.C.l
    public final void a(sg.bigo.ads.Q.c cVar, int i) {
        cVar.a(this);
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(int i, String str, y yVar) {
        this.l0 = true;
    }

    @Override // sg.bigo.ads.s0.z
    public final void a(Bitmap bitmap, y yVar) {
        String str = yVar.e;
        this.k0 = true;
    }

    @Override // sg.bigo.ads.C.l
    public final boolean a(int i, View view, ViewGroup viewGroup) {
        sg.bigo.ads.P.c cVar = (InterfaceC5087a) this.k.f12482a;
        boolean z = false;
        if (view != null && cVar != null) {
            view.setTag(1);
            if (sg.bigo.ads.C.l.a(viewGroup, view)) {
                sg.bigo.ads.U0.h hVar = ((sg.bigo.ads.U0.k) cVar).y0;
                if (hVar != null) {
                    String str = hVar.c;
                    if (sg.bigo.ads.O.g.f12472a.B.a(9) && URLUtil.isHttpUrl(str)) {
                        sg.bigo.ads.s1.b.a(3000, 10220, "Invalid http url: " + str, cVar);
                    } else {
                        int i2 = 40;
                        if (view instanceof ImageView) {
                            p pVar = new p((ImageView) view, 0);
                            pVar.a(this);
                            sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
                            if (jVar != null) {
                                z = jVar.a(18);
                            } else {
                                i2 = 5;
                            }
                            pVar.a(AbstractRunnableC5522h.a("IconCreativeNet", i2, z), hVar.c, ((sg.bigo.ads.U0.b) cVar).T);
                        } else if (view instanceof AdIconView) {
                            AdIconView adIconView = (AdIconView) view;
                            sg.bigo.ads.R0.j jVar2 = AbstractRunnableC5522h.e;
                            if (jVar2 != null) {
                                z = jVar2.a(18);
                            } else {
                                i2 = 5;
                            }
                            C5447k a2 = AbstractRunnableC5522h.a("IconCreativeNet", i2, z);
                            String str2 = hVar.c;
                            boolean z2 = ((sg.bigo.ads.U0.b) cVar).T;
                            C5065a c5065a = (C5065a) adIconView.getViewImpl();
                            c5065a.f12728a.removeAllViews();
                            AdImageView adImageView = new AdImageView(c5065a.f12728a.getContext());
                            adImageView.setIconTag(true);
                            adImageView.c.a(this);
                            X.a(adImageView, c5065a.f12728a, null, -1);
                            adImageView.c.a(a2, str2, z2);
                        }
                    }
                }
                sg.bigo.ads.C.f.a(viewGroup, view, i, this, this.f0);
                return true;
            }
        }
        return false;
    }
}

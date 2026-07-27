package sg.bigo.ads.D;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import sg.bigo.ads.C.t;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.d1.s;
import sg.bigo.ads.n1.o;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public class k extends t {
    public final sg.bigo.ads.T0.l u0;

    public k(sg.bigo.ads.P.j jVar) {
        super(jVar);
        sg.bigo.ads.T0.l lVar = jVar.b.w;
        this.u0 = lVar;
        this.f0 = lVar.c;
    }

    @Override // sg.bigo.ads.C.t
    public final void a(sg.bigo.ads.Q.c cVar, sg.bigo.ads.P.c cVar2, int i, boolean z) {
        q qVar = ((sg.bigo.ads.U0.b) cVar2).I;
        if (i == 0 && qVar != null) {
            Integer a2 = z.a(qVar.a("multi_ads.page_group_type"));
            if ((a2 != null ? a2.intValue() : 1) == 3) {
                cVar.a(this);
            }
        }
        super.a(cVar, cVar2, i, z);
    }

    @Override // sg.bigo.ads.C.t, sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.H) {
            return;
        }
        this.H = true;
        sg.bigo.ads.s1.b.a(this.k.f12482a, SystemClock.elapsedRealtime() - this.w);
    }

    @Override // sg.bigo.ads.C.l
    public final void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List list, int i, View... viewArr) {
        sg.bigo.ads.P.q qVar;
        o oVar;
        super.a(viewGroup, mediaView, view, adOptionsView, list, i, viewArr);
        if (this.u0.b) {
            sg.bigo.ads.C.f.a(viewGroup, viewGroup, i, this, this.f0);
        }
        if (this.u0.f12556a && mediaView != null) {
            ((s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(false);
        }
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        if (gVar != null && (qVar = gVar.B) != null && qVar.a(32) && (oVar = this.k0) != null && !this.s0) {
            this.s0 = true;
            oVar.g = this.a0;
        }
        AbstractC5446j.a(1, null, new j(this), 0L);
    }
}

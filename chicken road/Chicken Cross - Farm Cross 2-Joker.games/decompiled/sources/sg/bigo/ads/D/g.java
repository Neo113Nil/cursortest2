package sg.bigo.ads.D;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import sg.bigo.ads.C.t;
import sg.bigo.ads.F.r;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.d1.s;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class g extends t {
    public final a u0;
    public b v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;

    public g(sg.bigo.ads.P.j jVar) {
        super(jVar);
        this.w0 = false;
        this.x0 = false;
        this.y0 = false;
        this.u0 = new a(jVar);
    }

    @Override // sg.bigo.ads.C.l
    public final void B() {
        this.u0.a(this.v0, 0);
        r rVar = this.X;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // sg.bigo.ads.C.t
    public final sg.bigo.ads.z1.l E() {
        return new sg.bigo.ads.z1.l(0, 1);
    }

    @Override // sg.bigo.ads.e.h
    public final String o() {
        View view = this.l;
        return view == null ? "" : view.getWidth() > this.l.getHeight() * 2 ? "320x50" : "300x250";
    }

    @Override // sg.bigo.ads.C.t, sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void u() {
        if (this.W > 0) {
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.W);
            synchronized (this) {
                this.N.put("attach_render_cost", valueOf);
            }
        }
        super.u();
    }

    @Override // sg.bigo.ads.e.m
    public final void y() {
        super.y();
        this.u0.y();
    }

    @Override // sg.bigo.ads.C.t, sg.bigo.ads.C.l
    public final void a(sg.bigo.ads.Q.c cVar, int i) {
        b bVar = new b(this, cVar);
        this.v0 = bVar;
        super.a(bVar, i);
    }

    @Override // sg.bigo.ads.C.l
    public final void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List list, int i, View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i, viewArr);
        this.y0 = true;
        mediaView.setMediaAreaClickable(true);
        ((s) ((sg.bigo.ads.N.g) mediaView.getViewImpl())).a(false);
        X.a(this.l, this.Z);
    }

    @Override // sg.bigo.ads.C.t, sg.bigo.ads.C.l
    public final void a(MediaView mediaView) {
        Runnable fVar;
        if (mediaView == null) {
            return;
        }
        if (this.x0 && this.l0 != null) {
            fVar = new e(this, mediaView);
        } else if (!this.w0) {
            return;
        } else {
            fVar = new f(this, mediaView);
        }
        AbstractC5446j.b(fVar);
    }
}

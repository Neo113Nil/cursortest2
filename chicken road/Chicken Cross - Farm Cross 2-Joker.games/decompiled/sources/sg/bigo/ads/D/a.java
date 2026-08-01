package sg.bigo.ads.D;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class a extends sg.bigo.ads.C.l {
    public a(sg.bigo.ads.P.j jVar) {
        super(jVar);
    }

    @Override // sg.bigo.ads.C.l
    public final void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List list, int i, View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i, viewArr);
        X.a(this.l, this.Z);
    }

    @Override // sg.bigo.ads.e.h
    public final String o() {
        View view = this.l;
        return view == null ? "" : view.getWidth() > this.l.getHeight() * 2 ? "320x50" : "300x250";
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void u() {
        if (this.W > 0) {
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - this.W);
            synchronized (this) {
                this.N.put("attach_render_cost", valueOf);
            }
        }
        super.u();
    }

    @Override // sg.bigo.ads.C.l
    public final boolean a(int i, View view, ViewGroup viewGroup) {
        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) this.k.f12482a;
        if (view == null || interfaceC5087a == null) {
            return false;
        }
        view.setTag(1);
        sg.bigo.ads.C.l.a(viewGroup, view);
        sg.bigo.ads.C.f.a(viewGroup, view, i, this, this.f0);
        return true;
    }

    @Override // sg.bigo.ads.C.l
    public final void a(MediaView mediaView) {
        super.a(mediaView);
    }
}

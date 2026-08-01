package sg.bigo.ads.i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.i.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5235g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5236h f12982a;

    public RunnableC5235g(C5236h c5236h) {
        this.f12982a = c5236h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5236h c5236h = this.f12982a;
        if (c5236h.i || c5236h.j) {
            return;
        }
        c5236h.j = true;
        C5234f c5234f = c5236h.f;
        if (c5234f != null) {
            C5241m c5241m = c5236h.f12983a;
            if (c5241m.g == c5234f) {
                c5241m.g = null;
            }
            c5236h.f = null;
        }
        View view = c5236h.b;
        if (view != null) {
            view.setVisibility(8);
            X.c(c5236h.b);
            c5236h.b = null;
        }
        c5236h.c = null;
        C5236h c5236h2 = this.f12982a;
        ViewGroup viewGroup = c5236h2.d;
        if (viewGroup == null) {
            AbstractC5496a.a("ForcePlayableFallback", "attachPlayableView: playable slot is null");
        } else {
            View view2 = c5236h2.f12983a.p.o;
            if (view2 == null) {
                AbstractC5496a.a("ForcePlayableFallback", "attachPlayableView: adCompanionView is null after onLoaded");
            } else {
                X.c(view2);
                X.a(view2, viewGroup, new FrameLayout.LayoutParams(-1, -1, 17), -1);
            }
        }
        this.f12982a.f12983a.a(1);
        C5242n c5242n = this.f12982a.g;
        if (c5242n != null) {
            View view3 = c5242n.f12989a.p.o;
            if (view3 != null) {
                view3.setTag(19);
                H2 h2 = (H2) c5242n.b.f12990a.f12819a.get();
                if (h2 != null) {
                    h2.r0.f12816a.add(view3);
                }
            }
            H2 h22 = (H2) c5242n.b.f12990a.f12819a.get();
            C5185l1 c5185l1 = h22 != null ? (C5185l1) h22.e : null;
            if (c5185l1 == null || c5185l1.D() == null || c5185l1.D().getWatermarkView() == null) {
                return;
            }
            c5185l1.D().getWatermarkView().bringToFront();
        }
    }
}

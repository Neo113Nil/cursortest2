package sg.bigo.ads.n;

import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.h.AbstractC5164f1;

/* renamed from: sg.bigo.ads.n.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5386k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5388l0 f13177a;

    public RunnableC5386k0(C5388l0 c5388l0) {
        this.f13177a = c5388l0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5401s0 c5401s0 = this.f13177a.i;
        c5401s0.X = true;
        c5401s0.Y = true;
        c5401s0.u.post(new RunnableC5390m0(c5401s0));
        float a2 = AbstractC4963u.a(c5401s0.u.getContext(), 252);
        float measuredWidth = c5401s0.E.getMeasuredWidth();
        sg.bigo.ads.U.r a3 = AbstractC5164f1.a(c5401s0.d);
        if (a3.a()) {
            float f = measuredWidth / a2;
            float f2 = a3.f12567a;
            float f3 = a3.b;
            if (f < (f2 * 1.0f) / f3) {
                a2 = ((f3 * measuredWidth) * 1.0f) / f2;
            }
        }
        c5401s0.u.post(new RunnableC5392n0(c5401s0, measuredWidth, a2));
    }
}

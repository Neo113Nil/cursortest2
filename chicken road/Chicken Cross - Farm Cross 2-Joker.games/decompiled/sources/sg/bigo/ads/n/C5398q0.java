package sg.bigo.ads.n;

import android.transition.Transition;
import android.view.View;
import sg.bigo.ads.h.AbstractC5140Q;

/* renamed from: sg.bigo.ads.n.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5398q0 extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f13187a;
    public final /* synthetic */ C5401s0 b;

    public C5398q0(C5401s0 c5401s0, boolean z) {
        this.b = c5401s0;
        this.f13187a = z;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        if (this.f13187a) {
            AbstractC5140Q.a((View) this.b.T);
        }
        this.b.A();
    }
}

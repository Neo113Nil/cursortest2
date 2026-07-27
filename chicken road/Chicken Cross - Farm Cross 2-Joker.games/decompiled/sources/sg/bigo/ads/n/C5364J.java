package sg.bigo.ads.n;

import android.transition.Transition;
import android.widget.Button;
import sg.bigo.ads.u.AbstractC5490k;

/* renamed from: sg.bigo.ads.n.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5364J extends sg.bigo.ads.U.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f13137a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C5389m c;
    public final /* synthetic */ N d;

    public C5364J(N n, boolean[] zArr, boolean z, C5389m c5389m) {
        this.d = n;
        this.f13137a = zArr;
        this.b = z;
        this.c = c5389m;
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        boolean[] zArr = this.f13137a;
        zArr[0] = true;
        AbstractC5490k.a(this.d.J, true, zArr[1], this.b);
    }

    @Override // sg.bigo.ads.U.i, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        sg.bigo.ads.E0.p.a(this.d.D, -1, new C5363I(transition));
        Button button = this.d.J;
        AbstractC5490k.a(button, button, this.c.f13179a, this.f13137a, this.b, transition.getDuration());
    }
}

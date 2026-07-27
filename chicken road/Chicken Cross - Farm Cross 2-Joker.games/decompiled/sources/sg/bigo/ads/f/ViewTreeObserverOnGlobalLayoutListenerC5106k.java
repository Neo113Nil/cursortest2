package sg.bigo.ads.f;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.AdOptionsView;

/* renamed from: sg.bigo.ads.f.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5106k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12769a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C5111p e;

    public ViewTreeObserverOnGlobalLayoutListenerC5106k(C5111p c5111p, FrameLayout frameLayout, boolean z, boolean z2, String str) {
        this.e = c5111p;
        this.f12769a = frameLayout;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C5111p c5111p = this.e;
        if (c5111p.b == null) {
            return;
        }
        c5111p.v = new LinearLayout(this.f12769a.getContext());
        this.e.v.setOrientation(0);
        X.a(C5111p.a(this.e, this.f12769a.getContext(), this.b), this.e.v, null, -1);
        X.a(C5111p.a(this.e, this.f12769a.getContext(), this.c, this.d), this.e.v, null, -1);
        C5111p c5111p2 = this.e;
        if (c5111p2.u == null) {
            c5111p2.u = new AdOptionsView(this.e.k);
        }
        C5111p c5111p3 = this.e;
        AdOptionsView adOptionsView = c5111p3.u;
        sg.bigo.ads.U0.c cVar = c5111p3.m;
        adOptionsView.a(cVar, cVar.O);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.topMargin = Math.max(this.e.b.getTop(), 0);
        layoutParams.rightMargin = Math.max(this.f12769a.getRight() - this.e.b.getRight(), 0);
        layoutParams.setMarginEnd(Math.max(this.f12769a.getRight() - this.e.b.getRight(), 0));
        X.a(this.e.v, this.f12769a, layoutParams, -1);
        C5111p c5111p4 = this.e;
        X.a(c5111p4.u, c5111p4.b, null, -1);
    }
}

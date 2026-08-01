package sg.bigo.ads.f;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;

/* renamed from: sg.bigo.ads.f.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5107l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12770a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C5111p e;

    public ViewTreeObserverOnGlobalLayoutListenerC5107l(C5111p c5111p, FrameLayout frameLayout, boolean z, boolean z2, String str) {
        this.e = c5111p;
        this.f12770a = frameLayout;
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
        LinearLayout a2 = C5111p.a(this.e, C5111p.a(c5111p, this.f12770a.getContext(), this.b));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = AbstractC4963u.a(this.f12770a.getContext(), 16);
        layoutParams.setMarginStart(AbstractC4963u.a(this.f12770a.getContext(), 16));
        layoutParams.topMargin = AbstractC4963u.a(this.f12770a.getContext(), 28);
        X.a(a2, this.f12770a, layoutParams, -1);
        C5111p c5111p2 = this.e;
        if (c5111p2.A == 2 && c5111p2.y != null) {
            X.a(a2, new C5102g(c5111p2));
        }
        TextView a3 = C5111p.a(this.e, this.f12770a.getContext(), this.c, this.d);
        if (a3 != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            a3.measure(-2, -2);
            layoutParams2.topMargin = Math.max((this.e.b.getBottom() - a3.getMeasuredHeight()) - 10, 0);
            layoutParams2.leftMargin = AbstractC4963u.a(this.e.b.getContext(), 10) + this.e.b.getLeft();
            layoutParams2.setMarginStart(AbstractC4963u.a(this.e.b.getContext(), 10) + this.e.b.getLeft());
            X.a(a3, this.f12770a, layoutParams2, -1);
            C5111p c5111p3 = this.e;
            if (c5111p3.A != 2 || c5111p3.y == null) {
                return;
            }
            X.a(a3, new C5102g(c5111p3));
        }
    }
}

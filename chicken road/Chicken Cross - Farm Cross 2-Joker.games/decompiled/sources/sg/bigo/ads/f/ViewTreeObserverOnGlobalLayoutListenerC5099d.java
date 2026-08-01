package sg.bigo.ads.f;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.k1.C5270k;

/* renamed from: sg.bigo.ads.f.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5099d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f12762a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C5111p e;

    public ViewTreeObserverOnGlobalLayoutListenerC5099d(C5111p c5111p, FrameLayout frameLayout, boolean z, boolean z2, String str) {
        this.e = c5111p;
        this.f12762a = frameLayout;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C5111p c5111p = this.e;
        C5270k c5270k = c5111p.b;
        if (c5270k == null) {
            return;
        }
        InterfaceC5108m interfaceC5108m = c5111p.q;
        if (interfaceC5108m != null) {
            c5270k.getLeft();
            int top = this.e.b.getTop();
            int right = this.e.b.getRight();
            this.e.b.getBottom();
            sg.bigo.ads.H.c cVar = (sg.bigo.ads.H.c) interfaceC5108m;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = AbstractC4963u.a(cVar.f12687a, 10) + top;
            int measuredWidth = cVar.g.getMeasuredWidth();
            int min = Math.min(Math.max((right - measuredWidth) - AbstractC4963u.a(cVar.f12687a, 10), 0), (AbstractC4963u.c(cVar.f12687a) - AbstractC4963u.a(cVar.f12687a, 80)) - measuredWidth);
            layoutParams.leftMargin = min;
            layoutParams.setMarginStart(min);
            cVar.g.setLayoutParams(layoutParams);
        }
        Context context = this.f12762a.getContext();
        LinearLayout a2 = C5111p.a(this.e, C5111p.a(this.e, context, this.b));
        a2.measure(-2, -2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = Math.max(AbstractC4963u.a(context, 10) + this.e.b.getTop(), 0);
        layoutParams2.leftMargin = AbstractC4963u.a(context, 10) + this.e.b.getLeft();
        X.a(a2, this.f12762a, layoutParams2, -1);
        TextView a3 = C5111p.a(this.e, context, this.c, this.d);
        if (a3 != null) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            a3.measure(-2, -2);
            layoutParams3.topMargin = Math.max((this.e.b.getBottom() - a3.getMeasuredHeight()) - 10, 0);
            layoutParams3.leftMargin = AbstractC4963u.a(context, 10) + this.e.b.getLeft();
            layoutParams3.setMarginStart(AbstractC4963u.a(context, 10) + this.e.b.getLeft());
            X.a(a3, this.f12762a, layoutParams3, -1);
        }
    }
}

package sg.bigo.ads.n;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import sg.bigo.ads.K0.AbstractC4963u;

/* renamed from: sg.bigo.ads.n.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5405u0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayout.LayoutParams f13194a;
    public final /* synthetic */ LinearLayout.LayoutParams b;
    public final /* synthetic */ C5407v0 c;

    public ViewTreeObserverOnGlobalLayoutListenerC5405u0(C5407v0 c5407v0, LinearLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2) {
        this.c = c5407v0;
        this.f13194a = layoutParams;
        this.b = layoutParams2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int a2 = AbstractC4963u.a(this.c.C.getContext(), 100);
        int measuredHeight = this.c.C.getMeasuredHeight();
        if (measuredHeight < a2) {
            LinearLayout.LayoutParams layoutParams = this.f13194a;
            layoutParams.weight = 0.0f;
            layoutParams.height = a2;
            this.c.C.setLayoutParams(layoutParams);
            int measuredHeight2 = this.c.E.getMeasuredHeight();
            LinearLayout.LayoutParams layoutParams2 = this.b;
            layoutParams2.height = measuredHeight2 - (a2 - measuredHeight);
            this.c.E.setLayoutParams(layoutParams2);
        }
    }
}

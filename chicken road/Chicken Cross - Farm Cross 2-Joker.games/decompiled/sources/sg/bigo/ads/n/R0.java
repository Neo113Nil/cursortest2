package sg.bigo.ads.n;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class R0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13148a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ S0 d;

    public R0(S0 s0, FrameLayout frameLayout, int i, int i2) {
        this.d = s0;
        this.f13148a = frameLayout;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d.D = motionEvent.getX();
            this.d.E = motionEvent.getY();
            return !this.f13148a.isScrollContainer();
        }
        if (actionMasked != 1) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean b = sg.bigo.ads.K0.X.b(Math.round(this.d.D), Math.round(this.d.E), this.f13148a);
        boolean b2 = sg.bigo.ads.K0.X.b(Math.round(x), Math.round(y), this.f13148a);
        Object tag = this.f13148a.getTag();
        int i = this.b;
        if (tag instanceof Integer) {
            i = ((Integer) tag).intValue();
        }
        int i2 = i;
        int i3 = this.c;
        if (2 == i3) {
            if (b && b2) {
                this.d.d.a(Math.round(x), Math.round(y), Math.round(this.d.D), Math.round(this.d.E), 8, i2);
            }
            return false;
        }
        if (3 != i3 && 1 == i3 && b) {
            this.d.d.a(Math.round(x), Math.round(y), Math.round(this.d.D), Math.round(this.d.E), 8, i2);
        }
        return false;
    }
}

package sg.bigo.ads.t;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: sg.bigo.ads.t.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC5471a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13307a;
    public final int b;
    public float c;
    public float d;
    public int e;
    public final /* synthetic */ C5472b f;

    public ViewOnTouchListenerC5471a(C5472b c5472b, boolean z) {
        this.f = c5472b;
        this.b = ViewConfiguration.get(c5472b.f12687a).getScaledTouchSlop();
        this.f13307a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r7 >= r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        r8.j(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        if (r7 >= r1) goto L47;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C5472b c5472b;
        int i;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(this.c - rawX) >= this.b || Math.abs(this.d - rawY) >= this.b) {
                    int abs = Math.abs((int) (rawY - this.d));
                    if (!this.f13307a) {
                        if (this.d < rawY) {
                            ImageView imageView = this.f.f;
                            if (imageView == null || imageView.isEnabled()) {
                                c5472b = this.f;
                                int i2 = c5472b.P0;
                                if (i2 == 0 && c5472b.Q0.topMargin * 3 >= c5472b.s0) {
                                    c5472b.f(4);
                                } else if (c5472b.Q0.topMargin * 3 >= c5472b.s0 * 2) {
                                    c5472b.f(4);
                                } else {
                                    i = i2;
                                }
                            } else {
                                C5472b c5472b2 = this.f;
                                c5472b2.j(c5472b2.P0);
                            }
                        } else {
                            int i3 = abs * 3;
                            c5472b = this.f;
                            i = c5472b.P0;
                        }
                        c5472b.j(i);
                    } else if (this.d > rawY) {
                        int i4 = abs * 3;
                        c5472b = this.f;
                        i = c5472b.P0;
                    }
                } else {
                    C5472b c5472b3 = this.f;
                    c5472b3.getClass();
                    c5472b3.j(0);
                }
            } else if (action == 2) {
                int rawY2 = (int) motionEvent.getRawY();
                int i5 = rawY2 - this.e;
                this.e = rawY2;
                if (!this.f13307a || i5 <= 0) {
                    this.f.k(i5);
                }
            } else if (action == 3) {
                C5472b c5472b4 = this.f;
                float f = ((ViewGroup.MarginLayoutParams) c5472b4.w0.getLayoutParams()).topMargin;
                int i6 = c5472b4.u0;
                c5472b4.j(f > ((float) i6) * 0.8f ? i6 : 0);
            }
        } else {
            this.c = motionEvent.getRawX();
            this.d = motionEvent.getRawY();
            this.e = (int) motionEvent.getRawY();
            C5472b c5472b5 = this.f;
            c5472b5.P0 = c5472b5.Q0.topMargin;
        }
        return true;
    }
}

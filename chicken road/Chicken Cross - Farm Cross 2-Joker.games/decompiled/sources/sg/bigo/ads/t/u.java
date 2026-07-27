package sg.bigo.ads.t;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class u implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f13320a;
    public float b;
    public float c;
    public int d;
    public final /* synthetic */ v e;

    public u(v vVar) {
        this.e = vVar;
        this.f13320a = ViewConfiguration.get(vVar.f12687a).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r6 != 3) goto L39;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((ViewGroup.MarginLayoutParams) this.e.w0.getLayoutParams()).topMargin <= 0 || !this.e.J0.get()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b = motionEvent.getRawX();
            this.c = motionEvent.getRawY();
            if (((ViewGroup.MarginLayoutParams) this.e.w0.getLayoutParams()).topMargin > 0 || this.e.r0 == null) {
                if (((ViewGroup.MarginLayoutParams) this.e.w0.getLayoutParams()).topMargin > 0) {
                    C5476f c5476f = this.e.r0;
                }
                if (this.e.M0) {
                    this.d = (int) motionEvent.getRawY();
                }
            }
            return false;
        }
        if (action == 1) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (Math.abs(this.b - rawX) < this.f13320a && Math.abs(this.c - rawY) < this.f13320a) {
                v vVar = this.e;
                vVar.getClass();
                vVar.j(0);
            }
            v vVar2 = this.e;
            float f = ((ViewGroup.MarginLayoutParams) vVar2.w0.getLayoutParams()).topMargin;
            int i = vVar2.u0;
            vVar2.j(f > ((float) i) * 0.8f ? i : 0);
        } else if (action == 2) {
            int rawY2 = (int) motionEvent.getRawY();
            int i2 = rawY2 - this.d;
            this.d = rawY2;
            this.e.k(i2);
        }
        return true;
    }
}

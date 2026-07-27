package l;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class J implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f9709a;

    public J(K k3) {
        this.f9709a = k3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        K k3 = this.f9709a;
        if (action == 0 && (rVar = k3.f9732v) != null && rVar.isShowing() && x3 >= 0 && x3 < k3.f9732v.getWidth() && y >= 0 && y < k3.f9732v.getHeight()) {
            k3.f9728r.postDelayed(k3.f9724n, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        k3.f9728r.removeCallbacks(k3.f9724n);
        return false;
    }
}

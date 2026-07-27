package sg.bigo.ads.C;

import android.view.MotionEvent;
import android.view.View;
import sg.bigo.ads.K0.X;

/* renamed from: sg.bigo.ads.C.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC4942a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12223a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View.OnTouchListener c;

    public ViewOnTouchListenerC4942a(View view, View view2, View.OnTouchListener onTouchListener) {
        this.f12223a = view;
        this.b = view2;
        this.c = onTouchListener;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getActionMasked() == 0 && this.f12223a != null) {
            Object parent = this.b.getParent();
            if ((parent instanceof View) && X.c(rawX, rawY, ((View) parent).findViewWithTag(4))) {
                return false;
            }
        }
        return this.c.onTouch(view, motionEvent);
    }
}

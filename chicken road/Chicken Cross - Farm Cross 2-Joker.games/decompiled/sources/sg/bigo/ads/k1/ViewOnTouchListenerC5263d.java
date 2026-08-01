package sg.bigo.ads.k1;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: sg.bigo.ads.k1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC5263d implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5271l f13032a;

    public ViewOnTouchListenerC5263d(C5271l c5271l) {
        this.f13032a = c5271l;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f13032a.e.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action != 0 && action != 1) || view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }
}

package sg.bigo.ads.j;

import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class j extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.U.j f13003a;

    public j(Context context) {
        super(context);
        this.f13003a = new sg.bigo.ads.U.j();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.f13003a.b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f13003a.f12564a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }
}

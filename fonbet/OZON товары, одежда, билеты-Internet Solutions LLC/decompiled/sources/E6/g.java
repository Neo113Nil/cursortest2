package E6;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes8.dex */
final class g implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f7585a;

    g(e eVar) {
        this.f7585a = eVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        e eVar = this.f7585a;
        try {
            float z11 = eVar.z();
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (z11 < eVar.x()) {
                eVar.K(eVar.x(), x11, y11, true);
            } else if (z11 < eVar.x() || z11 >= eVar.w()) {
                eVar.K(eVar.y(), x11, y11, true);
            } else {
                eVar.K(eVar.w(), x11, y11, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        e eVar = this.f7585a;
        onClickListener = eVar.f7563p;
        if (onClickListener != null) {
            onClickListener2 = eVar.f7563p;
            onClickListener2.onClick(eVar.f7555h);
        }
        RectF t2 = eVar.t();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (t2 == null || !t2.contains(x11, y11)) {
            return false;
        }
        t2.width();
        t2.height();
        return true;
    }
}

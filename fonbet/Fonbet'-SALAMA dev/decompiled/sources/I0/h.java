package I0;

import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class h extends FrameLayout {
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}

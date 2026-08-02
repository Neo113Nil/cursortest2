package E6;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes8.dex */
final class f extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f7584a;

    f(e eVar) {
        this.f7584a = eVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f11) {
        this.f7584a.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View.OnLongClickListener onLongClickListener;
        View.OnLongClickListener onLongClickListener2;
        e eVar = this.f7584a;
        onLongClickListener = eVar.f7564q;
        if (onLongClickListener != null) {
            onLongClickListener2 = eVar.f7564q;
            onLongClickListener2.onLongClick(eVar.f7555h);
        }
    }
}

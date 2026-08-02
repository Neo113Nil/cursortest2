package n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import m.ViewOnTouchListenerC2063a;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18194k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC2063a f18195l;

    public /* synthetic */ V(ViewOnTouchListenerC2063a viewOnTouchListenerC2063a, int i) {
        this.f18194k = i;
        this.f18195l = viewOnTouchListenerC2063a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18194k) {
            case 0:
                ViewParent parent = this.f18195l.f17862n.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC2063a viewOnTouchListenerC2063a = this.f18195l;
                viewOnTouchListenerC2063a.a();
                View view = viewOnTouchListenerC2063a.f17862n;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC2063a.d()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC2063a.f17865q = true;
                    break;
                }
                break;
        }
    }
}

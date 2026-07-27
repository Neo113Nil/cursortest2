package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import k.ViewOnTouchListenerC1060a;

/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC1060a f9687b;

    public /* synthetic */ C(ViewOnTouchListenerC1060a viewOnTouchListenerC1060a, int i3) {
        this.f9686a = i3;
        this.f9687b = viewOnTouchListenerC1060a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9686a) {
            case 0:
                ViewParent parent = this.f9687b.f9532d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC1060a viewOnTouchListenerC1060a = this.f9687b;
                viewOnTouchListenerC1060a.a();
                View view = viewOnTouchListenerC1060a.f9532d;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC1060a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC1060a.f9534g = true;
                    break;
                }
                break;
        }
    }
}

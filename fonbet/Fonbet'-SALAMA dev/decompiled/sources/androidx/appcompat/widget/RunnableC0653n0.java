package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.appcompat.widget.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0653n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0655o0 f8710b;

    public /* synthetic */ RunnableC0653n0(AbstractViewOnTouchListenerC0655o0 abstractViewOnTouchListenerC0655o0, int i7) {
        this.f8709a = i7;
        this.f8710b = abstractViewOnTouchListenerC0655o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8709a) {
            case 0:
                ViewParent parent = this.f8710b.f8723d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0655o0 abstractViewOnTouchListenerC0655o0 = this.f8710b;
                abstractViewOnTouchListenerC0655o0.a();
                View view = abstractViewOnTouchListenerC0655o0.f8723d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0655o0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractViewOnTouchListenerC0655o0.f8726x = true;
                    break;
                }
                break;
        }
    }
}

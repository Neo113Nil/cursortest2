package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: androidx.appcompat.widget.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0632n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0634o0 f8710b;

    public /* synthetic */ RunnableC0632n0(AbstractViewOnTouchListenerC0634o0 abstractViewOnTouchListenerC0634o0, int i7) {
        this.f8709a = i7;
        this.f8710b = abstractViewOnTouchListenerC0634o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8709a) {
            case 0:
                ViewParent parent = this.f8710b.f8723d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC0634o0 abstractViewOnTouchListenerC0634o0 = this.f8710b;
                abstractViewOnTouchListenerC0634o0.a();
                View view = abstractViewOnTouchListenerC0634o0.f8723d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0634o0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0634o0.f8726x = true;
                    break;
                }
                break;
        }
    }
}

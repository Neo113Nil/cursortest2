package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v40 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8062j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ w40 f8063k;

    public /* synthetic */ v40(w40 w40Var, int i) {
        this.f8062j = i;
        this.f8063k = w40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8062j;
        w40 w40Var = this.f8063k;
        switch (i) {
            case 0:
                ViewParent parent = w40Var.f8373m.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                w40Var.m5234a();
                View view = w40Var.f8373m;
                if (view.isEnabled() && !view.isLongClickable() && w40Var.mo2981c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    w40Var.f8376p = true;
                    break;
                }
                break;
        }
    }
}

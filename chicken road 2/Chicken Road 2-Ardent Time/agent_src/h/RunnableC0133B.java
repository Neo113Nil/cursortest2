package h;

/* renamed from: h.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0133B implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.a f3041b;

    public /* synthetic */ RunnableC0133B(g.a aVar, int i2) {
        this.f3040a = i2;
        this.f3041b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3040a) {
            case 0:
                android.view.ViewParent parent = this.f3041b.f2910d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                g.a aVar = this.f3041b;
                aVar.a();
                android.view.View view = aVar.f2910d;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    aVar.f2913g = true;
                    break;
                }
                break;
        }
    }
}

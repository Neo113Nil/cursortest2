package c;

import A0.RunnableC0049o;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0529h implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: k, reason: collision with root package name */
    public final long f7327k = SystemClock.uptimeMillis() + 10000;

    /* renamed from: l, reason: collision with root package name */
    public Runnable f7328l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7329m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0531j f7330n;

    public ViewTreeObserverOnDrawListenerC0529h(AbstractActivityC0531j abstractActivityC0531j) {
        this.f7330n = abstractActivityC0531j;
    }

    public final void a(View view) {
        if (this.f7329m) {
            return;
        }
        this.f7329m = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.l.f("runnable", runnable);
        this.f7328l = runnable;
        View decorView = this.f7330n.getWindow().getDecorView();
        kotlin.jvm.internal.l.e("getDecorView(...)", decorView);
        if (!this.f7329m) {
            decorView.postOnAnimation(new RunnableC0049o(10, this));
        } else if (kotlin.jvm.internal.l.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f7328l;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f7327k) {
                this.f7329m = false;
                this.f7330n.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f7328l = null;
        v vVar = (v) this.f7330n.f7345q.getValue();
        synchronized (vVar.f7367b) {
            z3 = vVar.f7368c;
        }
        if (z3) {
            this.f7329m = false;
            this.f7330n.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7330n.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

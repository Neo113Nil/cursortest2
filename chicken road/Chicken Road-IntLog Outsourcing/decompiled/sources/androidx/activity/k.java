package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f4056b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f4058d;

    /* renamed from: a, reason: collision with root package name */
    public final long f4055a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4057c = false;

    public k(l lVar) {
        this.f4058d = lVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4056b = runnable;
        View decorView = this.f4058d.getWindow().getDecorView();
        if (!this.f4057c) {
            decorView.postOnAnimation(new B2.b(4, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // androidx.activity.j
    public final void g(View view) {
        if (this.f4057c) {
            return;
        }
        this.f4057c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f4056b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f4055a) {
                this.f4057c = false;
                this.f4058d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f4056b = null;
        m mVar = this.f4058d.mFullyDrawnReporter;
        synchronized (mVar.f4059a) {
            z = mVar.f4060b;
        }
        if (z) {
            this.f4057c = false;
            this.f4058d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4058d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

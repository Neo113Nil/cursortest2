package c;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f2499b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f2501d;

    /* renamed from: a, reason: collision with root package name */
    public final long f2498a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2500c = false;

    public j(k kVar) {
        this.f2501d = kVar;
    }

    public final void a(View view) {
        if (this.f2500c) {
            return;
        }
        this.f2500c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2499b = runnable;
        View decorView = this.f2501d.getWindow().getDecorView();
        if (!this.f2500c) {
            decorView.postOnAnimation(new G0.m(5, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f2499b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2498a) {
                this.f2500c = false;
                this.f2501d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f2499b = null;
        V.f fVar = this.f2501d.f2508i;
        synchronized (fVar.f1606a) {
            z3 = fVar.f1607b;
        }
        if (z3) {
            this.f2500c = false;
            this.f2501d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2501d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

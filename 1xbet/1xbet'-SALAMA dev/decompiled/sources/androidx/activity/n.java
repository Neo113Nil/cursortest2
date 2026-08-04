package androidx.activity;

import A1.K0;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f8108b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.A f8110d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8107a = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8109c = false;

    public n(androidx.fragment.app.A a2) {
        this.f8110d = a2;
    }

    @Override // androidx.activity.m
    public final void b(View view) {
        if (this.f8109c) {
            return;
        }
        this.f8109c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8108b = runnable;
        View decorView = this.f8110d.getWindow().getDecorView();
        if (!this.f8109c) {
            decorView.postOnAnimation(new K0(this, 20));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z4;
        Runnable runnable = this.f8108b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f8107a) {
                this.f8109c = false;
                this.f8110d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f8108b = null;
        q qVar = this.f8110d.mFullyDrawnReporter;
        synchronized (qVar.f8114a) {
            z4 = qVar.f8115b;
        }
        if (z4) {
            this.f8109c = false;
            this.f8110d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8110d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

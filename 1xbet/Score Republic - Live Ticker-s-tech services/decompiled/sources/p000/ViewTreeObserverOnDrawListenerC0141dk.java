package p000;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: dk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0141dk implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* JADX INFO: renamed from: j */
    public final long f1671j = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: k */
    public Runnable f1672k;

    /* JADX INFO: renamed from: l */
    public boolean f1673l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ AbstractActivityC0790v4 f1674m;

    public ViewTreeObserverOnDrawListenerC0141dk(AbstractActivityC0790v4 abstractActivityC0790v4) {
        this.f1674m = abstractActivityC0790v4;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.f1672k = runnable;
        View decorView = this.f1674m.getWindow().getDecorView();
        decorView.getClass();
        if (!this.f1673l) {
            decorView.postOnAnimation(new RunnableC0944za(1, this));
        } else if (af0.m187a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f1672k;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1671j) {
                this.f1673l = false;
                this.f1674m.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f1672k = null;
        e60 e60Var = (e60) this.f1674m.f2780p.m2847a();
        synchronized (e60Var.f1967a) {
            z = e60Var.f1968b;
        }
        if (z) {
            this.f1673l = false;
            this.f1674m.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1674m.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

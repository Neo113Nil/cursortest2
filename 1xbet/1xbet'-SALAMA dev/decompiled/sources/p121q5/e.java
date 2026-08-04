package p121q5;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f15888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f15889b;

    public e(f fVar, m mVar) {
        this.f15889b = fVar;
        this.f15888a = mVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f15889b;
        if (fVar.f15896g && fVar.f15894e != null) {
            this.f15888a.getViewTreeObserver().removeOnPreDrawListener(this);
            fVar.f15894e = null;
        }
        return fVar.f15896g;
    }
}

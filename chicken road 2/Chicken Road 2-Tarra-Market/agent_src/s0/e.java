package s0;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f6512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6513b;

    public e(f fVar, o oVar) {
        this.f6513b = fVar;
        this.f6512a = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f6513b;
        if (fVar.f6521h && fVar.f6519f != null) {
            this.f6512a.getViewTreeObserver().removeOnPreDrawListener(this);
            fVar.f6519f = null;
        }
        return fVar.f6521h;
    }
}

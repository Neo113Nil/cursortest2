package sg.bigo.ads.t;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class r implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f13317a;

    public r(v vVar) {
        this.f13317a = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        v vVar = this.f13317a;
        if (vVar.J0.compareAndSet(true, false)) {
            long abs = (long) Math.abs(((vVar.s0 - ((ViewGroup.MarginLayoutParams) vVar.w0.getLayoutParams()).topMargin) * 1.5f) / vVar.v0);
            n nVar = new n(vVar);
            nVar.setDuration(abs);
            vVar.w0.startAnimation(nVar);
        }
    }
}

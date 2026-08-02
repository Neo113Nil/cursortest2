package q5;

import android.view.ViewTreeObserver;

/* renamed from: q5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC1561e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f15882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1562f f15883b;

    public ViewTreeObserverOnPreDrawListenerC1561e(C1562f c1562f, m mVar) {
        this.f15883b = c1562f;
        this.f15882a = mVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C1562f c1562f = this.f15883b;
        if (c1562f.f15890g && c1562f.f15888e != null) {
            this.f15882a.getViewTreeObserver().removeOnPreDrawListener(this);
            c1562f.f15888e = null;
        }
        return c1562f.f15890g;
    }
}

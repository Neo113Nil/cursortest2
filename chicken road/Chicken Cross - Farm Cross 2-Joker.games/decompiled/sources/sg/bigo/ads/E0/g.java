package sg.bigo.ads.E0;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12268a;
    public final /* synthetic */ k b;

    public g(n nVar, k kVar) {
        this.f12268a = nVar;
        this.b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int a2 = this.f12268a.a(p.a(valueAnimator));
        k kVar = this.b;
        if (kVar != null ? kVar.b(a2) : false) {
            return;
        }
        this.f12268a.a(a2);
    }
}

package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f9801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f9802b;

    public b(e eVar, d dVar) {
        this.f9802b = eVar;
        this.f9801a = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        e eVar = this.f9802b;
        eVar.getClass();
        d dVar = this.f9801a;
        e.d(fFloatValue, dVar);
        eVar.a(fFloatValue, dVar, false);
        eVar.invalidateSelf();
    }
}

package T4;

import T4.c;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.a f26602a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f26603b;

    a(c cVar, c.a aVar) {
        this.f26603b = cVar;
        this.f26602a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c cVar = this.f26603b;
        cVar.getClass();
        c.a aVar = this.f26602a;
        c.h(floatValue, aVar);
        cVar.a(floatValue, aVar, false);
        cVar.invalidateSelf();
    }
}

package sg.bigo.ads.K0;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* renamed from: sg.bigo.ads.K0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4948e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArgbEvaluator f12357a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ GradientDrawable e;

    public C4948e(ArgbEvaluator argbEvaluator, int i, int i2, int i3, GradientDrawable gradientDrawable) {
        this.f12357a = argbEvaluator;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = gradientDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.e.setColors(new int[]{((Integer) this.f12357a.evaluate(floatValue, Integer.valueOf(this.b), Integer.valueOf(this.c))).intValue(), ((Integer) this.f12357a.evaluate(floatValue, Integer.valueOf(this.b), Integer.valueOf(this.d))).intValue()});
    }
}

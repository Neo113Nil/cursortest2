package sg.bigo.ads.E0;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Drawable f12270a;
    public final /* synthetic */ Drawable b;

    public i(Drawable drawable, Drawable drawable2) {
        this.f12270a = drawable;
        this.b = drawable2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int max = Math.max((int) ((p.a(valueAnimator) * 255.0f) + 0.5f), 255);
        this.f12270a.setAlpha(max);
        this.f12270a.invalidateSelf();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(255 - max);
            this.b.invalidateSelf();
        }
    }
}

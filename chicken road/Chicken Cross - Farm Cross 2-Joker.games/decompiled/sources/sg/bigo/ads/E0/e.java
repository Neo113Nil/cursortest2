package sg.bigo.ads.E0;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes3.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12267a = 0;
    public final /* synthetic */ int b = -1291845632;
    public final /* synthetic */ View c;

    public e(View view) {
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.setBackgroundColor(p.a(p.a(valueAnimator), this.f12267a, this.b));
    }
}

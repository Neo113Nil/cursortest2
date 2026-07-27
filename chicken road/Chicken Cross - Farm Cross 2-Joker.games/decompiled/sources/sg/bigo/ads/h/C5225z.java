package sg.bigo.ads.h;

import android.animation.ValueAnimator;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.h.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5225z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueCallback f12946a;

    public C5225z(ValueCallback valueCallback) {
        this.f12946a = valueCallback;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ValueCallback valueCallback;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (!(animatedValue instanceof Integer) || (valueCallback = this.f12946a) == null) {
            return;
        }
        Integer num = (Integer) animatedValue;
        num.intValue();
        valueCallback.onReceiveValue(num);
    }
}

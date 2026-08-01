package sg.bigo.ads.E0;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12266a;
    public final /* synthetic */ int b;
    public final /* synthetic */ TextView[] c;

    public d(int i, int i2, TextView[] textViewArr) {
        this.f12266a = i;
        this.b = i2;
        this.c = textViewArr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int a2 = p.a(p.a(valueAnimator), this.f12266a, this.b);
        for (TextView textView : this.c) {
            textView.setTextColor(a2);
        }
    }
}

package sg.bigo.ads.h;

import android.view.View;
import android.view.animation.TranslateAnimation;
import sg.bigo.ads.K0.AbstractC4954k;

/* renamed from: sg.bigo.ads.h.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5127D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12810a;
    public final /* synthetic */ View b;

    public RunnableC5127D(View view, int i) {
        this.f12810a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.f12810a);
        translateAnimation.setDuration(2000L);
        translateAnimation.setInterpolator(AbstractC4954k.a(3));
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(2);
        this.b.startAnimation(translateAnimation);
    }
}

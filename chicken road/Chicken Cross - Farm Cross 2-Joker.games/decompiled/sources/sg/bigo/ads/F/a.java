package sg.bigo.ads.F;

import android.view.animation.ScaleAnimation;
import android.widget.Button;
import sg.bigo.ads.K0.AbstractC4954k;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Button f12282a;

    public a(Button button) {
        this.f12282a = button;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(AbstractC4954k.a(1));
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f12282a.startAnimation(scaleAnimation);
    }
}

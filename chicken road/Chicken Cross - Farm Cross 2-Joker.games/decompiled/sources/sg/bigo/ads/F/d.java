package sg.bigo.ads.F;

import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4954k;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12285a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public d(ViewGroup viewGroup, long j, int i) {
        this.f12285a = viewGroup;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12285a, "translationX", 0.0f, -r0, 0.0f, AbstractC4963u.a(this.f12285a.getContext(), 8), 0.0f);
        ofFloat.setInterpolator(AbstractC4954k.a(3));
        ofFloat.setDuration(300L);
        ofFloat.setRepeatMode(2);
        ofFloat.setStartDelay(this.b);
        ofFloat.addListener(new c(this));
        ofFloat.start();
    }
}

package sg.bigo.ads.F;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import sg.bigo.ads.K0.AbstractC4954k;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12288a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ int e;

    public g(View view, View view2, int[] iArr, ViewGroup viewGroup, int i) {
        this.f12288a = view;
        this.b = view2;
        this.c = iArr;
        this.d = viewGroup;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12288a.getVisibility() != 0) {
            this.f12288a.setVisibility(0);
        }
        View view = this.b;
        int[] iArr = this.c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", iArr[0], iArr[1]);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(AbstractC4954k.a(0));
        ofFloat.addListener(new f(this));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(AbstractC4954k.a(1));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.b, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.b, "scaleY", 0.0f, 1.0f);
        ofFloat3.setDuration(300L);
        ofFloat3.setInterpolator(AbstractC4954k.a(1));
        ofFloat4.setDuration(300L);
        ofFloat4.setInterpolator(AbstractC4954k.a(1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.start();
    }
}

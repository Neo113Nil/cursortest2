package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f9835b;

    public /* synthetic */ f(l lVar, int i7) {
        this.f9834a = i7;
        this.f9835b = lVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j jVar;
        switch (this.f9834a) {
            case 0:
                l lVar = this.f9835b;
                if (!lVar.mRefreshing) {
                    lVar.reset();
                    break;
                } else {
                    lVar.mProgress.setAlpha(255);
                    lVar.mProgress.start();
                    if (lVar.mNotify && (jVar = lVar.mListener) != null) {
                        jVar.onRefresh();
                    }
                    lVar.mCurrentTargetOffsetTop = lVar.mCircleView.getTop();
                    break;
                }
                break;
            default:
                l lVar2 = this.f9835b;
                if (!lVar2.mScale) {
                    lVar2.startScaleDownAnimation(null);
                    break;
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i7 = this.f9834a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i7 = this.f9834a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}

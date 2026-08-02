package Qx;

import android.animation.ValueAnimator;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingAnimator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerV2Impl;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23836b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f23835a = i11;
        this.f23836b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23835a) {
            case 0:
                RecShelfViewHolder.createAnimator$lambda$9$lambda$7((RecShelfViewHolder) this.f23836b, valueAnimator);
                break;
            case 1:
                PinchToZoomOnboardingAnimator.getDotsPinchingAnimator$lambda$19$lambda$18((PinchToZoomOnboardingAnimator) this.f23836b, valueAnimator);
                break;
            default:
                ShellNavBarCornersManagerV2Impl._get_cornerAnimator_$lambda$1$lambda$0((ShellNavBarCornersManagerV2Impl) this.f23836b, valueAnimator);
                break;
        }
    }
}

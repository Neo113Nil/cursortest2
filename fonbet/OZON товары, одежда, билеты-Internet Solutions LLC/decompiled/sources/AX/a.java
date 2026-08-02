package AX;

import android.animation.ValueAnimator;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetRichContentBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentWidgetViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingAnimator;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.ShellNavBarCornersManagerV2Impl;
import ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2;
import ru.ozon.app.android.uikit.view.shimmer.ShimmerDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f676b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f675a = i11;
        this.f676b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f675a) {
            case 0:
                ShimmerDrawable.updateListener$lambda$0((ShimmerDrawable) this.f676b, valueAnimator);
                break;
            case 1:
                RichContentWidgetViewHolder.handleExpandClick$lambda$12$lambda$11$lambda$9((PdpWidgetRichContentBinding) this.f676b, valueAnimator);
                break;
            case 2:
                PinchToZoomOnboardingAnimator.getDotsScaleAnimator$lambda$15$lambda$14((PinchToZoomOnboardingAnimator) this.f676b, valueAnimator);
                break;
            case 3:
                ShellNavBarCornersManagerV2Impl._get_reversCornerAnimator_$lambda$4$lambda$3((ShellNavBarCornersManagerV2Impl) this.f676b, valueAnimator);
                break;
            default:
                TravelEditTextInputLayoutV2.showMaskPatternView$lambda$18$lambda$17((TravelEditTextInputLayoutV2) this.f676b, valueAnimator);
                break;
        }
    }
}

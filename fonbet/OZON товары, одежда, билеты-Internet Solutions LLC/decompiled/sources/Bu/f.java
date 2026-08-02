package Bu;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2;
import ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeViewAnimationHelper;

/* loaded from: classes12.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4057b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f4056a = i11;
        this.f4057b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4056a) {
            case 0:
                ProductActionBarViewV2.createAlphaAnimator$lambda$35$lambda$34((View) this.f4057b, valueAnimator);
                break;
            case 1:
                CartPickerView.animateWidthChange$lambda$28$lambda$26((CartPickerView) this.f4057b, valueAnimator);
                break;
            default:
                MarqueeViewAnimationHelper.setupAnimator$lambda$3$lambda$2((MarqueeViewAnimationHelper) this.f4057b, valueAnimator);
                break;
        }
    }
}

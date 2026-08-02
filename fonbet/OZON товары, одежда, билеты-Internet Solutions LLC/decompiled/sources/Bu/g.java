package Bu;

import android.animation.ValueAnimator;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2;
import ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeViewAnimationHelper;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.progressView.MainDrawMajorScreenProgressView;

/* loaded from: classes12.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4059b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f4058a = i11;
        this.f4059b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4058a) {
            case 0:
                ProductActionBarViewV2.createWidthAnimator$lambda$38$lambda$37((ProductActionBarViewV2) this.f4059b, valueAnimator);
                break;
            case 1:
                MarqueeViewAnimationHelper.setupAndStartFadeAnimation$lambda$5$lambda$4((MarqueeViewAnimationHelper) this.f4059b, valueAnimator);
                break;
            default:
                MainDrawMajorScreenProgressView.updateWithAnimation$lambda$4$lambda$3((MainDrawMajorScreenProgressView) this.f4059b, valueAnimator);
                break;
        }
    }
}

package Bu;

import android.animation.ValueAnimator;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2StickyAnimator;
import ru.ozon.app.android.travel.molecules.view.progressView.TravelHorizontalProgressView;

/* loaded from: classes12.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4053b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f4052a = i11;
        this.f4053b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4052a) {
            case 0:
                ProductActionBarView.createWidthAnimator$lambda$35$lambda$34((ProductActionBarView) this.f4053b, valueAnimator);
                break;
            case 1:
                CatalogTabsV2StickyAnimator.animateDisappearance$lambda$14$lambda$11((CatalogTabsV2StickyAnimator) this.f4053b, valueAnimator);
                break;
            default:
                TravelHorizontalProgressView.animateProgress$lambda$5$lambda$4((TravelHorizontalProgressView) this.f4053b, valueAnimator);
                break;
        }
    }
}

package Bu;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2StickyAnimator;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView;

/* loaded from: classes12.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4055b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f4054a = i11;
        this.f4055b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4054a) {
            case 0:
                ProductActionBarView.createAlphaAnimator$lambda$32$lambda$31((View) this.f4055b, valueAnimator);
                break;
            case 1:
                CatalogTabsV2StickyAnimator.animateAppearance$lambda$7$lambda$4((CatalogTabsV2StickyAnimator) this.f4055b, valueAnimator);
                break;
            default:
                SearchFormV5LocationsView.rotateAnimator$lambda$16$lambda$15((SearchFormV5LocationsView) this.f4055b, valueAnimator);
                break;
        }
    }
}

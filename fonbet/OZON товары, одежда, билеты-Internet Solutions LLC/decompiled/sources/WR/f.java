package WR;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5MultiFrameBindDelegate;

/* loaded from: classes4.dex */
public final /* synthetic */ class f implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33347b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f33346a = i11;
        this.f33347b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindReviewsIcon$lambda$5;
        Unit steps$lambda$4;
        switch (this.f33346a) {
            case 0:
                bindReviewsIcon$lambda$5 = HotelsSearchResultsV5MultiFrameBindDelegate.bindReviewsIcon$lambda$5((HotelsSearchResultsV5MultiFrameBindDelegate) this.f33347b);
                return bindReviewsIcon$lambda$5;
            default:
                steps$lambda$4 = CartSplitV2ControlsWidgetViewHolder.steps$lambda$4((CartSplitV2ControlsWidgetViewHolder) this.f33347b);
                return steps$lambda$4;
        }
    }
}

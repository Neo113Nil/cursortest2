package WR;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5MultiFrameBindDelegate;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33345b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f33344a = i11;
        this.f33345b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindReviews$lambda$4;
        switch (this.f33344a) {
            case 0:
                bindReviews$lambda$4 = HotelsSearchResultsV5MultiFrameBindDelegate.bindReviews$lambda$4((HotelsSearchResultsV5MultiFrameBindDelegate) this.f33345b);
                return bindReviews$lambda$4;
            default:
                return CartSplitV2ControlsWidgetViewHolder.steps$lambda$3((CartSplitV2ControlsWidgetViewHolder) this.f33345b);
        }
    }
}

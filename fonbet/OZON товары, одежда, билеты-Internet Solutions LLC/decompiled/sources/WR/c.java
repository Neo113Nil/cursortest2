package WR;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5MultiFrameBindDelegate;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33341b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f33340a = i11;
        this.f33341b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindTitle$lambda$2;
        switch (this.f33340a) {
            case 0:
                bindTitle$lambda$2 = HotelsSearchResultsV5MultiFrameBindDelegate.bindTitle$lambda$2((HotelsSearchResultsV5MultiFrameBindDelegate) this.f33341b);
                return bindTitle$lambda$2;
            default:
                return CartSplitV2ControlsWidgetViewHolder.steps$lambda$1((CartSplitV2ControlsWidgetViewHolder) this.f33341b);
        }
    }
}

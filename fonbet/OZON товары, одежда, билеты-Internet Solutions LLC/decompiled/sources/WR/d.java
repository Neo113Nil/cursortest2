package WR;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesWidgetViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5MultiFrameBindDelegate;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33343b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f33342a = i11;
        this.f33343b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindAddress$lambda$3;
        Unit steps$lambda$0;
        switch (this.f33342a) {
            case 0:
                bindAddress$lambda$3 = HotelsSearchResultsV5MultiFrameBindDelegate.bindAddress$lambda$3((HotelsSearchResultsV5MultiFrameBindDelegate) this.f33343b);
                return bindAddress$lambda$3;
            case 1:
                steps$lambda$0 = CartSplitV2AccessoriesWidgetViewHolder.steps$lambda$0((CartSplitV2AccessoriesWidgetViewHolder) this.f33343b);
                return steps$lambda$0;
            default:
                return CartSplitV2ControlsWidgetViewHolder.steps$lambda$2((CartSplitV2ControlsWidgetViewHolder) this.f33343b);
        }
    }
}

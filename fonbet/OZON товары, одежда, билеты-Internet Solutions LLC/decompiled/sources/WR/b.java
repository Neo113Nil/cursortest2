package WR;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.multiFrameBinding.HotelsSearchResultsV5MultiFrameBindDelegate;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33339b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f33338a = i11;
        this.f33339b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindImages$lambda$1;
        Unit steps$lambda$0;
        switch (this.f33338a) {
            case 0:
                bindImages$lambda$1 = HotelsSearchResultsV5MultiFrameBindDelegate.bindImages$lambda$1((HotelsSearchResultsV5MultiFrameBindDelegate) this.f33339b);
                return bindImages$lambda$1;
            default:
                steps$lambda$0 = CartSplitV2ControlsWidgetViewHolder.steps$lambda$0((CartSplitV2ControlsWidgetViewHolder) this.f33339b);
                return steps$lambda$0;
        }
    }
}

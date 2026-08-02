package EM;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.CartSplitV2HeaderWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4MultiFrameBindDelegate;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV4MultiFrameBindDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.vh.TileScrollBannerViewHolder;

/* loaded from: classes10.dex */
public final /* synthetic */ class g implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7703b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f7702a = i11;
        this.f7703b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindStep7$lambda$6;
        Unit bindSteps$lambda$0;
        Unit steps$lambda$1;
        Unit steps$lambda$0;
        switch (this.f7702a) {
            case 0:
                bindStep7$lambda$6 = AviaSearchResultV4MultiFrameBindDelegate.bindStep7$lambda$6((AviaSearchResultV4MultiFrameBindDelegate) this.f7703b);
                return bindStep7$lambda$6;
            case 1:
                bindSteps$lambda$0 = TravelRailwaySearchResultsV4MultiFrameBindDelegate.bindSteps$lambda$0((TravelRailwaySearchResultsV4MultiFrameBindDelegate) this.f7703b);
                return bindSteps$lambda$0;
            case 2:
                steps$lambda$1 = TileScrollBannerViewHolder.steps$lambda$1((TileScrollBannerViewHolder) this.f7703b);
                return steps$lambda$1;
            default:
                steps$lambda$0 = CartSplitV2HeaderWidgetViewHolder.steps$lambda$0((CartSplitV2HeaderWidgetViewHolder) this.f7703b);
                return steps$lambda$0;
        }
    }
}

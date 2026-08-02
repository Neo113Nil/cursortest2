package Go;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVH;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3MultiFrameBindDelegate;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10291b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f10290a = i11;
        this.f10291b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit steps$lambda$1;
        Unit steps$lambda$3;
        Unit bindSteps$lambda$0;
        switch (this.f10290a) {
            case 0:
                steps$lambda$1 = RealFbsSplitVH.steps$lambda$1((RealFbsSplitVH) this.f10291b);
                return steps$lambda$1;
            case 1:
                steps$lambda$3 = CartSplitV2ItemWidgetViewHolder.steps$lambda$3((CartSplitV2ItemWidgetViewHolder) this.f10291b);
                return steps$lambda$3;
            default:
                bindSteps$lambda$0 = TravelRailwaySearchResultsV3MultiFrameBindDelegate.bindSteps$lambda$0((TravelRailwaySearchResultsV3MultiFrameBindDelegate) this.f10291b);
                return bindSteps$lambda$0;
        }
    }
}

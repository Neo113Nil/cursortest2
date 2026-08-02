package Go;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVH;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3MultiFrameBindDelegate;

/* loaded from: classes11.dex */
public final /* synthetic */ class c implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10293b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f10292a = i11;
        this.f10293b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit steps$lambda$2;
        Unit bindSteps$lambda$1;
        switch (this.f10292a) {
            case 0:
                steps$lambda$2 = RealFbsSplitVH.steps$lambda$2((RealFbsSplitVH) this.f10293b);
                return steps$lambda$2;
            case 1:
                return CartSplitV2ItemWidgetViewHolder.steps$lambda$4((CartSplitV2ItemWidgetViewHolder) this.f10293b);
            default:
                bindSteps$lambda$1 = TravelRailwaySearchResultsV3MultiFrameBindDelegate.bindSteps$lambda$1((TravelRailwaySearchResultsV3MultiFrameBindDelegate) this.f10293b);
                return bindSteps$lambda$1;
        }
    }
}

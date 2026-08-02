package EX;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3MultiFrameBindDelegate;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.MaxiTileViewHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7715b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f7714a = i11;
        this.f7715b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit steps$lambda$0;
        Unit bindSteps$lambda$2;
        Unit steps$lambda$02;
        switch (this.f7714a) {
            case 0:
                steps$lambda$0 = MaxiTileViewHolder.steps$lambda$0((MaxiTileViewHolder) this.f7715b);
                return steps$lambda$0;
            case 1:
                bindSteps$lambda$2 = TravelRailwaySearchResultsV3MultiFrameBindDelegate.bindSteps$lambda$2((TravelRailwaySearchResultsV3MultiFrameBindDelegate) this.f7715b);
                return bindSteps$lambda$2;
            default:
                steps$lambda$02 = CartSplitV2ProductWidgetViewHolder.steps$lambda$0((CartSplitV2ProductWidgetViewHolder) this.f7715b);
                return steps$lambda$02;
        }
    }
}

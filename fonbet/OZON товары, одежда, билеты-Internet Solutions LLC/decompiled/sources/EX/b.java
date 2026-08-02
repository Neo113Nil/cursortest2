package EX;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.presentation.train.multiFrameBinding.TravelRailwaySearchResultsV3MultiFrameBindDelegate;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.MaxiTileViewHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7717b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f7716a = i11;
        this.f7717b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit steps$lambda$1;
        Unit bindSteps$lambda$3;
        Unit steps$lambda$12;
        switch (this.f7716a) {
            case 0:
                steps$lambda$1 = MaxiTileViewHolder.steps$lambda$1((MaxiTileViewHolder) this.f7717b);
                return steps$lambda$1;
            case 1:
                bindSteps$lambda$3 = TravelRailwaySearchResultsV3MultiFrameBindDelegate.bindSteps$lambda$3((TravelRailwaySearchResultsV3MultiFrameBindDelegate) this.f7717b);
                return bindSteps$lambda$3;
            default:
                steps$lambda$12 = CartSplitV2ProductWidgetViewHolder.steps$lambda$1((CartSplitV2ProductWidgetViewHolder) this.f7717b);
                return steps$lambda$12;
        }
    }
}

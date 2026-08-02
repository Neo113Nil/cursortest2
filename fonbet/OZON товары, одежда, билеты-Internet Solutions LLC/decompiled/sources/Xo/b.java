package Xo;

import kotlin.Unit;
import ru.ozon.app.android.checkoutcomposer.total.presentation.main.TotalVH;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridMultiFrameBindStrategy;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.TravelCarriageSelectV3MultiFrameBindDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.TileGrid2CartButtonBaseViewHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34490b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f34489a = i11;
        this.f34490b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit steps$lambda$4$lambda$1;
        Unit bindStep5$lambda$4;
        Unit steps$lambda$3$lambda$2;
        Unit steps$lambda$0;
        switch (this.f34489a) {
            case 0:
                steps$lambda$4$lambda$1 = TotalVH.steps$lambda$4$lambda$1((TotalVH) this.f34490b);
                return steps$lambda$4$lambda$1;
            case 1:
                bindStep5$lambda$4 = TravelCarriageSelectV3MultiFrameBindDelegate.bindStep5$lambda$4((TravelCarriageSelectV3MultiFrameBindDelegate) this.f34490b);
                return bindStep5$lambda$4;
            case 2:
                steps$lambda$3$lambda$2 = CheckoutTotalViewHolder.steps$lambda$3$lambda$2((CheckoutTotalViewHolder) this.f34490b);
                return steps$lambda$3$lambda$2;
            case 3:
                steps$lambda$0 = TileGrid2CartButtonBaseViewHolder.steps$lambda$0((TileGrid2CartButtonBaseViewHolder) this.f34490b);
                return steps$lambda$0;
            default:
                return Srv2GridMultiFrameBindStrategy.bindStep4$lambda$3((Srv2GridMultiFrameBindStrategy) this.f34490b);
        }
    }
}

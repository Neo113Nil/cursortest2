package Xo;

import kotlin.Unit;
import ru.ozon.app.android.checkoutcomposer.total.presentation.main.TotalVH;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.CheckoutTotalViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.strategy.Srv2GridMultiFrameBindStrategy;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.multiFrameBinding.TravelCarriageSelectV3MultiFrameBindDelegate;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34488b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f34487a = i11;
        this.f34488b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit steps$lambda$4$lambda$0;
        Unit bindStep4$lambda$3;
        Unit steps$lambda$3$lambda$1;
        Unit bindStep3$lambda$2;
        switch (this.f34487a) {
            case 0:
                steps$lambda$4$lambda$0 = TotalVH.steps$lambda$4$lambda$0((TotalVH) this.f34488b);
                return steps$lambda$4$lambda$0;
            case 1:
                bindStep4$lambda$3 = TravelCarriageSelectV3MultiFrameBindDelegate.bindStep4$lambda$3((TravelCarriageSelectV3MultiFrameBindDelegate) this.f34488b);
                return bindStep4$lambda$3;
            case 2:
                steps$lambda$3$lambda$1 = CheckoutTotalViewHolder.steps$lambda$3$lambda$1((CheckoutTotalViewHolder) this.f34488b);
                return steps$lambda$3$lambda$1;
            default:
                bindStep3$lambda$2 = Srv2GridMultiFrameBindStrategy.bindStep3$lambda$2((Srv2GridMultiFrameBindStrategy) this.f34488b);
                return bindStep3$lambda$2;
        }
    }
}

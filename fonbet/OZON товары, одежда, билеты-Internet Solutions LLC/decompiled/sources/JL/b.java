package JL;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.presentation.TotalPriceWithButtonViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.presentation.TravelSortingV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.presentation.CalendarHeaderInformerViewMapper;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14286a;

    public /* synthetic */ b(int i11) {
        this.f14286a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$0;
        View createHolder$lambda$1;
        View createHolder$lambda$12;
        View createHolder$lambda$2;
        switch (this.f14286a) {
            case 0:
                createHolder$lambda$0 = RateAppViewMapper.createHolder$lambda$0(viewGroup);
                return createHolder$lambda$0;
            case 1:
                createHolder$lambda$1 = TravelSortingV2ViewMapper.createHolder$lambda$1((LinearLayout) viewGroup);
                return createHolder$lambda$1;
            case 2:
                createHolder$lambda$12 = CalendarHeaderInformerViewMapper.createHolder$lambda$1((LinearLayout) viewGroup);
                return createHolder$lambda$12;
            default:
                createHolder$lambda$2 = TotalPriceWithButtonViewMapper.createHolder$lambda$2((LinearLayout) viewGroup);
                return createHolder$lambda$2;
        }
    }
}

package AP;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.button.PassengersMatcherV2ButtonNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.presentation.RailwayScrollPriceCalendarStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.sticky.TotalPriceWithButtonV2StickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.overlay.top.TravelTextTopOverlayViewMapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f652a;

    public /* synthetic */ a(int i11) {
        this.f652a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2;
        View createHolder$lambda$0;
        View createHolder$lambda$22;
        View createHolder$lambda$1;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f652a) {
            case 0:
                createHolder$lambda$2 = TotalPriceWithButtonV2StickyViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
            case 1:
                createHolder$lambda$0 = PassengersMatcherV2ButtonNoUiViewMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$0;
            case 2:
                createHolder$lambda$22 = TravelTextTopOverlayViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$22;
            default:
                createHolder$lambda$1 = RailwayScrollPriceCalendarStickyViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
        }
    }
}

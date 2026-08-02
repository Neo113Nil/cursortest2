package ET;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total.FlightSeatsSchemeTotalStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.vertical.VerticalButtonWithInformationViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation.overlay.bottom.TravelTextBottomOverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v2.presentation.top.TravelTextV2StickyTopViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.footer.TouristCountSelectorV3FooterViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursBookInformer.presentation.ToursBookInformerViewMapper;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7708a;

    public /* synthetic */ a(int i11) {
        this.f7708a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$7;
        View createHolder$lambda$0;
        View createHolder$lambda$1;
        View createHolder$lambda$12;
        View createHolder$lambda$13;
        View createHolder$lambda$14;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f7708a) {
            case 0:
                createHolder$lambda$7 = TouristCountSelectorV3FooterViewMapper.createHolder$lambda$7(linearLayout);
                return createHolder$lambda$7;
            case 1:
                createHolder$lambda$0 = ToursBookInformerViewMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$0;
            case 2:
                createHolder$lambda$1 = FlightSeatsSchemeTotalStickyViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            case 3:
                createHolder$lambda$12 = TravelTextBottomOverlayViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$12;
            case 4:
                createHolder$lambda$13 = TravelTextV2StickyTopViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$13;
            default:
                createHolder$lambda$14 = VerticalButtonWithInformationViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$14;
        }
    }
}

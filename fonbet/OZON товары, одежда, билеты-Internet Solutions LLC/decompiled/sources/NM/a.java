package NM;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.buttons.SecureDealButtonsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.tabs.AviaDetailedInfoV3TabsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockStickyViewMapper;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18841a;

    public /* synthetic */ a(int i11) {
        this.f18841a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$12;
        View createHolder$lambda$3;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f18841a) {
            case 0:
                createHolder$lambda$1 = FlightSeatsSchemePassengersBlockStickyViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            case 1:
                createHolder$lambda$12 = SecureDealButtonsViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$12;
            default:
                createHolder$lambda$3 = AviaDetailedInfoV3TabsViewMapper.createHolder$lambda$3(linearLayout);
                return createHolder$lambda$3;
        }
    }
}

package MQ;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation.PriceCalendarHeaderV3OverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarViewMapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17733a;

    public /* synthetic */ a(int i11) {
        this.f17733a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$0;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f17733a) {
            case 0:
                createHolder$lambda$1 = TravelSearchBarViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            default:
                createHolder$lambda$0 = PriceCalendarHeaderV3OverlayViewMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$0;
        }
    }
}

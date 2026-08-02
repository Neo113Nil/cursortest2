package MN;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input.PassengersDirectoryV3InputNoUiViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.PriceCalendarFooterV3BottomViewMapper;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17726a;

    public /* synthetic */ a(int i11) {
        this.f17726a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$3$lambda$2;
        View createHolder$lambda$2;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f17726a) {
            case 0:
                createHolder$lambda$3$lambda$2 = PassengersDirectoryV3InputNoUiViewMapper.createHolder$lambda$3$lambda$2(linearLayout);
                return createHolder$lambda$3$lambda$2;
            default:
                createHolder$lambda$2 = PriceCalendarFooterV3BottomViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
        }
    }
}

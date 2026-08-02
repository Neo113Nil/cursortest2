package LN;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartOverlayMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3OverlayViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.buttons.PassengersDirectoryV3ButtonNoUiViewMapper;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16641a;

    public /* synthetic */ a(int i11) {
        this.f16641a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2$lambda$1;
        View createHolder$lambda$1;
        View createHolder$lambda$2;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f16641a) {
            case 0:
                createHolder$lambda$2$lambda$1 = PassengersDirectoryV3ButtonNoUiViewMapper.createHolder$lambda$2$lambda$1(linearLayout);
                return createHolder$lambda$2$lambda$1;
            case 1:
                createHolder$lambda$1 = BottomCartOverlayMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            default:
                createHolder$lambda$2 = DeliveryWidgetV3OverlayViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
        }
    }
}

package DQ;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.presentation.sticky.ButtonWidgetV2StickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.OverlayButtonsV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation.StickyPromoRedirectV2ViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyTop.ToursMealStickyTopViewMapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6266a;

    public /* synthetic */ a(int i11) {
        this.f6266a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$3;
        View createHolder$lambda$2;
        View createHolder$lambda$12;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f6266a) {
            case 0:
                createHolder$lambda$1 = StickyPromoRedirectV2ViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            case 1:
                createHolder$lambda$3 = ToursMealStickyTopViewMapper.createHolder$lambda$3(linearLayout);
                return createHolder$lambda$3;
            case 2:
                createHolder$lambda$2 = OverlayButtonsV2ViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$12 = ButtonWidgetV2StickyViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$12;
        }
    }
}

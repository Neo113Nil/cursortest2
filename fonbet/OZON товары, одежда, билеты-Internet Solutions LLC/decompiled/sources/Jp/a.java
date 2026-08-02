package Jp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.mapper.SelectButtonViewMapper;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky.TravelPriceDetailInformationNoUiViewMapper;
import ru.ozon.app.android.ugc.widgets.stickyBubble.core.StickyBubbleViewMapper;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14836a;

    public /* synthetic */ a(int i11) {
        this.f14836a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$0;
        View createHolder$lambda$2;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f14836a) {
            case 0:
                createHolder$lambda$1 = SelectButtonViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            case 1:
                createHolder$lambda$0 = TravelPriceDetailInformationNoUiViewMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$0;
            default:
                createHolder$lambda$2 = StickyBubbleViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
        }
    }
}

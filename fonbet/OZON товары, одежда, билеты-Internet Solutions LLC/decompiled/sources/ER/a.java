package ER;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.overlay.QuickFiltersOverlayViewMapper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.presentation.HotelsMapCardV1ViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation.HotelsPageButtonV5OverlayViewMapper;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7707a;

    public /* synthetic */ a(int i11) {
        this.f7707a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$0;
        View createHolder$lambda$1;
        View createHolder$lambda$12;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f7707a) {
            case 0:
                createHolder$lambda$0 = HotelsMapCardV1ViewMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$0;
            case 1:
                createHolder$lambda$1 = QuickFiltersOverlayViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            default:
                createHolder$lambda$12 = HotelsPageButtonV5OverlayViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$12;
        }
    }
}

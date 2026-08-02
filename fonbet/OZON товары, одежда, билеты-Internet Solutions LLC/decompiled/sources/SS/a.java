package SS;

import UZ.d;
import WZ.e;
import WZ.g;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.WholeSaleModalViewModel;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarWidgetViewHolder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26074b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f26073a = i11;
        this.f26074b = obj;
    }

    @Override // WZ.e
    public final g modifyParams(UZ.a aVar, g gVar) {
        g customParamsModifier$lambda$4;
        g onCleared$lambda$1$lambda$0;
        switch (this.f26073a) {
            case 0:
                customParamsModifier$lambda$4 = TravelScrollPriceCalendarWidgetViewHolder.getCustomParamsModifier$lambda$4((String) this.f26074b, (d) aVar, gVar);
                return customParamsModifier$lambda$4;
            default:
                onCleared$lambda$1$lambda$0 = WholeSaleModalViewModel.onCleared$lambda$1$lambda$0((WholeSaleModalViewModel) this.f26074b, (d) aVar, gVar);
                return onCleared$lambda$1$lambda$0;
        }
    }
}

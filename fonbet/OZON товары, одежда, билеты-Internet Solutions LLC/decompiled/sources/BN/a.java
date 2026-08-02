package BN;

import UZ.d;
import WZ.e;
import WZ.g;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModelImpl;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListWidgetViewHolder;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3266b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f3265a = i11;
        this.f3266b = obj;
    }

    @Override // WZ.e
    public final g modifyParams(UZ.a aVar, g gVar) {
        g onSelectorItemSelected$lambda$6$lambda$5;
        g customParamsModifier$lambda$4;
        switch (this.f3265a) {
            case 0:
                onSelectorItemSelected$lambda$6$lambda$5 = HotelsBookAdditionsViewModelImpl.onSelectorItemSelected$lambda$6$lambda$5((SelectorItem) this.f3266b, (d) aVar, gVar);
                return onSelectorItemSelected$lambda$6$lambda$5;
            default:
                customParamsModifier$lambda$4 = UnpaidOrderListWidgetViewHolder.getCustomParamsModifier$lambda$4((String) this.f3266b, (d) aVar, gVar);
                return customParamsModifier$lambda$4;
        }
    }
}

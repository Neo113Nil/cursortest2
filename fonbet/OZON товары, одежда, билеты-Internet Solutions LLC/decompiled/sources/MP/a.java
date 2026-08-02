package MP;

import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3WidgetViewHolder;
import ru.ozon.app.android.travel.molecules.view.quickFiltersRowList.QuickFiltersRowListVO;
import ru.ozon.app.android.travel.molecules.view.quickFiltersRowList.QuickFiltersRowListView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17732c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f17730a = i11;
        this.f17731b = obj;
        this.f17732c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17730a) {
            case 0:
                TravelPaymentV3WidgetViewHolder.bind$lambda$1((TravelPaymentV3VO) this.f17731b, (TravelPaymentV3WidgetViewHolder) this.f17732c);
                break;
            default:
                QuickFiltersRowListView.bind$lambda$4((QuickFiltersRowListView) this.f17731b, (QuickFiltersRowListVO) this.f17732c);
                break;
        }
    }
}

package AA;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation.TravelSearchSortAndFilterViewModel;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.TravelOrderListMobileViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f588b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f587a = i11;
        this.f588b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f587a) {
            case 0:
                this.f588b.invoke(obj);
                break;
            case 1:
                this.f588b.invoke(obj);
                break;
            case 2:
                this.f588b.invoke(obj);
                break;
            case 3:
                this.f588b.invoke(obj);
                break;
            case 4:
                this.f588b.invoke(obj);
                break;
            case 5:
                this.f588b.invoke(obj);
                break;
            case 6:
            case 7:
            default:
                this.f588b.invoke(obj);
                break;
            case 8:
                this.f588b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AtomAction performAction$lambda$0;
        AtomAction performApiAction$lambda$0;
        switch (this.f587a) {
            case 6:
                performAction$lambda$0 = TravelSearchSortAndFilterViewModel.performAction$lambda$0(this.f588b, obj);
                return performAction$lambda$0;
            default:
                performApiAction$lambda$0 = TravelOrderListMobileViewModel.performApiAction$lambda$0(this.f588b, obj);
                return performApiAction$lambda$0;
        }
    }
}

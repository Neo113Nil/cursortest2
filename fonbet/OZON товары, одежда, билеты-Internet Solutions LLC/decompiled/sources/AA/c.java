package AA;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import qc.q;
import ru.ozon.app.android.analytics.plugins.af.AppsFlyerConversionStorageImpl;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements g, o, q, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f591b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f590a = i11;
        this.f591b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f590a) {
            case 0:
                this.f591b.invoke(obj);
                break;
            case 1:
            case 2:
            default:
                this.f591b.invoke(obj);
                break;
            case 3:
                this.f591b.invoke(obj);
                break;
            case 4:
                this.f591b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AtomAction submitRequest$lambda$4;
        PriceCalendarFooterVO performUpdateStateRequest$lambda$0;
        switch (this.f590a) {
            case 1:
                submitRequest$lambda$4 = TouristCountSelectorViewModel.submitRequest$lambda$4(this.f591b, obj);
                return submitRequest$lambda$4;
            default:
                performUpdateStateRequest$lambda$0 = PriceCalendarFooterViewModel.performUpdateStateRequest$lambda$0(this.f591b, obj);
                return performUpdateStateRequest$lambda$0;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f591b.invoke(obj);
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeResult$lambda$1;
        observeResult$lambda$1 = AppsFlyerConversionStorageImpl.observeResult$lambda$1(this.f591b, obj);
        return observeResult$lambda$1;
    }
}

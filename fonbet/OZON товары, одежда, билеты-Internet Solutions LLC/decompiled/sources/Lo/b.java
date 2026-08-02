package Lo;

import com.google.android.material.appbar.AppBarLayout;
import java.util.Map;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector.LogosCarouselVO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector.LogosCarouselViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view.QuickFiltersView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3TextInputView;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.controllers.AppBarController;
import v8.C10272a;
import v8.InterfaceC10273b;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17159c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f17157a = i11;
        this.f17158b = obj;
        this.f17159c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17157a) {
            case 0:
                ((LogosCarouselViewHolder) this.f17158b).scrollToItem((LogosCarouselVO) this.f17159c);
                break;
            case 1:
                AppBarController.configAppBar$lambda$2$lambda$1$lambda$0((AppBarController) this.f17158b, (AppBarLayout) this.f17159c);
                break;
            case 2:
                QuickFiltersView.bind$lambda$4((QuickFiltersView) this.f17158b, (QuickFiltersVO.QuickFiltersState) this.f17159c);
                break;
            case 3:
                AddNewPassengerFormV3TextInputView.bindSuggests$lambda$9((AddNewPassengerFormV3TextInputView) this.f17158b, (TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem) this.f17159c);
                break;
            default:
                ((InterfaceC10273b) ((Map.Entry) this.f17158b).getKey()).a((C10272a) this.f17159c);
                break;
        }
    }
}

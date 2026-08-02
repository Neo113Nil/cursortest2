package KK;

import ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditComponent$Companion$create$1;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di.RateMainButtonComponent;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModelImpl;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarViewModel;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.di.OrderNavTitleComponent;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15429a;

    public /* synthetic */ b(int i11) {
        this.f15429a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        RateViewModelImpl viewModelProvider$lambda$0;
        OrderNavBarViewModel viewModel$lambda$0;
        InputViewModel inputViewModelProvider$lambda$0;
        switch (this.f15429a) {
            case 0:
                viewModelProvider$lambda$0 = RateMainButtonComponent.viewModelProvider$lambda$0();
                return viewModelProvider$lambda$0;
            case 1:
                viewModel$lambda$0 = OrderNavTitleComponent.viewModel$lambda$0();
                return viewModel$lambda$0;
            default:
                inputViewModelProvider$lambda$0 = ReturnImageEditComponent$Companion$create$1.inputViewModelProvider$lambda$0();
                return inputViewModelProvider$lambda$0;
        }
    }
}

package KK;

import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di.RateComponent;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModelImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15428a;

    public /* synthetic */ a(int i11) {
        this.f15428a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        RateViewModelImpl viewModelProvider$lambda$0;
        HandlersInhibitor handlersInhibitor$lambda$1;
        switch (this.f15428a) {
            case 0:
                viewModelProvider$lambda$0 = RateComponent.viewModelProvider$lambda$0();
                return viewModelProvider$lambda$0;
            default:
                handlersInhibitor$lambda$1 = CartSplitV2ProductWidgetComponent$Companion$create$1$1.handlersInhibitor$lambda$1();
                return handlersInhibitor$lambda$1;
        }
    }
}

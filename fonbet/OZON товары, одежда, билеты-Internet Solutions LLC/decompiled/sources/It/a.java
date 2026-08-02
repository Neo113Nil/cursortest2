package It;

import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.di.CartMasterWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.cart.widgets.cartMaster.presentation.CartMasterViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12602a;

    public /* synthetic */ a(int i11) {
        this.f12602a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        CartMasterViewModel viewModel$lambda$0;
        HandlersInhibitor handlersInhibitor$lambda$2;
        switch (this.f12602a) {
            case 0:
                viewModel$lambda$0 = CartMasterWidgetComponent$Companion$create$1$1.viewModel$lambda$0();
                return viewModel$lambda$0;
            default:
                handlersInhibitor$lambda$2 = CartSplitV2ControlsWidgetComponent$Companion$create$1$1.handlersInhibitor$lambda$2();
                return handlersInhibitor$lambda$2;
        }
    }
}

package Pv;

import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CartSplitV2ViewModelV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.CartSplitV2ControlsWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.di.StickyOzonBankPromoComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.di.CatalogShelfComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22715a;

    public /* synthetic */ a(int i11) {
        this.f22715a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        CatalogTabsSharedViewModel catalogTabsSharedViewModel$lambda$0;
        CartSplitV2ViewModelV2 viewModelProvider$lambda$0;
        TotalVisibilityViewModel cartTotalVisibilityViewModelProvider$lambda$0;
        switch (this.f22715a) {
            case 0:
                catalogTabsSharedViewModel$lambda$0 = CatalogShelfComponent$Companion$create$1$1.catalogTabsSharedViewModel$lambda$0();
                return catalogTabsSharedViewModel$lambda$0;
            case 1:
                viewModelProvider$lambda$0 = CartSplitV2ControlsWidgetComponent$Companion$create$1$1.viewModelProvider$lambda$0();
                return viewModelProvider$lambda$0;
            default:
                cartTotalVisibilityViewModelProvider$lambda$0 = StickyOzonBankPromoComponent$Companion$create$1$1.cartTotalVisibilityViewModelProvider$lambda$0();
                return cartTotalVisibilityViewModelProvider$lambda$0;
        }
    }
}

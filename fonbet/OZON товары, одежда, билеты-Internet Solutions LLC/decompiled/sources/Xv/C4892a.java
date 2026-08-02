package Xv;

import ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2Component$Companion$create$1$1;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;

/* renamed from: Xv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C4892a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34501a;

    public /* synthetic */ C4892a(int i11) {
        this.f34501a = i11;
    }

    @Override // Pc.a
    public final Object get() {
        CatalogTabsSharedViewModel catalogTabsSharedViewModelProvider$lambda$0;
        SharedSellerViewModel sellerViewModelProvider$lambda$1;
        switch (this.f34501a) {
            case 0:
                catalogTabsSharedViewModelProvider$lambda$0 = CatalogTabsV2Component$Companion$create$1$1.catalogTabsSharedViewModelProvider$lambda$0();
                return catalogTabsSharedViewModelProvider$lambda$0;
            default:
                sellerViewModelProvider$lambda$1 = ShoppingListsV2WidgetComponent$Companion$create$1$1.sellerViewModelProvider$lambda$1();
                return sellerViewModelProvider$lambda$1;
        }
    }
}

package At;

import hi.InterfaceC6958a;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerVmWrapper;
import ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent$Companion$create$1$1;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6958a f1275b;

    public /* synthetic */ b(InterfaceC6958a interfaceC6958a, int i11) {
        this.f1274a = i11;
        this.f1275b = interfaceC6958a;
    }

    @Override // Pc.a
    public final Object get() {
        SelectedProductsManagerVmWrapper viewModelProvider$lambda$0;
        SubscribeViewModel subscribeViewModelProvider$lambda$0;
        switch (this.f1274a) {
            case 0:
                viewModelProvider$lambda$0 = WishlistMultiselectWidgetComponent$Companion$create$1$1.viewModelProvider$lambda$0((WishlistMultiselectWidgetComponent$Companion$create$1$1) this.f1275b);
                return viewModelProvider$lambda$0;
            default:
                subscribeViewModelProvider$lambda$0 = CartButtonV5WidgetComponent$Companion$create$1$1.subscribeViewModelProvider$lambda$0((CartButtonV5WidgetComponent$Companion$create$1$1) this.f1275b);
                return subscribeViewModelProvider$lambda$0;
        }
    }
}

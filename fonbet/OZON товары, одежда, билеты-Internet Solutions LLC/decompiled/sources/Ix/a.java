package Ix;

import k20.C7475g;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.di.ProductsInBotV2Component$Companion$create$1$1;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.ProductsInBotV2ViewModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent$Companion$create$1$1;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12604b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f12603a = i11;
        this.f12604b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        ProductsInBotV2ViewModel viewModelProvider$lambda$0;
        SmallTileAddToCartButtonBinder addToCartButtonBinderProvider$lambda$0;
        switch (this.f12603a) {
            case 0:
                viewModelProvider$lambda$0 = ProductsInBotV2Component$Companion$create$1$1.viewModelProvider$lambda$0((C7475g) this.f12604b);
                return viewModelProvider$lambda$0;
            default:
                addToCartButtonBinderProvider$lambda$0 = TileGrid3WidgetComponent$Companion$create$1$1.addToCartButtonBinderProvider$lambda$0((TileGrid3WidgetComponent$Companion$create$1$1) this.f12604b);
                return addToCartButtonBinderProvider$lambda$0;
        }
    }
}

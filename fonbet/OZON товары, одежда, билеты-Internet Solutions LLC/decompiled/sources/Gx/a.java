package Gx;

import k20.C7475g;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.di.OrderTrackingComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.presentation.OrderTrackingViewModel;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.ProductsInBotViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10320a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f10321b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f10320a = i11;
        this.f10321b = c7475g;
    }

    @Override // Pc.a
    public final Object get() {
        ProductsInBotViewModel viewModelProvider$lambda$0;
        OrderTrackingViewModel viewModelProvider$lambda$02;
        switch (this.f10320a) {
            case 0:
                viewModelProvider$lambda$0 = ProductsInBotComponent$Companion$create$1$1.viewModelProvider$lambda$0(this.f10321b);
                return viewModelProvider$lambda$0;
            default:
                viewModelProvider$lambda$02 = OrderTrackingComponent$Companion$create$1$1.viewModelProvider$lambda$0(this.f10321b);
                return viewModelProvider$lambda$02;
        }
    }
}

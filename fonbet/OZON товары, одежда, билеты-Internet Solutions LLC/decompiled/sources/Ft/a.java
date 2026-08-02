package Ft;

import k20.C7475g;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.di.CartControlsComponent$Companion$create$1$1;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewModel;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.di.StaticCouponListComponent;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9559b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9558a = i11;
        this.f9559b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        CartControlsViewModel viewModel$lambda$0;
        StaticCouponListWidgetViewModel widgetViewModel$lambda$0;
        switch (this.f9558a) {
            case 0:
                viewModel$lambda$0 = CartControlsComponent$Companion$create$1$1.viewModel$lambda$0((C7475g) this.f9559b);
                return viewModel$lambda$0;
            default:
                widgetViewModel$lambda$0 = StaticCouponListComponent.widgetViewModel$lambda$0((StaticCouponListComponent) this.f9559b);
                return widgetViewModel$lambda$0;
        }
    }
}

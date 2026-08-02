package Gv;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.di.OrderInfoComponent;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.di.SellerSortSwitcherComponent;

/* renamed from: Gv.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3130a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10317a;

    public /* synthetic */ C3130a(int i11) {
        this.f10317a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        OrderInfoComponent create$lambda$0;
        SellerSortSwitcherComponent create$lambda$02;
        switch (this.f10317a) {
            case 0:
                create$lambda$0 = OrderInfoComponent.Companion.create$lambda$0();
                return create$lambda$0;
            default:
                create$lambda$02 = SellerSortSwitcherComponent.Companion.create$lambda$0();
                return create$lambda$02;
        }
    }
}

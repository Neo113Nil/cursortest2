package FD;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.checkoutPrefetch.di.CheckoutPrefetchComponent;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.di.CartControlsComponent;
import ru.ozon.app.android.fresh.chat.widgets.promptStatus.di.PromptStatusDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryToCharitiesInfo.di.DeliveryToCharitiesInfoComponent;
import ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent;
import ru.ozon.app.android.storefront.widgets.cms.di.BannerComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.di.NotificationSubscriptionComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.di.NotificationSubscriptionBannerV3Component;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.di.OrderToursChangeFormComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f9177b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f9176a = i11;
        this.f9177b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        DeliveryV6WidgetComponent create$lambda$0;
        CartControlsComponent create$lambda$02;
        PromptStatusDIComponent create$lambda$03;
        NotificationSubscriptionComponent create$lambda$04;
        NotificationSubscriptionBannerV3Component create$lambda$05;
        DeliveryToCharitiesInfoComponent create$lambda$06;
        BannerComponent create$lambda$07;
        CheckoutPrefetchComponent create$lambda$08;
        OrderToursChangeFormComponent create$lambda$09;
        switch (this.f9176a) {
            case 0:
                create$lambda$0 = DeliveryV6WidgetComponent.Companion.create$lambda$0(this.f9177b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = CartControlsComponent.Companion.create$lambda$0(this.f9177b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = PromptStatusDIComponent.Companion.create$lambda$0(this.f9177b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = NotificationSubscriptionComponent.Companion.create$lambda$0(this.f9177b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = NotificationSubscriptionBannerV3Component.Companion.create$lambda$0(this.f9177b);
                return create$lambda$05;
            case 5:
                create$lambda$06 = DeliveryToCharitiesInfoComponent.Companion.create$lambda$0(this.f9177b);
                return create$lambda$06;
            case 6:
                create$lambda$07 = BannerComponent.Companion.create$lambda$0(this.f9177b);
                return create$lambda$07;
            case 7:
                create$lambda$08 = CheckoutPrefetchComponent.Companion.create$lambda$0(this.f9177b);
                return create$lambda$08;
            default:
                create$lambda$09 = OrderToursChangeFormComponent.Companion.create$lambda$0(this.f9177b);
                return create$lambda$09;
        }
    }
}

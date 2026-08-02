package Bs;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent;
import ru.ozon.app.android.checkoutcomposer.comment.di.CommentWidgetComponent;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetComponent;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.di.AddLegalAddressMobileComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddLegalAddressMobileViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.core.AddLegalInnMobileViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalInnMobile.di.AddLegalInnMobileComponent;
import ru.ozon.app.android.search.widgets.aiHelper.di.AiHelperComponent;
import ru.ozon.app.android.storefront.widgets.miniappHeader.di.MiniappHeaderComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.di.AviaCheckTariffsPriceDetailsComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.di.EmptyStateV3Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.di.FiltersComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.di.RoundedNavBarComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelHiddenErrorTimeout.di.TravelHiddenErrorTimeoutComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.stepListWithScale.di.StepListWithScaleComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetails.di.HotelsPageDetailsComponent;

/* renamed from: Bs.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2670a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4039b;

    public /* synthetic */ C2670a(C7475g c7475g, int i11) {
        this.f4038a = i11;
        this.f4039b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        DeliveryReviewFormWidgetComponent widgetComponent$lambda$0;
        ControlsV3WidgetComponent create$lambda$0;
        EmptyStateV3Component create$lambda$02;
        TravelHiddenErrorTimeoutComponent create$lambda$03;
        FiltersComponent widgetComponent$lambda$2;
        MiniappHeaderComponent create$lambda$04;
        AddLegalAddressMobileComponent widgetComponent$lambda$02;
        AddLegalInnMobileComponent widgetComponent$lambda$03;
        CommentWidgetComponent create$lambda$05;
        StepListWithScaleComponent create$lambda$06;
        AiHelperComponent create$lambda$07;
        RoundedNavBarComponent create$lambda$08;
        HotelsPageDetailsComponent create$lambda$09;
        AviaCheckTariffsPriceDetailsComponent create$lambda$010;
        OrderDonePaymentStatusWidgetComponent create$lambda$011;
        switch (this.f4038a) {
            case 0:
                widgetComponent$lambda$0 = DeliveryReviewFormItemViewMapper.widgetComponent$lambda$0(this.f4039b);
                return widgetComponent$lambda$0;
            case 1:
                create$lambda$0 = ControlsV3WidgetComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$0;
            case 2:
                create$lambda$02 = EmptyStateV3Component.Companion.create$lambda$0(this.f4039b);
                return create$lambda$02;
            case 3:
                create$lambda$03 = TravelHiddenErrorTimeoutComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$03;
            case 4:
                widgetComponent$lambda$2 = FiltersSectionViewMapper.widgetComponent$lambda$2(this.f4039b);
                return widgetComponent$lambda$2;
            case 5:
                create$lambda$04 = MiniappHeaderComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$04;
            case 6:
                widgetComponent$lambda$02 = AddLegalAddressMobileViewMapper.widgetComponent$lambda$0(this.f4039b);
                return widgetComponent$lambda$02;
            case 7:
                widgetComponent$lambda$03 = AddLegalInnMobileViewMapper.widgetComponent$lambda$0(this.f4039b);
                return widgetComponent$lambda$03;
            case 8:
                create$lambda$05 = CommentWidgetComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$05;
            case 9:
                create$lambda$06 = StepListWithScaleComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$06;
            case 10:
                create$lambda$07 = AiHelperComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$07;
            case 11:
                create$lambda$08 = RoundedNavBarComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$08;
            case 12:
                create$lambda$09 = HotelsPageDetailsComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$09;
            case 13:
                create$lambda$010 = AviaCheckTariffsPriceDetailsComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$010;
            default:
                create$lambda$011 = OrderDonePaymentStatusWidgetComponent.Companion.create$lambda$0(this.f4039b);
                return create$lambda$011;
        }
    }
}

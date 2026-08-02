package DD;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.bank.widgets.installmentPaymentScheduleV2.di.InstallmentPaymentScheduleWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.deliveryQuantity.di.DeliveryQuantityWidgetComponent;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.di.CatalogTileScrollComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.di.CharityAddressSelectorComponent;
import ru.ozon.app.android.marketing.widgets.shopButtons.di.ShopButtonsComponent;
import ru.ozon.app.android.orderdetails.orderactions.v1.di.OrderActionsComponent;
import ru.ozon.app.android.orderdetails.orderactions.v1.presentation.OrderActionsViewMapper;
import ru.ozon.app.android.orderdetails.radiogroup.di.RadioGroupComponent;
import ru.ozon.app.android.orderdetails.radiogroup.presentation.RadioGroupWidgetViewMapper;
import ru.ozon.app.android.pdp.widgets.delivery.di.DeliveryWidgetComponent;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.di.DescriptionAccordionWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.daily.di.DailyComponent;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.di.ReturnTextAreaButtonsComponent;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.mapper.ReturnTextAreaButtonViewMapper;
import ru.ozon.app.android.returns.edit.presentation.comment.ReturnEditCommentComponent;
import ru.ozon.app.android.returns.edit.presentation.comment.ReturnTextEditBlockViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.di.CalendarComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.paymentDetails.di.PaymentDetailsComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.nightsRangeSelector.v3.di.NightsRangeSelectorV3Component;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.di.ReportAbuseFormComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di.UniversalObjectScrollWidgetComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f6222b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f6221a = i11;
        this.f6222b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        DeliveryWidgetComponent create$lambda$0;
        UniversalObjectScrollWidgetComponent create$lambda$02;
        DescriptionAccordionWidgetComponent instance$lambda$0;
        ReportAbuseFormComponent instance$lambda$02;
        DailyComponent create$lambda$03;
        CatalogTileScrollComponent create$lambda$04;
        CalendarComponent create$lambda$05;
        CharityAddressSelectorComponent create$lambda$06;
        ShopButtonsComponent create$lambda$07;
        PaymentDetailsComponent create$lambda$08;
        ReturnTextAreaButtonsComponent widgetComponent$lambda$0;
        OrderActionsComponent widgetComponent$lambda$02;
        ReturnEditCommentComponent widgetComponent$lambda$03;
        DeliveryQuantityWidgetComponent create$lambda$09;
        NightsRangeSelectorV3Component create$lambda$010;
        InstallmentPaymentScheduleWidgetComponent create$lambda$011;
        RadioGroupComponent widgetComponent$lambda$04;
        switch (this.f6221a) {
            case 0:
                create$lambda$0 = DeliveryWidgetComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = UniversalObjectScrollWidgetComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$02;
            case 2:
                instance$lambda$0 = DescriptionAccordionWidgetComponent.Companion.getInstance$lambda$0(this.f6222b);
                return instance$lambda$0;
            case 3:
                instance$lambda$02 = ReportAbuseFormComponent.Companion.getInstance$lambda$0(this.f6222b);
                return instance$lambda$02;
            case 4:
                create$lambda$03 = DailyComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = CatalogTileScrollComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$04;
            case 6:
                create$lambda$05 = CalendarComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$05;
            case 7:
                create$lambda$06 = CharityAddressSelectorComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$06;
            case 8:
                create$lambda$07 = ShopButtonsComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$07;
            case 9:
                create$lambda$08 = PaymentDetailsComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$08;
            case 10:
                widgetComponent$lambda$0 = ReturnTextAreaButtonViewMapper.widgetComponent$lambda$0(this.f6222b);
                return widgetComponent$lambda$0;
            case 11:
                widgetComponent$lambda$02 = OrderActionsViewMapper.widgetComponent$lambda$0(this.f6222b);
                return widgetComponent$lambda$02;
            case 12:
                widgetComponent$lambda$03 = ReturnTextEditBlockViewMapper.widgetComponent$lambda$0(this.f6222b);
                return widgetComponent$lambda$03;
            case 13:
                create$lambda$09 = DeliveryQuantityWidgetComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$09;
            case 14:
                create$lambda$010 = NightsRangeSelectorV3Component.Companion.create$lambda$0(this.f6222b);
                return create$lambda$010;
            case 15:
                create$lambda$011 = InstallmentPaymentScheduleWidgetComponent.Companion.create$lambda$0(this.f6222b);
                return create$lambda$011;
            default:
                widgetComponent$lambda$04 = RadioGroupWidgetViewMapper.widgetComponent$lambda$0(this.f6222b);
                return widgetComponent$lambda$04;
        }
    }
}

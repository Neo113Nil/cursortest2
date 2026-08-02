package AN;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.commonBarcode.di.CommonBarcodeComponent;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.core.OrderDoneButtonBarWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.di.OrderDoneButtonBarWidgetComponent;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.core.OrderDoneCrossButtonWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonecrossbutton.di.OrderDoneCrossButtonWidgetComponent;
import ru.ozon.app.android.cml.delivery.widgets.stickyButton.di.StickyButtonComponent;
import ru.ozon.app.android.common.ui.actionCards.core.ActionCardsViewMapper;
import ru.ozon.app.android.common.ui.actionCards.di.ActionCardsComponent;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.di.CheckoutTotalWidgetComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.di.FeedbackCurtainComponent;
import ru.ozon.app.android.orders.cml.deliveryInfo.di.DeliveryInfoWidgetComponent;
import ru.ozon.app.android.pdp.widgets.textDescription.di.TextDescriptionWidgetComponent;
import ru.ozon.app.android.returns.ui.molecules.opencloud.di.OpenCloudComponent;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewMapper.OpenCloudViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.core.NpsRatingWidgetComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.di.HotelsBookAdditionsComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.di.PricesHistogramV2Component;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di.SelectionItemDescriptionComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f649b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f648a = i11;
        this.f649b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        HotelsBookAdditionsComponent create$lambda$0;
        DeliveryInfoWidgetComponent create$lambda$02;
        OpenCloudComponent widgetComponent$lambda$0;
        CommonBarcodeComponent widgetComponent$lambda$02;
        NpsRatingWidgetComponent widgetComponent$lambda$03;
        TextDescriptionWidgetComponent instance$lambda$0;
        CheckoutTotalWidgetComponent create$lambda$03;
        PricesHistogramV2Component create$lambda$04;
        ActionCardsComponent widgetComponent$lambda$04;
        FeedbackCurtainComponent create$lambda$05;
        SelectionItemDescriptionComponent create$lambda$06;
        StickyButtonComponent create$lambda$07;
        OrderDoneButtonBarWidgetComponent widgetComponent$lambda$05;
        OrderDoneCrossButtonWidgetComponent widgetComponent$lambda$2;
        switch (this.f648a) {
            case 0:
                create$lambda$0 = HotelsBookAdditionsComponent.Companion.create$lambda$0(this.f649b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = DeliveryInfoWidgetComponent.Companion.create$lambda$0(this.f649b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$0 = OpenCloudViewMapper.widgetComponent$lambda$0(this.f649b);
                return widgetComponent$lambda$0;
            case 3:
                widgetComponent$lambda$02 = CommonBarcodeFullWidthViewMapper.widgetComponent$lambda$0(this.f649b);
                return widgetComponent$lambda$02;
            case 4:
                widgetComponent$lambda$03 = NpsRatingViewMapper.widgetComponent$lambda$0(this.f649b);
                return widgetComponent$lambda$03;
            case 5:
                instance$lambda$0 = TextDescriptionWidgetComponent.Companion.getInstance$lambda$0(this.f649b);
                return instance$lambda$0;
            case 6:
                create$lambda$03 = CheckoutTotalWidgetComponent.Companion.create$lambda$0(this.f649b);
                return create$lambda$03;
            case 7:
                create$lambda$04 = PricesHistogramV2Component.Companion.create$lambda$0(this.f649b);
                return create$lambda$04;
            case 8:
                widgetComponent$lambda$04 = ActionCardsViewMapper.widgetComponent$lambda$0(this.f649b);
                return widgetComponent$lambda$04;
            case 9:
                create$lambda$05 = FeedbackCurtainComponent.Companion.create$lambda$0(this.f649b);
                return create$lambda$05;
            case 10:
                create$lambda$06 = SelectionItemDescriptionComponent.Companion.create$lambda$0(this.f649b);
                return create$lambda$06;
            case 11:
                create$lambda$07 = StickyButtonComponent.Companion.create$lambda$0(this.f649b);
                return create$lambda$07;
            case 12:
                widgetComponent$lambda$05 = OrderDoneButtonBarWidgetViewMapper.widgetComponent$lambda$0(this.f649b);
                return widgetComponent$lambda$05;
            default:
                widgetComponent$lambda$2 = OrderDoneCrossButtonWidgetViewMapper.widgetComponent$lambda$2(this.f649b);
                return widgetComponent$lambda$2;
        }
    }
}

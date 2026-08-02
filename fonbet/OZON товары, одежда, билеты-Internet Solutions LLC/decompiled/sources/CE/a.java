package CE;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.di.RfbsAddressInfoWidgetComponent;
import ru.ozon.app.android.composer.di.page.RetainComposerViewModel;
import ru.ozon.app.android.favorites.applyWishlist.di.ApplyWishlistWidgetComponent;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di.FreshPremiumPointsTrainComponent;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.FreshPremiumPointsTrainMultipleViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di.DocsDeliveryFormComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.submitButton.DocsDeliverySubmitButtonViewMapper;
import ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.di.CurtainGoalsV2Component;
import ru.ozon.app.android.pdp.widgets.othersellers.core.di.OtherSellersSellerComponent;
import ru.ozon.app.android.pdp.widgets.priceV4.di.PriceV4Component;
import ru.ozon.app.android.pdp.widgets.wholesaleInputButton.di.WholesaleInputButtonWidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.railwayScrollPriceCalendar.di.RailwayScrollPriceCalendarComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.di.ToursHotelInfoCardComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4525b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f4524a = i11;
        this.f4525b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        PriceV4Component create$lambda$0;
        RfbsAddressInfoWidgetComponent create$lambda$02;
        ToursHotelInfoCardComponent create$lambda$03;
        DocsDeliveryFormComponent widgetComponent$lambda$1;
        ApplyWishlistWidgetComponent create$lambda$04;
        WholesaleInputButtonWidgetComponent create$lambda$05;
        CurtainGoalsV2Component create$lambda$06;
        FreshPremiumPointsTrainComponent widgetComponent$lambda$0;
        RailwayScrollPriceCalendarComponent create$lambda$07;
        OtherSellersSellerComponent createComponent$lambda$0;
        InterfaceC6958a interfaceC6958a;
        switch (this.f4524a) {
            case 0:
                create$lambda$0 = PriceV4Component.Companion.create$lambda$0((C7475g) this.f4525b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = RfbsAddressInfoWidgetComponent.Companion.create$lambda$0((C7475g) this.f4525b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = ToursHotelInfoCardComponent.Companion.create$lambda$0((C7475g) this.f4525b);
                return create$lambda$03;
            case 3:
                widgetComponent$lambda$1 = DocsDeliverySubmitButtonViewMapper.widgetComponent$lambda$1((C7475g) this.f4525b);
                return widgetComponent$lambda$1;
            case 4:
                create$lambda$04 = ApplyWishlistWidgetComponent.Companion.create$lambda$0((C7475g) this.f4525b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = WholesaleInputButtonWidgetComponent.Companion.create$lambda$0((C7475g) this.f4525b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = CurtainGoalsV2Component.Companion.create$lambda$0((C7475g) this.f4525b);
                return create$lambda$06;
            case 7:
                widgetComponent$lambda$0 = FreshPremiumPointsTrainMultipleViewMapper.widgetComponent$lambda$0((C7475g) this.f4525b);
                return widgetComponent$lambda$0;
            case 8:
                create$lambda$07 = RailwayScrollPriceCalendarComponent.Companion.create$lambda$0((C7475g) this.f4525b);
                return create$lambda$07;
            case 9:
                createComponent$lambda$0 = OtherSellersSellerComponent.Companion.createComponent$lambda$0((C7475g) this.f4525b);
                return createComponent$lambda$0;
            default:
                interfaceC6958a = ((RetainComposerViewModel) this.f4525b).retainComponent;
                return interfaceC6958a;
        }
    }
}

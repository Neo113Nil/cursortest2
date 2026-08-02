package GN;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.bank.widgets.premiumPoints.core.PremiumPointsViewMapper;
import ru.ozon.app.android.bank.widgets.premiumPoints.di.PremiumPointsComponent;
import ru.ozon.app.android.checkoutcomposer.split.di.SplitWidgetComponent;
import ru.ozon.app.android.geo.addresseditconfirmbutton.di.AddressEditConfirmButtonWidgetComponent;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.di.BigPromoPDPComponent;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.di.MarketingActionsWidgetComponent;
import ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollViewMapper;
import ru.ozon.app.android.search.widgets.feedbackTile.di.FeedbackTileComponent;
import ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.di.HotelsCheckoutTitleComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.di.PriceCalendarHeaderV3Component;
import ru.ozon.app.android.ugc.widgets.createlistwrapper.di.CreateListWrapperWidgetComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9837a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f9838b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f9837a = i11;
        this.f9838b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        HotelsCheckoutTitleComponent create$lambda$0;
        RateAppWidgetComponent create$lambda$02;
        SkuThinScrollComponent widgetComponent$lambda$0;
        SplitWidgetComponent create$lambda$03;
        CreateListWrapperWidgetComponent create$lambda$04;
        BigPromoPDPComponent create$lambda$05;
        MarketingActionsWidgetComponent create$lambda$06;
        AddressEditConfirmButtonWidgetComponent create$lambda$07;
        PriceCalendarHeaderV3Component create$lambda$08;
        FeedbackTileComponent create$lambda$09;
        PremiumPointsComponent widgetComponent$lambda$1;
        switch (this.f9837a) {
            case 0:
                create$lambda$0 = HotelsCheckoutTitleComponent.Companion.create$lambda$0(this.f9838b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = RateAppWidgetComponent.Companion.create$lambda$0(this.f9838b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$0 = SkuThinScrollViewMapper.widgetComponent$lambda$0(this.f9838b);
                return widgetComponent$lambda$0;
            case 3:
                create$lambda$03 = SplitWidgetComponent.Companion.create$lambda$0(this.f9838b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = CreateListWrapperWidgetComponent.Companion.create$lambda$0(this.f9838b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = BigPromoPDPComponent.Companion.create$lambda$0(this.f9838b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = MarketingActionsWidgetComponent.Companion.create$lambda$0(this.f9838b);
                return create$lambda$06;
            case 7:
                create$lambda$07 = AddressEditConfirmButtonWidgetComponent.Companion.create$lambda$0(this.f9838b);
                return create$lambda$07;
            case 8:
                create$lambda$08 = PriceCalendarHeaderV3Component.Companion.create$lambda$0(this.f9838b);
                return create$lambda$08;
            case 9:
                create$lambda$09 = FeedbackTileComponent.Companion.create$lambda$0(this.f9838b);
                return create$lambda$09;
            default:
                widgetComponent$lambda$1 = PremiumPointsViewMapper.widgetComponent$lambda$1(this.f9838b);
                return widgetComponent$lambda$1;
        }
    }
}

package AO;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.core.title.TitleViewMapper;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.di.AddressPartsInputComponent;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.di.ParcelPhotoAddComponent;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.IconButtonWidgetViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.di.IconButtonWidgetComponent;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di.TipCourierHeaderComponent;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.simple.TipCourierHeaderViewMapper;
import ru.ozon.app.android.favorites.buttonStack.di.ButtonStackWidgetComponent;
import ru.ozon.app.android.fresh.cart.widgets.cartClickTile.di.CartClickTileDIComponent;
import ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.di.StickyPromoBannerComponent;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.di.MatchShoppingCardsWidgetComponent;
import ru.ozon.app.android.returns.creation.widgets.activeDeliveries.di.ReturnCreationActiveDeliveriesComponent;
import ru.ozon.app.android.rfbs.deliverycomplain.di.DeliveryComplainWidgetComponent;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.DeliveryComplainOverlayViewMapper;
import ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent;
import ru.ozon.app.android.search.widgets.title.core.SearchHistoryTitleViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.di.TravelFlightCheckTariffComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.disposableBanner.di.DisposableBannerComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating.SingleReviewHeaderInfoComponent;
import ru.ozon.app.android.ugc.widgets.ugccounters.di.UgcCountersComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f651b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f650a = i11;
        this.f651b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        DisposableBannerComponent create$lambda$0;
        CartClickTileDIComponent create$lambda$02;
        DeliveryComplainWidgetComponent widgetComponent$lambda$3;
        MatchShoppingCardsWidgetComponent create$lambda$03;
        StickyPromoBannerComponent create$lambda$04;
        ParcelPhotoAddComponent create$lambda$05;
        ReturnCreationActiveDeliveriesComponent create$lambda$06;
        ButtonStackWidgetComponent create$lambda$07;
        UgcCountersComponent instance$lambda$0;
        AddressPartsInputComponent create$lambda$08;
        SearchHistoryWidgetComponent widgetComponent$lambda$0;
        TravelFlightCheckTariffComponent create$lambda$09;
        TipCourierHeaderComponent widgetComponent$lambda$02;
        IconButtonWidgetComponent widgetComponent$lambda$03;
        ClickToDeliveryWidgetComponent widgetComponent$lambda$1;
        SingleReviewHeaderInfoComponent create$lambda$010;
        switch (this.f650a) {
            case 0:
                create$lambda$0 = DisposableBannerComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = CartClickTileDIComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$3 = DeliveryComplainOverlayViewMapper.widgetComponent$lambda$3(this.f651b);
                return widgetComponent$lambda$3;
            case 3:
                create$lambda$03 = MatchShoppingCardsWidgetComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = StickyPromoBannerComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = ParcelPhotoAddComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = ReturnCreationActiveDeliveriesComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$06;
            case 7:
                create$lambda$07 = ButtonStackWidgetComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$07;
            case 8:
                instance$lambda$0 = UgcCountersComponent.Companion.getInstance$lambda$0(this.f651b);
                return instance$lambda$0;
            case 9:
                create$lambda$08 = AddressPartsInputComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$08;
            case 10:
                widgetComponent$lambda$0 = SearchHistoryTitleViewMapper.widgetComponent$lambda$0(this.f651b);
                return widgetComponent$lambda$0;
            case 11:
                create$lambda$09 = TravelFlightCheckTariffComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$09;
            case 12:
                widgetComponent$lambda$02 = TipCourierHeaderViewMapper.widgetComponent$lambda$0(this.f651b);
                return widgetComponent$lambda$02;
            case 13:
                widgetComponent$lambda$03 = IconButtonWidgetViewMapper.widgetComponent$lambda$0(this.f651b);
                return widgetComponent$lambda$03;
            case 14:
                widgetComponent$lambda$1 = TitleViewMapper.widgetComponent$lambda$1(this.f651b);
                return widgetComponent$lambda$1;
            default:
                create$lambda$010 = SingleReviewHeaderInfoComponent.Companion.create$lambda$0(this.f651b);
                return create$lambda$010;
        }
    }
}

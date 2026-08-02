package Bm;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.bank.widgets.productStarsTile.core.ProductStarsTileViewMapper;
import ru.ozon.app.android.bank.widgets.productStarsTile.di.ProductStarsTileWidgetComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.di.EdoProvidersV2Component;
import ru.ozon.app.android.geo.addressBookBarV2.di.AddressBookBarV2Component;
import ru.ozon.app.android.orderdetails.cheques.di.ChequeComponent;
import ru.ozon.app.android.orderdetails.cheques.presentation.cheque.ChequeViewMapper;
import ru.ozon.app.android.orderdetails.replytocourierinfo.di.ReplyToCourierInfoComponent;
import ru.ozon.app.android.orderdetails.replytocourierinfo.presentation.ReplyToCourierInfoWidgetViewMapper;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.di.EntryBannerComponent;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewMapper.ReturnCreationDeliveryViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.di.ServicePackSelectionV3Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.di.TravelAddNewPassengerFormV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.di.TravelHotelCardV3Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelHotelCard.v3.presentation.TravelHotelCardV3ViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.singleVideo.SingleReviewSingleVideoComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo.SingleReviewUserInfoComponent;

/* renamed from: Bm.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2665a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4003b;

    public /* synthetic */ C2665a(C7475g c7475g, int i11) {
        this.f4002a = i11;
        this.f4003b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ProductStarsTileWidgetComponent widgetComponent$lambda$0;
        SingleReviewUserInfoComponent create$lambda$0;
        DeliveryGroupComponent widgetComponent$lambda$1;
        TravelHotelCardV3Component widgetComponent$lambda$02;
        EdoProvidersV2Component create$lambda$02;
        ChequeComponent widgetComponent$lambda$03;
        TravelAddNewPassengerFormV2Component create$lambda$03;
        EntryBannerComponent create$lambda$04;
        ServicePackSelectionV3Component create$lambda$05;
        AddressBookBarV2Component create$lambda$06;
        SingleReviewSingleVideoComponent create$lambda$07;
        ReplyToCourierInfoComponent widgetComponent$lambda$04;
        switch (this.f4002a) {
            case 0:
                widgetComponent$lambda$0 = ProductStarsTileViewMapper.widgetComponent$lambda$0(this.f4003b);
                return widgetComponent$lambda$0;
            case 1:
                create$lambda$0 = SingleReviewUserInfoComponent.Companion.create$lambda$0(this.f4003b);
                return create$lambda$0;
            case 2:
                widgetComponent$lambda$1 = ReturnCreationDeliveryViewMapper.widgetComponent$lambda$1(this.f4003b);
                return widgetComponent$lambda$1;
            case 3:
                widgetComponent$lambda$02 = TravelHotelCardV3ViewMapper.widgetComponent$lambda$0(this.f4003b);
                return widgetComponent$lambda$02;
            case 4:
                create$lambda$02 = EdoProvidersV2Component.Companion.create$lambda$0(this.f4003b);
                return create$lambda$02;
            case 5:
                widgetComponent$lambda$03 = ChequeViewMapper.widgetComponent$lambda$0(this.f4003b);
                return widgetComponent$lambda$03;
            case 6:
                create$lambda$03 = TravelAddNewPassengerFormV2Component.Companion.create$lambda$0(this.f4003b);
                return create$lambda$03;
            case 7:
                create$lambda$04 = EntryBannerComponent.Companion.create$lambda$0(this.f4003b);
                return create$lambda$04;
            case 8:
                create$lambda$05 = ServicePackSelectionV3Component.Companion.create$lambda$0(this.f4003b);
                return create$lambda$05;
            case 9:
                create$lambda$06 = AddressBookBarV2Component.Companion.create$lambda$0(this.f4003b);
                return create$lambda$06;
            case 10:
                create$lambda$07 = SingleReviewSingleVideoComponent.Companion.create$lambda$0(this.f4003b);
                return create$lambda$07;
            default:
                widgetComponent$lambda$04 = ReplyToCourierInfoWidgetViewMapper.widgetComponent$lambda$0(this.f4003b);
                return widgetComponent$lambda$04;
        }
    }
}

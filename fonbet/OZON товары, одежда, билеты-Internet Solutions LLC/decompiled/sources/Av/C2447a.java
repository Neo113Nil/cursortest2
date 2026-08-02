package Av;

import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.orderlist.v4.di.OrderListV4Component;
import ru.ozon.app.android.fresh.geo.widgets.deliveryRating.di.DeliveryRatingComponent;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingBottomButton.di.GeotrackingBottomButtonComponent;
import ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.di.FullTextSearchHeaderV4Component;
import ru.ozon.app.android.search.widgets.tapTags.v2.di.TapTagsV2WidgetComponent;
import ru.ozon.app.android.search.widgets.tapTags.v3.di.TapTagsV3WidgetComponent;
import ru.ozon.app.android.storefront.widgets.navbarv2.di.ShellNavBarComponent;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3WidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.di.ButtonWidgetComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.di.MainTabsComponent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.di.HotelsMapInfoV2Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.di.TravelCarriageTypeSelectV2Component;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.di.TravelTrainCheckInComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.TouristCountSelectorV3Component;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.di.SelectionReactionsComponent;
import ru.ozon.app.android.ugc.widgets.profileHeader.di.ProfileHeaderComponent;

/* renamed from: Av.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2447a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1288b;

    public /* synthetic */ C2447a(Object obj, int i11) {
        this.f1287a = i11;
        this.f1288b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        DeliveryRatingComponent create$lambda$0;
        GeotrackingBottomButtonComponent create$lambda$02;
        TouristCountSelectorV3Component create$lambda$03;
        HotelsMapInfoV2Component create$lambda$04;
        FullTextSearchHeaderV4Component create$lambda$05;
        TapTagsV2WidgetComponent create$lambda$06;
        OrderListV4Component create$lambda$07;
        TapTagsV3WidgetComponent create$lambda$08;
        TravelCarriageTypeSelectV2Component create$lambda$09;
        ShellNavBarComponent create$lambda$010;
        ProfileHeaderComponent create$lambda$011;
        MainTabsComponent create$lambda$012;
        SelectionReactionsComponent instance$lambda$0;
        NaviBlocksV3WidgetComponent create$lambda$013;
        ButtonWidgetComponent create$lambda$014;
        TravelTrainCheckInComponent create$lambda$015;
        PdpPriceBlockWidgetsComponent instance$lambda$02;
        ReturnCreationPhotoPickerComponent create$lambda$016;
        switch (this.f1287a) {
            case 0:
                create$lambda$0 = DeliveryRatingComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = GeotrackingBottomButtonComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = TouristCountSelectorV3Component.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = HotelsMapInfoV2Component.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = FullTextSearchHeaderV4Component.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$05;
            case 5:
                create$lambda$06 = TapTagsV2WidgetComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$06;
            case 6:
                create$lambda$07 = OrderListV4Component.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$07;
            case 7:
                create$lambda$08 = TapTagsV3WidgetComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$08;
            case 8:
                create$lambda$09 = TravelCarriageTypeSelectV2Component.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$09;
            case 9:
                create$lambda$010 = ShellNavBarComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$010;
            case 10:
                create$lambda$011 = ProfileHeaderComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$011;
            case 11:
                create$lambda$012 = MainTabsComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$012;
            case 12:
                instance$lambda$0 = SelectionReactionsComponent.Companion.getInstance$lambda$0((C7475g) this.f1288b);
                return instance$lambda$0;
            case 13:
                create$lambda$013 = NaviBlocksV3WidgetComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$013;
            case 14:
                create$lambda$014 = ButtonWidgetComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$014;
            case 15:
                create$lambda$015 = TravelTrainCheckInComponent.Companion.create$lambda$0((C7475g) this.f1288b);
                return create$lambda$015;
            case 16:
                instance$lambda$02 = PdpPriceBlockWidgetsComponent.Companion.getInstance$lambda$0((C7475g) this.f1288b);
                return instance$lambda$02;
            default:
                create$lambda$016 = ReturnCreationPhotoPickerComponent.Companion.create$lambda$0((Context) this.f1288b);
                return create$lambda$016;
        }
    }
}

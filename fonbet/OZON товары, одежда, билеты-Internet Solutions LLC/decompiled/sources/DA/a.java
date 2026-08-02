package DA;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.di.CommonPromoBannerComponent;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.core.BankAccountStatusViewMapper;
import ru.ozon.app.android.bank.widgets.di.BankAccountStatusWidgetComponent;
import ru.ozon.app.android.cart.cartButtonWithTooltip.di.CartButtonWithTooltipWidgetComponent;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.di.DetailedCheckoutProductsDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.di.TagListDIComponent;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.di.SellerTransparencyV3Component;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.di.CellHorizontalScrollComponent;
import ru.ozon.app.android.pdp.widgets.aspectProductV2.di.AspectProductComponent;
import ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent;
import ru.ozon.app.android.pdp.widgets.tabs.di.PdpTabsComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.di.PassengersLuggageSelectionComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.di.TimeoutAndActionV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.di.TotalPriceWithButtonV2Component;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v2.di.FlightOrderDetailsV2Component;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderLinks.di.TravelOrderLinksComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.di.HotelsPageDetailsFullComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsVerticalShelves.di.HotelsVerticalShelvesComponent;
import ru.ozon.app.android.ugc.core.widgets.blockList.di.BlockListComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterComponent;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.di.ReviewsPreviewComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.di.SkuGrid3Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid3.presentation.SkuGrid3ThinViewMapper;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6218b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6217a = i11;
        this.f6218b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        CellHorizontalScrollComponent create$lambda$0;
        ReviewsPreviewComponent instance$lambda$0;
        HotelsVerticalShelvesComponent create$lambda$02;
        AspectProductComponent create$lambda$03;
        GalleryV4WidgetComponent create$lambda$04;
        CommonPromoBannerComponent invoke$lambda$0;
        FlightOrderDetailsV2Component create$lambda$05;
        PdpTabsComponent create$lambda$06;
        TagListDIComponent create$lambda$07;
        SkuGrid3Component widgetComponent$lambda$0;
        PassengersLuggageSelectionComponent create$lambda$08;
        CartButtonWithTooltipWidgetComponent create$lambda$09;
        SellerTransparencyV3Component create$lambda$010;
        DetailedCheckoutProductsDIComponent create$lambda$011;
        TravelOrderLinksComponent create$lambda$012;
        ActionsFooterComponent create$lambda$013;
        BankAccountStatusWidgetComponent widgetComponent$lambda$02;
        HotelsPageDetailsFullComponent create$lambda$014;
        TimeoutAndActionV2Component create$lambda$015;
        TotalPriceWithButtonV2Component create$lambda$016;
        BlockListComponent create$lambda$017;
        switch (this.f6217a) {
            case 0:
                create$lambda$0 = CellHorizontalScrollComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$0;
            case 1:
                instance$lambda$0 = ReviewsPreviewComponent.Companion.getInstance$lambda$0((C7475g) this.f6218b);
                return instance$lambda$0;
            case 2:
                create$lambda$02 = HotelsVerticalShelvesComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$02;
            case 3:
                create$lambda$03 = AspectProductComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = GalleryV4WidgetComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$04;
            case 5:
                invoke$lambda$0 = CommonPromoBannerComponent.Companion.invoke$lambda$0((C7475g) this.f6218b);
                return invoke$lambda$0;
            case 6:
                create$lambda$05 = FlightOrderDetailsV2Component.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$05;
            case 7:
                create$lambda$06 = PdpTabsComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$06;
            case 8:
                create$lambda$07 = TagListDIComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$07;
            case 9:
                widgetComponent$lambda$0 = SkuGrid3ThinViewMapper.widgetComponent$lambda$0((C7475g) this.f6218b);
                return widgetComponent$lambda$0;
            case 10:
                create$lambda$08 = PassengersLuggageSelectionComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$08;
            case 11:
                create$lambda$09 = CartButtonWithTooltipWidgetComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$09;
            case 12:
                create$lambda$010 = SellerTransparencyV3Component.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$010;
            case 13:
                create$lambda$011 = DetailedCheckoutProductsDIComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$011;
            case 14:
                create$lambda$012 = TravelOrderLinksComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$012;
            case 15:
                create$lambda$013 = ActionsFooterComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$013;
            case 16:
                widgetComponent$lambda$02 = BankAccountStatusViewMapper.widgetComponent$lambda$0((C7475g) this.f6218b);
                return widgetComponent$lambda$02;
            case 17:
                create$lambda$014 = HotelsPageDetailsFullComponent.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$014;
            case 18:
                create$lambda$015 = TimeoutAndActionV2Component.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$015;
            case 19:
                create$lambda$016 = TotalPriceWithButtonV2Component.Companion.create$lambda$0((C7475g) this.f6218b);
                return create$lambda$016;
            default:
                create$lambda$017 = BlockListComponent.Companion.create$lambda$0((JsonParser) this.f6218b);
                return create$lambda$017;
        }
    }
}

package CN;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.di.PersonalInfoVerificationComponent;
import ru.ozon.app.android.favorites.accesscontrol.di.AccessControlWidgetComponent;
import ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.di.FreshMiniappHeaderComponent;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.core.WannaDiscountDecisionViewMapper;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di.WannaDiscountComponent;
import ru.ozon.app.android.monetization.widgets.overlayButton.di.OverlayButtonComponent;
import ru.ozon.app.android.orders.cml.deliveryOrderList.di.DeliveryOrderWidgetComponent;
import ru.ozon.app.android.returns.edit.presentation.sticky.ReturnEditStickyComponent;
import ru.ozon.app.android.returns.edit.presentation.sticky.ReturnEditStickyViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.result.core.ResultViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.result.di.ResultComponent;
import ru.ozon.app.android.storefront.widgets.stickyCart.di.StickyCartWidgetComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.di.HotelsBookTotalV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.di.PromoCodeApplierComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.presentation.PromoCodeApplierViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.di.TravelRailwaySeatSelectWithSchemeComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeV2ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2CartButtonComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4543b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f4542a = i11;
        this.f4543b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        HotelsBookTotalV2Component create$lambda$0;
        DeliveryOrderWidgetComponent create$lambda$02;
        OverlayButtonComponent create$lambda$03;
        ResultComponent widgetComponent$lambda$0;
        StickyCartWidgetComponent create$lambda$04;
        AccessControlWidgetComponent create$lambda$05;
        SuggestionsWidgetComponent widgetComponent$lambda$02;
        TileGrid2CartButtonComponent create$lambda$06;
        PersonalInfoVerificationComponent create$lambda$07;
        FreshMiniappHeaderComponent create$lambda$08;
        PromoCodeApplierComponent widgetComponent$lambda$1;
        WannaDiscountComponent widgetComponent$lambda$03;
        TravelRailwaySeatSelectWithSchemeComponent widgetComponent$lambda$12;
        ShoppingListsV2WidgetComponent create$lambda$09;
        ReturnEditStickyComponent widgetComponent$lambda$13;
        switch (this.f4542a) {
            case 0:
                create$lambda$0 = HotelsBookTotalV2Component.Companion.create$lambda$0(this.f4543b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = DeliveryOrderWidgetComponent.Companion.create$lambda$0(this.f4543b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = OverlayButtonComponent.Companion.create$lambda$0(this.f4543b);
                return create$lambda$03;
            case 3:
                widgetComponent$lambda$0 = ResultViewMapper.widgetComponent$lambda$0(this.f4543b);
                return widgetComponent$lambda$0;
            case 4:
                create$lambda$04 = StickyCartWidgetComponent.Companion.create$lambda$0(this.f4543b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = AccessControlWidgetComponent.Companion.create$lambda$0(this.f4543b);
                return create$lambda$05;
            case 6:
                widgetComponent$lambda$02 = SuggestionWithFilterViewMapper.widgetComponent$lambda$0(this.f4543b);
                return widgetComponent$lambda$02;
            case 7:
                create$lambda$06 = TileGrid2CartButtonComponent.Companion.create$lambda$0(this.f4543b);
                return create$lambda$06;
            case 8:
                create$lambda$07 = PersonalInfoVerificationComponent.Companion.create$lambda$0(this.f4543b);
                return create$lambda$07;
            case 9:
                create$lambda$08 = FreshMiniappHeaderComponent.Companion.create$lambda$0(this.f4543b);
                return create$lambda$08;
            case 10:
                widgetComponent$lambda$1 = PromoCodeApplierViewMapper.widgetComponent$lambda$1(this.f4543b);
                return widgetComponent$lambda$1;
            case 11:
                widgetComponent$lambda$03 = WannaDiscountDecisionViewMapper.widgetComponent$lambda$0(this.f4543b);
                return widgetComponent$lambda$03;
            case 12:
                widgetComponent$lambda$12 = TravelRailwaySeatSelectWithSchemeV2ViewMapper.widgetComponent$lambda$1(this.f4543b);
                return widgetComponent$lambda$12;
            case 13:
                create$lambda$09 = ShoppingListsV2WidgetComponent.Companion.create$lambda$0(this.f4543b);
                return create$lambda$09;
            default:
                widgetComponent$lambda$13 = ReturnEditStickyViewMapper.widgetComponent$lambda$1(this.f4543b);
                return widgetComponent$lambda$13;
        }
    }
}

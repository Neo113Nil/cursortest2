package AV;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.di.CatalogTabsV2Component;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.di.BottomCartComponent;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.core.SisBrandFavoriteViewMapper;
import ru.ozon.app.android.marketing.widgets.sisbrandfavorite.di.SisBrandFavoriteWidgetComponent;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.di.OrderDeliveryDetailV2ActionsComponent;
import ru.ozon.app.android.orderdetails.orderdeliverydetailv2.presentation.actions.OrderDeliveryDetailV2ActionsViewMapper;
import ru.ozon.app.android.orders.cml.groupButtons.di.GroupButtonsComponent;
import ru.ozon.app.android.search.widgets.history.search.di.HistoryWidgetComponent;
import ru.ozon.app.android.storefront.widgets.financeWidget.di.FinanceWidgetComponent;
import ru.ozon.app.android.storefront.widgets.shellNavBarTitle.di.ShellNavTitleWidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.di.EmptyStateComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.di.MiniAppTitleComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.di.FlightOrderDetailsV4Component;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.di.InfoPopupV2Component;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.di.TravelScrollPriceCalendarComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.singleBadge.SingleReviewBadgeComponent;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.di.AdditionalReviewV2Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2ReserveButtonComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f666b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f665a = i11;
        this.f666b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SingleReviewBadgeComponent create$lambda$0;
        HistoryWidgetComponent create$lambda$02;
        EmptyStateComponent create$lambda$03;
        GroupButtonsComponent create$lambda$04;
        ShellNavTitleWidgetComponent create$lambda$05;
        FinanceWidgetComponent create$lambda$06;
        TravelScrollPriceCalendarComponent create$lambda$07;
        AdditionalReviewV2Component instance$lambda$0;
        FlightOrderDetailsV4Component create$lambda$08;
        BottomCartComponent create$lambda$09;
        CatalogTabsV2Component create$lambda$010;
        TileGrid2ReserveButtonComponent create$lambda$011;
        SisBrandFavoriteWidgetComponent widgetComponent$lambda$1;
        MiniAppTitleComponent create$lambda$012;
        OrderDeliveryDetailV2ActionsComponent widgetComponent$lambda$0;
        CancelPostingsV2Component widgetComponent$lambda$02;
        InfoPopupV2Component create$lambda$013;
        switch (this.f665a) {
            case 0:
                create$lambda$0 = SingleReviewBadgeComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = HistoryWidgetComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = EmptyStateComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = GroupButtonsComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = ShellNavTitleWidgetComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$05;
            case 5:
                create$lambda$06 = FinanceWidgetComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$06;
            case 6:
                create$lambda$07 = TravelScrollPriceCalendarComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$07;
            case 7:
                instance$lambda$0 = AdditionalReviewV2Component.Companion.getInstance$lambda$0(this.f666b);
                return instance$lambda$0;
            case 8:
                create$lambda$08 = FlightOrderDetailsV4Component.Companion.create$lambda$0(this.f666b);
                return create$lambda$08;
            case 9:
                create$lambda$09 = BottomCartComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$09;
            case 10:
                create$lambda$010 = CatalogTabsV2Component.Companion.create$lambda$0(this.f666b);
                return create$lambda$010;
            case 11:
                create$lambda$011 = TileGrid2ReserveButtonComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$011;
            case 12:
                widgetComponent$lambda$1 = SisBrandFavoriteViewMapper.widgetComponent$lambda$1(this.f666b);
                return widgetComponent$lambda$1;
            case 13:
                create$lambda$012 = MiniAppTitleComponent.Companion.create$lambda$0(this.f666b);
                return create$lambda$012;
            case 14:
                widgetComponent$lambda$0 = OrderDeliveryDetailV2ActionsViewMapper.widgetComponent$lambda$0(this.f666b);
                return widgetComponent$lambda$0;
            case 15:
                widgetComponent$lambda$02 = CancelPostingsV2MonopostingViewMapper.widgetComponent$lambda$0(this.f666b);
                return widgetComponent$lambda$02;
            default:
                create$lambda$013 = InfoPopupV2Component.Companion.create$lambda$0(this.f666b);
                return create$lambda$013;
        }
    }
}

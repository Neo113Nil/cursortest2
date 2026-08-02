package DR;

import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.input.DeliveryDateChangedComplaintFormInputViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.CartSplitV2TitleViewMapper;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di.CartSplitV2TitleWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.total.di.TotalWidgetComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.di.SearchBarComponent;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionsViewMapper;
import ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.actions.OrderDeliveryDetailActionsWidgetComponent;
import ru.ozon.app.android.orders.cml.parcelTimeline.di.ParcelTimelineWidgetComponent;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.di.ReturnCreationSelectedItemsComponent;
import ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper.PaginationMobileViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.di.BadgeListComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelFiltersButton.di.TravelFiltersButtonComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelTextWithBadge.di.TravelTextWithBadgeComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderPaymentStatus.v1.di.OrderPaymentStatusComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.hiddenQueryServicesManager.di.HiddenQueryServicesManagerComponent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.di.HotelsMapCardComponent;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.di.TopAuthorCounterComponent;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.di.PinnedReviewComponent;
import ru.ozon.app.android.ugc.widgets.newquestionform.di.NewQuestionFormComponent;
import ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6271b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6270a = i11;
        this.f6271b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        HotelsMapCardComponent create$lambda$0;
        TravelFiltersButtonComponent create$lambda$02;
        DeliveryDateChangedComplaintFormComponent widgetComponent$lambda$0;
        ParcelTimelineWidgetComponent create$lambda$03;
        TopAuthorCounterComponent create$lambda$04;
        PinnedReviewComponent create$lambda$05;
        SelectionsListComponent instance$lambda$0;
        SearchBarComponent create$lambda$06;
        TotalWidgetComponent create$lambda$07;
        TravelTextWithBadgeComponent create$lambda$08;
        NewQuestionFormComponent instance$lambda$02;
        OrderPaymentStatusComponent create$lambda$09;
        CartSplitV2TitleWidgetComponent widgetComponent$lambda$02;
        BadgeListComponent create$lambda$010;
        OrderDeliveryDetailActionsWidgetComponent widgetComponent$lambda$03;
        ReturnableItemsListComponent widgetComponent$lambda$04;
        HiddenQueryServicesManagerComponent create$lambda$011;
        ReturnCreationSelectedItemsComponent create$lambda$012;
        switch (this.f6270a) {
            case 0:
                create$lambda$0 = HotelsMapCardComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = TravelFiltersButtonComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$0 = DeliveryDateChangedComplaintFormInputViewMapper.widgetComponent$lambda$0((C7475g) this.f6271b);
                return widgetComponent$lambda$0;
            case 3:
                create$lambda$03 = ParcelTimelineWidgetComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = TopAuthorCounterComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = PinnedReviewComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$05;
            case 6:
                instance$lambda$0 = SelectionsListComponent.Companion.getInstance$lambda$0((C7475g) this.f6271b);
                return instance$lambda$0;
            case 7:
                create$lambda$06 = SearchBarComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$06;
            case 8:
                create$lambda$07 = TotalWidgetComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$07;
            case 9:
                create$lambda$08 = TravelTextWithBadgeComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$08;
            case 10:
                instance$lambda$02 = NewQuestionFormComponent.Companion.getInstance$lambda$0((C7475g) this.f6271b);
                return instance$lambda$02;
            case 11:
                create$lambda$09 = OrderPaymentStatusComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$09;
            case 12:
                widgetComponent$lambda$02 = CartSplitV2TitleViewMapper.widgetComponent$lambda$0((C7475g) this.f6271b);
                return widgetComponent$lambda$02;
            case 13:
                create$lambda$010 = BadgeListComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$010;
            case 14:
                widgetComponent$lambda$03 = OrderDeliveryDetailActionsViewMapper.widgetComponent$lambda$0((C7475g) this.f6271b);
                return widgetComponent$lambda$03;
            case 15:
                widgetComponent$lambda$04 = PaginationMobileViewMapper.widgetComponent$lambda$0((C7475g) this.f6271b);
                return widgetComponent$lambda$04;
            case 16:
                create$lambda$011 = HiddenQueryServicesManagerComponent.Companion.create$lambda$0((C7475g) this.f6271b);
                return create$lambda$011;
            default:
                create$lambda$012 = ReturnCreationSelectedItemsComponent.Companion.create$lambda$0((Context) this.f6271b);
                return create$lambda$012;
        }
    }
}

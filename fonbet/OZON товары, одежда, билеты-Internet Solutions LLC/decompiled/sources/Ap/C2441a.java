package Ap;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.core.OrderDoneTotalElementViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.di.OrderDoneTotalWidgetComponent;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.di.ActionTriggerComponent;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.presentation.ActionTriggerViewMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Component;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutStickyTotal.di.CheckoutStickyTotalComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di.SwapButtonDIComponent;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v2.di.DeliveryTimeSelectorV2Component;
import ru.ozon.app.android.ordertracking.v4.OrderTrackingV4ViewMapper;
import ru.ozon.app.android.ordertracking.v4.di.OrderTrackingV4WidgetComponent;
import ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessViewMapper;
import ru.ozon.app.android.session.flashcall.di.RequestPhoneAccessComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.di.FiltersComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header.FiltersHeaderStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v1.di.TravelCellListComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.di.HotelsRoomsDetailsFullComponent;
import ru.ozon.app.android.ugc.widgets.listanswers.di.AnswerComponent;
import ru.ozon.app.android.ugc.widgets.stickyBubble.di.StickyBubbleComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2WidgetV2Component;

/* renamed from: Ap.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2441a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f1256b;

    public /* synthetic */ C2441a(C7475g c7475g, int i11) {
        this.f1255a = i11;
        this.f1256b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        OrderDoneTotalWidgetComponent widgetComponent$lambda$0;
        RequestPhoneAccessComponent widgetComponent$lambda$02;
        TravelCellListComponent create$lambda$0;
        FiltersComponent widgetComponent$lambda$3;
        OrderTrackingV4WidgetComponent widgetComponent$lambda$03;
        StickyBubbleComponent create$lambda$02;
        SwapButtonDIComponent create$lambda$03;
        AnswerComponent instance$lambda$0;
        DeliveryTimeSelectorV2Component create$lambda$04;
        TileGrid2WidgetV2Component create$lambda$05;
        CheckoutStickyTotalComponent create$lambda$06;
        TipCourierDetailsV2Component widgetComponent$lambda$04;
        ActionTriggerComponent widgetComponent$lambda$05;
        HotelsRoomsDetailsFullComponent create$lambda$07;
        switch (this.f1255a) {
            case 0:
                widgetComponent$lambda$0 = OrderDoneTotalElementViewMapper.widgetComponent$lambda$0(this.f1256b);
                return widgetComponent$lambda$0;
            case 1:
                widgetComponent$lambda$02 = RequestPhoneAccessViewMapper.widgetComponent$lambda$0(this.f1256b);
                return widgetComponent$lambda$02;
            case 2:
                create$lambda$0 = TravelCellListComponent.Companion.create$lambda$0(this.f1256b);
                return create$lambda$0;
            case 3:
                widgetComponent$lambda$3 = FiltersHeaderStickyViewMapper.widgetComponent$lambda$3(this.f1256b);
                return widgetComponent$lambda$3;
            case 4:
                widgetComponent$lambda$03 = OrderTrackingV4ViewMapper.widgetComponent$lambda$0(this.f1256b);
                return widgetComponent$lambda$03;
            case 5:
                create$lambda$02 = StickyBubbleComponent.Companion.create$lambda$0(this.f1256b);
                return create$lambda$02;
            case 6:
                create$lambda$03 = SwapButtonDIComponent.Companion.create$lambda$0(this.f1256b);
                return create$lambda$03;
            case 7:
                instance$lambda$0 = AnswerComponent.Companion.getInstance$lambda$0(this.f1256b);
                return instance$lambda$0;
            case 8:
                create$lambda$04 = DeliveryTimeSelectorV2Component.Companion.create$lambda$0(this.f1256b);
                return create$lambda$04;
            case 9:
                create$lambda$05 = TileGrid2WidgetV2Component.Companion.create$lambda$0(this.f1256b);
                return create$lambda$05;
            case 10:
                create$lambda$06 = CheckoutStickyTotalComponent.Companion.create$lambda$0(this.f1256b);
                return create$lambda$06;
            case 11:
                widgetComponent$lambda$04 = TipCourierDetailsTipsViewMapper.widgetComponent$lambda$0(this.f1256b);
                return widgetComponent$lambda$04;
            case 12:
                widgetComponent$lambda$05 = ActionTriggerViewMapper.widgetComponent$lambda$0(this.f1256b);
                return widgetComponent$lambda$05;
            default:
                create$lambda$07 = HotelsRoomsDetailsFullComponent.Companion.create$lambda$0(this.f1256b);
                return create$lambda$07;
        }
    }
}

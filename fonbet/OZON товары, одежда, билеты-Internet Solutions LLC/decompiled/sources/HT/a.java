package HT;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.selectPayment.di.SelectPaymentComponent;
import ru.ozon.app.android.account.orders.selectPayment.presentation.SelectPaymentViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.core.EnableNotificationsSnackbarWidgetViewMapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.enablenotificationssnackbar.di.EnableNotificationsSnackbarWidgetComponent;
import ru.ozon.app.android.composer.widgets.internal.loading.di.LoadingComponent;
import ru.ozon.app.android.fresh.checkout.widgets.timeSlots.di.TimeSlotsDIComponent;
import ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.di.OrderStatusV3Component;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.di.AddressCommunicationComponent;
import ru.ozon.app.android.fresh.main.widgets.catalogTile.di.CatalogTileComponent;
import ru.ozon.app.android.orderdetails.customsfees.core.CustomsFeesViewMapper;
import ru.ozon.app.android.orderdetails.customsfees.di.CustomsFeesComponent;
import ru.ozon.app.android.pdp.widgets.badgeList.di.BadgeListWidgetComponent;
import ru.ozon.app.android.pdp.widgets.characteristics.di.CharacteristicsWidgetComponent;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.di.FeedbackFormComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.di.CellWithTimerComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.di.HotelsRoomsDetailsFullV3Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.di.TravelRoomsGuestsCardWidgetComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightDetails.di.ToursFlightDetailsComponent;
import ru.ozon.app.android.widgets.debug.coloredlifecyclewidget.di.ColoredLifecycleComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f10756b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f10755a = i11;
        this.f10756b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ToursFlightDetailsComponent create$lambda$0;
        OrderStatusV3Component create$lambda$02;
        TravelRoomsGuestsCardWidgetComponent create$lambda$03;
        AddressCommunicationComponent create$lambda$04;
        ColoredLifecycleComponent invoke$lambda$0;
        LoadingComponent invoke$lambda$02;
        CellWithTimerComponent create$lambda$05;
        CatalogTileComponent create$lambda$06;
        CustomsFeesComponent widgetComponent$lambda$0;
        BadgeListWidgetComponent instance$lambda$0;
        SelectPaymentComponent widgetComponent$lambda$02;
        TimeSlotsDIComponent create$lambda$07;
        EnableNotificationsSnackbarWidgetComponent widgetComponent$lambda$03;
        FeedbackFormComponent create$lambda$08;
        HotelsRoomsDetailsFullV3Component create$lambda$09;
        CharacteristicsWidgetComponent instance$lambda$02;
        switch (this.f10755a) {
            case 0:
                create$lambda$0 = ToursFlightDetailsComponent.Companion.create$lambda$0(this.f10756b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = OrderStatusV3Component.Companion.create$lambda$0(this.f10756b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = TravelRoomsGuestsCardWidgetComponent.Companion.create$lambda$0(this.f10756b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = AddressCommunicationComponent.Companion.create$lambda$0(this.f10756b);
                return create$lambda$04;
            case 4:
                invoke$lambda$0 = ColoredLifecycleComponent.Companion.invoke$lambda$0(this.f10756b);
                return invoke$lambda$0;
            case 5:
                invoke$lambda$02 = LoadingComponent.Companion.invoke$lambda$0(this.f10756b);
                return invoke$lambda$02;
            case 6:
                create$lambda$05 = CellWithTimerComponent.Companion.create$lambda$0(this.f10756b);
                return create$lambda$05;
            case 7:
                create$lambda$06 = CatalogTileComponent.Companion.create$lambda$0(this.f10756b);
                return create$lambda$06;
            case 8:
                widgetComponent$lambda$0 = CustomsFeesViewMapper.widgetComponent$lambda$0(this.f10756b);
                return widgetComponent$lambda$0;
            case 9:
                instance$lambda$0 = BadgeListWidgetComponent.Companion.getInstance$lambda$0(this.f10756b);
                return instance$lambda$0;
            case 10:
                widgetComponent$lambda$02 = SelectPaymentViewMapper.widgetComponent$lambda$0(this.f10756b);
                return widgetComponent$lambda$02;
            case 11:
                create$lambda$07 = TimeSlotsDIComponent.Companion.create$lambda$0(this.f10756b);
                return create$lambda$07;
            case 12:
                widgetComponent$lambda$03 = EnableNotificationsSnackbarWidgetViewMapper.widgetComponent$lambda$0(this.f10756b);
                return widgetComponent$lambda$03;
            case 13:
                create$lambda$08 = FeedbackFormComponent.Companion.create$lambda$0(this.f10756b);
                return create$lambda$08;
            case 14:
                create$lambda$09 = HotelsRoomsDetailsFullV3Component.Companion.create$lambda$0(this.f10756b);
                return create$lambda$09;
            default:
                instance$lambda$02 = CharacteristicsWidgetComponent.Companion.getInstance$lambda$0(this.f10756b);
                return instance$lambda$02;
        }
    }
}

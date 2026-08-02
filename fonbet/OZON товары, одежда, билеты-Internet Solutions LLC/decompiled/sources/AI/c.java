package AI;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cml.delivery.widgets.boxList.di.BoxListComponent;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.di.ParticipantPhoneComponent;
import ru.ozon.app.android.commonwidgets.widgets.curtainSettings.di.CurtainSettingsComponent;
import ru.ozon.app.android.composer.di.page.RetainComposerViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.di.CompanyCardComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.di.OrderStatusLiveActivityComponent;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.di.DeliveryOrderInputWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.navbar.di.MorkovskNavBarComponent;
import ru.ozon.app.android.search.widgets.history.catalog.di.SearchHistoryWidgetComponent;
import ru.ozon.app.android.search.widgets.history.catalog.presentation.SearchHistoryViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.di.TravelPriceCalendarV3Component;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.di.ToursSummaryComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f632b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f631a = i11;
        this.f632b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SearchHistoryWidgetComponent widgetComponent$lambda$0;
        OrderStatusLiveActivityComponent create$lambda$0;
        DeliveryOrderInputWidgetComponent create$lambda$02;
        BoxListComponent create$lambda$03;
        TravelPriceCalendarV3Component create$lambda$04;
        CompanyCardComponent create$lambda$05;
        ToursSummaryComponent create$lambda$06;
        ParticipantPhoneComponent create$lambda$07;
        MorkovskNavBarComponent create$lambda$08;
        CurtainSettingsComponent create$lambda$09;
        InterfaceC6958a interfaceC6958a;
        switch (this.f631a) {
            case 0:
                widgetComponent$lambda$0 = SearchHistoryViewMapper.widgetComponent$lambda$0((C7475g) this.f632b);
                return widgetComponent$lambda$0;
            case 1:
                create$lambda$0 = OrderStatusLiveActivityComponent.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$0;
            case 2:
                create$lambda$02 = DeliveryOrderInputWidgetComponent.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$02;
            case 3:
                create$lambda$03 = BoxListComponent.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = TravelPriceCalendarV3Component.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = CompanyCardComponent.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = ToursSummaryComponent.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$06;
            case 7:
                create$lambda$07 = ParticipantPhoneComponent.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$07;
            case 8:
                create$lambda$08 = MorkovskNavBarComponent.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$08;
            case 9:
                create$lambda$09 = CurtainSettingsComponent.Companion.create$lambda$0((C7475g) this.f632b);
                return create$lambda$09;
            default:
                interfaceC6958a = ((RetainComposerViewModel) this.f632b).retainComponent;
                return interfaceC6958a;
        }
    }
}

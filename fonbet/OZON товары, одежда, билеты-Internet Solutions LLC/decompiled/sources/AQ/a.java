package AQ;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core.AddEdoFormViewMapperV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.AddEdoComponentV2;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.di.OrderTrackingComponent;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.di.PromoCarouselComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.di.SeparatorBadgeWidgetComponent;
import ru.ozon.app.android.geo.mapPreview.di.MapPreviewComponent;
import ru.ozon.app.android.returns.creation.widgets.methods.core.dates.DatesElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent;
import ru.ozon.app.android.session.session.di.SessionComponent;
import ru.ozon.app.android.session.session.mapper.SessionViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.di.HotTicketsComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.di.SearchFormBarComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.di.AdditionalServicesTotalComponent;
import ru.ozon.app.android.ugc.widgets.usersFinalRatingV2.di.UsersFinalRatingV2Component;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f656b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f655a = i11;
        this.f656b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SearchFormBarComponent create$lambda$0;
        PromoCarouselComponent create$lambda$02;
        SessionComponent widgetComponent$lambda$0;
        ProductsInBotComponent create$lambda$03;
        AddEdoComponentV2 widgetComponent$lambda$02;
        MapPreviewComponent create$lambda$04;
        ReturnCreationMethodsComponent widgetComponent$lambda$1;
        SeparatorBadgeWidgetComponent create$lambda$05;
        UsersFinalRatingV2Component create$lambda$06;
        HotTicketsComponent create$lambda$07;
        AdditionalServicesTotalComponent create$lambda$08;
        OrderTrackingComponent create$lambda$09;
        switch (this.f655a) {
            case 0:
                create$lambda$0 = SearchFormBarComponent.Companion.create$lambda$0(this.f656b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = PromoCarouselComponent.Companion.create$lambda$0(this.f656b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$0 = SessionViewMapper.widgetComponent$lambda$0(this.f656b);
                return widgetComponent$lambda$0;
            case 3:
                create$lambda$03 = ProductsInBotComponent.Companion.create$lambda$0(this.f656b);
                return create$lambda$03;
            case 4:
                widgetComponent$lambda$02 = AddEdoFormViewMapperV2.widgetComponent$lambda$0(this.f656b);
                return widgetComponent$lambda$02;
            case 5:
                create$lambda$04 = MapPreviewComponent.Companion.create$lambda$0(this.f656b);
                return create$lambda$04;
            case 6:
                widgetComponent$lambda$1 = DatesElementViewMapper.widgetComponent$lambda$1(this.f656b);
                return widgetComponent$lambda$1;
            case 7:
                create$lambda$05 = SeparatorBadgeWidgetComponent.Companion.create$lambda$0(this.f656b);
                return create$lambda$05;
            case 8:
                create$lambda$06 = UsersFinalRatingV2Component.Companion.create$lambda$0(this.f656b);
                return create$lambda$06;
            case 9:
                create$lambda$07 = HotTicketsComponent.Companion.create$lambda$0(this.f656b);
                return create$lambda$07;
            case 10:
                create$lambda$08 = AdditionalServicesTotalComponent.Companion.create$lambda$0(this.f656b);
                return create$lambda$08;
            default:
                create$lambda$09 = OrderTrackingComponent.Companion.create$lambda$0(this.f656b);
                return create$lambda$09;
        }
    }
}

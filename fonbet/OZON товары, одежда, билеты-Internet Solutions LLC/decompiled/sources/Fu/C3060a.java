package Fu;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.familyGroup.di.FamilyGroupWidgetComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.di.AddConsigneeComponent;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component;
import ru.ozon.app.android.geo.addresseditcarousel.di.AddressEditCarouselWidgetComponent;
import ru.ozon.app.android.orderdetails.modalConstructor.di.ModalConstructorComponent;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.button.ButtonViewMapper;
import ru.ozon.app.android.returns.total.di.ReturnDetailsTotalComponent;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarViewMapper;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.di.TravelDocumentsToEmailComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.horizontalIconButtons.di.HorizontalIconButtonsComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.di.OrderNavBarComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.di.TravelRailwaySeatSelectWithSchemeComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.TravelRailwaySeatSelectFooterViewMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.header.badgesList.SingleReviewBadgesListComponent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent;

/* renamed from: Fu.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3060a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f9561b;

    public /* synthetic */ C3060a(C7475g c7475g, int i11) {
        this.f9560a = i11;
        this.f9561b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        AddConsigneeComponent create$lambda$0;
        SelectionItemFormComponent instance$lambda$0;
        FamilyGroupWidgetComponent create$lambda$02;
        SearchBarComponent widgetComponent$lambda$2;
        HorizontalIconButtonsComponent create$lambda$03;
        OrderNavBarComponent create$lambda$04;
        ModalConstructorComponent widgetComponent$lambda$1;
        TravelRailwaySeatSelectWithSchemeComponent widgetComponent$lambda$3;
        TravelDocumentsToEmailComponent create$lambda$05;
        NotificationCarouselV2Component create$lambda$06;
        AddressEditCarouselWidgetComponent create$lambda$07;
        ReturnDetailsTotalComponent create$lambda$08;
        SingleReviewBadgesListComponent create$lambda$09;
        switch (this.f9560a) {
            case 0:
                create$lambda$0 = AddConsigneeComponent.Companion.create$lambda$0(this.f9561b);
                return create$lambda$0;
            case 1:
                instance$lambda$0 = SelectionItemFormComponent.Companion.getInstance$lambda$0(this.f9561b);
                return instance$lambda$0;
            case 2:
                create$lambda$02 = FamilyGroupWidgetComponent.Companion.create$lambda$0(this.f9561b);
                return create$lambda$02;
            case 3:
                widgetComponent$lambda$2 = SearchBarViewMapper.widgetComponent$lambda$2(this.f9561b);
                return widgetComponent$lambda$2;
            case 4:
                create$lambda$03 = HorizontalIconButtonsComponent.Companion.create$lambda$0(this.f9561b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = OrderNavBarComponent.Companion.create$lambda$0(this.f9561b);
                return create$lambda$04;
            case 6:
                widgetComponent$lambda$1 = ButtonViewMapper.widgetComponent$lambda$1(this.f9561b);
                return widgetComponent$lambda$1;
            case 7:
                widgetComponent$lambda$3 = TravelRailwaySeatSelectFooterViewMapper.widgetComponent$lambda$3(this.f9561b);
                return widgetComponent$lambda$3;
            case 8:
                create$lambda$05 = TravelDocumentsToEmailComponent.Companion.create$lambda$0(this.f9561b);
                return create$lambda$05;
            case 9:
                create$lambda$06 = NotificationCarouselV2Component.Companion.create$lambda$0(this.f9561b);
                return create$lambda$06;
            case 10:
                create$lambda$07 = AddressEditCarouselWidgetComponent.Companion.create$lambda$0(this.f9561b);
                return create$lambda$07;
            case 11:
                create$lambda$08 = ReturnDetailsTotalComponent.Companion.create$lambda$0(this.f9561b);
                return create$lambda$08;
            default:
                create$lambda$09 = SingleReviewBadgesListComponent.Companion.create$lambda$0(this.f9561b);
                return create$lambda$09;
        }
    }
}

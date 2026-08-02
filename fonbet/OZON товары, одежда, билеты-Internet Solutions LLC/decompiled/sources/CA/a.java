package CA;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.changeDeliveryTimeButton.di.ChangeDeliveryTimeButtonComponent;
import ru.ozon.app.android.account.orders.changeDeliveryTimeButton.presentation.ChangeDeliveryTimeButtonViewMapper;
import ru.ozon.app.android.cart.master.di.MasterWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.sbp.search.di.SearchBankListComponent;
import ru.ozon.app.android.checkoutcomposer.sbp.top.di.PopularBankListComponent;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.di.TotalExpandedWidgetComponent;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.di.SecureDealCurtainComponent;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di.BorderlessButtonComponent;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.mapper.BorderlessButtonViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.di.ExpressNavBarComponent;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.di.BloggerPersonalDataFormComponent;
import ru.ozon.app.android.orderdetails.orderactions.v2.di.OrderActionsV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelInfoBadge.v1.di.TravelInfoBadgeComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelNavTitle.v3.di.TravelNavTitleV3Component;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.di.StickyCellComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4519b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f4518a = i11;
        this.f4519b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        BloggerPersonalDataFormComponent create$lambda$0;
        SearchBankListComponent create$lambda$02;
        StickyCellComponent instance$lambda$0;
        PopularBankListComponent create$lambda$03;
        TravelInfoBadgeComponent create$lambda$04;
        TravelNavTitleV3Component create$lambda$05;
        MasterWidgetComponent create$lambda$06;
        TotalExpandedWidgetComponent create$lambda$07;
        OrderActionsV2Component create$lambda$08;
        BorderlessButtonComponent widgetComponent$lambda$0;
        SecureDealCurtainComponent create$lambda$09;
        ChangeDeliveryTimeButtonComponent widgetComponent$lambda$2;
        ExpressNavBarComponent create$lambda$010;
        switch (this.f4518a) {
            case 0:
                create$lambda$0 = BloggerPersonalDataFormComponent.Companion.create$lambda$0(this.f4519b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = SearchBankListComponent.Companion.create$lambda$0(this.f4519b);
                return create$lambda$02;
            case 2:
                instance$lambda$0 = StickyCellComponent.Companion.getInstance$lambda$0(this.f4519b);
                return instance$lambda$0;
            case 3:
                create$lambda$03 = PopularBankListComponent.Companion.create$lambda$0(this.f4519b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = TravelInfoBadgeComponent.Companion.create$lambda$0(this.f4519b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = TravelNavTitleV3Component.Companion.create$lambda$0(this.f4519b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = MasterWidgetComponent.Companion.create$lambda$0(this.f4519b);
                return create$lambda$06;
            case 7:
                create$lambda$07 = TotalExpandedWidgetComponent.Companion.create$lambda$0(this.f4519b);
                return create$lambda$07;
            case 8:
                create$lambda$08 = OrderActionsV2Component.Companion.create$lambda$0(this.f4519b);
                return create$lambda$08;
            case 9:
                widgetComponent$lambda$0 = BorderlessButtonViewMapper.widgetComponent$lambda$0(this.f4519b);
                return widgetComponent$lambda$0;
            case 10:
                create$lambda$09 = SecureDealCurtainComponent.Companion.create$lambda$0(this.f4519b);
                return create$lambda$09;
            case 11:
                widgetComponent$lambda$2 = ChangeDeliveryTimeButtonViewMapper.widgetComponent$lambda$2(this.f4519b);
                return widgetComponent$lambda$2;
            default:
                create$lambda$010 = ExpressNavBarComponent.Companion.create$lambda$0(this.f4519b);
                return create$lambda$010;
        }
    }
}

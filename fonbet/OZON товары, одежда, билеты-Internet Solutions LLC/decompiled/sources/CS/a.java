package CS;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethComponent;
import ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent;
import ru.ozon.app.android.faq.accordion.presentation.FaqAccordionViewMapper;
import ru.ozon.app.android.faq.di.FaqComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.di.RoleInvitationCreatorDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.di.FlexButtonsDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v2.di.TextBlockV2Component;
import ru.ozon.app.android.orderdetails.timeLeft.di.TimeLeftWidgetComponent;
import ru.ozon.app.android.orderdetails.timeLeft.presentation.TimeLeftViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocks.di.NaviBlocksComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.di.AdditionalServiceCardComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.di.MilesForBuyersComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.di.TravelTextComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di.SearchFormV4Component;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.di.HotelsPageMapPreviewV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.di.HotelsScrollPriceCalendarComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.di.TravelCarriageSelectV3Component;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.di.SkuListComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.skulist.presentation.SkuListViewMapper;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4550b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f4549a = i11;
        this.f4550b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        HotelsScrollPriceCalendarComponent create$lambda$0;
        ButtonWidgetComponent create$lambda$02;
        HotelsPageMapPreviewV2Component create$lambda$03;
        FaqComponent widgetComponent$lambda$0;
        MilesForBuyersComponent create$lambda$04;
        InternalTeethComponent create$lambda$05;
        TravelTextComponent create$lambda$06;
        SkuListComponent widgetComponent$lambda$02;
        TextBlockV2Component create$lambda$07;
        TravelCarriageSelectV3Component create$lambda$08;
        NaviBlocksComponent create$lambda$09;
        AdditionalServiceCardComponent create$lambda$010;
        RoleInvitationCreatorDIComponent create$lambda$011;
        FlexButtonsDIComponent create$lambda$012;
        SearchFormV4Component create$lambda$013;
        TimeLeftWidgetComponent widgetComponent$lambda$03;
        switch (this.f4549a) {
            case 0:
                create$lambda$0 = HotelsScrollPriceCalendarComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = ButtonWidgetComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = HotelsPageMapPreviewV2Component.Companion.create$lambda$0(this.f4550b);
                return create$lambda$03;
            case 3:
                widgetComponent$lambda$0 = FaqAccordionViewMapper.widgetComponent$lambda$0(this.f4550b);
                return widgetComponent$lambda$0;
            case 4:
                create$lambda$04 = MilesForBuyersComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = InternalTeethComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = TravelTextComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$06;
            case 7:
                widgetComponent$lambda$02 = SkuListViewMapper.widgetComponent$lambda$0(this.f4550b);
                return widgetComponent$lambda$02;
            case 8:
                create$lambda$07 = TextBlockV2Component.Companion.create$lambda$0(this.f4550b);
                return create$lambda$07;
            case 9:
                create$lambda$08 = TravelCarriageSelectV3Component.Companion.create$lambda$0(this.f4550b);
                return create$lambda$08;
            case 10:
                create$lambda$09 = NaviBlocksComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$09;
            case 11:
                create$lambda$010 = AdditionalServiceCardComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$010;
            case 12:
                create$lambda$011 = RoleInvitationCreatorDIComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$011;
            case 13:
                create$lambda$012 = FlexButtonsDIComponent.Companion.create$lambda$0(this.f4550b);
                return create$lambda$012;
            case 14:
                create$lambda$013 = SearchFormV4Component.Companion.create$lambda$0(this.f4550b);
                return create$lambda$013;
            default:
                widgetComponent$lambda$03 = TimeLeftViewMapper.widgetComponent$lambda$0(this.f4550b);
                return widgetComponent$lambda$03;
        }
    }
}

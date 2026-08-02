package AG;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cml.delivery.widgets.input.di.InputWidgetComponent;
import ru.ozon.app.android.cml.delivery.widgets.secureDeal.di.SecureDealComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.di.BenefitListComponent;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.di.CartButtonQuantWidgetComponent;
import ru.ozon.app.android.pdp.widgets.navBar.di.NavBarWidgetComponent;
import ru.ozon.app.android.returns.cancels.cancelReasons.di.SelectCancelReasonComponent;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewMapper.ReturnableItemsTitleViewMapper;
import ru.ozon.app.android.search.widgets.curtainHeader.di.CurtainHeaderComponent;
import ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle.SuggestionsBadgeTitleSubtitleViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.di.FlightRouteDetailsComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.di.TravelPriceDetailInformationV2Component;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaRow.SingleReviewGalleryRowComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f624b;

    public /* synthetic */ b(C7475g c7475g, int i11) {
        this.f623a = i11;
        this.f624b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SelectCancelReasonComponent widgetComponent$lambda$2;
        FlightRouteDetailsComponent create$lambda$0;
        InputWidgetComponent create$lambda$02;
        BenefitListComponent create$lambda$03;
        SuggestionsWidgetComponent widgetComponent$lambda$0;
        CartButtonQuantWidgetComponent create$lambda$04;
        TravelPriceDetailInformationV2Component create$lambda$05;
        CurtainHeaderComponent create$lambda$06;
        SecureDealComponent create$lambda$07;
        NavBarWidgetComponent create$lambda$08;
        ReturnableItemsListComponent widgetComponent$lambda$02;
        SingleReviewGalleryRowComponent create$lambda$09;
        switch (this.f623a) {
            case 0:
                widgetComponent$lambda$2 = SelectCancelReasonStickyViewMapper.widgetComponent$lambda$2(this.f624b);
                return widgetComponent$lambda$2;
            case 1:
                create$lambda$0 = FlightRouteDetailsComponent.Companion.create$lambda$0(this.f624b);
                return create$lambda$0;
            case 2:
                create$lambda$02 = InputWidgetComponent.Companion.create$lambda$0(this.f624b);
                return create$lambda$02;
            case 3:
                create$lambda$03 = BenefitListComponent.Companion.create$lambda$0(this.f624b);
                return create$lambda$03;
            case 4:
                widgetComponent$lambda$0 = SuggestionsBadgeTitleSubtitleViewMapper.widgetComponent$lambda$0(this.f624b);
                return widgetComponent$lambda$0;
            case 5:
                create$lambda$04 = CartButtonQuantWidgetComponent.Companion.create$lambda$0(this.f624b);
                return create$lambda$04;
            case 6:
                create$lambda$05 = TravelPriceDetailInformationV2Component.Companion.create$lambda$0(this.f624b);
                return create$lambda$05;
            case 7:
                create$lambda$06 = CurtainHeaderComponent.Companion.create$lambda$0(this.f624b);
                return create$lambda$06;
            case 8:
                create$lambda$07 = SecureDealComponent.Companion.create$lambda$0(this.f624b);
                return create$lambda$07;
            case 9:
                create$lambda$08 = NavBarWidgetComponent.Companion.create$lambda$0(this.f624b);
                return create$lambda$08;
            case 10:
                widgetComponent$lambda$02 = ReturnableItemsTitleViewMapper.widgetComponent$lambda$0(this.f624b);
                return widgetComponent$lambda$02;
            default:
                create$lambda$09 = SingleReviewGalleryRowComponent.Companion.create$lambda$0(this.f624b);
                return create$lambda$09;
        }
    }
}

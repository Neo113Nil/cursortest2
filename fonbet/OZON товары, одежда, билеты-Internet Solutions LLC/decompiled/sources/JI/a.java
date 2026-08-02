package JI;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.di.BottomContainerDIComponent;
import ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons.SelectCancelReasonsViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di.AspectsCompactV2WidgetComponent;
import ru.ozon.app.android.search.widgets.searchRequest.di.SearchRequestComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonsActionSheet.di.ButtonsActionSheetComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v3.di.TravelRailwaySearchResultsV3Component;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.di.RateItemsV2Component;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f14282b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f14281a = i11;
        this.f14282b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SearchRequestComponent create$lambda$0;
        AspectsCompactV2WidgetComponent create$lambda$02;
        SelectCancelReasonComponent widgetComponent$lambda$1;
        BottomContainerDIComponent create$lambda$03;
        TravelRailwaySearchResultsV3Component create$lambda$04;
        RateItemsV2Component create$lambda$05;
        ButtonsActionSheetComponent create$lambda$06;
        switch (this.f14281a) {
            case 0:
                create$lambda$0 = SearchRequestComponent.Companion.create$lambda$0(this.f14282b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = AspectsCompactV2WidgetComponent.Companion.create$lambda$0(this.f14282b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$1 = SelectCancelReasonsViewMapper.widgetComponent$lambda$1(this.f14282b);
                return widgetComponent$lambda$1;
            case 3:
                create$lambda$03 = BottomContainerDIComponent.Companion.create$lambda$0(this.f14282b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = TravelRailwaySearchResultsV3Component.Companion.create$lambda$0(this.f14282b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = RateItemsV2Component.Companion.create$lambda$0(this.f14282b);
                return create$lambda$05;
            default:
                create$lambda$06 = ButtonsActionSheetComponent.Companion.create$lambda$0(this.f14282b);
                return create$lambda$06;
        }
    }
}

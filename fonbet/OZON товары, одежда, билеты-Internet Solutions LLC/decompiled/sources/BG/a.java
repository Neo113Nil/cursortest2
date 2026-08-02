package BG;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.postRender.di.PostRenderComponent;
import ru.ozon.app.android.cscore.copybutton.CopyButtonViewMapper;
import ru.ozon.app.android.cscore.copybutton.di.CopyButtonWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.di.WelcomeScreenComponent;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.di.CancelPostingsV2Component;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.button.CancelPostingsV2ButtonViewMapper;
import ru.ozon.app.android.search.widgets.searchResult.error.di.SearchResultErrorComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.searchResultsNavTitle.v1.di.SearchResultsNavTitleComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.invisibleRefresher.di.InvisibleRefresherComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.buttonsBar.di.ButtonsBarComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.di.AdditionalReturnServiceCellComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.di.TravelRailwaySearchResultsV4Component;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f3249b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f3248a = i11;
        this.f3249b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        CancelPostingsV2Component widgetComponent$lambda$1;
        SearchResultErrorComponent create$lambda$0;
        InvisibleRefresherComponent create$lambda$02;
        PostRenderComponent create$lambda$03;
        ButtonsBarComponent create$lambda$04;
        SearchResultsNavTitleComponent create$lambda$05;
        CopyButtonWidgetComponent widgetComponent$lambda$0;
        TravelRailwaySearchResultsV4Component create$lambda$06;
        AdditionalReturnServiceCellComponent create$lambda$07;
        WelcomeScreenComponent create$lambda$08;
        switch (this.f3248a) {
            case 0:
                widgetComponent$lambda$1 = CancelPostingsV2ButtonViewMapper.widgetComponent$lambda$1(this.f3249b);
                return widgetComponent$lambda$1;
            case 1:
                create$lambda$0 = SearchResultErrorComponent.Companion.create$lambda$0(this.f3249b);
                return create$lambda$0;
            case 2:
                create$lambda$02 = InvisibleRefresherComponent.Companion.create$lambda$0(this.f3249b);
                return create$lambda$02;
            case 3:
                create$lambda$03 = PostRenderComponent.Companion.create$lambda$0(this.f3249b);
                return create$lambda$03;
            case 4:
                create$lambda$04 = ButtonsBarComponent.Companion.create$lambda$0(this.f3249b);
                return create$lambda$04;
            case 5:
                create$lambda$05 = SearchResultsNavTitleComponent.Companion.create$lambda$0(this.f3249b);
                return create$lambda$05;
            case 6:
                widgetComponent$lambda$0 = CopyButtonViewMapper.widgetComponent$lambda$0(this.f3249b);
                return widgetComponent$lambda$0;
            case 7:
                create$lambda$06 = TravelRailwaySearchResultsV4Component.Companion.create$lambda$0(this.f3249b);
                return create$lambda$06;
            case 8:
                create$lambda$07 = AdditionalReturnServiceCellComponent.Companion.create$lambda$0(this.f3249b);
                return create$lambda$07;
            default:
                create$lambda$08 = WelcomeScreenComponent.Companion.create$lambda$0(this.f3249b);
                return create$lambda$08;
        }
    }
}

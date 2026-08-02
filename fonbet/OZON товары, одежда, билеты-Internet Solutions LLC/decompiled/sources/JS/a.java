package JS;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.orderlist.v2.OrderListViewMapper;
import ru.ozon.app.android.account.orders.orderlist.v2.di.OrderListComponent;
import ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper;
import ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent;
import ru.ozon.app.android.composer.di.page.RetainComposerViewModel;
import ru.ozon.app.android.favorites.familyProfileAvatar.di.FamilyProfileAvatarComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di.SimpleInfoComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.footer.SimpleInfoFooterViewMapper;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.di.ProfileTilesDIComponent;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di.SellerActionsPreviewComponent;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v2.di.PlayerShowcaseV2Component;
import ru.ozon.app.android.pdp.widgets.sellerV4.di.SellerV4WidgetsComponent;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.AbstractSearchResultsGridViewMapper;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.widgetv2.SearchResultsGridWidgetV2Component;
import ru.ozon.app.android.search.widgets.expandableCells.di.ExpandableCellsComponent;
import ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent;
import ru.ozon.app.android.search.widgets.suggestions.ui.prefetch.SuggestionsPrefetchViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.di.HotelsRoomsListV5Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.di.SkiResortInfoComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.di.TransparentNavBarV2Component;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.di.UsersGradesV2Component;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14289b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f14288a = i11;
        this.f14289b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SkiResortInfoComponent create$lambda$0;
        TransparentNavBarV2Component create$lambda$02;
        WiseSkuScrollComponent create$lambda$6;
        PlayerShowcaseV2Component instance$lambda$0;
        ProfileTilesDIComponent create$lambda$03;
        SellerV4WidgetsComponent create$lambda$04;
        SellerActionsPreviewComponent create$lambda$05;
        SuggestionsWidgetComponent widgetComponent$lambda$1;
        OrderListComponent widgetComponent$lambda$0;
        ServiceCarouselComponent widgetComponent$lambda$02;
        UsersGradesV2Component create$lambda$06;
        SearchResultsGridWidgetV2Component widgetComponent$lambda$03;
        FamilyProfileAvatarComponent create$lambda$07;
        SimpleInfoComponent widgetComponent$lambda$04;
        ExpandableCellsComponent create$lambda$08;
        HotelsRoomsListV5Component create$lambda$09;
        InterfaceC6958a interfaceC6958a;
        switch (this.f14288a) {
            case 0:
                create$lambda$0 = SkiResortInfoComponent.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = TransparentNavBarV2Component.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$02;
            case 2:
                create$lambda$6 = WiseSkuScrollComponent.Companion.create$lambda$6((C7475g) this.f14289b);
                return create$lambda$6;
            case 3:
                instance$lambda$0 = PlayerShowcaseV2Component.Companion.getInstance$lambda$0((C7475g) this.f14289b);
                return instance$lambda$0;
            case 4:
                create$lambda$03 = ProfileTilesDIComponent.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = SellerV4WidgetsComponent.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$04;
            case 6:
                create$lambda$05 = SellerActionsPreviewComponent.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$05;
            case 7:
                widgetComponent$lambda$1 = SuggestionsPrefetchViewMapper.widgetComponent$lambda$1((C7475g) this.f14289b);
                return widgetComponent$lambda$1;
            case 8:
                widgetComponent$lambda$0 = OrderListViewMapper.widgetComponent$lambda$0((C7475g) this.f14289b);
                return widgetComponent$lambda$0;
            case 9:
                widgetComponent$lambda$02 = ServiceCarouselViewMapper.widgetComponent$lambda$0((C7475g) this.f14289b);
                return widgetComponent$lambda$02;
            case 10:
                create$lambda$06 = UsersGradesV2Component.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$06;
            case 11:
                widgetComponent$lambda$03 = AbstractSearchResultsGridViewMapper.widgetComponent$lambda$0((C7475g) this.f14289b);
                return widgetComponent$lambda$03;
            case 12:
                create$lambda$07 = FamilyProfileAvatarComponent.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$07;
            case 13:
                widgetComponent$lambda$04 = SimpleInfoFooterViewMapper.widgetComponent$lambda$0((C7475g) this.f14289b);
                return widgetComponent$lambda$04;
            case 14:
                create$lambda$08 = ExpandableCellsComponent.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$08;
            case 15:
                create$lambda$09 = HotelsRoomsListV5Component.Companion.create$lambda$0((C7475g) this.f14289b);
                return create$lambda$09;
            default:
                interfaceC6958a = ((RetainComposerViewModel) this.f14289b).retainComponent;
                return interfaceC6958a;
        }
    }
}

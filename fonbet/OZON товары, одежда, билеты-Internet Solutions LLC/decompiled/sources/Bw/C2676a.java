package Bw;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.emptyCart.core.v2.di.EmptyCartV2Component;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.di.SearchBarComponent;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.di.CartTileComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsTableV2.di.DocsTableV2Component;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.di.ScrollComponent;
import ru.ozon.app.android.pdp.widgets.helpfulHints.di.HelpufulWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.di.LotteryInformationWidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.di.FiltersButtonWithCounterComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation.FiltersButtonWithCounterViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconButton.di.IconButtonComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.di.TravelRailwaySeatSelectWithSchemeComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.button.TravelRailwaySeatSelectStickyButtonViewMapper;

/* renamed from: Bw.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2676a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4067b;

    public /* synthetic */ C2676a(C7475g c7475g, int i11) {
        this.f4066a = i11;
        this.f4067b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ScrollComponent create$lambda$0;
        EmptyCartV2Component create$lambda$02;
        FiltersButtonWithCounterComponent widgetComponent$lambda$3;
        IconButtonComponent create$lambda$03;
        CartTileComponent create$lambda$5;
        DocsTableV2Component create$lambda$04;
        LotteryInformationWidgetComponent instance$lambda$0;
        HelpufulWidgetComponent create$lambda$05;
        TravelRailwaySeatSelectWithSchemeComponent widgetComponent$lambda$2;
        SearchBarComponent create$lambda$06;
        switch (this.f4066a) {
            case 0:
                create$lambda$0 = ScrollComponent.Companion.create$lambda$0(this.f4067b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = EmptyCartV2Component.Companion.create$lambda$0(this.f4067b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$3 = FiltersButtonWithCounterViewMapper.widgetComponent$lambda$3(this.f4067b);
                return widgetComponent$lambda$3;
            case 3:
                create$lambda$03 = IconButtonComponent.Companion.create$lambda$0(this.f4067b);
                return create$lambda$03;
            case 4:
                create$lambda$5 = CartTileComponent.Companion.create$lambda$5(this.f4067b);
                return create$lambda$5;
            case 5:
                create$lambda$04 = DocsTableV2Component.Companion.create$lambda$0(this.f4067b);
                return create$lambda$04;
            case 6:
                instance$lambda$0 = LotteryInformationWidgetComponent.Companion.getInstance$lambda$0(this.f4067b);
                return instance$lambda$0;
            case 7:
                create$lambda$05 = HelpufulWidgetComponent.Companion.create$lambda$0(this.f4067b);
                return create$lambda$05;
            case 8:
                widgetComponent$lambda$2 = TravelRailwaySeatSelectStickyButtonViewMapper.widgetComponent$lambda$2(this.f4067b);
                return widgetComponent$lambda$2;
            default:
                create$lambda$06 = SearchBarComponent.Companion.create$lambda$0(this.f4067b);
                return create$lambda$06;
        }
    }
}

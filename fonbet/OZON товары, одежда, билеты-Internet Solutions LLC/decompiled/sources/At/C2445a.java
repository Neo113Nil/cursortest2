package At;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cml.delivery.widgets.selectCategory.di.SelectCategoryComponent;
import ru.ozon.app.android.favorites.wishlistMultiselect.di.WishlistMultiselectWidgetComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.courierTips.di.CourierTipsComponent;
import ru.ozon.app.android.geo.addressEditDetailV2.di.AddressEditDetailV2WidgetComponent;
import ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di.ExternalVerificationWidgetComponent;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationHandlerMobileViewMapperNoUi;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.di.EmptyStateV2Component;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.di.ToursMealComponent;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.di.CommentsListComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2BannerComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper;

/* renamed from: At.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2445a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f1273b;

    public /* synthetic */ C2445a(C7475g c7475g, int i11) {
        this.f1272a = i11;
        this.f1273b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        WishlistMultiselectWidgetComponent create$lambda$0;
        EmptyStateV2Component create$lambda$02;
        CommentsListComponent create$lambda$03;
        ToursMealComponent create$lambda$04;
        BrandWidgetComponent instance$lambda$0;
        CourierTipsComponent create$lambda$05;
        TileGrid2BannerComponent widgetComponent$lambda$0;
        AddressEditDetailV2WidgetComponent create$lambda$06;
        SelectCategoryComponent create$lambda$07;
        ExternalVerificationWidgetComponent widgetComponent$lambda$02;
        CartButtonV5WidgetComponent create$lambda$08;
        switch (this.f1272a) {
            case 0:
                create$lambda$0 = WishlistMultiselectWidgetComponent.Companion.create$lambda$0(this.f1273b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = EmptyStateV2Component.Companion.create$lambda$0(this.f1273b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = CommentsListComponent.Companion.create$lambda$0(this.f1273b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = ToursMealComponent.Companion.create$lambda$0(this.f1273b);
                return create$lambda$04;
            case 4:
                instance$lambda$0 = BrandWidgetComponent.Companion.getInstance$lambda$0(this.f1273b);
                return instance$lambda$0;
            case 5:
                create$lambda$05 = CourierTipsComponent.Companion.create$lambda$0(this.f1273b);
                return create$lambda$05;
            case 6:
                widgetComponent$lambda$0 = TileGrid2BannerViewMapper.widgetComponent$lambda$0(this.f1273b);
                return widgetComponent$lambda$0;
            case 7:
                create$lambda$06 = AddressEditDetailV2WidgetComponent.Companion.create$lambda$0(this.f1273b);
                return create$lambda$06;
            case 8:
                create$lambda$07 = SelectCategoryComponent.Companion.create$lambda$0(this.f1273b);
                return create$lambda$07;
            case 9:
                widgetComponent$lambda$02 = ExternalVerificationHandlerMobileViewMapperNoUi.widgetComponent$lambda$0(this.f1273b);
                return widgetComponent$lambda$02;
            default:
                create$lambda$08 = CartButtonV5WidgetComponent.Companion.create$lambda$0(this.f1273b);
                return create$lambda$08;
        }
    }
}

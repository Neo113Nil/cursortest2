package AH;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.ads.widgets.advBanner.v4.di.AdvBannerV4Component;
import ru.ozon.app.android.cart.totalV3.di.TotalV3Component;
import ru.ozon.app.android.cart.totalV3.presentation.TotalViewMapper;
import ru.ozon.app.android.common.filterWidgets.filters.di.FilterComponent;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.di.CurtainContentComponent;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.CurtainContentViewMapper;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.di.ReorderTileComponent;
import ru.ozon.app.android.fresh.geo.widgets.addressPopupButton.di.AddressPopupButtonComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.di.SteppedThermometerComponent;
import ru.ozon.app.android.marketing.widgets.enableNotifications.di.EnableNotificationsComponent;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.core.button.EmptyScreenButtonViewMapper;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.di.EmptyScreenWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.di.MorkovskOnboardingInfoComponent;
import ru.ozon.app.android.returns.cancels.modalConstructor.di.ModalConstructorComponent;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.imageList.HorizontalScrollImagesViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewMapper.ReturnCreationItemViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.core.atom.AtomElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent;
import ru.ozon.app.android.returns.ui.molecules.cellContent.du.ReturnCellContentComponent;
import ru.ozon.app.android.returns.ui.molecules.cellContent.mapper.ReturnCellContentViewMapper;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.separator.di.SeparatorComponent;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.core.multi.NavLikezoneCaruselMultiViewMapper;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.di.NavLikezoneCaruselComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.di.PassengerDirectoryComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.di.PassengersDirectoryV3Component;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.di.ToursRoomsListV2Component;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f626b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f625a = i11;
        this.f626b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ReturnCellContentComponent widgetComponent$lambda$0;
        ModalConstructorComponent widgetComponent$lambda$1;
        PassengerDirectoryComponent create$lambda$0;
        FilterComponent create$lambda$02;
        PassengersDirectoryV3Component create$lambda$03;
        DeliveryGroupComponent widgetComponent$lambda$02;
        ReorderTileComponent create$lambda$04;
        ToursRoomsListV2Component create$lambda$05;
        ReturnCreationMethodsComponent widgetComponent$lambda$12;
        TotalV3Component widgetComponent$lambda$3;
        SteppedThermometerComponent create$lambda$06;
        EmptyScreenWidgetComponent widgetComponent$lambda$32;
        NavLikezoneCaruselComponent widgetComponent$lambda$03;
        SeparatorComponent widgetComponent$lambda$04;
        CurtainContentComponent widgetComponent$lambda$05;
        MorkovskOnboardingInfoComponent create$lambda$07;
        AdvBannerV4Component create$lambda$08;
        EnableNotificationsComponent create$lambda$09;
        AddressPopupButtonComponent create$lambda$010;
        switch (this.f625a) {
            case 0:
                widgetComponent$lambda$0 = ReturnCellContentViewMapper.widgetComponent$lambda$0(this.f626b);
                return widgetComponent$lambda$0;
            case 1:
                widgetComponent$lambda$1 = HorizontalScrollImagesViewMapper.widgetComponent$lambda$1(this.f626b);
                return widgetComponent$lambda$1;
            case 2:
                create$lambda$0 = PassengerDirectoryComponent.Companion.create$lambda$0(this.f626b);
                return create$lambda$0;
            case 3:
                create$lambda$02 = FilterComponent.Companion.create$lambda$0(this.f626b);
                return create$lambda$02;
            case 4:
                create$lambda$03 = PassengersDirectoryV3Component.Companion.create$lambda$0(this.f626b);
                return create$lambda$03;
            case 5:
                widgetComponent$lambda$02 = ReturnCreationItemViewMapper.widgetComponent$lambda$0(this.f626b);
                return widgetComponent$lambda$02;
            case 6:
                create$lambda$04 = ReorderTileComponent.Companion.create$lambda$0(this.f626b);
                return create$lambda$04;
            case 7:
                create$lambda$05 = ToursRoomsListV2Component.Companion.create$lambda$0(this.f626b);
                return create$lambda$05;
            case 8:
                widgetComponent$lambda$12 = AtomElementViewMapper.widgetComponent$lambda$1(this.f626b);
                return widgetComponent$lambda$12;
            case 9:
                widgetComponent$lambda$3 = TotalViewMapper.widgetComponent$lambda$3(this.f626b);
                return widgetComponent$lambda$3;
            case 10:
                create$lambda$06 = SteppedThermometerComponent.Companion.create$lambda$0(this.f626b);
                return create$lambda$06;
            case 11:
                widgetComponent$lambda$32 = EmptyScreenButtonViewMapper.widgetComponent$lambda$3(this.f626b);
                return widgetComponent$lambda$32;
            case 12:
                widgetComponent$lambda$03 = NavLikezoneCaruselMultiViewMapper.widgetComponent$lambda$0(this.f626b);
                return widgetComponent$lambda$03;
            case 13:
                widgetComponent$lambda$04 = SeparatorViewMapper.widgetComponent$lambda$0(this.f626b);
                return widgetComponent$lambda$04;
            case 14:
                widgetComponent$lambda$05 = CurtainContentViewMapper.widgetComponent$lambda$0(this.f626b);
                return widgetComponent$lambda$05;
            case 15:
                create$lambda$07 = MorkovskOnboardingInfoComponent.Companion.create$lambda$0(this.f626b);
                return create$lambda$07;
            case 16:
                create$lambda$08 = AdvBannerV4Component.Companion.create$lambda$0(this.f626b);
                return create$lambda$08;
            case 17:
                create$lambda$09 = EnableNotificationsComponent.Companion.create$lambda$0(this.f626b);
                return create$lambda$09;
            default:
                create$lambda$010 = AddressPopupButtonComponent.Companion.create$lambda$0(this.f626b);
                return create$lambda$010;
        }
    }
}

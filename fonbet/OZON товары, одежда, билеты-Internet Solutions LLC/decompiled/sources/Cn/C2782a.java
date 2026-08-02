package Cn;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.di.CommonDisclaimerV2Component;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.di.CommonLayoutGridComponent;
import ru.ozon.app.android.account.orders.barcodePopover.v1.di.BarcodePopoverComponent;
import ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverViewMapper;
import ru.ozon.app.android.cart.controls.v2.di.ControlsWidgetComponent;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.di.InputCurtainComponent;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di.TipCourierHeaderComponent;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.overlay.TipCourierHeaderOverlayViewMapper;
import ru.ozon.app.android.favorites.favoriteproduct.v2.di.FavoriteProductV2Component;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.di.EdoProvidersComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation.EdoProvidersViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.di.DeliveryWidgetV3Component;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.data.DeliveryTimeSelectorViewMapper;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.di.DeliveryTimeSelectorComponent;
import ru.ozon.app.android.pdp.widgets.galleryFullView.di.GalleryFullViewWidgetComponent;
import ru.ozon.app.android.returns.cancels.modalConstructor.di.ModalConstructorComponent;
import ru.ozon.app.android.returns.cancels.modalConstructor.presentation.button.ButtonViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.di.QuickFiltersComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.di.IconChooserComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelImage.v1.di.TravelImageComponent;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.di.MediaPickerComponent;

/* renamed from: Cn.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2782a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f5161b;

    public /* synthetic */ C2782a(C7475g c7475g, int i11) {
        this.f5160a = i11;
        this.f5161b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ControlsWidgetComponent widgetComponent$lambda$0;
        ModalConstructorComponent widgetComponent$lambda$1;
        TravelImageComponent create$lambda$0;
        GalleryFullViewWidgetComponent createWidgetComponent$lambda$0;
        IconChooserComponent instance$lambda$0;
        CommonDisclaimerV2Component invoke$lambda$0;
        CommonLayoutGridComponent invoke$lambda$02;
        EdoProvidersComponent widgetComponent$lambda$02;
        InputCurtainComponent create$lambda$02;
        QuickFiltersComponent widgetComponent$lambda$12;
        MediaPickerComponent instance$lambda$02;
        DeliveryTimeSelectorComponent widgetComponent$lambda$03;
        TipCourierHeaderComponent widgetComponent$lambda$04;
        DeliveryWidgetV3Component create$lambda$03;
        BarcodePopoverComponent widgetComponent$lambda$05;
        FavoriteProductV2Component create$lambda$04;
        switch (this.f5160a) {
            case 0:
                widgetComponent$lambda$0 = ControlsViewMapper.widgetComponent$lambda$0(this.f5161b);
                return widgetComponent$lambda$0;
            case 1:
                widgetComponent$lambda$1 = ButtonViewMapper.widgetComponent$lambda$1(this.f5161b);
                return widgetComponent$lambda$1;
            case 2:
                create$lambda$0 = TravelImageComponent.Companion.create$lambda$0(this.f5161b);
                return create$lambda$0;
            case 3:
                createWidgetComponent$lambda$0 = GalleryFullViewWidgetComponent.Companion.createWidgetComponent$lambda$0(this.f5161b);
                return createWidgetComponent$lambda$0;
            case 4:
                instance$lambda$0 = IconChooserComponent.Companion.getInstance$lambda$0(this.f5161b);
                return instance$lambda$0;
            case 5:
                invoke$lambda$0 = CommonDisclaimerV2Component.Companion.invoke$lambda$0(this.f5161b);
                return invoke$lambda$0;
            case 6:
                invoke$lambda$02 = CommonLayoutGridComponent.Companion.invoke$lambda$0(this.f5161b);
                return invoke$lambda$02;
            case 7:
                widgetComponent$lambda$02 = EdoProvidersViewMapper.widgetComponent$lambda$0(this.f5161b);
                return widgetComponent$lambda$02;
            case 8:
                create$lambda$02 = InputCurtainComponent.Companion.create$lambda$0(this.f5161b);
                return create$lambda$02;
            case 9:
                widgetComponent$lambda$12 = QuickFiltersViewMapper.widgetComponent$lambda$1(this.f5161b);
                return widgetComponent$lambda$12;
            case 10:
                instance$lambda$02 = MediaPickerComponent.Companion.getInstance$lambda$0(this.f5161b);
                return instance$lambda$02;
            case 11:
                widgetComponent$lambda$03 = DeliveryTimeSelectorViewMapper.widgetComponent$lambda$0(this.f5161b);
                return widgetComponent$lambda$03;
            case 12:
                widgetComponent$lambda$04 = TipCourierHeaderOverlayViewMapper.widgetComponent$lambda$0(this.f5161b);
                return widgetComponent$lambda$04;
            case 13:
                create$lambda$03 = DeliveryWidgetV3Component.Companion.create$lambda$0(this.f5161b);
                return create$lambda$03;
            case 14:
                widgetComponent$lambda$05 = BarcodePopoverViewMapper.widgetComponent$lambda$0(this.f5161b);
                return widgetComponent$lambda$05;
            default:
                create$lambda$04 = FavoriteProductV2Component.Companion.create$lambda$0(this.f5161b);
                return create$lambda$04;
        }
    }
}

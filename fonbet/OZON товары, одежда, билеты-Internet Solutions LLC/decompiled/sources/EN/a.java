package EN;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.core.reason.DeliveryDateChangedComplaintFormReasonViewMapper;
import ru.ozon.app.android.account.orders.datechangedcomplaintform.di.DeliveryDateChangedComplaintFormComponent;
import ru.ozon.app.android.checkoutcomposer.celllist.di.CheckoutCellListWidgetComponent;
import ru.ozon.app.android.cml.delivery.widgets.cellList.di.CmlCellListComponent;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.di.TipCourierDetailsV2Component;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.button.TipCourierDetailButtonViewMapper;
import ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.di.PromoStickyBubbleComponent;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.di.MessengerCounterV2Component;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.core.NotificationBarRestrictionViewMapper;
import ru.ozon.app.android.orderdetails.notificationbarrestriction.di.NotificationBarRestrictionComponent;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.di.MorkovskTabbarComponent;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.di.DeliveryGroupComponent;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewMapper.ReturnCreationGroupViewMapper;
import ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.cell.SuggestionsCellViewMapper;
import ru.ozon.app.android.storefront.widgets.helpCert.di.HelpCertWidgetComponent;
import ru.ozon.app.android.storefront.widgets.helpCert.ui.HelpCertViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.di.DirectFlightsDropdownComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.di.HotelsBookTotalV3Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.di.FiltersComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer.FiltersFooterStickyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.pendingAction.di.PendingActionComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.di.InfoPopupComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f7705b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f7704a = i11;
        this.f7705b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        HotelsBookTotalV3Component create$lambda$0;
        FiltersComponent widgetComponent$lambda$2;
        DeliveryDateChangedComplaintFormComponent widgetComponent$lambda$22;
        DirectFlightsDropdownComponent create$lambda$02;
        DeliveryGroupComponent widgetComponent$lambda$0;
        CmlCellListComponent create$lambda$03;
        PromoStickyBubbleComponent create$lambda$04;
        HelpCertWidgetComponent widgetComponent$lambda$02;
        SuggestionsWidgetComponent widgetComponent$lambda$03;
        CheckoutCellListWidgetComponent create$lambda$05;
        PendingActionComponent create$lambda$06;
        TipCourierDetailsV2Component widgetComponent$lambda$3;
        NotificationBarRestrictionComponent widgetComponent$lambda$04;
        MorkovskTabbarComponent create$lambda$07;
        CouponWidgetComponent create$lambda$08;
        InfoPopupComponent create$lambda$09;
        MessengerCounterV2Component createComponent$lambda$0;
        switch (this.f7704a) {
            case 0:
                create$lambda$0 = HotelsBookTotalV3Component.Companion.create$lambda$0(this.f7705b);
                return create$lambda$0;
            case 1:
                widgetComponent$lambda$2 = FiltersFooterStickyViewMapper.widgetComponent$lambda$2(this.f7705b);
                return widgetComponent$lambda$2;
            case 2:
                widgetComponent$lambda$22 = DeliveryDateChangedComplaintFormReasonViewMapper.widgetComponent$lambda$2(this.f7705b);
                return widgetComponent$lambda$22;
            case 3:
                create$lambda$02 = DirectFlightsDropdownComponent.Companion.create$lambda$0(this.f7705b);
                return create$lambda$02;
            case 4:
                widgetComponent$lambda$0 = ReturnCreationGroupViewMapper.widgetComponent$lambda$0(this.f7705b);
                return widgetComponent$lambda$0;
            case 5:
                create$lambda$03 = CmlCellListComponent.Companion.create$lambda$0(this.f7705b);
                return create$lambda$03;
            case 6:
                create$lambda$04 = PromoStickyBubbleComponent.Companion.create$lambda$0(this.f7705b);
                return create$lambda$04;
            case 7:
                widgetComponent$lambda$02 = HelpCertViewMapper.widgetComponent$lambda$0(this.f7705b);
                return widgetComponent$lambda$02;
            case 8:
                widgetComponent$lambda$03 = SuggestionsCellViewMapper.widgetComponent$lambda$0(this.f7705b);
                return widgetComponent$lambda$03;
            case 9:
                create$lambda$05 = CheckoutCellListWidgetComponent.Companion.create$lambda$0(this.f7705b);
                return create$lambda$05;
            case 10:
                create$lambda$06 = PendingActionComponent.Companion.create$lambda$0(this.f7705b);
                return create$lambda$06;
            case 11:
                widgetComponent$lambda$3 = TipCourierDetailButtonViewMapper.widgetComponent$lambda$3(this.f7705b);
                return widgetComponent$lambda$3;
            case 12:
                widgetComponent$lambda$04 = NotificationBarRestrictionViewMapper.widgetComponent$lambda$0(this.f7705b);
                return widgetComponent$lambda$04;
            case 13:
                create$lambda$07 = MorkovskTabbarComponent.Companion.create$lambda$0(this.f7705b);
                return create$lambda$07;
            case 14:
                create$lambda$08 = CouponWidgetComponent.Companion.create$lambda$0(this.f7705b);
                return create$lambda$08;
            case 15:
                create$lambda$09 = InfoPopupComponent.Companion.create$lambda$0(this.f7705b);
                return create$lambda$09;
            default:
                createComponent$lambda$0 = MessengerCounterV2Component.Companion.createComponent$lambda$0(this.f7705b);
                return createComponent$lambda$0;
        }
    }
}

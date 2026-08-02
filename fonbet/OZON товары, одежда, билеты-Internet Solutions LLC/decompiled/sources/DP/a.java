package DP;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.commonwidgets.widgets.error.di.ErrorWidgetComponent;
import ru.ozon.app.android.commonwidgets.widgets.error.presentation.ErrorViewMapper;
import ru.ozon.app.android.fresh.chat.widgets.floatCartButton.di.FloatCartButtonDIComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.di.StatusEdoComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation.StatusEdoViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di.WholeSaleComponent;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.di.BlackFridayStatusComponent;
import ru.ozon.app.android.pdp.widgets.translateButton.di.TranslateButtonWidgetComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.di.InsurancePanelComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.di.TravelCellListV2Component;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.di.TravelPriceDetailInformationComponent;
import ru.ozon.app.android.ugc.core.widgets.iconWidget.di.IconWidgetComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f6265b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f6264a = i11;
        this.f6265b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        TravelCellListV2Component create$lambda$0;
        IconWidgetComponent create$lambda$02;
        TravelPriceDetailInformationComponent create$lambda$03;
        FloatCartButtonDIComponent create$lambda$04;
        InsurancePanelComponent create$lambda$05;
        TranslateButtonWidgetComponent instance$lambda$0;
        WholeSaleComponent create$lambda$06;
        BlackFridayStatusComponent create$lambda$07;
        StatusEdoComponent widgetComponent$lambda$0;
        ErrorWidgetComponent widgetComponent$lambda$02;
        switch (this.f6264a) {
            case 0:
                create$lambda$0 = TravelCellListV2Component.Companion.create$lambda$0(this.f6265b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = IconWidgetComponent.Companion.create$lambda$0(this.f6265b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = TravelPriceDetailInformationComponent.Companion.create$lambda$0(this.f6265b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = FloatCartButtonDIComponent.Companion.create$lambda$0(this.f6265b);
                return create$lambda$04;
            case 4:
                create$lambda$05 = InsurancePanelComponent.Companion.create$lambda$0(this.f6265b);
                return create$lambda$05;
            case 5:
                instance$lambda$0 = TranslateButtonWidgetComponent.Companion.getInstance$lambda$0(this.f6265b);
                return instance$lambda$0;
            case 6:
                create$lambda$06 = WholeSaleComponent.Companion.create$lambda$0(this.f6265b);
                return create$lambda$06;
            case 7:
                create$lambda$07 = BlackFridayStatusComponent.Companion.create$lambda$0(this.f6265b);
                return create$lambda$07;
            case 8:
                widgetComponent$lambda$0 = StatusEdoViewMapper.widgetComponent$lambda$0(this.f6265b);
                return widgetComponent$lambda$0;
            default:
                widgetComponent$lambda$02 = ErrorViewMapper.widgetComponent$lambda$0(this.f6265b);
                return widgetComponent$lambda$02;
        }
    }
}

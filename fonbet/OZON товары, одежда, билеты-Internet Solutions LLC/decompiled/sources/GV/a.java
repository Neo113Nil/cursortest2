package GV;

import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.buttonv2.di.ActionButtonV2Component;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionButtonV2OverlayWidgetViewMapper;
import ru.ozon.app.android.checkoutcomposer.discountcode.di.DiscountCodeWidgetComponent;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.di.DeliveryReviewFormWidgetComponent;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer.DeliveryReviewFormFooterViewMapper;
import ru.ozon.app.android.fresh.chat.widgets.promptSuggestions.di.PromptSuggestionsDIComponent;
import ru.ozon.app.android.fresh.main.widgets.customCell.di.CustomCellComponent;
import ru.ozon.app.android.pdp.widgets.outofstock.di.OutOfStockComponent;
import ru.ozon.app.android.pdpoldwidgets.widgets.caption.di.CaptionWidgetComponent;
import ru.ozon.app.android.returns.creation.widgets.orders.di.ReturnCreationOrdersComponent;
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.di.PromoBannerB2BComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.di.InfoPopupV4Component;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.di.TranslateButtonComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9849b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9848a = i11;
        this.f9849b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        TranslateButtonComponent create$lambda$0;
        PromptSuggestionsDIComponent create$lambda$02;
        CustomCellComponent create$lambda$03;
        CaptionWidgetComponent create$lambda$04;
        ActionButtonV2Component widgetComponent$lambda$2;
        PromoBannerB2BComponent create$lambda$05;
        DiscountCodeWidgetComponent create$lambda$06;
        OutOfStockComponent createComponent$lambda$0;
        InfoPopupV4Component create$lambda$07;
        DeliveryReviewFormWidgetComponent widgetComponent$lambda$0;
        ReturnCreationOrdersComponent create$lambda$08;
        switch (this.f9848a) {
            case 0:
                create$lambda$0 = TranslateButtonComponent.Companion.create$lambda$0((C7475g) this.f9849b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = PromptSuggestionsDIComponent.Companion.create$lambda$0((C7475g) this.f9849b);
                return create$lambda$02;
            case 2:
                create$lambda$03 = CustomCellComponent.Companion.create$lambda$0((C7475g) this.f9849b);
                return create$lambda$03;
            case 3:
                create$lambda$04 = CaptionWidgetComponent.Companion.create$lambda$0((C7475g) this.f9849b);
                return create$lambda$04;
            case 4:
                widgetComponent$lambda$2 = ActionButtonV2OverlayWidgetViewMapper.widgetComponent$lambda$2((C7475g) this.f9849b);
                return widgetComponent$lambda$2;
            case 5:
                create$lambda$05 = PromoBannerB2BComponent.Companion.create$lambda$0((C7475g) this.f9849b);
                return create$lambda$05;
            case 6:
                create$lambda$06 = DiscountCodeWidgetComponent.Companion.create$lambda$0((C7475g) this.f9849b);
                return create$lambda$06;
            case 7:
                createComponent$lambda$0 = OutOfStockComponent.Companion.createComponent$lambda$0((C7475g) this.f9849b);
                return createComponent$lambda$0;
            case 8:
                create$lambda$07 = InfoPopupV4Component.Companion.create$lambda$0((C7475g) this.f9849b);
                return create$lambda$07;
            case 9:
                widgetComponent$lambda$0 = DeliveryReviewFormFooterViewMapper.widgetComponent$lambda$0((C7475g) this.f9849b);
                return widgetComponent$lambda$0;
            default:
                create$lambda$08 = ReturnCreationOrdersComponent.Companion.create$lambda$0((Context) this.f9849b);
                return create$lambda$08;
        }
    }
}

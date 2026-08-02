package Du;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.di.SplitDetailV2Component;
import ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.di.CourierTipsComponent;
import ru.ozon.app.android.fresh.feature.b2b.di.AccompanyingDocsDownloadingComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di.DeliveryWidgetV4Component;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.di.CartButtonWidgetComponent;
import ru.ozon.app.android.pdp.widgets.navTitle.di.PdpNavTitleWidgetComponent;
import ru.ozon.app.android.pdp.widgets.richContent.di.RichContentWidgetComponent;
import ru.ozon.app.android.pdp.widgets.separator.di.PdpSeparatorComponent;
import ru.ozon.app.android.regulardraw.widgets.warningTooltip.di.WarningTooltipComponent;
import ru.ozon.app.android.returns.creation.widgets.methods.core.textwithiconbutton.TextWithIconButtonElementViewMapper;
import ru.ozon.app.android.returns.creation.widgets.methods.di.ReturnCreationMethodsComponent;
import ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditComponent;
import ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditViewMapper;
import ru.ozon.app.android.search.widgets.brandList.di.BrandListComponent;
import ru.ozon.app.android.search.widgets.suggestions.di.SuggestionsWidgetComponent;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle.SuggestionsTitleSubtitleViewMapper;
import ru.ozon.app.android.storefront.widgets.scrollAnchor.di.ScrollAnchorComponent;
import ru.ozon.app.android.storefront.widgets.scrollAnchor.presentation.ScrollAnchorViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di.AddHotelGuestsV5Component;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;

/* renamed from: Du.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C2881a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f6779b;

    public /* synthetic */ C2881a(C7475g c7475g, int i11) {
        this.f6778a = i11;
        this.f6779b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        AccompanyingDocsDownloadingComponent widgetComponent$lambda$0;
        RichContentWidgetComponent create$lambda$0;
        ScrollAnchorComponent widgetComponent$lambda$02;
        SplitDetailV2Component create$lambda$02;
        AddHotelGuestsV5Component create$lambda$03;
        ReturnCreationMethodsComponent widgetComponent$lambda$1;
        PdpSeparatorComponent create$lambda$04;
        SuggestionsWidgetComponent widgetComponent$lambda$03;
        DeliveryWidgetV4Component create$lambda$05;
        BrandListComponent create$lambda$06;
        ReturnImageEditComponent widgetComponent$lambda$04;
        CourierTipsComponent create$lambda$07;
        CartButtonWidgetComponent create$lambda$08;
        ReviewFormComponent instance$lambda$0;
        PdpNavTitleWidgetComponent create$lambda$09;
        WarningTooltipComponent create$lambda$010;
        switch (this.f6778a) {
            case 0:
                widgetComponent$lambda$0 = AccompanyingDocsDownloadingViewMapper.widgetComponent$lambda$0(this.f6779b);
                return widgetComponent$lambda$0;
            case 1:
                create$lambda$0 = RichContentWidgetComponent.Companion.create$lambda$0(this.f6779b);
                return create$lambda$0;
            case 2:
                widgetComponent$lambda$02 = ScrollAnchorViewMapper.widgetComponent$lambda$0(this.f6779b);
                return widgetComponent$lambda$02;
            case 3:
                create$lambda$02 = SplitDetailV2Component.Companion.create$lambda$0(this.f6779b);
                return create$lambda$02;
            case 4:
                create$lambda$03 = AddHotelGuestsV5Component.Companion.create$lambda$0(this.f6779b);
                return create$lambda$03;
            case 5:
                widgetComponent$lambda$1 = TextWithIconButtonElementViewMapper.widgetComponent$lambda$1(this.f6779b);
                return widgetComponent$lambda$1;
            case 6:
                create$lambda$04 = PdpSeparatorComponent.Companion.create$lambda$0(this.f6779b);
                return create$lambda$04;
            case 7:
                widgetComponent$lambda$03 = SuggestionsTitleSubtitleViewMapper.widgetComponent$lambda$0(this.f6779b);
                return widgetComponent$lambda$03;
            case 8:
                create$lambda$05 = DeliveryWidgetV4Component.Companion.create$lambda$0(this.f6779b);
                return create$lambda$05;
            case 9:
                create$lambda$06 = BrandListComponent.Companion.create$lambda$0(this.f6779b);
                return create$lambda$06;
            case 10:
                widgetComponent$lambda$04 = ReturnImageEditViewMapper.widgetComponent$lambda$0(this.f6779b);
                return widgetComponent$lambda$04;
            case 11:
                create$lambda$07 = CourierTipsComponent.Companion.create$lambda$0(this.f6779b);
                return create$lambda$07;
            case 12:
                create$lambda$08 = CartButtonWidgetComponent.Companion.create$lambda$0(this.f6779b);
                return create$lambda$08;
            case 13:
                instance$lambda$0 = ReviewFormComponent.Companion.getInstance$lambda$0(this.f6779b);
                return instance$lambda$0;
            case 14:
                create$lambda$09 = PdpNavTitleWidgetComponent.Companion.create$lambda$0(this.f6779b);
                return create$lambda$09;
            default:
                create$lambda$010 = WarningTooltipComponent.Companion.create$lambda$0(this.f6779b);
                return create$lambda$010;
        }
    }
}

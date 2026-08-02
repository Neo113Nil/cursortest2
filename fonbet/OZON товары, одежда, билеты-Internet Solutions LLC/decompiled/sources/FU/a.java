package FU;

import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.CartSplitV2HeaderWidgetComponent;
import ru.ozon.app.android.common.taglist.di.TagListComponent;
import ru.ozon.app.android.courieronmap.di.CourierOnMapComponent;
import ru.ozon.app.android.courieronmap.presentation.CourierOnMapViewMapper;
import ru.ozon.app.android.returns.buttons.di.ReturnActionButtonsComponent;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.di.FeedbackFormV2Component;
import ru.ozon.app.android.search.widgets.suggestion.di.SearchSuggestionComponent;
import ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionsViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.di.BuyTogetherComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.di.ThemeChooserComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.di.ButtonsGroupComponent;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreview.di.ReviewGalleryPreviewComponent;
import ru.ozon.app.android.ugc.widgets.singlequestion.di.SingleQuestionComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.di.SkuScrollComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.presentation.SkuScrollViewMapper;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9203b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9202a = i11;
        this.f9203b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ButtonsGroupComponent instance$lambda$0;
        BuyTogetherComponent create$lambda$0;
        SingleQuestionComponent instance$lambda$02;
        SearchSuggestionComponent widgetComponent$lambda$0;
        SkuScrollComponent widgetComponent$lambda$02;
        CourierOnMapComponent widgetComponent$lambda$1;
        ReviewGalleryPreviewComponent instance$lambda$03;
        TagListComponent create$lambda$02;
        HotelsHorizontalShelvesComponent create$lambda$03;
        CartSplitV2HeaderWidgetComponent create$lambda$04;
        ThemeChooserComponent create$lambda$05;
        FeedbackFormV2Component create$lambda$06;
        ReturnActionButtonsComponent create$lambda$07;
        switch (this.f9202a) {
            case 0:
                instance$lambda$0 = ButtonsGroupComponent.Companion.getInstance$lambda$0((C7475g) this.f9203b);
                return instance$lambda$0;
            case 1:
                create$lambda$0 = BuyTogetherComponent.Companion.create$lambda$0((C7475g) this.f9203b);
                return create$lambda$0;
            case 2:
                instance$lambda$02 = SingleQuestionComponent.Companion.getInstance$lambda$0((C7475g) this.f9203b);
                return instance$lambda$02;
            case 3:
                widgetComponent$lambda$0 = SuggestionsViewMapper.widgetComponent$lambda$0((C7475g) this.f9203b);
                return widgetComponent$lambda$0;
            case 4:
                widgetComponent$lambda$02 = SkuScrollViewMapper.widgetComponent$lambda$0((C7475g) this.f9203b);
                return widgetComponent$lambda$02;
            case 5:
                widgetComponent$lambda$1 = CourierOnMapViewMapper.widgetComponent$lambda$1((C7475g) this.f9203b);
                return widgetComponent$lambda$1;
            case 6:
                instance$lambda$03 = ReviewGalleryPreviewComponent.Companion.getInstance$lambda$0((C7475g) this.f9203b);
                return instance$lambda$03;
            case 7:
                create$lambda$02 = TagListComponent.Companion.create$lambda$0((C7475g) this.f9203b);
                return create$lambda$02;
            case 8:
                create$lambda$03 = HotelsHorizontalShelvesComponent.Companion.create$lambda$0((C7475g) this.f9203b);
                return create$lambda$03;
            case 9:
                create$lambda$04 = CartSplitV2HeaderWidgetComponent.Companion.create$lambda$0((C7475g) this.f9203b);
                return create$lambda$04;
            case 10:
                create$lambda$05 = ThemeChooserComponent.Companion.create$lambda$0((C7475g) this.f9203b);
                return create$lambda$05;
            case 11:
                create$lambda$06 = FeedbackFormV2Component.Companion.create$lambda$0((C7475g) this.f9203b);
                return create$lambda$06;
            default:
                create$lambda$07 = ReturnActionButtonsComponent.Companion.create$lambda$0((Context) this.f9203b);
                return create$lambda$07;
        }
    }
}

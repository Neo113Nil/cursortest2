package CQ;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2Component;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips.TipCourierReviewViewMapper;
import ru.ozon.app.android.fresh.chat.widgets.messageBubble.di.MessageBubbleDIComponent;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.di.CheckoutProductsDIComponent;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di.FreshPremiumPointsTrainComponent;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.singleCarriageTrain.FreshPremiumPointsTrainSingleViewMapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di.DocsDeliveryFormComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.di.ImageBadgeListDIComponent;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.core.SellerTransparencyProfileViewMapper;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.di.SellerTransparencyProfileComponent;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di.AddToComparisonWidgetComponent;
import ru.ozon.app.android.product.common.richheader.RichHeaderComponent;
import ru.ozon.app.android.product.common.richheader.presentation.RichHeaderViewMapper;
import ru.ozon.app.android.storefront.widgets.profileIconButton.di.ProfileIconButtonComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.di.StickyPromoRedirectV2Component;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.di.ReviewGalleryFeedComponent;
import ru.ozon.app.android.ugc.widgets.listanswers.di.ListAnswersComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f4545b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f4544a = i11;
        this.f4545b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        StickyPromoRedirectV2Component create$lambda$0;
        ProfileIconButtonComponent create$lambda$02;
        RichHeaderComponent widgetComponent$lambda$0;
        DocsDeliveryFormComponent widgetComponent$lambda$02;
        MessageBubbleDIComponent create$lambda$03;
        ReviewGalleryFeedComponent create$lambda$04;
        ListAnswersComponent instance$lambda$0;
        CheckoutProductsDIComponent create$lambda$05;
        SellerTransparencyProfileComponent widgetComponent$lambda$03;
        AddToComparisonWidgetComponent create$lambda$06;
        TipCourierReviewV2Component widgetComponent$lambda$04;
        FreshPremiumPointsTrainComponent widgetComponent$lambda$05;
        ImageBadgeListDIComponent create$lambda$07;
        switch (this.f4544a) {
            case 0:
                create$lambda$0 = StickyPromoRedirectV2Component.Companion.create$lambda$0(this.f4545b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = ProfileIconButtonComponent.Companion.create$lambda$0(this.f4545b);
                return create$lambda$02;
            case 2:
                widgetComponent$lambda$0 = RichHeaderViewMapper.widgetComponent$lambda$0(this.f4545b);
                return widgetComponent$lambda$0;
            case 3:
                widgetComponent$lambda$02 = DocsDeliveryFormViewMapper.widgetComponent$lambda$0(this.f4545b);
                return widgetComponent$lambda$02;
            case 4:
                create$lambda$03 = MessageBubbleDIComponent.Companion.create$lambda$0(this.f4545b);
                return create$lambda$03;
            case 5:
                create$lambda$04 = ReviewGalleryFeedComponent.Companion.create$lambda$0(this.f4545b);
                return create$lambda$04;
            case 6:
                instance$lambda$0 = ListAnswersComponent.Companion.getInstance$lambda$0(this.f4545b);
                return instance$lambda$0;
            case 7:
                create$lambda$05 = CheckoutProductsDIComponent.Companion.create$lambda$0(this.f4545b);
                return create$lambda$05;
            case 8:
                widgetComponent$lambda$03 = SellerTransparencyProfileViewMapper.widgetComponent$lambda$0(this.f4545b);
                return widgetComponent$lambda$03;
            case 9:
                create$lambda$06 = AddToComparisonWidgetComponent.Companion.create$lambda$0(this.f4545b);
                return create$lambda$06;
            case 10:
                widgetComponent$lambda$04 = TipCourierReviewViewMapper.widgetComponent$lambda$0(this.f4545b);
                return widgetComponent$lambda$04;
            case 11:
                widgetComponent$lambda$05 = FreshPremiumPointsTrainSingleViewMapper.widgetComponent$lambda$0(this.f4545b);
                return widgetComponent$lambda$05;
            default:
                create$lambda$07 = ImageBadgeListDIComponent.Companion.create$lambda$0(this.f4545b);
                return create$lambda$07;
        }
    }
}

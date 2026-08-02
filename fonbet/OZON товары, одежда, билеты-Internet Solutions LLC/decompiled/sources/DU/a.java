package DU;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.cancelpostingsv2.di.CancelPostingsV2Component;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingsV2ButtonViewMapper;
import ru.ozon.app.android.account.orders.commonBarcode.di.CommonBarcodeComponent;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded.CommonBarcodeViewMapper;
import ru.ozon.app.android.bank.widgets.adBanner.di.AdBannerComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.di.VerificationEdoCheckingOperatorComponent;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core.WannaDiscountV2ViewMapper;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.di.WannaDiscountComponent;
import ru.ozon.app.android.returns.cancels.cancelReasons.di.SelectCancelReasonComponent;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.reasons.SelectCancelReasonsViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.di.ReturnableItemsListComponent;
import ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewMapper.TotalMobileViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di.RateMainButtonComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.di.RailwayTrainInformationComponent;
import ru.ozon.app.android.ugc.core.widgets.avatarAchievements.di.AvatarAchievementsComponent;
import ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.di.ProductsForReviewV2Component;
import ru.ozon.app.android.ugc.widgets.reviewFiltersButton.di.ReviewFiltersButtonComponent;
import ru.ozon.app.android.widgets.commonTextWidget.cellList.core.CellListWidgetComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f6275b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f6274a = i11;
        this.f6275b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        AvatarAchievementsComponent instance$lambda$0;
        CommonBarcodeComponent widgetComponent$lambda$0;
        RateMainButtonComponent widgetComponent$lambda$2;
        CellListWidgetComponent create$lambda$0;
        ProductsForReviewV2Component create$lambda$02;
        RailwayTrainInformationComponent create$lambda$03;
        WannaDiscountComponent widgetComponent$lambda$02;
        ReviewFiltersButtonComponent instance$lambda$02;
        AdBannerComponent create$lambda$04;
        CancelPostingsV2Component widgetComponent$lambda$1;
        VerificationEdoCheckingOperatorComponent create$lambda$05;
        ReturnableItemsListComponent widgetComponent$lambda$12;
        SelectCancelReasonComponent widgetComponent$lambda$13;
        switch (this.f6274a) {
            case 0:
                instance$lambda$0 = AvatarAchievementsComponent.Companion.getInstance$lambda$0(this.f6275b);
                return instance$lambda$0;
            case 1:
                widgetComponent$lambda$0 = CommonBarcodeViewMapper.widgetComponent$lambda$0(this.f6275b);
                return widgetComponent$lambda$0;
            case 2:
                widgetComponent$lambda$2 = RateMainButtonViewMapper.widgetComponent$lambda$2(this.f6275b);
                return widgetComponent$lambda$2;
            case 3:
                create$lambda$0 = CellListWidgetComponent.Companion.create$lambda$0(this.f6275b);
                return create$lambda$0;
            case 4:
                create$lambda$02 = ProductsForReviewV2Component.Companion.create$lambda$0(this.f6275b);
                return create$lambda$02;
            case 5:
                create$lambda$03 = RailwayTrainInformationComponent.Companion.create$lambda$0(this.f6275b);
                return create$lambda$03;
            case 6:
                widgetComponent$lambda$02 = WannaDiscountV2ViewMapper.widgetComponent$lambda$0(this.f6275b);
                return widgetComponent$lambda$02;
            case 7:
                instance$lambda$02 = ReviewFiltersButtonComponent.Companion.getInstance$lambda$0(this.f6275b);
                return instance$lambda$02;
            case 8:
                create$lambda$04 = AdBannerComponent.Companion.create$lambda$0(this.f6275b);
                return create$lambda$04;
            case 9:
                widgetComponent$lambda$1 = CancelPostingsV2ButtonViewMapper.widgetComponent$lambda$1(this.f6275b);
                return widgetComponent$lambda$1;
            case 10:
                create$lambda$05 = VerificationEdoCheckingOperatorComponent.Companion.create$lambda$0(this.f6275b);
                return create$lambda$05;
            case 11:
                widgetComponent$lambda$12 = TotalMobileViewMapper.widgetComponent$lambda$1(this.f6275b);
                return widgetComponent$lambda$12;
            default:
                widgetComponent$lambda$13 = SelectCancelReasonsViewMapper.widgetComponent$lambda$1(this.f6275b);
                return widgetComponent$lambda$13;
        }
    }
}

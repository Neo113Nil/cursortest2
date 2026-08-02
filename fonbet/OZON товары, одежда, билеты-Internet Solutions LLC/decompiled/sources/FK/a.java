package FK;

import Ve.C4318i4;
import Ve.C4667u7;
import Ve.C4699va;
import Ve.N5;
import Ve.P;
import Ve.Wa;
import android.content.Intent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ld0.x;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.view.AvatarPickerView;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.binder.ProductBinderV2;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.selectorsheet.OptionsSelectorSheetFragment;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.OrderDoneConfigurator;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.TagFilterViewHolder;
import ru.ozon.app.android.cscore.copybutton.CopyButtonViewHolder;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoViewHolder;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.texttitle.BlackFridayStatusTextTitleViewHolder;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselProductViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage.SwitchingImageView;
import ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation.HorizontalAutoScrollViewHolder;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingDialog;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.presentation.AdditionalServiceCardWidgetViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.BuyTogetherServiceView;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.view.PointsInputView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager.HotelsGalleryFullV2PagerVideoViewHolder;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9181b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9180a = i11;
        this.f9181b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9180a) {
            case 0:
                FashionTabOnboardingDialog.onViewCreated$lambda$0((FashionTabOnboardingDialog) this.f9181b, view);
                return;
            case 1:
                ((BuyTogetherServiceView) this.f9181b).performAction();
                return;
            case 2:
                OrderInfoViewHolder.lambda$4$lambda$3$lambda$2((OrderInfoViewHolder) this.f9181b, view);
                return;
            case 3:
                ErrorSummaryFragment.initButtonClickListeners$lambda$9$lambda$3((ErrorSummaryFragment) this.f9181b, view);
                return;
            case 4:
                PinPadFragment.t((PinPadFragment) this.f9181b);
                return;
            case 5:
                ((TagFilterViewHolder) this.f9181b).titleClick();
                return;
            case 6:
                AvatarPickerView.lambda$4$lambda$0((AvatarPickerView) this.f9181b, view);
                return;
            case 7:
                N5 this$0 = (N5) this.f9181b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4667u7) this$0.u()).f0(P.f29657a);
                return;
            case 8:
                C4699va this$02 = (C4699va) this.f9181b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((C4318i4) this$02.u()).f0(Wa.f30255a);
                return;
            case 9:
                CopyButtonViewHolder._init_$lambda$0((CopyButtonViewHolder) this.f9181b, view);
                return;
            case 10:
                HotelsGalleryFullV2PagerVideoViewHolder.lambda$4$lambda$3((HotelsGalleryFullV2PagerVideoViewHolder) this.f9181b, view);
                return;
            case 11:
                ((ComparisonCarouselProductViewHolder) this.f9181b).navigateToProductPage();
                return;
            case 12:
                AdditionalServiceCardWidgetViewHolder.setUpBackgroundView$lambda$3((AdditionalServiceCardWidgetViewHolder) this.f9181b, view);
                return;
            case 13:
                x xVar = (x) this.f9181b;
                Intent launchIntentForPackage = xVar.requireContext().getPackageManager().getLaunchIntentForPackage(xVar.requireContext().getPackageName());
                xVar.requireContext().startActivity(Intent.makeRestartActivityTask(launchIntentForPackage != null ? launchIntentForPackage.getComponent() : null));
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 14:
                ((OptionsSelectorSheetFragment) this.f9181b).dismiss();
                return;
            case 15:
                ((OrderDoneConfigurator) this.f9181b).openHome();
                return;
            case 16:
                PointsInputView._init_$lambda$0((PointsInputView) this.f9181b, view);
                return;
            case 17:
                SwitchingImageView._init_$lambda$1((SwitchingImageView) this.f9181b, view);
                return;
            case 18:
                BlackFridayStatusTextTitleViewHolder.configureLeftImage$lambda$2$lambda$1((BlackFridayStatusTextTitleViewHolder) this.f9181b, view);
                return;
            case 19:
                ProductBinderV2._init_$lambda$0((ProductBinderV2) this.f9181b, view);
                return;
            default:
                HorizontalAutoScrollViewHolder._init_$lambda$0((HorizontalAutoScrollViewHolder) this.f9181b, view);
                return;
        }
    }
}

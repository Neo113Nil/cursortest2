package Dc0;

import android.view.View;
import ru.ozon.app.android.bank.widgets.installmentPayment.presentation.InstallmentPaymentWidgetVH;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.SwipeRemoveButtonView;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.adapter.ParcelPhotoAddItemViewHolder;
import ru.ozon.app.android.debugmenu.servicemesh.DebugToolsActivity;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailView;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation.StatusBannerViewHolder;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3RowViewHolder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductImageBinder;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorVariantView;
import ru.ozon.app.android.orderdetails.customsfees.presentation.FeeViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.OldBadgeViewHolder;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase.InstallmentPurchaseWidgetViewHolder;
import ru.ozon.app.android.returns.details.deeplink.ReturnDetailsNormalizeBackStackConfigurator;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewHolder;
import ru.ozon.app.android.storefront.screens.about.AboutFragment;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v3.presentation.images.ImagesViewHolder;
import ru.ozon.app.android.travel.feature.tours.widgets.toursFlightOptions.presentation.content.ToursFlightOptionsWidgetViewHolder;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.deletereview.DeleteReviewBottomFragment;
import ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderViewHolder;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.ProductItemViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.button.TrailedActionView;
import ru.ozon.app.android.utils.ApplicationUtilsKt;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetView;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.ui.promo.PromoView;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3Holder;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6490b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f6489a = i11;
        this.f6490b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6489a) {
            case 0:
                q.B((q) this.f6490b);
                break;
            case 1:
                HammerProductImageBinder.init$lambda$1((HammerProductImageBinder) this.f6490b, view);
                break;
            case 2:
                OldBadgeViewHolder._init_$lambda$0((OldBadgeViewHolder) this.f6490b, view);
                break;
            case 3:
                ToursFlightOptionsWidgetViewHolder._init_$lambda$2((ToursFlightOptionsWidgetViewHolder) this.f6490b, view);
                break;
            case 4:
                ChangeEmailView._init_$lambda$24((ChangeEmailView) this.f6490b, view);
                break;
            case 5:
                DeleteReviewBottomFragment.onViewCreated$lambda$1((DeleteReviewBottomFragment) this.f6490b, view);
                break;
            case 6:
                ((NotificationsSettingsSelectorVariantView) this.f6490b).invokeClick();
                break;
            case 7:
                ParcelPhotoAddItemViewHolder.lambda$8$lambda$7((ParcelPhotoAddItemViewHolder) this.f6490b, view);
                break;
            case 8:
                YandexSearchSheetView.lambda$4$lambda$3((YandexSearchSheetView) this.f6490b, view);
                break;
            case 9:
                FeeViewHolder._init_$lambda$0((FeeViewHolder) this.f6490b, view);
                break;
            case 10:
                IconButtonV3Holder._init_$lambda$1((IconButtonV3Holder) this.f6490b, view);
                break;
            case 11:
                AboutFragment.inflateToolbarForSelect$lambda$7$lambda$6((AboutFragment) this.f6490b, view);
                break;
            case 12:
                SearchResultsGridViewHolder.lambda$4$lambda$2((SearchResultsGridViewHolder) this.f6490b, view);
                break;
            case 13:
                ProfileHeaderViewHolder._init_$lambda$0((ProfileHeaderViewHolder) this.f6490b, view);
                break;
            case 14:
                ((ReturnDetailsNormalizeBackStackConfigurator) this.f6490b).openReturns();
                break;
            case 15:
                InstallmentPurchaseWidgetViewHolder._init_$lambda$2((InstallmentPurchaseWidgetViewHolder) this.f6490b, view);
                break;
            case 16:
                ProductItemViewHolder.lambda$3$lambda$2((ProductItemViewHolder) this.f6490b, view);
                break;
            case 17:
                NavigationSliderV3RowViewHolder._init_$lambda$1((NavigationSliderV3RowViewHolder) this.f6490b, view);
                break;
            case 18:
                TrailedActionView.prepareUI$lambda$7((TrailedActionView) this.f6490b, view);
                break;
            case 19:
                CameraFragment.onViewCreated$lambda$27$lambda$19$lambda$14((CameraFragment) this.f6490b, view);
                break;
            case 20:
                PromoView._init_$lambda$1((PromoView) this.f6490b, view);
                break;
            case 21:
                StatusBannerViewHolder._init_$lambda$0((StatusBannerViewHolder) this.f6490b, view);
                break;
            case 22:
                ApplicationUtilsKt.restartApp((DebugToolsActivity) this.f6490b);
                break;
            case 23:
                SwipeRemoveButtonView._init_$lambda$2((SwipeRemoveButtonView) this.f6490b, view);
                break;
            case 24:
                InstallmentPaymentWidgetVH._init_$lambda$1((InstallmentPaymentWidgetVH) this.f6490b, view);
                break;
            default:
                ImagesViewHolder._init_$lambda$0((ImagesViewHolder) this.f6490b, view);
                break;
        }
    }
}

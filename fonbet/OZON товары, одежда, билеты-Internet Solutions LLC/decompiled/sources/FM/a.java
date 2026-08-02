package FM;

import Ui.C4069c;
import Ve.C1;
import Ve.C4092a9;
import Ve.C4386kf;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld0.C7931F;
import ru.ozon.app.android.account.orders.orderfilters.presentation.OrderFiltersViewHolder;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter.MultipleRangesFilterViewHolder;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.singleCarriageTrain.FreshPremiumPointsTrainSingleWidgetViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.adapter.AddLegalAddressViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductBadgesBinder;
import ru.ozon.app.android.session.auth.presentation.viewHolder.AuthViewHolder;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpWidgetView;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.adapter.images.ToursSearchResultItemImagesAdapter;
import ru.ozon.app.android.ugc.core.widgets.listreviews.presentation.sorts.ReviewsSortsBottomSheetDialogFragment;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders.SkuScrollStateBinder;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.horizontalthree.HorizontalThreeView;
import ru.ozon.fintech.ui.thumb.ThumbView;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9190b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9189a = i11;
        this.f9190b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9189a) {
            case 0:
                AviaSearchResultV4FlightView.setupRoot$lambda$19((AviaSearchResultV4FlightView) this.f9190b, view);
                break;
            case 1:
                ((MultipleRangesFilterViewHolder) this.f9190b).titleClick();
                break;
            case 2:
                PinPadFragment.A((PinPadFragment) this.f9190b);
                break;
            case 3:
                ReviewsSortsBottomSheetDialogFragment.bindApplySortButton$lambda$5$lambda$4((ReviewsSortsBottomSheetDialogFragment) this.f9190b, view);
                break;
            case 4:
                SkuScrollStateBinder.init$lambda$0((SkuScrollStateBinder) this.f9190b, view);
                break;
            case 5:
                C4069c.y((C4069c) this.f9190b);
                break;
            case 6:
                ToursSearchResultItemImagesAdapter.onBindViewHolder$lambda$0((ToursSearchResultItemImagesAdapter) this.f9190b, view);
                break;
            case 7:
                C1 this$0 = (C1) this.f9190b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4092a9) this$0.u()).e0(C4386kf.f31438a);
                break;
            case 8:
                ((OrderFiltersViewHolder) this.f9190b).showSortsBottomSheetDialog();
                break;
            case 9:
                AddLegalAddressViewHolder.lambda$2$lambda$1((AddLegalAddressViewHolder) this.f9190b, view);
                break;
            case 10:
                ((NavLikezoneCaruselBanner.View) this.f9190b).performClick();
                break;
            case 11:
                ProductBadgesBinder.init$lambda$0((ProductBadgesBinder) this.f9190b, view);
                break;
            case 12:
                DeliveryWidgetV3View.bindProgress$lambda$36$lambda$33((Function0) this.f9190b, view);
                break;
            case 13:
                C7931F.t((C7931F) this.f9190b);
                break;
            case 14:
                FreshPremiumPointsTrainSingleWidgetViewHolder._init_$lambda$1((FreshPremiumPointsTrainSingleWidgetViewHolder) this.f9190b, view);
                break;
            case 15:
                AuthViewHolder.lambda$2$lambda$1((AuthViewHolder) this.f9190b, view);
                break;
            case 16:
                HorizontalThreeView.clickListener$lambda$1((HorizontalThreeView) this.f9190b, view);
                break;
            case 17:
                ThumbView._init_$lambda$4((ThumbView) this.f9190b, view);
                break;
            default:
                ConfirmDeleteOtpWidgetView.lambda$3$lambda$1((ConfirmDeleteOtpWidgetView) this.f9190b, view);
                break;
        }
    }
}

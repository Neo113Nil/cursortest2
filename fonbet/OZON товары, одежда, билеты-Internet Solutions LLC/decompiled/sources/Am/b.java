package Am;

import Ve.Ab;
import Ve.C4313i;
import Ve.C4318i4;
import Ve.C4667u7;
import Ve.C4699va;
import Ve.N5;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.features.recycler.StringAbToggleHolder;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.selectall.CancelPostingsV2SelectAllViewHolder;
import ru.ozon.app.android.bank.widgets.premiumPoints.presentation.PremiumPointsWidgetVH;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.singleCarriageTrain.PremiumPointsTrainV2SingleWidgetViewHolder;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.productBlock.ProductBlockVH;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselProductViewHolder;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewHolder.ReturnCreationItemViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.coupleNew.CoupleBlockItemViewNew;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.pager.HotelsGalleryFullV2PagerVideoViewHolder;
import ru.ozon.fintech.features.cbottomstories.presentation.StoryFragment;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.snackbar.FinSnackbarView;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1247b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f1246a = i11;
        this.f1247b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1246a) {
            case 0:
                PremiumPointsWidgetVH.lambda$1$lambda$0((PremiumPointsWidgetVH) this.f1247b, view);
                break;
            case 1:
                StoryFragment.onViewCreated$lambda$2((StoryFragment) this.f1247b, view);
                break;
            case 2:
                ReturnCreationItemViewHolder.actionSelectClickListener$lambda$1((ReturnCreationItemViewHolder) this.f1247b, view);
                break;
            case 3:
                ((Function0) this.f1247b).invoke();
                break;
            case 4:
                PinPadFragment.z((PinPadFragment) this.f1247b);
                break;
            case 5:
                PremiumPointsTrainV2SingleWidgetViewHolder._init_$lambda$1((PremiumPointsTrainV2SingleWidgetViewHolder) this.f1247b, view);
                break;
            case 6:
                HotelsSearchResultsV5CardWidgetViewHolder._init_$lambda$0((HotelsSearchResultsV5CardWidgetViewHolder) this.f1247b, view);
                break;
            case 7:
                N5 this$0 = (N5) this.f1247b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4667u7) this$0.u()).f0(C4313i.f31222a);
                break;
            case 8:
                C4699va this$02 = (C4699va) this.f1247b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((C4318i4) this$02.u()).f0(Ab.f28595a);
                break;
            case 9:
                ((StringAbToggleHolder) this.f1247b).resetLocal();
                break;
            case 10:
                HotelsGalleryVideoViewHolder._init_$lambda$5((HotelsGalleryVideoViewHolder) this.f1247b, view);
                break;
            case 11:
                HotelsGalleryFullV2PagerVideoViewHolder.lambda$4$lambda$2((HotelsGalleryFullV2PagerVideoViewHolder) this.f1247b, view);
                break;
            case 12:
                ((ComparisonCarouselProductViewHolder) this.f1247b).navigateToProductPage();
                break;
            case 13:
                SearchBarViewDelegate.setupClickListeners$lambda$20((SearchBarViewDelegate) this.f1247b, view);
                break;
            case 14:
                CoupleBlockItemViewNew._init_$lambda$6((CoupleBlockItemViewNew) this.f1247b, view);
                break;
            case 15:
                ProductBlockVH.lambda$2$lambda$1((ProductBlockVH) this.f1247b, view);
                break;
            case 16:
                FinSnackbarView._init_$lambda$1((FinSnackbarView) this.f1247b, view);
                break;
            default:
                CancelPostingsV2SelectAllViewHolder._init_$lambda$0((CancelPostingsV2SelectAllViewHolder) this.f1247b, view);
                break;
        }
    }
}

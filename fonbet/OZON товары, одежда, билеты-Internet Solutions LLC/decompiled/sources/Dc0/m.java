package Dc0;

import Kb0.K;
import android.view.View;
import androidx.activity.J;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.SwipeFavoriteButtonView;
import ru.ozon.app.android.cml.delivery.widgets.deliveryParcelPhotoAdd.presentation.adapter.ParcelPhotoAddItemViewHolder;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.item.ShoppingListsV2ItemViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailView;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3RowViewHolder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.binders.HammerProductImageBinder;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting.OrderShipmentProductAdapter;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewProduct.presentation.NewBadgeViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewHolder;
import ru.ozon.app.android.storefront.screens.about.AboutFragment;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation.FinanceHeaderViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.FlightSchemeLegendViewV2;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view.ProductItemViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.button.TrailedActionView;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.offline.presentation.main.OfflineMainFragment;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.uni.atoms.v3.holders.rating.DsRatingHolder;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6488b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f6487a = i11;
        this.f6488b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        J onBackPressedDispatcher;
        switch (this.f6487a) {
            case 0:
                q.u((q) this.f6488b);
                return;
            case 1:
                HammerProductImageBinder.init$lambda$0((HammerProductImageBinder) this.f6488b, view);
                return;
            case 2:
                NewBadgeViewHolder._init_$lambda$0((NewBadgeViewHolder) this.f6488b, view);
                return;
            case 3:
                ((Function0) this.f6488b).invoke();
                return;
            case 4:
                ChangeEmailView._init_$lambda$23((ChangeEmailView) this.f6488b, view);
                return;
            case 5:
                ParcelPhotoAddItemViewHolder.lambda$8$lambda$4((ParcelPhotoAddItemViewHolder) this.f6488b, view);
                return;
            case 6:
                FinanceHeaderViewHolder.lambda$1$lambda$0((FinanceHeaderViewHolder) this.f6488b, view);
                return;
            case 7:
                FlightSchemeLegendViewV2._init_$lambda$7((FlightSchemeLegendViewV2) this.f6488b, view);
                return;
            case 8:
                FinLargeButtonView.bindState$lambda$3((FinLargeButtonView) this.f6488b, view);
                return;
            case 9:
                AboutFragment.onViewCreated$lambda$3$lambda$2((AboutFragment) this.f6488b, view);
                return;
            case 10:
                OfflineMainFragment.t((OfflineMainFragment) this.f6488b);
                return;
            case 11:
                SearchResultsGridViewHolder.lambda$4$lambda$1((SearchResultsGridViewHolder) this.f6488b, view);
                return;
            case 12:
                DsRatingHolder._init_$lambda$1((DsRatingHolder) this.f6488b, view);
                return;
            case 13:
                K k11 = Tb0.a.f26975d;
                if (k11 == null) {
                    throw new Lb0.a();
                }
                Xb0.a value = k11.K().getValue();
                androidx.fragment.app.r requireActivity = ((ld0.x) this.f6488b).requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                value.a(requireActivity);
                return;
            case 14:
                ProductItemViewHolder.lambda$3$lambda$1((ProductItemViewHolder) this.f6488b, view);
                return;
            case 15:
                NavigationSliderV3RowViewHolder._init_$lambda$0((NavigationSliderV3RowViewHolder) this.f6488b, view);
                return;
            case 16:
                ((TrailedActionView) this.f6488b).callOnClick();
                return;
            case 17:
                ShoppingListsV2ItemViewHolder._init_$lambda$1((ShoppingListsV2ItemViewHolder) this.f6488b, view);
                return;
            case 18:
                CameraFragment.onViewCreated$lambda$27$lambda$19$lambda$13((CameraFragment) this.f6488b, view);
                return;
            case 19:
                androidx.fragment.app.r activity = ((tj.e) this.f6488b).getActivity();
                if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                    return;
                }
                onBackPressedDispatcher.l();
                return;
            case 20:
                OrderShipmentProductAdapter.ProductItemVH.bindItem$lambda$2$lambda$0((OrderShipmentProductAdapter.ProductItemVH) this.f6488b, view);
                return;
            default:
                SwipeFavoriteButtonView._init_$lambda$2((SwipeFavoriteButtonView) this.f6488b, view);
                return;
        }
    }
}

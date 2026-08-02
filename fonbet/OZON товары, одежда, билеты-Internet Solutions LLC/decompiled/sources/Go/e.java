package Go;

import Ve.C4283gr;
import Ve.C4375k4;
import Ve.Qn;
import Zi.f;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVH;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7View;
import ru.ozon.app.android.pdp.widgets.aspectProductV2.presentation.AspectProductV2ViewHolder;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.badgetitlesubtitle.SuggestionsBadgeTitleSubtitleViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.presentation.HotelsGalleryFeedWidgetViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersAdapter;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewViewHolder;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle48IconCheckboxRadioView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder.VideoTileViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.banner.TileScrollBannerView;
import ru.ozon.uni.atoms.af.ButtonIconAtom;

/* loaded from: classes11.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10297b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f10296a = i11;
        this.f10297b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10296a) {
            case 0:
                RealFbsSplitVH.bindHeader$lambda$12$lambda$10$lambda$9((RealFbsSplitVH) this.f10297b, view);
                break;
            case 1:
                AspectProductV2ViewHolder._init_$lambda$1((AspectProductV2ViewHolder) this.f10297b, view);
                break;
            case 2:
                ButtonIconAtom._init_$lambda$1((ButtonIconAtom) this.f10297b, view);
                break;
            case 3:
                C4283gr this$0 = (C4283gr) this.f10297b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4375k4) this$0.u()).e0(Qn.f29804b);
                break;
            case 4:
                SuggestionsBadgeTitleSubtitleViewHolder._init_$lambda$3((SuggestionsBadgeTitleSubtitleViewHolder) this.f10297b, view);
                break;
            case 5:
                f.f((f) this.f10297b);
                break;
            case 6:
                HotelsGalleryFeedWidgetViewHolder._init_$lambda$0((HotelsGalleryFeedWidgetViewHolder) this.f10297b, view);
                break;
            case 7:
                CartSplitV2ItemWidgetViewHolder.lambda$11$lambda$9((CartSplitV2ItemWidgetViewHolder) this.f10297b, view);
                break;
            case 8:
                HotelsGalleryFiltersAdapter.FilterViewHolder._init_$lambda$0((HotelsGalleryFiltersAdapter.FilterViewHolder) this.f10297b, view);
                break;
            case 9:
                ProductForReviewViewHolder.lambda$6$lambda$5((ProductForReviewViewHolder) this.f10297b, view);
                break;
            case 10:
                ((Function1) this.f10297b).invoke(view);
                break;
            case 11:
                VideoTileViewHolder._init_$lambda$0((VideoTileViewHolder) this.f10297b, view);
                break;
            case 12:
                TileScrollBannerView._init_$lambda$0((TileScrollBannerView) this.f10297b, view);
                break;
            case 13:
                ScreenStateViewWidget._init_$lambda$1((ScreenStateViewWidget) this.f10297b, view);
                break;
            case 14:
                ((CellWithSubtitle48IconCheckboxRadioView) this.f10297b).onCheckedChange();
                break;
            default:
                SellerV7View.firstIslandLayer$lambda$5$lambda$4((SellerV7View) this.f10297b, view);
                break;
        }
    }
}

package Il;

import Ve.C4283gr;
import Ve.C4375k4;
import Ve.C4684uo;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld0.x;
import ru.ozon.app.android.account.orders.navBarItem.presentation.NavBarItemWidgetViewHolder;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.TextVH;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.gallery.preview.PreviewViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.titlesubtitle.SuggestionsTitleSubtitleViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownItemView;
import ru.ozon.app.android.travel.feature.general.common.widgets.promoCodeApplier.view.PromoCodeApplierView;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.view.UnpaidOrderListView;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultHotelView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.commentFooter.CommentFooterViewHolder;
import ru.ozon.app.android.ugc.widgets.productVariant.presentation.ProductVariantWidgetVH;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewViewHolder;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle48IconCheckboxRadioView;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12591b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f12590a = i11;
        this.f12591b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12590a) {
            case 0:
                TextVH._init_$lambda$0((TextVH) this.f12591b, view);
                break;
            case 1:
                ((DirectFlightsDropdownItemView) this.f12591b).invokeItemAction();
                break;
            case 2:
                UnpaidOrderListView.setupRoot$lambda$16((UnpaidOrderListView) this.f12591b, view);
                break;
            case 3:
                NavBarItemWidgetViewHolder._init_$lambda$0((ComposerReferences) this.f12591b, view);
                break;
            case 4:
                C4283gr this$0 = (C4283gr) this.f12591b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4375k4) this$0.u()).e0(C4684uo.f32234b);
                break;
            case 5:
                ToursSearchResultHotelView.setupRoot$lambda$14((ToursSearchResultHotelView) this.f12591b, view);
                break;
            case 6:
                SellerCarouselAdapter.onCreateViewHolder$lambda$4$lambda$3((SellerCarouselAdapter) this.f12591b, view);
                break;
            case 7:
                SuggestionsTitleSubtitleViewHolder._init_$lambda$2((SuggestionsTitleSubtitleViewHolder) this.f12591b, view);
                break;
            case 8:
                ProductVariantWidgetVH.lambda$2$lambda$1((ProductVariantWidgetVH) this.f12591b, view);
                break;
            case 9:
                CartSplitV2ItemWidgetViewHolder.lambda$11$lambda$8((CartSplitV2ItemWidgetViewHolder) this.f12591b, view);
                break;
            case 10:
                ProductForReviewViewHolder.lambda$3$lambda$2((ProductForReviewViewHolder) this.f12591b, view);
                break;
            case 11:
                PreviewViewHolder._init_$lambda$0((PreviewViewHolder) this.f12591b, view);
                break;
            case 12:
                ((Function0) this.f12591b).invoke();
                break;
            case 13:
                x.A((x) this.f12591b);
                break;
            case 14:
                PromoCodeApplierView._init_$lambda$6((PromoCodeApplierView) this.f12591b, view);
                break;
            case 15:
                ScreenStateViewWidget._init_$lambda$0((ScreenStateViewWidget) this.f12591b, view);
                break;
            case 16:
                CommentFooterViewHolder._init_$lambda$0((CommentFooterViewHolder) this.f12591b, view);
                break;
            case 17:
                ((ru.ozon.android.messenger.blocks.messageimage.presentation.a) this.f12591b).requireActivity().onBackPressed();
                break;
            default:
                ((CellWithSubtitle48IconCheckboxRadioView) this.f12591b).onCheckedChange();
                break;
        }
    }
}

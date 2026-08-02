package GW;

import Ve.C4307hm;
import Ve.C4757xc;
import Ve.Ub;
import android.view.View;
import androidx.activity.J;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.rv.vh.PriceVH;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetView;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.HeaderViewHolder;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.MorkovskTabItemViewHolder;
import ru.ozon.app.android.ugc.widgets.productVariant.presentation.ProductVariantWidgetVH;
import ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewViewHolder;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.image.ReviewsPreviewImageVH;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle40IconView;
import uj.C10065b;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9851b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9850a = i11;
        this.f9851b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        J onBackPressedDispatcher;
        switch (this.f9850a) {
            case 0:
                ReviewsPreviewImageVH._init_$lambda$1((ReviewsPreviewImageVH) this.f9851b, view);
                break;
            case 1:
                PriceVH._init_$lambda$0((PriceVH) this.f9851b, view);
                break;
            case 2:
                Ub this$0 = (Ub) this.f9851b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4757xc) this$0.u()).e0(C4307hm.f31207a);
                break;
            case 3:
                ProductVariantWidgetVH.lambda$2$lambda$0((ProductVariantWidgetVH) this.f9851b, view);
                break;
            case 4:
                ProductForReviewViewHolder.lambda$3$lambda$1((ProductForReviewViewHolder) this.f9851b, view);
                break;
            case 5:
                SearchSheetView.lambda$4$lambda$3((SearchSheetView) this.f9851b, view);
                break;
            case 6:
                MorkovskTabItemViewHolder._init_$lambda$0((MorkovskTabItemViewHolder) this.f9851b, view);
                break;
            case 7:
                CellWithSubtitle40IconView._init_$lambda$0((CellWithSubtitle40IconView) this.f9851b, view);
                break;
            case 8:
                r activity = ((C10065b) this.f9851b).getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.l();
                    break;
                }
                break;
            default:
                HeaderViewHolder._init_$lambda$2((HeaderViewHolder) this.f9851b, view);
                break;
        }
    }
}

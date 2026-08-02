package VD;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.logosCarousel.CarouselSelectorVH;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadderCell.SellerActionPreviewProgressLadderCellView;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.AspectsCompactV2PackVariantBaseViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.PackVariantsAdapter;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image.GalleryV4ImageVH;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4LocationsView;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28448c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f28446a = i11;
        this.f28447b = obj;
        this.f28448c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28446a) {
            case 0:
                GalleryV4ImageVH.bind$lambda$3$lambda$2((GalleryV4VO.Item.Image) this.f28447b, (GalleryV4ImageVH) this.f28448c, view);
                break;
            case 1:
                SellerActionPreviewProgressLadderCellView.bind$lambda$5((SellerActionsPreviewVO.ProgressLadderCell) this.f28447b, (Function1) this.f28448c, view);
                break;
            case 2:
                CellHolder.lambda$6$lambda$2((CellHolder) this.f28447b, (CellView) this.f28448c, view);
                break;
            case 3:
                CarouselSelectorVH.lambda$2$lambda$1((CarouselSelectorVH) this.f28447b, (Function1) this.f28448c, view);
                break;
            case 4:
                PackVariantsAdapter.onCreateViewHolder$lambda$3$lambda$2((AspectsCompactV2PackVariantBaseViewHolder) this.f28447b, (PackVariantsAdapter) this.f28448c, view);
                break;
            case 5:
                SearchFormV4LocationsView.bindLocation$lambda$14$lambda$13((CommonControlSettings) this.f28447b, (SearchFormV4LocationsView) this.f28448c, view);
                break;
            default:
                SearchFormV5LocationsView.bindLocation$lambda$14$lambda$13((CommonControlSettings) this.f28447b, (SearchFormV5LocationsView) this.f28448c, view);
                break;
        }
    }
}

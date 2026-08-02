package Nx;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.presentation.rv.BrandzoneItemViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.domain.ProfileTilesVO;
import ru.ozon.app.android.fresh.unsorted.widgets.profileTiles.presentation.views.PurchasesTileView;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.title.presentation.SearchTitleViewHolder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views.SingleReviewGalleryItemView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.common.models.MediaImageStickerVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersLlBinder;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.tabs.TabsHolder;

/* renamed from: Nx.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC3676a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19680c;

    public /* synthetic */ ViewOnClickListenerC3676a(int i11, Object obj, Object obj2) {
        this.f19678a = i11;
        this.f19679b = obj;
        this.f19680c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19678a) {
            case 0:
                PurchasesTileView.bind$lambda$9$lambda$8((ProfileTilesVO.Purchases) this.f19679b, (Function1) this.f19680c, view);
                break;
            case 1:
                UgcCountersLlBinder.bindBlocks$lambda$9$lambda$8$lambda$7((UgcCountersLlBinder) this.f19679b, (UgcCountersVO.Block.Expanding) this.f19680c, view);
                break;
            case 2:
                BrandzoneItemViewHolder._init_$lambda$1((BrandzoneItemViewHolder) this.f19679b, (Function1) this.f19680c, view);
                break;
            case 3:
                SearchTitleViewHolder._init_$lambda$3((SearchTitleViewHolder) this.f19679b, (ActiveSearchBarViewModel) this.f19680c, view);
                break;
            case 4:
                TabsHolder.setOnClick$lambda$8((CommonControlSettings) this.f19679b, (TabsHolder) this.f19680c, view);
                break;
            default:
                SingleReviewGalleryItemView.bindSticker$lambda$2$lambda$1((MediaImageStickerVO) this.f19679b, (Function1) this.f19680c, view);
                break;
        }
    }
}

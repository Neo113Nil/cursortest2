package BK;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.GalleryItemViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.GalleryRecyclerAdapter;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogScrollTileView;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogTile;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3258c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3259d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i11) {
        this.f3256a = i11;
        this.f3257b = obj;
        this.f3258c = obj2;
        this.f3259d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3256a) {
            case 0:
                ((CatalogScrollTileView) this.f3257b).onTileClick((CatalogTile.TileItemVO) this.f3258c, (Function1) this.f3259d);
                break;
            default:
                GalleryRecyclerAdapter.onBindViewHolder$lambda$0((GalleryItemViewHolder) this.f3257b, (GalleryRecyclerAdapter) this.f3258c, (GalleryV3VO.Item) this.f3259d, view);
                break;
        }
    }
}

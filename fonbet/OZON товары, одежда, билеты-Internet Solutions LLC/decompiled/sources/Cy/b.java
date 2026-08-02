package Cy;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.ratemessenger.recycler.adapter.a;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.CatalogTabsV2VO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.item.CatalogTabsMaxItemViewHolder;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.icon.BannerIcon;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.icon.BannerIcon$bind$2$1;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button.CategoryMenuButtonOverlayViewHolder;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.button.CategoryMenuButtonVO;
import ru.ozon.app.android.storefront.widgets.naviGrid3.presentation.NaviGrid3ItemVO;
import ru.ozon.app.android.storefront.widgets.naviGrid3.presentation.NaviGrid3ViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelQuantityCellVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelQuantityCellView;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AdditionalServiceVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.additionalService.AdditionalServiceView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views.SingleReviewGalleryMoreView;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricVideoViewHolder;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5182c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f5180a = i11;
        this.f5181b = obj;
        this.f5182c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5180a) {
            case 0:
                BannerIcon$bind$2$1.onLoadSuccessful$lambda$0((BannerIcon) this.f5181b, (AddressEditMapVO.MapIcon) this.f5182c, view);
                break;
            case 1:
                MediaCentricVideoViewHolder._init_$lambda$9((MediaCentricVideoViewHolder) this.f5181b, (Function1) this.f5182c, view);
                break;
            case 2:
                TravelQuantityCellView.bind$lambda$3$lambda$2((TravelQuantityCellView) this.f5181b, (TravelQuantityCellVO) this.f5182c, view);
                break;
            case 3:
                CategoryMenuButtonOverlayViewHolder.bind$lambda$1((CategoryMenuButtonOverlayViewHolder) this.f5181b, (CategoryMenuButtonVO) this.f5182c, view);
                break;
            case 4:
                CatalogTabsMaxItemViewHolder.bind$lambda$2$lambda$0((CatalogTabsMaxItemViewHolder) this.f5181b, (CatalogTabsV2VO.Tab) this.f5182c, view);
                break;
            case 5:
                AdditionalServiceView.bind$lambda$6((Function1) this.f5181b, (AdditionalServiceVO) this.f5182c, view);
                break;
            case 6:
                ((Function1) this.f5181b).invoke(Integer.valueOf(((a.C1518a) this.f5182c).getAdapterPosition()));
                break;
            case 7:
                SingleReviewGalleryMoreView.bindMoreButton$lambda$0((ButtonV3Atom.LargeBorderlessButton) this.f5181b, (Function1) this.f5182c, view);
                break;
            default:
                NaviGrid3ViewHolder.bind$lambda$4$lambda$3((NaviGrid3ItemVO) this.f5181b, (NaviGrid3ViewHolder) this.f5182c, view);
                break;
        }
    }
}

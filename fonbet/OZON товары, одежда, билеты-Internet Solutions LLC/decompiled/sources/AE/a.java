package AE;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.icon.BannerIcon;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCellVO;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCellViewHolder;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.actions.ActionsAdapter;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.actions.ActionsViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelQuantityCellVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelQuantityCellView;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.viewholders.ImageViewHolder;
import zc0.C11092g;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f606c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f604a = i11;
        this.f605b = obj;
        this.f606c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f604a) {
            case 0:
                PriceCellViewHolder.bindInternal$lambda$7$lambda$6((PriceCellViewHolder) this.f605b, (PriceCellVO) this.f606c, view);
                break;
            case 1:
                ImageViewHolder.bind$lambda$2$lambda$1((ReviewTilesVO.Content.Media.Image) this.f605b, (Function1) this.f606c, view);
                break;
            case 2:
                BannerIcon.fadeIn$lambda$9((AddressEditMapVO.MapIcon.BannerIcon) this.f605b, (BannerIcon) this.f606c, view);
                break;
            case 3:
                TravelQuantityCellView.bind$lambda$1$lambda$0((TravelQuantityCellView) this.f605b, (TravelQuantityCellVO) this.f606c, view);
                break;
            case 4:
                ((Function1) this.f605b).invoke((C11092g.a) this.f606c);
                break;
            default:
                ActionsAdapter.onCreateViewHolder$lambda$6$lambda$5$lambda$4((ActionsViewHolder) this.f605b, (ActionsAdapter) this.f606c, view);
                break;
        }
    }
}

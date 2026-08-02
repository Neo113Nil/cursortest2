package ED;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.progressLadder.SellerActionPreviewProgressLadderView;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterViewHolder;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.sideBar.SideBarConfigurator;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonView;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersDoubleBlockItemViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7680c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f7678a = i11;
        this.f7680c = obj;
        this.f7679b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7678a) {
            case 0:
                DeliveryAdapterViewHolder.Pickup._init_$lambda$0((DeliveryAdapterViewHolder.Pickup) this.f7680c, (Function1) this.f7679b, view);
                break;
            case 1:
                SellerActionPreviewProgressLadderView.bind$lambda$1((SellerActionsPreviewVO.ProgressLadder) this.f7680c, (Function1) this.f7679b, view);
                break;
            case 2:
                UgcCountersDoubleBlockItemViewHolder.bind$lambda$4$lambda$1$lambda$0((UgcCountersDoubleBlockItemViewHolder) this.f7680c, (UgcCountersVO.Block.Single) this.f7679b, view);
                break;
            case 3:
                SideBarConfigurator.bindTask$lambda$7((MainDrawMajorScreenVO.Lootbox) this.f7680c, (SideBarConfigurator) this.f7679b, view);
                break;
            case 4:
                TravelFiltersButtonView.bind$lambda$13$lambda$12((TravelFiltersButtonVO) this.f7680c, (Function2) this.f7679b, view);
                break;
            default:
                CouponPromoViewHolder.bindInactiveStateButton$lambda$9$lambda$8((CouponPromoViewHolder) this.f7680c, (CouponPromoVO) this.f7679b, view);
                break;
        }
    }
}

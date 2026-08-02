package AW;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.cart.cartSplitV2.LockedQuantityBinder;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsVO;
import ru.ozon.app.android.cart.controls.v2.presentation.ControlsViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation.EdoProvidersItemViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v1.presentation.EdoProvidersVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoViewHolder;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterViewHolder;
import ru.ozon.app.android.ugc.widgets.reviewTiles.data.ReviewTilesVO;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.MoreViewWrapper;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f671b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f672c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f670a = i11;
        this.f671b = obj;
        this.f672c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f670a) {
            case 0:
                MoreViewWrapper.bind$lambda$2((Function1) this.f671b, (ReviewTilesVO.Content.More) this.f672c, view);
                break;
            case 1:
                ControlsViewHolder.bind$lambda$2$lambda$1((ControlsViewHolder) this.f671b, (ControlsVO) this.f672c, view);
                break;
            case 2:
                DeliveryAdapterViewHolder.CellDefault._init_$lambda$1((DeliveryAdapterViewHolder.CellDefault) this.f672c, (Function1) this.f671b, view);
                break;
            case 3:
                EdoProvidersItemViewHolder.bind$lambda$4$lambda$2$lambda$1((EdoProvidersVO.EdoInfoVO) this.f671b, (EdoProvidersItemViewHolder) this.f672c, view);
                break;
            case 4:
                LockedQuantityBinder.bind$lambda$1((LockedQuantityBinder) this.f671b, (NotificationDTO) this.f672c, view);
                break;
            default:
                CouponPromoViewHolder.bindActiveButton$lambda$7$lambda$6((CouponPromoViewHolder) this.f671b, (CouponPromoVO) this.f672c, view);
                break;
        }
    }

    public /* synthetic */ b(DeliveryAdapterViewHolder.CellDefault cellDefault, Function1 function1) {
        this.f670a = 2;
        this.f672c = cellDefault;
        this.f671b = function1;
    }
}

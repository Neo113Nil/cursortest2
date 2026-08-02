package Sk;

import android.view.View;
import ru.ozon.app.android.account.orders.orderProduct.presentation.item.OrderProductItemViewHolder;
import ru.ozon.app.android.account.orders.orderProduct.viewObject.OrderProductItemVO;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.models.MegaCellCheckboxFilter;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.rv.vh.FilterValuesMegaCellCheckboxViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.video.GalleryV4VideoVH;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentVO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentWidgetViewHolder;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26345c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f26343a = i11;
        this.f26344b = obj;
        this.f26345c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f26343a) {
            case 0:
                OrderProductItemViewHolder.bind$lambda$3$lambda$1((OrderProductItemVO) this.f26344b, (OrderProductItemViewHolder) this.f26345c, view);
                break;
            case 1:
                FilterValuesMegaCellCheckboxViewHolder.bind$lambda$1$lambda$0((MegaCellCheckboxFilter) this.f26344b, (FilterValuesMegaCellCheckboxViewHolder) this.f26345c, view);
                break;
            case 2:
                GalleryV4VideoVH.bind$lambda$3((GalleryV4VO.Item.Video) this.f26344b, (GalleryV4VideoVH) this.f26345c, view);
                break;
            default:
                TravelPersonalAccountReplenishmentWidgetViewHolder.bind$lambda$1$lambda$0((TravelPersonalAccountReplenishmentWidgetViewHolder) this.f26344b, (TravelPersonalAccountReplenishmentVO) this.f26345c, view);
                break;
        }
    }
}

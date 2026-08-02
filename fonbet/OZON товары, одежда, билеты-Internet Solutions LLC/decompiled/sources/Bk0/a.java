package Bk0;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation.DeliveryTimeSlotAdapter;
import ru.ozon.app.android.orderdetails.deliverytimeselector.v1.presentation.DeliveryTimeSlotViewHolder;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewHolder.DeliveryOrderInputViewHolder;
import ru.ozon.app.android.orders.cml.deliveryOrderInput.presentation.viewItem.DeliveryOrderInputVO;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.tiles.AspectsCompactTilesVariantV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.tiles.AspectsV2TileViewHolderFlex;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.preview.HotelsGalleryFullPreviewViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TariffVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.tariff.TariffLineView;
import ru.ozon.uni.android.flashbar.view.FlashbarView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3910c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f3908a = i11;
        this.f3909b = obj;
        this.f3910c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3908a) {
            case 0:
                FlashbarView.setActionTapListener$lambda$5((Function1) this.f3909b, (FlashbarView) this.f3910c, view);
                break;
            case 1:
                DeliveryOrderInputViewHolder.bind$lambda$2$lambda$0((DeliveryOrderInputVO) this.f3909b, (DeliveryOrderInputViewHolder) this.f3910c, view);
                break;
            case 2:
                AspectsV2TileViewHolderFlex.bind$lambda$4((AspectsCompactTilesVariantV2VO) this.f3909b, (AspectsV2TileViewHolderFlex) this.f3910c, view);
                break;
            case 3:
                DeliveryTimeSlotAdapter.onCreateViewHolder$lambda$3$lambda$2((DeliveryTimeSlotViewHolder) this.f3909b, (DeliveryTimeSlotAdapter) this.f3910c, view);
                break;
            case 4:
                HotelsGalleryFullPreviewViewHolder._init_$lambda$0((Function1) this.f3909b, (HotelsGalleryFullPreviewViewHolder) this.f3910c, view);
                break;
            default:
                TariffLineView.bind$lambda$4((Function1) this.f3909b, (TariffVO) this.f3910c, view);
                break;
        }
    }
}

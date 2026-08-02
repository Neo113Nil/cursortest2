package FV;

import android.view.View;
import cd0.m;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.input.viewdelegates.j;
import ru.ozon.android.messenger.blocks.input.viewmodel.o;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2Binder;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.creative.StaticCouponListCreativeViewBinder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation.TravelSearchSortAndFilterVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation.TravelSearchSortAndFilterWidgetViewHolder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricImageViewHolder;
import ru.ozon.id.nativeauth.data.models.EntryDTO;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9206c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f9204a = i11;
        this.f9205b = obj;
        this.f9206c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9204a) {
            case 0:
                MediaCentricImageViewHolder._init_$lambda$0((MediaCentricImageViewHolder) this.f9205b, (Function1) this.f9206c, view);
                break;
            case 1:
                m.u((m) this.f9205b, (EntryDTO.EntryButtonDTO) this.f9206c);
                break;
            case 2:
                TravelSearchSortAndFilterWidgetViewHolder.bind$lambda$3$lambda$2((TravelSearchSortAndFilterVO) this.f9205b, (TravelSearchSortAndFilterWidgetViewHolder) this.f9206c, view);
                break;
            case 3:
                DeliveryWidgetV2Binder.bind$lambda$0((DeliveryWidgetV2Binder) this.f9205b, (DeliveryWidgetV2VO.OzonDeliveryVOWidget) this.f9206c, view);
                break;
            case 4:
                StaticCouponListCreativeViewBinder.setClickListeners$lambda$0((StaticCouponListVO.ContentItem.Creative) this.f9205b, (Function1) this.f9206c, view);
                break;
            default:
                j.b((o) this.f9205b, (j) this.f9206c);
                break;
        }
    }
}

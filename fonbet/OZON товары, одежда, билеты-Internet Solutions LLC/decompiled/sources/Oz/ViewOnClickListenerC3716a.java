package Oz;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.DeliveryWidgetV2VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2Binder;
import ru.ozon.app.android.marketing.widgets.pdpCouponListV2.presentation.PdpGradientCouponView;

/* renamed from: Oz.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC3716a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20552c;

    public /* synthetic */ ViewOnClickListenerC3716a(int i11, Object obj, Object obj2) {
        this.f20550a = i11;
        this.f20551b = obj;
        this.f20552c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20550a) {
            case 0:
                PdpGradientCouponView.setCouponApplyClickListener$lambda$12$lambda$11((Function1) this.f20551b, (PdpGradientCouponView) this.f20552c, view);
                break;
            default:
                DeliveryWidgetV2Binder.bind$lambda$1((DeliveryWidgetV2Binder) this.f20551b, (DeliveryWidgetV2VO.SellerVOWidget) this.f20552c, view);
                break;
        }
    }
}

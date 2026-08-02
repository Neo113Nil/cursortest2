package Bo;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.payments.viewHolder.BasePaymentViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadge;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;

/* renamed from: Bo.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewOnClickListenerC2667a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4029c;

    public /* synthetic */ ViewOnClickListenerC2667a(int i11, Object obj, Object obj2) {
        this.f4027a = i11;
        this.f4029c = obj;
        this.f4028b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4027a) {
            case 0:
                BasePaymentViewHolder._init_$lambda$1((BasePaymentViewHolder) this.f4029c, (Function1) this.f4028b, view);
                break;
            case 1:
                MorkovskCurrencyBadge.bindOrInvisible$lambda$0((Function1) this.f4028b, (MorkovskCurrencyBadgeVO) this.f4029c, view);
                break;
            case 2:
                DeliveryWidgetV4View.bind$lambda$19$lambda$18((DeliveryWidgetV4View) this.f4029c, (DeliveryWidgetV4VO) this.f4028b, view);
                break;
            default:
                ru.ozon.android.messenger.blocks.input.attachments.presentation.a.e((ru.ozon.android.messenger.blocks.input.attachments.presentation.a) this.f4029c, (Function1) this.f4028b);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2667a(Function1 function1, MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO) {
        this.f4027a = 1;
        this.f4028b = function1;
        this.f4029c = morkovskCurrencyBadgeVO;
    }
}

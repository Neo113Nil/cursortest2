package Gu;

import android.view.View;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddConsigneeBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantQuantView;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetVO;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewHolder;

/* renamed from: Gu.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC3129b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10316c;

    public /* synthetic */ ViewOnClickListenerC3129b(int i11, Object obj, Object obj2) {
        this.f10314a = i11;
        this.f10315b = obj;
        this.f10316c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10314a) {
            case 0:
                AddConsigneeViewHolder.lambda$5$lambda$0((AddConsigneeViewHolder) this.f10315b, (WidgetAddConsigneeBinding) this.f10316c, view);
                break;
            case 1:
                CartQuantQuantView.bindMainButton$lambda$2((CartQuantQuantView) this.f10315b, (CartButtonQuantDto.CartButton) this.f10316c, view);
                break;
            default:
                OTPWidgetViewHolder.showDefaultPageState$lambda$6$lambda$5$lambda$4((OTPWidgetViewHolder) this.f10315b, (OTPWidgetVO.HintButton) this.f10316c, view);
                break;
        }
    }
}

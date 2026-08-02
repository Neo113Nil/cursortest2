package PP;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.presentation.adapter.TravelPaymentV4CardViewHolder;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView;
import ru.ozon.fintech.ui.screenstate.ScreenState;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22106c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f22104a = i11;
        this.f22105b = obj;
        this.f22106c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22104a) {
            case 0:
                TravelPaymentV4CardViewHolder._init_$lambda$0((TravelPaymentV4CardViewHolder) this.f22105b, (Function1) this.f22106c, view);
                break;
            case 1:
                FinSwitchItemView.bindState$lambda$3((FinSwitchItemView) this.f22105b, (FinSwitchItem.State) this.f22106c, view);
                break;
            default:
                ScreenStateView.bindState$lambda$2((ScreenStateView) this.f22105b, (ScreenState.Error) this.f22106c, view);
                break;
        }
    }
}

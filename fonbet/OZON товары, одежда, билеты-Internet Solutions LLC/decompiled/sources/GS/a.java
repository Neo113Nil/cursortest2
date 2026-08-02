package GS;

import Wc0.b;
import android.view.View;
import androidx.fragment.app.G;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.atoms.af.holders.PaymentMethodAtom;
import ru.ozon.app.android.partpayment.contractbtn.ContractBtnWidgetViewHolder;
import ru.ozon.app.android.storefront.widgets.videoScroll.presentation.VideoScrollViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.adapter.HotelsScrollPriceCalendarV2ViewHolder;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9843b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9842a = i11;
        this.f9843b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f9843b;
        switch (this.f9842a) {
            case 0:
                HotelsScrollPriceCalendarV2ViewHolder._init_$lambda$1((HotelsScrollPriceCalendarV2ViewHolder) obj, view);
                break;
            case 1:
                AuthFlowActivity.J((AuthFlowActivity) obj);
                break;
            case 2:
                PaymentMethodAtom._init_$lambda$1((PaymentMethodAtom) obj, view);
                break;
            case 3:
                VideoScrollViewHolder.lambda$2$lambda$1((VideoScrollViewHolder) obj, view);
                break;
            case 4:
                ContractBtnWidgetViewHolder._init_$lambda$0((ContractBtnWidgetViewHolder) obj, view);
                break;
            case 5:
                b.v((b) obj);
                break;
            case 6:
                OzonIdDebugActivity ozonIdDebugActivity = (OzonIdDebugActivity) obj;
                int i11 = OzonIdDebugActivity.f97514l;
                G supportFragmentManager = ozonIdDebugActivity.getSupportFragmentManager();
                if (ozonIdDebugActivity.getSupportFragmentManager().l0() <= 0) {
                    ozonIdDebugActivity.finish();
                    break;
                } else {
                    supportFragmentManager.P0();
                    break;
                }
            default:
                ((Function0) obj).invoke();
                break;
        }
    }
}

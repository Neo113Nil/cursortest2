package Al;

import Ve.C4238fb;
import Ve.C4799yq;
import Ve.C4825zo;
import Ve.Zp;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single.AdvBannerV4PlainSingleViewHolder;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation.BankAccountStatusWidgetVH;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewV4;
import ru.ozon.app.android.product.skuthinscroll.presentation.vh.SkuThinScrollItemViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.ComplexRouteItemView;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.uni.android.controls.button.InputSelectButtonView;

/* renamed from: Al.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewOnClickListenerC2437a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1241b;

    public /* synthetic */ ViewOnClickListenerC2437a(Object obj, int i11) {
        this.f1240a = i11;
        this.f1241b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1240a) {
            case 0:
                AdvBannerV4PlainSingleViewHolder._init_$lambda$1((AdvBannerV4PlainSingleViewHolder) this.f1241b, view);
                break;
            case 1:
                SkuThinScrollItemViewHolder._init_$lambda$1((SkuThinScrollItemViewHolder) this.f1241b, view);
                break;
            case 2:
                PinPadFragment.B((PinPadFragment) this.f1241b);
                break;
            case 3:
                Zp this$0 = (Zp) this.f1241b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4799yq c4799yq = (C4799yq) this$0.u();
                ((C4238fb) c4799yq.f31988c).b(C4825zo.f32678a);
                break;
            case 4:
                ((Function1) this.f1241b).invoke(view);
                break;
            case 5:
                CartViewV4.bindMinusPlus$lambda$4((CartViewV4) this.f1241b, view);
                break;
            case 6:
                BankAccountStatusWidgetVH._init_$lambda$4((BankAccountStatusWidgetVH) this.f1241b, view);
                break;
            case 7:
                ComplexRouteItemView.setUpLocationView$lambda$17$lambda$16((ComplexRouteItemView) this.f1241b, view);
                break;
            default:
                InputSelectButtonView.showCopy$lambda$16$lambda$15((InputSelectButtonView) this.f1241b, view);
                break;
        }
    }
}

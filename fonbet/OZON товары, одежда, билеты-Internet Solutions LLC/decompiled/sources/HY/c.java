package HY;

import Ve.C4238fb;
import Ve.C4550q5;
import Ve.C4695v6;
import Ve.C4825zo;
import Ve.K4;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.checkoutorderdone.orderdone.configurators.deliveryc2c.DeliveryOrderDoneConfigurator;
import ru.ozon.app.android.search.databinding.ActiveSearchbarBinding;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.SwitchingImageView;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.presentation.TravelOrderListMobileWidgetViewHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCheckboxRadioCounterView;
import ru.ozon.app.android.web.TransparentNavbarWebFragment;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.id.antibot.errorView.AntibotErrorView;
import ru.ozon.uni.atoms.v3.holders.controls.chip.ChipHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10762b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f10761a = i11;
        this.f10762b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10761a) {
            case 0:
                ((TransparentNavbarWebFragment) this.f10762b).handleShareAction();
                break;
            case 1:
                HeaderAtom.onConfigureView$lambda$4((HeaderAtom) this.f10762b, view);
                break;
            case 2:
                ActiveSearchBarViewHolder.setupClickListeners$lambda$18((ActiveSearchbarBinding) this.f10762b, view);
                break;
            case 3:
                SwitchingImageView._init_$lambda$1((SwitchingImageView) this.f10762b, view);
                break;
            case 4:
                K4 this$0 = (K4) this.f10762b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4550q5 c4550q5 = (C4550q5) this$0.u();
                Object event = C4695v6.f32259a;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.equals(event)) {
                    ((C4238fb) c4550q5.f31988c).b(C4825zo.f32678a);
                    break;
                }
                break;
            case 5:
                ChipHolder._init_$lambda$1((ChipHolder) this.f10762b, view);
                break;
            case 6:
                TravelOrderListMobileWidgetViewHolder._init_$lambda$2((TravelOrderListMobileWidgetViewHolder) this.f10762b, view);
                break;
            case 7:
                ((DeliveryOrderDoneConfigurator) this.f10762b).openHome();
                break;
            case 8:
                InputView.createFirstIconView$lambda$32$lambda$31((InputView) this.f10762b, view);
                break;
            case 9:
                ((CellWithSubtitle24IconCheckboxRadioCounterView) this.f10762b).onCheckedChanged();
                break;
            default:
                AntibotErrorView.b((AntibotErrorView) this.f10762b);
                break;
        }
    }
}

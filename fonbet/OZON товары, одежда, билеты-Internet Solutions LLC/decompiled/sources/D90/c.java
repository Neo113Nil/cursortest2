package D90;

import Ve.C4238fb;
import Ve.C4625sn;
import Ve.C4741wo;
import Ve.C4825zo;
import Ve.J4;
import Ve.N9;
import Ve.Ug;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.posting.CancelPostingsV2PostingViewHolder;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewHolder.OrderViewHolder;
import ru.ozon.app.android.atoms.af.holders.CheckboxAtom;
import ru.ozon.app.android.atoms.v3.holders.tags.crosstag.CrossTagHolder;
import ru.ozon.app.android.cart.common.product.binder.ProductBinder;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.progressiveText.ProgressiveTextVH;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectV4SizeNewView;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconCheckboxRadioCounterView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.presentation.viewHolder.Grid3BaseItemViewHolder;
import ru.ozon.app.android.web.TransparentNavbarWebFragment;
import ru.ozon.app.android.widgets.designSystemAtoms.presentation.DSAtomsWidgetViewHolder;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import ru.ozon.id.antibot.errorView.AntibotErrorView;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6196b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f6195a = i11;
        this.f6196b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6195a) {
            case 0:
                FintechNativeBridgeTestingFragment.u((FintechNativeBridgeTestingFragment) this.f6196b);
                break;
            case 1:
                ((TransparentNavbarWebFragment) this.f6196b).handleBackAction();
                break;
            case 2:
                ((Grid3BaseItemViewHolder) this.f6196b).navigateOrShowAdultDialog();
                break;
            case 3:
                CheckboxAtom._init_$lambda$1((CheckboxAtom) this.f6196b, view);
                break;
            case 4:
                ActiveSearchBarViewHolder.setupClickListeners$lambda$17((ActiveSearchBarViewHolder) this.f6196b, view);
                break;
            case 5:
                ((DSAtomsWidgetViewHolder) this.f6196b).onItemClick();
                break;
            case 6:
                J4 this$0 = (J4) this.f6196b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((N9) this$0.u()).e0(Ug.f30128a);
                break;
            case 7:
                C4625sn this$02 = (C4625sn) this.f6196b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                C4741wo c4741wo = (C4741wo) this$02.u();
                ((C4238fb) c4741wo.f31988c).b(C4825zo.f32678a);
                break;
            case 8:
                AspectV4SizeNewView._init_$lambda$1((AspectV4SizeNewView) this.f6196b, view);
                break;
            case 9:
                OrderViewHolder._init_$lambda$1((OrderViewHolder) this.f6196b, view);
                break;
            case 10:
                CrossTagHolder._init_$lambda$3((CrossTagHolder) this.f6196b, view);
                break;
            case 11:
                ProgressiveTextVH._init_$lambda$0((ProgressiveTextVH) this.f6196b, view);
                break;
            case 12:
                ((Function1) this.f6196b).invoke(view);
                break;
            case 13:
                CancelPostingsV2PostingViewHolder._init_$lambda$2((CancelPostingsV2PostingViewHolder) this.f6196b, view);
                break;
            case 14:
                ((CellWithSubtitle24IconCheckboxRadioCounterView) this.f6196b).onCheckedChanged();
                break;
            case 15:
                AntibotErrorView.d((AntibotErrorView) this.f6196b);
                break;
            default:
                ProductBinder.lambda$3$lambda$2((ProductBinder) this.f6196b, view);
                break;
        }
    }
}

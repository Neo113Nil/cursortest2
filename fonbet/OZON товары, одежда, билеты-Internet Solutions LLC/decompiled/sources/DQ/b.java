package DQ;

import Ve.C4238fb;
import Ve.C4297hc;
import Ve.C4582r9;
import Ve.C4825zo;
import Ve.Db;
import Ve.T9;
import Ve.Za;
import Zc0.n;
import android.view.View;
import androidx.lifecycle.x0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.v3.holders.timerBadge.TimerBadgeHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.AvatarPickerView;
import ru.ozon.app.android.orderdetails.cheques.presentation.cheque.ChequeWidgetViewHolder;
import ru.ozon.app.android.partpayment.formpage.view.vh.CheckboxFieldVH;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.carousel.CarouselAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsBenefitView;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation.StickyPromoRedirectV2WidgetViewHolder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker.nested.views.SelectionFormIconWrapper;
import ru.ozon.app.android.uikit.view.atoms.cells.regular.CellRegular24IconPickerView;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolder;
import ru.ozon.uni.atoms.v3.holders.tags.WrappedLinkTagHolder;
import xe.C10727i;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6268b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f6267a = i11;
        this.f6268b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6267a) {
            case 0:
                StickyPromoRedirectV2WidgetViewHolder.onWidgetCreated$lambda$0((StickyPromoRedirectV2WidgetViewHolder) this.f6268b, view);
                break;
            case 1:
                AvatarPickerView.lambda$3$lambda$0((AvatarPickerView) this.f6268b, view);
                break;
            case 2:
                SelectionFormIconWrapper._init_$lambda$4((SelectionFormIconWrapper) this.f6268b, view);
                break;
            case 3:
                Za this$0 = (Za) this.f6268b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4297hc c4297hc = (C4297hc) this$0.u();
                Object event = T9.f30027a;
                Intrinsics.checkNotNullParameter(event, "event");
                if (!event.equals(C4582r9.f31960a)) {
                    if (event.equals(event)) {
                        C10727i.c(x0.a(c4297hc), null, null, new Db(c4297hc, null), 3);
                        break;
                    }
                } else {
                    ((C4238fb) c4297hc.f31181d).b(C4825zo.f32678a);
                    break;
                }
                break;
            case 4:
                WrappedButtonHolder.onBind$lambda$2$lambda$1((WrappedButtonHolder) this.f6268b, view);
                break;
            case 5:
                ChequeWidgetViewHolder.lambda$1$lambda$0((ChequeWidgetViewHolder) this.f6268b, view);
                break;
            case 6:
                CheckboxFieldVH._init_$lambda$1((CheckboxFieldVH) this.f6268b, view);
                break;
            case 7:
                n.u((n) this.f6268b);
                break;
            case 8:
                TimerBadgeHolder._init_$lambda$1((TimerBadgeHolder) this.f6268b, view);
                break;
            case 9:
                WrappedLinkTagHolder._init_$lambda$1((WrappedLinkTagHolder) this.f6268b, view);
                break;
            case 10:
                AviaCheckTariffsBenefitView.getOrCreateRightIcon$lambda$6$lambda$5((AviaCheckTariffsBenefitView) this.f6268b, view);
                break;
            case 11:
                CellRegular24IconPickerView._init_$lambda$0((CellRegular24IconPickerView) this.f6268b, view);
                break;
            default:
                CarouselAdapter.ImageViewHolder._init_$lambda$0((CarouselAdapter.ImageViewHolder) this.f6268b, view);
                break;
        }
    }
}

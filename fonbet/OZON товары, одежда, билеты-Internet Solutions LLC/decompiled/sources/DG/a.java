package DG;

import Ve.Aa;
import Ve.Bi;
import Ve.C4152cb;
import Ve.Pe;
import Ve.Ur;
import Ve.V9;
import Ve.Yl;
import Zi.f;
import android.view.View;
import androidx.lifecycle.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ld0.x;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.noui.navbar.FilterNavBarViewHolder;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarViewHolder;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.periods.InstallmentPeriodsViewHolder;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting.CancelPostingsV2PostingViewHolder;
import ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation.SearchResultHeaderViewHolder;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingBannerView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.view.HotelsHorizontalShelvesView;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductAdultImageWithVideoCoverBinder;
import ru.ozon.id.nativeauth.main.ErrorView;
import xe.C10727i;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6229b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6228a = i11;
        this.f6229b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f6229b;
        switch (this.f6228a) {
            case 0:
                CancelPostingsV2PostingViewHolder._init_$lambda$2((CancelPostingsV2PostingViewHolder) obj, view);
                break;
            case 1:
                int i11 = ErrorView.f97275g;
                ((Function1) obj).invoke(view);
                break;
            case 2:
                SearchResultHeaderViewHolder.lambda$5$lambda$0((SearchResultHeaderViewHolder) obj, view);
                break;
            case 3:
                FilterNavBarViewHolder.onWidgetCreated$lambda$0((FilterNavBarViewHolder) obj, view);
                break;
            case 4:
                ButtonAtom._init_$lambda$2((ButtonAtom) obj, view);
                break;
            case 5:
                ProductAdultImageWithVideoCoverBinder.init$lambda$1((ProductAdultImageWithVideoCoverBinder) obj, view);
                break;
            case 6:
                V9 this$0 = (V9) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4152cb c4152cb = (C4152cb) this$0.u();
                Bi event = new Bi(Yl.TOUCH_TOP_BUTTON, Ur.STATUS_VIEW, Pe.TOUCH, null, null, null, null, 120);
                Intrinsics.checkNotNullParameter(event, "event");
                c4152cb.f30497a.b(event);
                C10727i.c(x0.a(c4152cb), null, null, new Aa(c4152cb, null), 3);
                break;
            case 7:
                OnboardingBannerView.bind$lambda$2$lambda$1$lambda$0((Function0) obj, view);
                break;
            case 8:
                f.g((f) obj);
                break;
            case 9:
                InstallmentPeriodsViewHolder._init_$lambda$0((InstallmentPeriodsViewHolder) obj, view);
                break;
            case 10:
                x.x((x) obj);
                break;
            case 11:
                HotelsHorizontalShelvesView._init_$lambda$9((HotelsHorizontalShelvesView) obj, view);
                break;
            case 12:
                ((CurtainNavBarViewHolder) obj).doDismiss();
                break;
            default:
                ((CellWithSubtitleCheckboxRadioCounterView) obj).onCheckedChange();
                break;
        }
    }
}

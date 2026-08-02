package EE;

import android.view.View;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.android.messenger.blocks.header.s;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.fresh.main.widgets.customCell.presentation.CustomCellVO;
import ru.ozon.app.android.fresh.main.widgets.customCell.presentation.CustomCellViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.domain.ImageBadgeListVO;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.ImageBadgeView;
import ru.ozon.app.android.orderdetails.dateselector.presentation.DateSelectorViewHolder;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.top.PriceV4TopWithBadgeView;
import ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder;
import ru.ozon.app.android.storefront.navBar.NavBarVO;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7686c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f7684a = i11;
        this.f7685b = obj;
        this.f7686c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7684a) {
            case 0:
                PriceV4TopWithBadgeView.setOnPriceClickListener$lambda$16((PriceV4TopWithBadgeView) this.f7685b, (Function1) this.f7686c, view);
                break;
            case 1:
                NavBarOverlayViewHolder.createImageAction$lambda$33$lambda$32((NavBarVO.Action) this.f7685b, (NavBarOverlayViewHolder) this.f7686c, view);
                break;
            case 2:
                DateSelectorViewHolder._init_$lambda$1((DateSelectorViewHolder) this.f7685b, (InterfaceC7851b) this.f7686c, view);
                break;
            case 3:
                CustomCellViewHolder.bind$lambda$0((CustomCellVO) this.f7685b, (CustomCellViewHolder) this.f7686c, view);
                break;
            case 4:
                s sVar = (s) this.f7685b;
                AtomAction a11 = sVar.a();
                d dVar = (d) this.f7686c;
                if (a11 != null) {
                    dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(a11, null, 3));
                }
                Map<String, MessengerTrackingInfo> l11 = sVar.l();
                if (l11 != null) {
                    dVar.c().m(l11);
                    break;
                }
                break;
            default:
                ImageBadgeView.bind$lambda$13$lambda$12((Function2) this.f7685b, (ImageBadgeListVO.ImageBadge) this.f7686c, view);
                break;
        }
    }
}

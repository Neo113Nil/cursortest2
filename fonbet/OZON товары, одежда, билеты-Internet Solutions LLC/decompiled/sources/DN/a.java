package DN;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.g;
import ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.OrderCalculatorWidgetViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.DateChooseDialog;
import ru.ozon.app.android.miniapp.MiniAppWebActivity;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewHolder.ReturnableItemsTitleViewHolder;
import ru.ozon.app.android.storefront.navBar.NavBarOverlayViewHolder;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view.TotalPriceDetailsItemView;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.navi.UniversalObjectNaviViewHolder;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.badgekit.BadgeKitView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.jointpurchase.JointPurchaseButtonWithQuantityView;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6261b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f6260a = i11;
        this.f6261b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6260a) {
            case 0:
                TotalPriceDetailsItemView.setUpIconView$lambda$10((TotalPriceDetailsItemView) this.f6261b, view);
                break;
            case 1:
                JointPurchaseButtonWithQuantityView.initClickListeners$lambda$2((JointPurchaseButtonWithQuantityView) this.f6261b, view);
                break;
            case 2:
                ShelfCardView._init_$lambda$1((ShelfCardView) this.f6261b, view);
                break;
            case 3:
                PinPadFragment.G((PinPadFragment) this.f6261b);
                break;
            case 4:
                UniversalObjectNaviViewHolder.lambda$5$lambda$4((UniversalObjectNaviViewHolder) this.f6261b, view);
                break;
            case 5:
                ((DateChooseDialog) this.f6261b).dismiss();
                break;
            case 6:
                BadgeKitView.cl$lambda$0((BadgeKitView) this.f6261b, view);
                break;
            case 7:
                NavBarOverlayViewHolder.setNavBarNavigationIcon$lambda$28$lambda$27((NavBarOverlayViewHolder) this.f6261b, view);
                break;
            case 8:
                OrderCalculatorWidgetViewHolder.setupRegionViews$lambda$0((OrderCalculatorWidgetViewHolder) this.f6261b, view);
                break;
            case 9:
                VideoMoleculeViewHolder._init_$lambda$16((VideoMoleculeViewHolder) this.f6261b, view);
                break;
            case 10:
                Context context = ((ViewGroup) this.f6261b).getContext();
                g gVar = context instanceof g ? (g) context : null;
                if (gVar != null) {
                    gVar.onBackPressed();
                    break;
                }
                break;
            case 11:
                FinToolbarView.lambda$5$lambda$4((FinToolbarView) this.f6261b, view);
                break;
            case 12:
                ReturnableItemsTitleViewHolder.subtitleClickListener$lambda$2((ReturnableItemsTitleViewHolder) this.f6261b, view);
                break;
            default:
                ((MiniAppWebActivity) this.f6261b).finish();
                break;
        }
    }
}

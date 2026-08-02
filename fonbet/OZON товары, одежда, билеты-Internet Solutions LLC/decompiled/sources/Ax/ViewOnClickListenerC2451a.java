package Ax;

import Ve.C4449mk;
import Ve.C4460n2;
import Ve.C4817zg;
import Ve.H7;
import Ve.Vq;
import Ve.Y3;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.AbToggleActivity;
import ru.ozon.app.android.atoms.v3.holders.tags.crosstag.CrossTagHolder;
import ru.ozon.app.android.cart.cartButtonWithTooltip.presentation.CartButtonWithTooltipViewHolder;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation.ScrollProductViewHolder;
import ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation.ExpressNavBarColorsHelper;
import ru.ozon.app.android.partpayment.formpage.view.vh.ValidateButtonVH;
import ru.ozon.app.android.returns.ui.molecules.balance.presentaion.recyclerView.ReturnCreationTotalRowViewHolder;
import ru.ozon.app.android.storefront.core.socialAtoms.productList.items.ProductListItemViewHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithReverseSubtitleCounterView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.UniversalObjectGridViewHolder;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import ru.ozon.id.antibot.errorView.AntibotErrorView;
import ru.ozon.uni.android.atom.notification.view.NotificationBarView;

/* renamed from: Ax.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2451a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1294b;

    public /* synthetic */ ViewOnClickListenerC2451a(Object obj, int i11) {
        this.f1293a = i11;
        this.f1294b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1293a) {
            case 0:
                ExpressNavBarColorsHelper.setNavBarNavigationIcon$lambda$2$lambda$1((ExpressNavBarColorsHelper) this.f1294b, view);
                break;
            case 1:
                ScrollProductViewHolder.lambda$5$lambda$4((ScrollProductViewHolder) this.f1294b, view);
                break;
            case 2:
                FintechNativeBridgeTestingFragment.x((FintechNativeBridgeTestingFragment) this.f1294b);
                break;
            case 3:
                UniversalObjectGridViewHolder._init_$lambda$6((UniversalObjectGridViewHolder) this.f1294b, view);
                break;
            case 4:
                ((Function1) this.f1294b).invoke(view);
                break;
            case 5:
                ProductListItemViewHolder._init_$lambda$1((ProductListItemViewHolder) this.f1294b, view);
                break;
            case 6:
                AbToggleActivity.initToolbar$lambda$1((AbToggleActivity) this.f1294b, view);
                break;
            case 7:
                C4460n2 this$0 = (C4460n2) this.f1294b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((Y3) this$0.u()).f0(Vq.f30228a);
                break;
            case 8:
                C4817zg this$02 = (C4817zg) this.f1294b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((C4449mk) this$02.u()).e0(H7.f29124b);
                break;
            case 9:
                ValidateButtonVH.lambda$1$lambda$0((ValidateButtonVH) this.f1294b, view);
                break;
            case 10:
                CartButtonWithTooltipViewHolder._init_$lambda$0((CartButtonWithTooltipViewHolder) this.f1294b, view);
                break;
            case 11:
                CrossTagHolder._init_$lambda$1((CrossTagHolder) this.f1294b, view);
                break;
            case 12:
                ((Function0) this.f1294b).invoke();
                break;
            case 13:
                ru.ozon.android.inAppUpdate.internal.ui.a.t((ru.ozon.android.inAppUpdate.internal.ui.a) this.f1294b);
                break;
            case 14:
                NotificationBarView.setupListeners$lambda$8((NotificationBarView) this.f1294b, view);
                break;
            case 15:
                CellWithReverseSubtitleCounterView._init_$lambda$8((CellWithReverseSubtitleCounterView) this.f1294b, view);
                break;
            case 16:
                AntibotErrorView.c((AntibotErrorView) this.f1294b);
                break;
            default:
                ReturnCreationTotalRowViewHolder.clickableAreaClickListener$lambda$1((ReturnCreationTotalRowViewHolder) this.f1294b, view);
                break;
        }
    }
}

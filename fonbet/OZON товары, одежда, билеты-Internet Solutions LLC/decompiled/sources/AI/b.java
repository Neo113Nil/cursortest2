package AI;

import Dc0.q;
import Ve.C4192dm;
import Ve.D1;
import Ve.Mk;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.bank.widgets.starPoints.presentation.StarPointsWidgetVH;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarViewHolder;
import ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation.NavBarIconButtonWidgetViewHolder;
import ru.ozon.app.android.debugmenu.debugscreen.version.VersionActivity;
import ru.ozon.app.android.fresh.main.ui.atoms.cartPrice.CartPriceFreshView;
import ru.ozon.app.android.pdpoldwidgets.widgets.caption.presentation.CaptionViewHolder;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoViewHolder;
import ru.ozon.app.android.search.catalog.components.meta.MetaFragment;
import ru.ozon.app.android.search.widgets.history.catalog.presentation.SearchHistoryViewHolder;
import ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation.SearchResultHeaderViewHolder;
import ru.ozon.app.android.storefront.widgets.megadraw.presentation.MegaDrawViewHolder;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerItemVH;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductHorizontalBadgesBinder;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment;
import ru.ozon.fintech.features.operations.ui.actioncard.ActionCardView;
import ru.ozon.id.nativeauth.main.ErrorView;
import ru.ozon.id.nativeauth.main.b;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f630b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f629a = i11;
        this.f630b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f630b;
        switch (this.f629a) {
            case 0:
                SearchHistoryViewHolder.setSearchItemClickListener$lambda$8((SearchHistoryViewHolder) obj, view);
                break;
            case 1:
                q.v((q) obj);
                break;
            case 2:
                StarPointsWidgetVH.lambda$1$lambda$0((StarPointsWidgetVH) obj, view);
                break;
            case 3:
                VideoMoleculeViewHolder.lambda$17$lambda$14((VideoMoleculeViewHolder) obj, view);
                break;
            case 4:
                ActionCardView.a((ActionCardView) obj);
                break;
            case 5:
                int i11 = ErrorView.f97275g;
                ((b.c.C2137b) ((b.c) obj)).e().invoke();
                break;
            case 6:
                CategoryLogoViewHolder._init_$lambda$0((CategoryLogoViewHolder) obj, view);
                break;
            case 7:
                CartPriceFreshView.initClickListeners$lambda$0((CartPriceFreshView) obj, view);
                break;
            case 8:
                SearchResultHeaderViewHolder.lambda$5$lambda$4((SearchResultHeaderViewHolder) obj, view);
                break;
            case 9:
                CbottomModalDialogFragment.t((CbottomModalDialogFragment) obj);
                break;
            case 10:
                ProductHorizontalBadgesBinder.init$lambda$0((ProductHorizontalBadgesBinder) obj, view);
                break;
            case 11:
                ((MetaFragment) obj).dismiss();
                break;
            case 12:
                C4192dm this$0 = (C4192dm) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((D1) this$0.u()).e0(Mk.f29481a);
                break;
            case 13:
                MegaDrawViewHolder.clickListener$lambda$0((MegaDrawViewHolder) obj, view);
                break;
            case 14:
                MediaPickerItemVH.lambda$6$lambda$2((MediaPickerItemVH) obj, view);
                break;
            case 15:
                CaptionViewHolder._init_$lambda$2((CaptionViewHolder) obj, view);
                break;
            case 16:
                VersionActivity.onCreate$lambda$2((VersionActivity) obj, view);
                break;
            case 17:
                ScreenStateViewWidget.showState$lambda$7$lambda$6((ScreenState.Custom) obj, view);
                break;
            case 18:
                CurtainNavBarViewHolder._init_$lambda$3((CurtainNavBarViewHolder) obj, view);
                break;
            case 19:
                ((CellWithSubtitleCheckboxRadioView) obj).onCheckedChange();
                break;
            default:
                NavBarIconButtonWidgetViewHolder._init_$lambda$1((NavBarIconButtonWidgetViewHolder) obj, view);
                break;
        }
    }
}

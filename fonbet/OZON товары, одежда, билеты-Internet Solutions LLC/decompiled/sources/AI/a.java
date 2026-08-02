package AI;

import Ve.Bi;
import Ve.C4152cb;
import Ve.C4238fb;
import Ve.Oc;
import Ve.Pe;
import Ve.Ur;
import Ve.V9;
import Ve.Vf;
import Ve.Yl;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ld0.x;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.AntibotEmptyActivity;
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.presentation.CurtainNavBarViewHolder;
import ru.ozon.app.android.debugmenu.debugscreen.version.VersionActivity;
import ru.ozon.app.android.fresh.main.widgets.product.common.richheader.presentation.RichHeaderViewHolder;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderViewHolder;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.contactcourier.ContactCourierBottomSheetDialog;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewHolder.ReturnableItemViewHolder;
import ru.ozon.app.android.returns.ui.presentation.flexImages.imageView.BaseImageView;
import ru.ozon.app.android.search.widgets.history.catalog.presentation.SearchHistoryViewHolder;
import ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation.SearchResultHeaderViewHolder;
import ru.ozon.app.android.storefront.ui.videomolecule.databinding.VideoMoleculeBinding;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerItemVH;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders.ProductBottomBadgesBinder;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.features.offline.ui.contact.OfflineContactView;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f628b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f627a = i11;
        this.f628b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f627a) {
            case 0:
                SearchHistoryViewHolder.setRemoveSearchItemClickListener$lambda$4((SearchHistoryViewHolder) this.f628b, view);
                break;
            case 1:
                BaseImageView._init_$lambda$2((BaseImageView) this.f628b, view);
                break;
            case 2:
                VideoMoleculeViewHolder.lambda$17$lambda$13((VideoMoleculeBinding) this.f628b, view);
                break;
            case 3:
                ((Function0) this.f628b).invoke();
                break;
            case 4:
                ((AntibotEmptyActivity) this.f628b).finish();
                break;
            case 5:
                SearchResultHeaderViewHolder.lambda$5$lambda$2((SearchResultHeaderViewHolder) this.f628b, view);
                break;
            case 6:
                ProductBottomBadgesBinder.init$lambda$0((ProductBottomBadgesBinder) this.f628b, view);
                break;
            case 7:
                V9 this$0 = (V9) this.f628b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C4152cb c4152cb = (C4152cb) this$0.u();
                Bi event = new Bi(Yl.TOUCH_BOTTOM_BUTTON, Ur.STATUS_VIEW, Pe.TOUCH, null, null, null, null, 120);
                Intrinsics.checkNotNullParameter(event, "event");
                c4152cb.f30497a.b(event);
                ((C4238fb) c4152cb.f30791d).b(new Oc(Vf.f30201a, false));
                break;
            case 8:
                MediaPickerItemVH.lambda$6$lambda$0((MediaPickerItemVH) this.f628b, view);
                break;
            case 9:
                StickyLadderViewHolder._init_$lambda$0((StickyLadderViewHolder) this.f628b, view);
                break;
            case 10:
                x.u((x) this.f628b);
                break;
            case 11:
                OfflineContactView._init_$lambda$0((OfflineContactView) this.f628b, view);
                break;
            case 12:
                VersionActivity.onCreate$lambda$1((VersionActivity) this.f628b, view);
                break;
            case 13:
                ScreenStateViewWidget.showState$lambda$5((ScreenStateViewWidget) this.f628b, view);
                break;
            case 14:
                ReturnableItemViewHolder.actionSelectClickListener$lambda$1((ReturnableItemViewHolder) this.f628b, view);
                break;
            case 15:
                CurtainNavBarViewHolder._init_$lambda$1((CurtainNavBarViewHolder) this.f628b, view);
                break;
            case 16:
                ((ContactCourierBottomSheetDialog) this.f628b).dismiss();
                break;
            case 17:
                ((CellWithSubtitleCheckboxRadioCounterView) this.f628b).onCheckedChange();
                break;
            default:
                RichHeaderViewHolder._init_$lambda$1((RichHeaderViewHolder) this.f628b, view);
                break;
        }
    }
}

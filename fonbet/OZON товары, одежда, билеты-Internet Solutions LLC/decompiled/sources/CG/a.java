package CG;

import Dc0.q;
import android.view.View;
import ru.ozon.app.android.atoms.v3.holders.authorBlock.AuthorBlockHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.SwipeRemoveButtonView;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.colorfilter.colors.AspectsColorViewHolder;
import ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4OrderViewHolder;
import ru.ozon.app.android.partpayment.formpage.view.modalpickerfragment.adapter.ModalPickerOptionsViewHolder;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.presentation.CrosslinkViewHolder;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewHolder;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewHolder.ReturnCreationSelectedItemViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridViewHolder;
import ru.ozon.app.android.storefront.core.socialAtoms.badge.SocialBadgeAtomHolder;
import ru.ozon.app.android.storefront.widgets.stickyCart.presenatation.StickyCartOverlayViewHolder;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.deletereview.DeleteReviewBottomFragment;
import ru.ozon.app.android.ugc.widgets.profileHeader.presentation.ProfileHeaderViewHolder;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleValueView;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header.HeaderVHOptimized;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.ui.button.transparent.TransparentButtonView;
import ru.ozon.fintech.ui.promoV2.PromoV2View;
import tj.e;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4529b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f4528a = i11;
        this.f4529b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4528a) {
            case 0:
                CancelPostingsV2MonopostingViewHolder._init_$lambda$1((CancelPostingsV2MonopostingViewHolder) this.f4529b, view);
                break;
            case 1:
                q.C((q) this.f4529b);
                break;
            case 2:
                ((DeleteReviewBottomFragment) this.f4529b).dismiss();
                break;
            case 3:
                OrderTrackingV4OrderViewHolder.lambda$1$lambda$0((OrderTrackingV4OrderViewHolder) this.f4529b, view);
                break;
            case 4:
                AspectsColorViewHolder.lambda$3$lambda$1((AspectsColorViewHolder) this.f4529b, view);
                break;
            case 5:
                StickyCartOverlayViewHolder.onClickListener$lambda$1((StickyCartOverlayViewHolder) this.f4529b, view);
                break;
            case 6:
                HeaderVHOptimized._init_$lambda$3((HeaderVHOptimized) this.f4529b, view);
                break;
            case 7:
                SocialBadgeAtomHolder._init_$lambda$1((SocialBadgeAtomHolder) this.f4529b, view);
                break;
            case 8:
                ModalPickerOptionsViewHolder._init_$lambda$0((ModalPickerOptionsViewHolder) this.f4529b, view);
                break;
            case 9:
                AuthorBlockHolder._init_$lambda$1((AuthorBlockHolder) this.f4529b, view);
                break;
            case 10:
                ReturnCreationSelectedItemViewHolder.cardClickListener$lambda$0((ReturnCreationSelectedItemViewHolder) this.f4529b, view);
                break;
            case 11:
                TransparentButtonView._init_$lambda$1((TransparentButtonView) this.f4529b, view);
                break;
            case 12:
                com.vk.id.captcha.web.a.b.a((com.vk.id.captcha.web.a.b) this.f4529b, view);
                break;
            case 13:
                SearchResultsGridViewHolder.lambda$4$lambda$3((SearchResultsGridViewHolder) this.f4529b, view);
                break;
            case 14:
                ProfileHeaderViewHolder.setCountClickListeners$lambda$11$lambda$8((ProfileHeaderViewHolder) this.f4529b, view);
                break;
            case 15:
                CrosslinkViewHolder._init_$lambda$0((CrosslinkViewHolder) this.f4529b, view);
                break;
            case 16:
                ((CameraFragment) this.f4529b).handleFlashClick();
                break;
            case 17:
                PromoV2View._init_$lambda$1((PromoV2View) this.f4529b, view);
                break;
            case 18:
                CellWithSubtitleValueView._init_$lambda$1((CellWithSubtitleValueView) this.f4529b, view);
                break;
            case 19:
                e.t((e) this.f4529b);
                break;
            default:
                SwipeRemoveButtonView._init_$lambda$3((SwipeRemoveButtonView) this.f4529b, view);
                break;
        }
    }
}

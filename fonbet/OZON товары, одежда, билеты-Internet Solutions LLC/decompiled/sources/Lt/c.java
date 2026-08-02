package Lt;

import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.r;
import gj.C6743a;
import hj.C6960a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oj.C8744a;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.SwipeTileLayout;
import ru.ozon.app.android.fresh.checkout.widgets.paymentInfoV2.presentation.payments.viewHolder.BaseFreshPaymentViewHolder;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.adapter.OrderTrackingItemsAdapter;
import ru.ozon.app.android.fresh.unsorted.widgets.tagList.presentation.TagListView;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.views.SelectionTileHeaderView;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersSingleBlockItemViewHolder;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17170b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17171c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f17169a = i11;
        this.f17170b = obj;
        this.f17171c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17169a) {
            case 0:
                SwipeTileLayout.lambda$6$lambda$5((ImageButton) this.f17170b, (SwipeTileLayout) this.f17171c, view);
                break;
            case 1:
                SelectionTileHeaderView.bindSocialHeader$lambda$17((SelectionsListVI.HeaderVO.SocialHeader) this.f17170b, (Function1) this.f17171c, view);
                break;
            case 2:
                TagListView.getOrCreateTabButton$lambda$8$lambda$7((TagListView) this.f17170b, (TagButtonDTO) this.f17171c, view);
                break;
            case 3:
                UgcCountersSingleBlockItemViewHolder.bind$lambda$1$lambda$0((UgcCountersSingleBlockItemViewHolder) this.f17170b, (UgcCountersVO.Block.Single) this.f17171c, view);
                break;
            case 4:
                BaseFreshPaymentViewHolder._init_$lambda$1((BaseFreshPaymentViewHolder) this.f17170b, (Function1) this.f17171c, view);
                break;
            case 5:
                lj.c b11 = C6960a.b();
                C8744a c8744a = (C8744a) this.f17170b;
                r requireActivity = c8744a.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                b11.d(requireActivity);
                C6743a.b(ActionType.CLICK.INSTANCE, ((ButtonView) this.f17171c).getTitleText());
                c8744a.dismiss();
                break;
            default:
                OrderTrackingItemsAdapter.ItemViewHolder.itemClickListener$lambda$1((AtomAction) this.f17170b, (OrderTrackingItemsAdapter.ItemViewHolder) this.f17171c, view);
                break;
        }
    }
}

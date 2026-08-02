package Cz;

import Wc0.b;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import ru.ozon.app.android.atoms.af.holders.RadioItemAtom;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedPaymentButtonHolder;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.csma.tips.core.rv.v2.TipItemInputV2ViewHolder;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.HammersV3HeaderViewHolder;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameViewNew;
import ru.ozon.app.android.storefront.widgets.naviGrid3.presentation.NaviGrid3ViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarBottomView;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.presentation.AdditionalServiceCellWidgetViewHolder;
import ru.ozon.fintech.ui.action.ActionTextItemState;
import ru.ozon.fintech.ui.action.ActionTextItemView;
import spay.sdk.view.SPayButton;

/* renamed from: Cz.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2788a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5184b;

    public /* synthetic */ ViewOnClickListenerC2788a(Object obj, int i11) {
        this.f5183a = i11;
        this.f5184b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5183a) {
            case 0:
                HammersV3HeaderViewHolder._init_$lambda$0((HammersV3HeaderViewHolder) this.f5184b, view);
                break;
            case 1:
                SPayButton.a((SPayButton) this.f5184b, view);
                break;
            case 2:
                RadioItemAtom._init_$lambda$2((RadioItemAtom) this.f5184b, view);
                break;
            case 3:
                ActionTextItemView.bindState$lambda$1((ActionTextItemState) this.f5184b, view);
                break;
            case 4:
                b.x((b) this.f5184b);
                break;
            case 5:
                WrappedPaymentButtonHolder._init_$lambda$1((WrappedPaymentButtonHolder) this.f5184b, view);
                break;
            case 6:
                CalendarBottomView.setUpReadyButton$lambda$0((CalendarBottomView) this.f5184b, view);
                break;
            case 7:
                CartSplitV2ItemWidgetViewHolder.removeClickListener$lambda$0((CartSplitV2ItemWidgetViewHolder) this.f5184b, view);
                break;
            case 8:
                TipItemInputV2ViewHolder.lambda$2$lambda$1((TextInputEditText) this.f5184b, view);
                break;
            case 9:
                FrameViewNew._init_$lambda$9((FrameViewNew) this.f5184b, view);
                break;
            case 10:
                AdditionalServiceCellWidgetViewHolder._init_$lambda$0((AdditionalServiceCellWidgetViewHolder) this.f5184b, view);
                break;
            case 11:
                ((ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.a) this.f5184b).dismiss();
                break;
            default:
                NaviGrid3ViewHolder._init_$lambda$1((NaviGrid3ViewHolder) this.f5184b, view);
                break;
        }
    }
}

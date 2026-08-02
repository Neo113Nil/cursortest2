package EX;

import Ri.C3933a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.shipment.CancelPostingsV2ShipmentViewHolder;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products.ProductViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryAbViewHolder;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewHolder.ReturnCreationTotalViewHolder;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle48IconView;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.MaxiTileViewHolder;
import ru.ozon.fintech.features.demo.ui.message.DemoMessageItemView;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ti.C9876a;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7719b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f7718a = i11;
        this.f7719b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f7719b;
        switch (this.f7718a) {
            case 0:
                MaxiTileViewHolder.lambda$3$lambda$2((MaxiTileViewHolder) obj, view);
                break;
            case 1:
                OzonTextInputLayout._init_$lambda$4((OzonTextInputLayout) obj, view);
                break;
            case 2:
                ((Function0) obj).invoke();
                break;
            case 3:
                ProductViewHolder._init_$lambda$0((ProductViewHolder) obj, view);
                break;
            case 4:
                ErrorSummaryAbViewHolder._init_$lambda$0((ErrorSummaryAbViewHolder) obj, view);
                break;
            case 5:
                DemoMessageItemView._init_$lambda$1((DemoMessageItemView) obj, view);
                break;
            case 6:
                int i11 = C3933a.f25109d;
                ((C3933a) obj).dismiss();
                break;
            case 7:
                CartSplitV2ItemWidgetViewHolder.lambda$11$lambda$10((CartSplitV2ItemWidgetViewHolder) obj, view);
                break;
            case 8:
                ((Function1) obj).invoke(view);
                break;
            case 9:
                ReturnCreationTotalViewHolder.lambda$4$lambda$3((ReturnCreationTotalViewHolder) obj, view);
                break;
            case 10:
                ScreenStateViewWidget.showState$lambda$2((ScreenStateViewWidget) obj, view);
                break;
            case 11:
                Context context = ((ViewGroup) obj).getContext();
                g gVar = context instanceof g ? (g) context : null;
                if (gVar != null) {
                    gVar.onBackPressed();
                    break;
                }
                break;
            case 12:
                CellWithSubtitle48IconView._init_$lambda$0((CellWithSubtitle48IconView) obj, view);
                break;
            case 13:
                ((C9876a) obj).dismiss();
                break;
            default:
                CancelPostingsV2ShipmentViewHolder._init_$lambda$0((CancelPostingsV2ShipmentViewHolder) obj, view);
                break;
        }
    }
}

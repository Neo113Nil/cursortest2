package LB;

import android.view.View;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.bank.widgets.installmentPayment.presentation.InstallmentPaymentWidgetVH;
import ru.ozon.app.android.csma.tips.core.rv.UtilsKt;
import ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4AllOrdersViewHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.CartButtonQuantDto;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleInCartQuantViewImpl;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleInCartViewV4;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsVO;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.SelectionTileView;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16637c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f16635a = i11;
        this.f16637c = obj;
        this.f16636b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16635a) {
            case 0:
                OrderTrackingV4AllOrdersViewHolder.lambda$1$lambda$0((OrderTrackingV4AllOrdersViewHolder) this.f16637c, (Function1) this.f16636b, view);
                break;
            case 1:
                SelectionTileView.setFooterIcon$lambda$11$lambda$10((Function1) this.f16636b, (SelectionsListVI.TileFooterContent.SelectionItemFooter) this.f16637c, view);
                break;
            case 2:
                ConstraintLayout this_apply = (ConstraintLayout) this.f16637c;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.startAnimation((Animation) this.f16636b);
                break;
            case 3:
                UtilsKt.setOnClickListener$lambda$2((RecyclerView.C) this.f16637c, (Function1) this.f16636b, view);
                break;
            case 4:
                DoubleInCartQuantViewImpl.bindMainButton$lambda$1((CartButtonQuantDto.CartButton) this.f16637c, (DoubleInCartQuantViewImpl) this.f16636b, view);
                break;
            case 5:
                DoubleInCartViewV4.bindMinusPlus$lambda$4$lambda$3((DoubleInCartViewV4) this.f16637c, (DoubleCartVO.CartMode) this.f16636b, view);
                break;
            case 6:
                NewCredentialsViewHolder.bind$lambda$5((NewCredentialsViewHolder) this.f16637c, (NewCredentialsVO) this.f16636b, view);
                break;
            default:
                InstallmentPaymentWidgetVH.bind$lambda$3((I) this.f16637c, (InstallmentPaymentWidgetVH) this.f16636b, view);
                break;
        }
    }

    public /* synthetic */ a(Function1 function1, SelectionsListVI.TileFooterContent.SelectionItemFooter selectionItemFooter) {
        this.f16635a = 1;
        this.f16636b = function1;
        this.f16637c = selectionItemFooter;
    }
}

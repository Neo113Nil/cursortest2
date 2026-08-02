package GD;

import android.view.View;
import be0.C5656a;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.presentation.chatlist.popup.c;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.CartSplitV2ProductVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.binder.ProductBinderV2;
import ru.ozon.app.android.common.navigationblocks.presentation.rv.BlocksViewHolder;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchVO;
import ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation.FakeSearchView;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.presentation.DeliveryProblemsVO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.presentation.DeliveryProblemsViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.viewHolder.DeliveryV6SectionCellDefaultViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9810c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f9808a = i11;
        this.f9810c = obj;
        this.f9809b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9808a) {
            case 0:
                DeliveryV6SectionCellDefaultViewHolder._init_$lambda$1((DeliveryV6SectionCellDefaultViewHolder) this.f9810c, (Function1) this.f9809b, view);
                break;
            case 1:
                BlocksViewHolder.lambda$2$lambda$1((BlocksViewHolder) this.f9810c, (Function1) this.f9809b, view);
                break;
            case 2:
                C5656a.b((C5656a) this.f9810c, (String) this.f9809b);
                break;
            case 3:
                DeliveryProblemsViewHolder.trackAnalytics$lambda$2((DeliveryProblemsVO) this.f9810c, (DeliveryProblemsViewHolder) this.f9809b, view);
                break;
            case 4:
                FakeSearchView.bind$lambda$10$lambda$7((Function1) this.f9809b, (FakeSearchVO) this.f9810c, view);
                break;
            case 5:
                ProductBinderV2.bind$lambda$2$lambda$1((ProductBinderV2) this.f9810c, (CartSplitV2ProductVO) this.f9809b, view);
                break;
            default:
                c.t((c) this.f9810c, (d) this.f9809b);
                break;
        }
    }

    public /* synthetic */ a(FakeSearchVO fakeSearchVO, Function1 function1) {
        this.f9808a = 4;
        this.f9809b = function1;
        this.f9810c = fakeSearchVO;
    }
}

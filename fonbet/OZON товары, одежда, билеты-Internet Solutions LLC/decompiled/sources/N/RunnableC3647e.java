package N;

import ru.ozon.app.android.cart.cartSplitV2.accessories.AccessoriesAsyncState;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.accessories.CartSplitV2AccessoriesViewRender;
import ru.ozon.app.android.cart.feature.databinding.WidgetCartSplitV2ItemAccessoriesBinding;

/* renamed from: N.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC3647e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18216c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18217d;

    public /* synthetic */ RunnableC3647e(Object obj, Object obj2, Object obj3, int i11) {
        this.f18214a = i11;
        this.f18215b = obj;
        this.f18216c = obj2;
        this.f18217d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18214a) {
            case 0:
                l.m((l) this.f18215b, (Runnable) this.f18216c, (Runnable) this.f18217d);
                break;
            default:
                CartSplitV2AccessoriesViewRender.renderState$lambda$9$lambda$8((WidgetCartSplitV2ItemAccessoriesBinding) this.f18215b, (CartSplitV2AccessoriesViewRender) this.f18216c, (AccessoriesAsyncState.Success) this.f18217d);
                break;
        }
    }
}

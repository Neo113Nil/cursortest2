package Go;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemWidgetViewHolder;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVH;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.composer.ui.widget.k;

/* renamed from: Go.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C3125a implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f10289b;

    public /* synthetic */ C3125a(int i11, k kVar) {
        this.f10288a = i11;
        this.f10289b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit steps$lambda$0;
        Unit steps$lambda$2;
        switch (this.f10288a) {
            case 0:
                steps$lambda$0 = RealFbsSplitVH.steps$lambda$0((RealFbsSplitVH) this.f10289b);
                return steps$lambda$0;
            default:
                steps$lambda$2 = CartSplitV2ItemWidgetViewHolder.steps$lambda$2((CartSplitV2ItemWidgetViewHolder) this.f10289b);
                return steps$lambda$2;
        }
    }
}

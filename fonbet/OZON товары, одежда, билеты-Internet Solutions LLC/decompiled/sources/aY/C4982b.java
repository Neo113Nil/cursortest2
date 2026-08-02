package aY;

import kotlin.Unit;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.viewHolder.CartSplitV2CellItemViewHolder;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileMoleculeDelegate;

/* renamed from: aY.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4982b implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36514b;

    public /* synthetic */ C4982b(Object obj, int i11) {
        this.f36513a = i11;
        this.f36514b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit steps$lambda$1;
        Unit steps$lambda$0;
        switch (this.f36513a) {
            case 0:
                steps$lambda$1 = SmallTileMoleculeDelegate.steps$lambda$1((SmallTileMoleculeDelegate) this.f36514b);
                return steps$lambda$1;
            default:
                steps$lambda$0 = CartSplitV2CellItemViewHolder.steps$lambda$0((CartSplitV2CellItemViewHolder) this.f36514b);
                return steps$lambda$0;
        }
    }
}

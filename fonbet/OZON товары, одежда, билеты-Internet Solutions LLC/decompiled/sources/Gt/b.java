package Gt;

import android.animation.TypeEvaluator;
import kotlin.Pair;
import ru.ozon.app.android.fresh.cart.widgets.cartControls.presentation.CartControlsViewController;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f7, Object obj, Object obj2) {
        Pair cornersEvaluator$lambda$3;
        cornersEvaluator$lambda$3 = CartControlsViewController.cornersEvaluator$lambda$3(f7, (Pair) obj, (Pair) obj2);
        return cornersEvaluator$lambda$3;
    }
}

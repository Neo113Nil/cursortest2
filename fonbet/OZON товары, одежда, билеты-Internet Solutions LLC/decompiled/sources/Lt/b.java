package Lt;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.SwipeTileLayout;
import ru.ozon.app.android.travel.molecules.view.input.TravelEditTextInputLayoutV2;
import ru.ozon.uni.android.atom.timer.TimerView;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f17168b;

    public /* synthetic */ b(View view, int i11) {
        this.f17167a = i11;
        this.f17168b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17167a) {
            case 0:
                SwipeTileLayout.animateToOffset$lambda$9$lambda$8((SwipeTileLayout) this.f17168b, valueAnimator);
                break;
            case 1:
                TravelEditTextInputLayoutV2.riseHint$lambda$26$lambda$25((TravelEditTextInputLayoutV2) this.f17168b, valueAnimator);
                break;
            default:
                TimerView.updateTime$lambda$6$lambda$5((TimerView) this.f17168b, valueAnimator);
                break;
        }
    }
}

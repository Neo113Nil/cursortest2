package FN;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Set;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeGroupState;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.view.HotelsBookTotalV3StickyContainerAnimator;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9195c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f9193a = i11;
        this.f9194b = obj;
        this.f9195c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9193a) {
            case 0:
                HotelsBookTotalV3StickyContainerAnimator.show$lambda$6$lambda$5((HotelsBookTotalV3StickyContainerAnimator) this.f9194b, (View) this.f9195c, valueAnimator);
                break;
            default:
                GroupSwipeCoordinator.animateGroupToOffset$lambda$17$lambda$16((SwipeGroupState) this.f9194b, (Set) this.f9195c, valueAnimator);
                break;
        }
    }
}

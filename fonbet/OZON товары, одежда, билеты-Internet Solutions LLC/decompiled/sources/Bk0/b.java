package Bk0;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import ru.ozon.fintech.ui.pinprogress.PinProgressView;
import ru.ozon.uni.android.flashbar.view.SwipeToDismissTouchListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3913c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f3911a = i11;
        this.f3912b = obj;
        this.f3913c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3911a) {
            case 0:
                SwipeToDismissTouchListener.performDismiss$lambda$0((ViewGroup.LayoutParams) this.f3912b, (SwipeToDismissTouchListener) this.f3913c, valueAnimator);
                break;
            default:
                PinProgressView.animateDot$lambda$25$lambda$24((PinProgressView.DotState) this.f3912b, (PinProgressView) this.f3913c, valueAnimator);
                break;
        }
    }
}

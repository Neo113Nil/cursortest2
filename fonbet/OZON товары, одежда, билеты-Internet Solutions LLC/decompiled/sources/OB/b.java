package OB;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.ordertracking.v4.presentation.view.StretchFrameLayout;
import ru.ozon.fintech.ui.pinprogress.PinProgressView;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f20128b;

    public /* synthetic */ b(View view, int i11) {
        this.f20127a = i11;
        this.f20128b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20127a) {
            case 0:
                StretchFrameLayout.animateWidthToInitial$lambda$5$lambda$2((StretchFrameLayout) this.f20128b, valueAnimator);
                break;
            default:
                PinProgressView.createMoveAndShakeAnimator$lambda$47$lambda$46((PinProgressView) this.f20128b, valueAnimator);
                break;
        }
    }
}

package Ij;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.android.uikit.view.progress.OzProgressBar;
import ru.ozon.app.android.ordertracking.v4.presentation.util.BarcodeAnimation;

/* renamed from: Ij.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C3260a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12588b;

    public /* synthetic */ C3260a(View view, int i11) {
        this.f12587a = i11;
        this.f12588b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12587a) {
            case 0:
                OzProgressBar.animateProgress$lambda$5$lambda$4((OzProgressBar) this.f12588b, valueAnimator);
                break;
            default:
                BarcodeAnimation.animateWidth_gwCluXo$lambda$2$lambda$1(this.f12588b, valueAnimator);
                break;
        }
    }
}

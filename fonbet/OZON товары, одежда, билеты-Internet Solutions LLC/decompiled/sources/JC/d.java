package JC;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.pdp.utils.views.input.PdpTextInputLayout;
import ru.ozon.uni.android.uikit.view.progress.OzProgressBar;

/* loaded from: classes13.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14268b;

    public /* synthetic */ d(View view, int i11) {
        this.f14267a = i11;
        this.f14268b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14267a) {
            case 0:
                PdpTextInputLayout.riseHint$lambda$15$lambda$14((PdpTextInputLayout) this.f14268b, valueAnimator);
                break;
            default:
                OzProgressBar.animateProgress$lambda$5$lambda$4((OzProgressBar) this.f14268b, valueAnimator);
                break;
        }
    }
}

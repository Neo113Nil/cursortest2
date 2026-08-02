package NB;

import android.animation.ValueAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ordertracking.v4.presentation.util.marqueeanimation.MarqueeViewAnimationHelper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4LocationsView;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f18828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18829c;

    public /* synthetic */ a(ConstraintLayout constraintLayout, float f7, int i11) {
        this.f18827a = i11;
        this.f18829c = constraintLayout;
        this.f18828b = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18827a) {
            case 0:
                MarqueeViewAnimationHelper.setupAndStartFadeAnimation$lambda$6(this.f18828b, (MarqueeViewAnimationHelper) this.f18829c, valueAnimator);
                break;
            case 1:
                SearchFormV4LocationsView.shrinkAnimator$lambda$20$lambda$19((SearchFormV4LocationsView) this.f18829c, this.f18828b, valueAnimator);
                break;
            default:
                SearchFormV5LocationsView.shrinkAnimator$lambda$20$lambda$19((SearchFormV5LocationsView) this.f18829c, this.f18828b, valueAnimator);
                break;
        }
    }

    public /* synthetic */ a(MarqueeViewAnimationHelper marqueeViewAnimationHelper, float f7) {
        this.f18827a = 0;
        this.f18828b = f7;
        this.f18829c = marqueeViewAnimationHelper;
    }
}

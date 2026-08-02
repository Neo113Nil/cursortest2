package EY;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4LocationsView;
import ru.ozon.app.android.videomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7723b;

    public /* synthetic */ c(View view, int i11) {
        this.f7722a = i11;
        this.f7723b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7722a) {
            case 0:
                VideoMoleculeTimeBar._init_$lambda$2((VideoMoleculeTimeBar) this.f7723b, valueAnimator);
                break;
            case 1:
                ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar._init_$lambda$2((ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar) this.f7723b, valueAnimator);
                break;
            default:
                SearchFormV4LocationsView.rotateAnimator$lambda$16$lambda$15((SearchFormV4LocationsView) this.f7723b, valueAnimator);
                break;
        }
    }
}

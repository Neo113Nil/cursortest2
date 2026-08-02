package EY;

import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.input.FeedbackInputViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView$startTypingTextAnimation$1$1;
import ru.ozon.app.android.videomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7721b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f7720a = i11;
        this.f7721b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7720a) {
            case 0:
                ((VideoMoleculeTimeBar) this.f7721b).stopScrubbing(false);
                break;
            case 1:
                ((ru.ozon.app.android.pdpvideomolecule.presentation.view.controlpanel.VideoMoleculeTimeBar) this.f7721b).stopScrubbing(false);
                break;
            case 2:
                FeedbackInputViewHolder.scrollToEnd$lambda$11((FeedbackInputViewHolder) this.f7721b);
                break;
            default:
                SearchFormV5LocationsView$startTypingTextAnimation$1$1.onAnimationEnd$lambda$0((SearchFormV5LocationsView) this.f7721b);
                break;
        }
    }
}

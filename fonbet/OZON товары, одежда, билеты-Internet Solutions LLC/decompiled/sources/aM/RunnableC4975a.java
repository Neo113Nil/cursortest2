package aM;

import androidx.concurrent.futures.b;
import d0.J;
import io.sentry.android.replay.capture.q;
import java.io.File;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation.HotelsReviewsVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsReviews.presentation.HotelsReviewsWidgetViewHolder;

/* renamed from: aM.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4975a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36489c;

    public /* synthetic */ RunnableC4975a(int i11, Object obj, Object obj2) {
        this.f36487a = i11;
        this.f36488b = obj;
        this.f36489c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36487a) {
            case 0:
                BottomNavigationController.hideWithAnimation$lambda$7((BottomNavigationController) this.f36488b, (OzonBottomNavigationView) this.f36489c);
                break;
            case 1:
                ((J) this.f36488b).f60805l.remove((b.a) this.f36489c);
                break;
            case 2:
                io.sentry.util.g.a((File) this.f36488b);
                ((q) this.f36489c).b(-1);
                break;
            default:
                HotelsReviewsWidgetViewHolder.bind$lambda$2((HotelsReviewsVO) this.f36488b, (HotelsReviewsWidgetViewHolder) this.f36489c);
                break;
        }
    }
}

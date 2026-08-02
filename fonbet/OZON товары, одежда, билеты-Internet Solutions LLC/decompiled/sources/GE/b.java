package GE;

import androidx.camera.core.impl.M;
import androidx.core.widget.ContentLoadingProgressBar;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.ordertracking.v4.OrderTrackingV4ViewHolder;
import ru.ozon.app.android.pdp.widgets.productStarsTile.presentation.ProductStarsTileView;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9819b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f9818a = i11;
        this.f9819b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9818a) {
            case 0:
                ProductStarsTileView.updateUserStars$lambda$6$lambda$5((ProductStarsTileView) this.f9819b);
                break;
            case 1:
                OrderTrackingV4ViewHolder.scrollToStart$lambda$1((OrderTrackingV4ViewHolder) this.f9819b);
                break;
            case 2:
                ((Function0) this.f9819b).invoke();
                break;
            case 3:
                ((M.c) this.f9819b).a();
                break;
            default:
                ContentLoadingProgressBar.a((ContentLoadingProgressBar) this.f9819b);
                break;
        }
    }
}

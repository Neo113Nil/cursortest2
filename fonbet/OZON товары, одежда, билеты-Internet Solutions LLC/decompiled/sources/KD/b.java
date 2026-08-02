package KD;

import Z.w;
import androidx.camera.core.impl.W;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.coordinator.GroupSwipeCoordinator;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.GalleryFullViewPinchToZoomTouchListener;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15408b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f15407a = i11;
        this.f15408b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15407a) {
            case 0:
                ((GalleryFullViewPinchToZoomTouchListener) this.f15408b).clearZoom();
                break;
            case 1:
                ((W) this.f15408b).d();
                break;
            case 2:
                w.c((w) this.f15408b);
                break;
            default:
                GroupSwipeCoordinator.handleSwipeEnd$lambda$9((GroupSwipeCoordinator) this.f15408b);
                break;
        }
    }
}

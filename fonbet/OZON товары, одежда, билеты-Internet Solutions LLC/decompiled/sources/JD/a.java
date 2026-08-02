package JD;

import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder;
import ru.ozon.app.android.tabbar.ui.BottomNavigationController;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.sticky.TravelQuickFiltersTopWidgetHolder;
import yZ.e;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14271b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f14270a = i11;
        this.f14271b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14270a) {
            case 0:
                GalleryFullViewViewHolder.notifyRunnable$lambda$0((GalleryFullViewViewHolder) this.f14271b);
                break;
            case 1:
                BottomNavigationController.showWithAnimation$lambda$6((BottomNavigationController) this.f14271b);
                break;
            case 2:
                TravelQuickFiltersTopWidgetHolder.bind$lambda$0((TravelQuickFiltersTopWidgetHolder) this.f14271b);
                break;
            default:
                e.a((e) this.f14271b);
                break;
        }
    }
}

package Fv;

import org.maplibre.android.maps.MapView;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingBottomOffsetDecorator;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.cell.FeedbackCellV2ViewHolder;

/* renamed from: Fv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC3061a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9563b;

    public /* synthetic */ RunnableC3061a(Object obj, int i11) {
        this.f9562a = i11;
        this.f9563b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9562a) {
            case 0:
                GeotrackingBottomOffsetDecorator.invalidateItemDecorations$lambda$1((GeotrackingBottomOffsetDecorator) this.f9563b);
                break;
            case 1:
                SearchBarViewDelegate.onScreenStateViewAction$lambda$3((SearchBarViewDelegate) this.f9563b);
                break;
            case 2:
                ((MapView) this.f9563b).onSurfaceCreated();
                break;
            default:
                FeedbackCellV2ViewHolder.closeSheetIfNeeded$lambda$0((FeedbackCellV2ViewHolder) this.f9563b);
                break;
        }
    }
}

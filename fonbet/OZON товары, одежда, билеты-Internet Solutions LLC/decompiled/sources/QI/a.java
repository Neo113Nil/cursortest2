package QI;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.regulardraw.widgets.warningTooltip.presentation.WarningTooltipViewHolder;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryWidgetViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileMoleculeView;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23124b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f23123a = i11;
        this.f23124b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean gestureDetector$lambda$6;
        boolean lambda$2$lambda$1;
        boolean interceptTouchesView$lambda$4$lambda$3;
        switch (this.f23123a) {
            case 0:
                z11 = ActiveSearchBarViewHolder.touchListener$lambda$0((ActiveSearchBarViewHolder) this.f23124b, view, motionEvent);
                return z11;
            case 1:
                gestureDetector$lambda$6 = HotelsGalleryWidgetViewHolder.setGestureDetector$lambda$6((HotelsGalleryWidgetViewHolder) this.f23124b, view, motionEvent);
                return gestureDetector$lambda$6;
            case 2:
                lambda$2$lambda$1 = SmallTileMoleculeView.lambda$2$lambda$1((SmallTileMoleculeView) this.f23124b, view, motionEvent);
                return lambda$2$lambda$1;
            default:
                interceptTouchesView$lambda$4$lambda$3 = WarningTooltipViewHolder.interceptTouchesView$lambda$4$lambda$3((WarningTooltipViewHolder) this.f23124b, view, motionEvent);
                return interceptTouchesView$lambda$4$lambda$3;
        }
    }
}

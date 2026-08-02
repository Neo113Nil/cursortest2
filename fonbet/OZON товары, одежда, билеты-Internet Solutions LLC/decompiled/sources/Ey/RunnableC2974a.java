package Ey;

import android.os.Parcelable;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.fresh.common.widgets.horizontalListWidget.AbstractHorizontalListViewHolder;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.utils.LocationMarkerProvider;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultWidgetViewHolder;

/* renamed from: Ey.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC2974a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8155c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8156d;

    public /* synthetic */ RunnableC2974a(Object obj, Object obj2, Object obj3, int i11) {
        this.f8153a = i11;
        this.f8154b = obj;
        this.f8155c = obj2;
        this.f8156d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8153a) {
            case 0:
                LocationMarkerProvider.createUserLocationMarker$lambda$1((LocationMarkerProvider) this.f8154b, (AddressEditMapVO.LocationMarker) this.f8155c, (Function0) this.f8156d);
                break;
            case 1:
                ToursSearchResultWidgetViewHolder.submitSearchResultsAndRestoreLayoutManagerState$lambda$4((ToursSearchResultViewModel.ToursState) this.f8154b, (ToursSearchResultWidgetViewHolder) this.f8155c, (Parcelable) this.f8156d);
                break;
            default:
                AbstractHorizontalListViewHolder.submitList$lambda$0((Parcelable) this.f8154b, (AbstractHorizontalListViewHolder) this.f8155c, (Function0) this.f8156d);
                break;
        }
    }
}

package B5;

import B90.v0;
import java.io.InputStream;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.normal.TravelQuickFiltersWidgetViewHolder;

/* loaded from: classes8.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2754b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f2753a = i11;
        this.f2754b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2753a) {
            case 0:
                O5.g.b((InputStream) this.f2754b);
                break;
            case 1:
                v0.n0((v0) this.f2754b);
                break;
            default:
                TravelQuickFiltersWidgetViewHolder.bind$lambda$0((TravelQuickFiltersWidgetViewHolder) this.f2754b);
                break;
        }
    }
}

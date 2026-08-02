package IO;

import UZ.d;
import WZ.e;
import WZ.g;
import java.util.Map;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.TextInputFilterRefreshHandler;
import ru.ozon.app.android.common.filterWidgets.filtervalues.presentation.ApplyFiltersAnalyticDelegate;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionWidgetViewHolder;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f12100b;

    public /* synthetic */ a(Map map, int i11) {
        this.f12099a = i11;
        this.f12100b = map;
    }

    @Override // WZ.e
    public final g modifyParams(UZ.a aVar, g gVar) {
        g customParamsModifier$lambda$1;
        g modifyAnalyticsData$lambda$2;
        g modifyAnalyticsData$lambda$0;
        switch (this.f12099a) {
            case 0:
                customParamsModifier$lambda$1 = FiltersSectionWidgetViewHolder.getCustomParamsModifier$lambda$1(this.f12100b, (d) aVar, gVar);
                return customParamsModifier$lambda$1;
            case 1:
                modifyAnalyticsData$lambda$2 = TextInputFilterRefreshHandler.modifyAnalyticsData$lambda$2(this.f12100b, (d) aVar, gVar);
                return modifyAnalyticsData$lambda$2;
            default:
                modifyAnalyticsData$lambda$0 = ApplyFiltersAnalyticDelegate.modifyAnalyticsData$lambda$0(this.f12100b, (d) aVar, gVar);
                return modifyAnalyticsData$lambda$0;
        }
    }
}

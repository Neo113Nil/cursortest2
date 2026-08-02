package B;

import androidx.concurrent.futures.b;
import androidx.recyclerview.widget.RecyclerView;
import m3.C8062d;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.presentation.HotelsScrollPriceCalendarVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v1.view.HotelsScrollPriceCalendarView;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersRvBinder;

/* loaded from: classes8.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1306c;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f1304a = i11;
        this.f1305b = obj;
        this.f1306c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1304a) {
            case 0:
                g.a((g) this.f1305b, (b.a) this.f1306c);
                break;
            case 1:
                HotelsScrollPriceCalendarView.bind$lambda$3((HotelsScrollPriceCalendarVO) this.f1305b, (HotelsScrollPriceCalendarView) this.f1306c);
                break;
            case 2:
                UgcCountersRvBinder.showOnboarding$lambda$9$lambda$8((RecyclerView) this.f1305b, (UgcCountersRvBinder) this.f1306c);
                break;
            default:
                C8062d.c((C8062d) this.f1305b, this.f1306c);
                break;
        }
    }
}

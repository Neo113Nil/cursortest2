package VS;

import android.content.Intent;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.core.impl.U;
import io.sentry.cache.l;
import io.sentry.protocol.o;
import org.chromium.net.ProxyChangeListener;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2VO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v2.presentation.TravelScrollPriceCalendarV2WidgetViewHolder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28461c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f28459a = i11;
        this.f28460b = obj;
        this.f28461c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28459a) {
            case 0:
                TravelScrollPriceCalendarV2WidgetViewHolder.bind$lambda$1((TravelScrollPriceCalendarV2WidgetViewHolder) this.f28460b, (TravelScrollPriceCalendarV2VO) this.f28461c);
                break;
            case 1:
                U.a((U) this.f28460b, (InterfaceC5129y0.a) this.f28461c);
                break;
            case 2:
                ((l) this.f28460b).K((o) this.f28461c, "request.json");
                break;
            default:
                ProxyChangeListener.a((ProxyChangeListener) this.f28460b, (Intent) this.f28461c);
                break;
        }
    }
}

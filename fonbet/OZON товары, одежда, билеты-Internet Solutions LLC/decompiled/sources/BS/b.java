package BS;

import androidx.lifecycle.AbstractC5434v;
import io.sentry.android.core.C7102c;
import java.util.List;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view.HotelsRoomsListV5View;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3285d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i11) {
        this.f3282a = i11;
        this.f3283b = obj;
        this.f3284c = obj2;
        this.f3285d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3282a) {
            case 0:
                ((HotelsRoomsListV5View) this.f3283b).checkOthersCardsHeight((List) this.f3284c, (AbstractC5434v) this.f3285d);
                break;
            default:
                C7102c.c((C7102c) this.f3283b, (Runnable) this.f3284c, (String) this.f3285d);
                break;
        }
    }
}

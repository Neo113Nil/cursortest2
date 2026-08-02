package AB;

import Ig.c;
import f5.AbstractC6430h;
import java.util.List;
import java.util.concurrent.Executor;
import ru.ozon.app.android.orderdetails.databinding.WidgetOrderTrackShipmentBinding;
import ru.ozon.app.android.orderdetails.trackshipment.presentation.OrderTrackShipmentVO;
import ru.ozon.app.android.orderdetails.trackshipment.presentation.OrderTrackShipmentViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f596c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f594a = i11;
        this.f595b = obj;
        this.f596c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f594a) {
            case 0:
                OrderTrackShipmentViewHolder.bind$lambda$2$lambda$0((WidgetOrderTrackShipmentBinding) this.f595b, (OrderTrackShipmentVO) this.f596c);
                break;
            case 1:
                c.a((c) this.f595b, (Throwable) this.f596c);
                break;
            case 2:
                ((Executor) this.f595b).execute((Runnable) this.f596c);
                break;
            default:
                AbstractC6430h.a((List) this.f595b, (AbstractC6430h) this.f596c);
                break;
        }
    }
}

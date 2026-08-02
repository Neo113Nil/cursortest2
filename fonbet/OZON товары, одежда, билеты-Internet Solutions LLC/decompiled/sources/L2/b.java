package L2;

import C2.r;
import E2.f;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import ru.ozon.app.android.product.utils.PinchToZoomTouchListener;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.container.TravelTabsContainer;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16227c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f16225a = i11;
        this.f16226b = obj;
        this.f16227c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16225a) {
            case 0:
                a this$0 = (a) this.f16226b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                JSONException e11 = (JSONException) this.f16227c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                r rVar = this$0.f16205f;
                if (rVar == null) {
                    Intrinsics.n("callback");
                    throw null;
                }
                String message = e11.getMessage();
                rVar.a((message == null || message.length() <= 0) ? new F2.a(new f(), "Unknown error") : new F2.a(new f(), message));
                return;
            case 1:
                PinchToZoomTouchListener.moveToOriginPosition$lambda$12((PinchToZoomTouchListener) this.f16226b, (View) this.f16227c);
                return;
            case 2:
                NativeBridgeConfigurator.q((NativeBridgeConfigurator) this.f16226b, (String) this.f16227c);
                return;
            default:
                TravelTabsContainer.submitData$lambda$3((List) this.f16226b, (TravelTabsContainer) this.f16227c);
                return;
        }
    }
}

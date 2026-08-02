package I;

import androidx.media3.ui.LegacyPlayerControlView;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter.PricesHistogramV2DaysAdapter;
import v.W1;

/* loaded from: classes8.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11271b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f11270a = i11;
        this.f11271b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11270a) {
            case 0:
                ((ScheduledFuture) this.f11271b).cancel(true);
                return;
            case 1:
                K2.a this$0 = (K2.a) this.f11271b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C2.r rVar = this$0.f15113f;
                if (rVar != null) {
                    rVar.a(new D2.k("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            case 2:
                ((PricesHistogramV2DaysAdapter) this.f11271b).notifyDataSetChanged();
                return;
            case 3:
                W1.b((W1) this.f11271b);
                return;
            default:
                ((LegacyPlayerControlView) this.f11271b).w();
                return;
        }
    }
}

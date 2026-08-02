package Kl;

import WZ.r;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16002b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16003c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f16001a = i11;
        this.f16002b = obj;
        this.f16003c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AnalyticsDataLayer sendEventAsync$lambda$3;
        switch (this.f16001a) {
            case 0:
                sendEventAsync$lambda$3 = BaseAnalyticsModule.sendEventAsync$lambda$3((Function1) this.f16002b, (BaseAnalyticsModule) this.f16003c);
                return sendEventAsync$lambda$3;
            default:
                return r.i((r) this.f16002b, (Map) this.f16003c);
        }
    }
}

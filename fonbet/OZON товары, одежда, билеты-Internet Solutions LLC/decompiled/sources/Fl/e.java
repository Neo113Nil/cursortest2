package Fl;

import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2AnalyticsListenerImpl;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.VideoBannerV2Events;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements o, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9509b;

    public /* synthetic */ e(Function1 function1, int i11) {
        this.f9508a = i11;
        this.f9509b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9508a) {
            case 1:
                this.f9509b.invoke(obj);
                break;
            default:
                this.f9509b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        VideoBannerV2Events playerProgressEvents$lambda$6;
        playerProgressEvents$lambda$6 = AdvVideoBannerV2AnalyticsListenerImpl.getPlayerProgressEvents$lambda$6(this.f9509b, obj);
        return playerProgressEvents$lambda$6;
    }
}

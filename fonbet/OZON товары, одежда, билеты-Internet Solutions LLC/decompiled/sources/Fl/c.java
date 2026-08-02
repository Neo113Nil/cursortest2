package Fl;

import io.reactivex.u;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2AnalyticsListenerImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements o, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9505b;

    public /* synthetic */ c(Function1 function1, int i11) {
        this.f9504a = i11;
        this.f9505b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9504a) {
            case 1:
                this.f9505b.invoke(obj);
                break;
            default:
                this.f9505b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        u playerProgressEvents$lambda$4;
        playerProgressEvents$lambda$4 = AdvVideoBannerV2AnalyticsListenerImpl.getPlayerProgressEvents$lambda$4(this.f9505b, obj);
        return playerProgressEvents$lambda$4;
    }
}

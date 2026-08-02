package Fl;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.analytics.AdvVideoBannerV2AnalyticsListenerImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements o, g, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9507b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f9506a = i11;
        this.f9507b = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f9506a) {
            case 1:
                this.f9507b.invoke(obj);
                break;
            case 2:
            default:
                this.f9507b.invoke(obj);
                break;
            case 3:
                this.f9507b.invoke(obj);
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Long playerProgressEvents$lambda$5;
        playerProgressEvents$lambda$5 = AdvVideoBannerV2AnalyticsListenerImpl.getPlayerProgressEvents$lambda$5(this.f9507b, obj);
        return playerProgressEvents$lambda$5;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f9507b.invoke(obj);
    }
}

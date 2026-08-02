package Hl;

import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.ads.data.messaging.AdvertisingMessagingInteractorImpl;
import ru.ozon.app.android.ads.data.models.AdvertisingClientInfo;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2PlayerBinder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener;

/* renamed from: Hl.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3165a implements OnFinishPlayerControllerListener, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f11208a;

    public /* synthetic */ C3165a(Object obj) {
        this.f11208a = obj;
    }

    @Override // qc.o
    public Object apply(Object obj) {
        AdvertisingClientInfo advertisingInfoObservable$lambda$1;
        advertisingInfoObservable$lambda$1 = AdvertisingMessagingInteractorImpl.advertisingInfoObservable$lambda$1((Function1) this.f11208a, obj);
        return advertisingInfoObservable$lambda$1;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener
    public void onFinish() {
        AdvVideoBannerV2PlayerBinder.playerListener$lambda$5$lambda$0((AdvVideoBannerV2PlayerBinder) this.f11208a);
    }
}

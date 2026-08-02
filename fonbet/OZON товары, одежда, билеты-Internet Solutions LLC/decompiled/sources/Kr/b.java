package Kr;

import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2PlayerBinder;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements qc.g, OnReadyPlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16033b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f16032a = i11;
        this.f16033b = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f16032a) {
            case 0:
                ((Function1) this.f16033b).invoke(obj);
                break;
            case 1:
                ((Function1) this.f16033b).invoke(obj);
                break;
            default:
                ((Function1) this.f16033b).invoke(obj);
                break;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
    public void onReady(PlayerState playerState) {
        AdvVideoBannerV2PlayerBinder.playerListener$lambda$5$lambda$4((AdvVideoBannerV2PlayerBinder) this.f16033b, playerState);
    }
}

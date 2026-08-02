package BY;

import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.app.android.videocover.VideoTileDelegate;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements OnErrorPlayerControllerListener, Ub0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3307a;

    public /* synthetic */ b(Object obj) {
        this.f3307a = obj;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        VideoTileDelegate.playerListener$lambda$8$lambda$4((VideoTileDelegate) this.f3307a, str, exc, bool);
    }
}

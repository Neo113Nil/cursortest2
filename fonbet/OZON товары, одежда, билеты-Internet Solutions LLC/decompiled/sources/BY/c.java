package BY;

import N3.C3655f;
import h4.C6798d;
import java.util.List;
import m3.C8050C;
import n3.C8436i;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.glide.loaders.CdnChooserUrlChecker;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener;
import ru.ozon.app.android.videocover.VideoTileDelegate;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements OnFinishPlayerControllerListener, C8436i.b, CdnChooserUrlChecker.ImageRulesProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3308a;

    public /* synthetic */ c(Object obj) {
        this.f3308a = obj;
    }

    @Override // n3.C8436i.b
    public void c(long j11, C8050C c8050c) {
        C3655f.a(j11, c8050c, ((C6798d) this.f3308a).f64812J);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener
    public void onFinish() {
        VideoTileDelegate.playerListener$lambda$8$lambda$7((VideoTileDelegate) this.f3308a);
    }

    @Override // ru.ozon.app.android.pikazon.glide.loaders.CdnChooserUrlChecker.ImageRulesProvider
    public List provide() {
        List cdnChooserUrlChecker$lambda$0;
        cdnChooserUrlChecker$lambda$0 = Pikazon.cdnChooserUrlChecker$lambda$0((Pikazon) this.f3308a);
        return cdnChooserUrlChecker$lambda$0;
    }
}

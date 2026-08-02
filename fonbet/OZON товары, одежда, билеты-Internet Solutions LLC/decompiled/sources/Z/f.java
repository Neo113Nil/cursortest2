package Z;

import B90.C;
import android.media.MediaFormat;
import android.media.metrics.TrackChangeEvent;
import androidx.media3.ui.PlayerView;
import d0.InterfaceC5999j;
import d0.InterfaceC6000k;
import java.util.List;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.storage.FileSource;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselView;
import u3.N;
import w2.C10411b;
import w2.C10416g;

/* loaded from: classes8.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35224c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f35222a = i11;
        this.f35223b = obj;
        this.f35224c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileSource fileSource;
        switch (this.f35222a) {
            case 0:
                m.a((m) this.f35223b, (InterfaceC5999j.a) this.f35224c);
                break;
            case 1:
                ((InterfaceC6000k) this.f35223b).c(new C((MediaFormat) this.f35224c));
                break;
            case 2:
                StoryV3MediaFragment.showVideo$lambda$17$lambda$16$lambda$15$lambda$14((StoryV3MediaFragment) this.f35223b, (PlayerView) this.f35224c);
                break;
            case 3:
                fileSource = ((OfflineManager) this.f35223b).f79968a;
                fileSource.deactivate();
                ((Le0.q) this.f35224c).onSuccess();
                break;
            case 4:
                ((ServicePackageCarouselView) this.f35223b).scrollToSelectedItem((List) this.f35224c);
                break;
            case 5:
                ((N) this.f35223b).f99771d.reportTrackChangeEvent((TrackChangeEvent) this.f35224c);
                break;
            default:
                C10416g c10416g = (C10416g) this.f35223b;
                c10416g.b().bringToFront();
                ((C10411b.d) this.f35224c).b(c10416g);
                break;
        }
    }
}

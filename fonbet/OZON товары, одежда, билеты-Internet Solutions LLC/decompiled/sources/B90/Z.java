package B90;

import androidx.concurrent.futures.b;
import androidx.preference.Preference;
import java.util.concurrent.atomic.AtomicReference;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricVideoViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class Z implements Preference.d, OnRenderedFirstFramePlayerControllerListener, b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3130b;

    public /* synthetic */ Z(Object obj, int i11) {
        this.f3129a = i11;
        this.f3130b = obj;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((AtomicReference) this.f3130b).set(aVar);
        return "acquireInputBuffer";
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.H((FintechPreferencesFragment) this.f3130b);
        return true;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        switch (this.f3129a) {
            case 1:
                MediaCentricVideoViewHolder.playerListener$lambda$6$lambda$0((MediaCentricVideoViewHolder) this.f3130b);
                break;
            default:
                ReviewGalleryV2EventsDelegate.playerListener$lambda$7$lambda$2((ReviewGalleryV2EventsDelegate) this.f3130b);
                break;
        }
    }
}

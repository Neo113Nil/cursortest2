package B90;

import androidx.concurrent.futures.b;
import androidx.preference.Preference;
import java.util.concurrent.atomic.AtomicReference;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoDelegate;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class S implements Preference.d, OnErrorPlayerControllerListener, b.c, OnRenderedFirstFramePlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3119a;

    public /* synthetic */ S(Object obj) {
        this.f3119a = obj;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((AtomicReference) this.f3119a).set(aVar);
        return "Data closed";
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.F((FintechPreferencesFragment) this.f3119a);
        return true;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        ReviewsPreviewVideoDelegate.playerListener$lambda$3$lambda$2((ReviewsPreviewVideoDelegate) this.f3119a, str, exc, bool);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        StoryMediaFragment.showVideo$lambda$32$lambda$31$lambda$30((StoryMediaFragment) this.f3119a);
    }
}

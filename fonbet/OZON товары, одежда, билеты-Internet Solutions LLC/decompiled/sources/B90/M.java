package B90;

import android.view.View;
import androidx.concurrent.futures.b;
import androidx.core.app.u;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ru.ozon.app.android.miniapp.webview.MiniAppWebView;
import ru.ozon.app.android.returns.ui.utils.KeyboardScrollToTargetHelper;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import w2.C10411b;

/* loaded from: classes3.dex */
public final /* synthetic */ class M implements Preference.d, b.c, androidx.core.view.D, HasAudioPlayerControllerListener, u.a, C10411b.c, SwipeRefreshLayout.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3113b;

    public /* synthetic */ M(Object obj, int i11) {
        this.f3112a = i11;
        this.f3113b = obj;
    }

    @Override // w2.C10411b.c
    public boolean b() {
        boolean launchSplashScreen$lambda$2$lambda$0;
        launchSplashScreen$lambda$2$lambda$0 = OzonTravelActivity.launchSplashScreen$lambda$2$lambda$0((OzonTravelActivity) this.f3113b);
        return launchSplashScreen$lambda$2$lambda$0;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((E.Q) this.f3113b).f6839f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.k0((FintechPreferencesFragment) this.f3113b);
        return true;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener
    public void hasAudio(boolean z11) {
        switch (this.f3112a) {
            case 3:
                HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$7((HotelsGalleryVideoPlayer) this.f3113b, z11);
                break;
            default:
                ((StoryMediaFragment) this.f3113b).bindMuteButton(z11);
                break;
        }
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$0;
        insetsListener$lambda$0 = KeyboardScrollToTargetHelper.getInsetsListener$lambda$0((KeyboardScrollToTargetHelper) this.f3113b, view, c5353y0);
        return insetsListener$lambda$0;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ((MiniAppWebView) this.f3113b).refresh();
    }
}

package B90;

import androidx.preference.Preference;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.l;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Preference.d, HasAudioPlayerControllerListener, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3188a;

    public /* synthetic */ r(Object obj) {
        this.f3188a = obj;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.C((FintechPreferencesFragment) this.f3188a);
        return true;
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        return ((SentryAndroidOptions) this.f3188a).getExecutorService();
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener
    public void hasAudio(boolean z11) {
        VideoMoleculeViewHolder.playerListener$lambda$11$lambda$2((VideoMoleculeViewHolder) this.f3188a, z11);
    }
}

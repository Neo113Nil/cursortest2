package B90;

import android.os.Bundle;
import androidx.preference.Preference;
import java.io.Serializable;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.B;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingDelegateImpl;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class D implements Preference.c, OnBufferPlayerControllerListener, HasAudioPlayerControllerListener, B.a, androidx.fragment.app.M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3100a;

    public /* synthetic */ D(Object obj) {
        this.f3100a = obj;
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference, Serializable serializable) {
        FintechPreferencesFragment.d0((FintechPreferencesFragment) this.f3100a);
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        NotificationOnboardingDelegateImpl.setFragmentResultListener$lambda$0((NotificationOnboardingDelegateImpl) this.f3100a, str, bundle);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener
    public void hasAudio(boolean z11) {
        VideoMoleculeViewHolder.playerListener$lambda$12$lambda$3((VideoMoleculeViewHolder) this.f3100a, z11);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
    public void onBuffer() {
        StoryV3MediaFragment.showVideo$lambda$17$lambda$16$lambda$11((StoryV3MediaFragment) this.f3100a);
    }
}

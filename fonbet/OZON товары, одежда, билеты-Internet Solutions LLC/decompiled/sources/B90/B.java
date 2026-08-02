package B90;

import android.os.Bundle;
import androidx.camera.core.h;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.preference.Preference;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity;
import ru.ozon.app.android.pdp.ui.configurators.ugc.selections.RefreshSelectionConfigurator;
import ru.ozon.app.android.storefront.core.atoms.views.RangeFilterView;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener;
import ru.ozon.fintech.features.camera.domain.scanner.base.FintechBaseImageAnalyzer;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import s6.InterfaceC9602b;

/* loaded from: classes3.dex */
public final /* synthetic */ class B implements Preference.d, h.a, androidx.fragment.app.M, InterfaceC9602b, HasAudioPlayerControllerListener, xZ.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3098a;

    public /* synthetic */ B(Object obj) {
        this.f3098a = obj;
    }

    @Override // s6.InterfaceC9602b
    public void a(Number number, Number number2) {
        RangeFilterView._init_$lambda$1((RangeFilterView) this.f3098a, number, number2);
    }

    @Override // androidx.camera.core.h.a
    public void analyze(androidx.camera.core.p pVar) {
        ((FintechBaseImageAnalyzer) this.f3098a).analyze(pVar);
    }

    @Override // xZ.i
    public ComponentCallbacksC5392m create() {
        ComponentCallbacksC5392m handleNavigation$lambda$3;
        handleNavigation$lambda$3 = OzonFreshActivity.handleNavigation$lambda$3((String) this.f3098a);
        return handleNavigation$lambda$3;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.q0((FintechPreferencesFragment) this.f3098a);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        RefreshSelectionConfigurator.setRefreshResultListener$lambda$0((RefreshSelectionConfigurator) this.f3098a, str, bundle);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener
    public void hasAudio(boolean z11) {
        ((StoryV3MediaFragment) this.f3098a).bindMuteButton(z11);
    }
}

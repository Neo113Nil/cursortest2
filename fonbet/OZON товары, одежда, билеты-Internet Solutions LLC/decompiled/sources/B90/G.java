package B90;

import androidx.preference.Preference;
import io.sentry.InterfaceC7217w1;
import io.sentry.e3;
import java.io.Serializable;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class G implements Preference.c, InterfaceC7217w1, OnErrorPlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3105a;

    public /* synthetic */ G(Object obj) {
        this.f3105a = obj;
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference, Serializable serializable) {
        FintechPreferencesFragment.M((FintechPreferencesFragment) this.f3105a);
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(io.sentry.U u11) {
        e3 e3Var = (e3) this.f3105a;
        e3Var.getClass();
        u11.t(e3Var);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        VideoMoleculeViewHolder.playerListener$lambda$12$lambda$7((VideoMoleculeViewHolder) this.f3105a, str, exc, bool);
    }
}

package B90;

import androidx.preference.Preference;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2608j implements Preference.d, OnFinishPlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3161a;

    public /* synthetic */ C2608j(Object obj) {
        this.f3161a = obj;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.g0((FintechPreferencesFragment) this.f3161a);
        return true;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener
    public void onFinish() {
        VideoMoleculeViewHolder.playerListener$lambda$11$lambda$7((VideoMoleculeViewHolder) this.f3161a);
    }
}

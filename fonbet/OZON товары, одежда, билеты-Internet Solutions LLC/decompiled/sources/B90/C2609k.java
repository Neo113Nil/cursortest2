package B90;

import androidx.credentials.playservices.HiddenActivity;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnFailureListener;
import m3.InterfaceC8068j;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStopPlayerControllerListener;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2609k implements Preference.d, OnStopPlayerControllerListener, OnFailureListener, InterfaceC8068j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3164a;

    public /* synthetic */ C2609k(Object obj) {
        this.f3164a = obj;
    }

    @Override // m3.InterfaceC8068j
    public void accept(Object obj) {
        k4.l.g((k4.l) this.f3164a, (k4.c) obj);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.n0((FintechPreferencesFragment) this.f3164a);
        return true;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.c((HiddenActivity) this.f3164a, exc);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStopPlayerControllerListener
    public void onStop() {
        VideoMoleculeViewHolder.playerListener$lambda$11$lambda$8((VideoMoleculeViewHolder) this.f3164a);
    }
}

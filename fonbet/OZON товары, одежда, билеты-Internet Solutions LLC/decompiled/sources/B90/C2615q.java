package B90;

import a50.C4950b;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.credentials.playservices.HiddenActivity;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnFailureListener;
import p3.InterfaceC8846f;
import ru.ozon.app.android.common.filterWidgets.filters.configurators.FiltersKeyboardInsetConfigurator;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2615q implements Preference.d, androidx.core.view.D, OnFailureListener, OnFinishPlayerControllerListener, InterfaceC8846f.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3185b;

    public /* synthetic */ C2615q(Object obj, int i11) {
        this.f3184a = i11;
        this.f3185b = obj;
    }

    @Override // p3.InterfaceC8846f.a
    public InterfaceC8846f createDataSource() {
        return C4950b.t((C4950b) this.f3185b);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.Q((FintechPreferencesFragment) this.f3185b);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$0;
        C5353y0 insetsListener$lambda$3;
        switch (this.f3184a) {
            case 1:
                insetsListener$lambda$0 = InputSubmitViewHolder.insetsListener$lambda$0((InputSubmitViewHolder) this.f3185b, view, c5353y0);
                return insetsListener$lambda$0;
            default:
                insetsListener$lambda$3 = FiltersKeyboardInsetConfigurator.insetsListener$lambda$3((FiltersKeyboardInsetConfigurator) this.f3185b, view, c5353y0);
                return insetsListener$lambda$3;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.a((HiddenActivity) this.f3185b, exc);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener
    public void onFinish() {
        GalleryVideoPlayer.playerListener$lambda$6$lambda$5((GalleryVideoPlayer) this.f3185b);
    }
}

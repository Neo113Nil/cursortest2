package B90;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nl0.InterfaceC8605e;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputsDelegate;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.appupdate.errors.RuStoreInstallException;

/* loaded from: classes3.dex */
public final /* synthetic */ class X implements Preference.c, androidx.core.view.D, HasAudioPlayerControllerListener, InterfaceC8605e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3127a;

    public /* synthetic */ X(Object obj) {
        this.f3127a = obj;
    }

    @Override // androidx.preference.Preference.c
    public void b(Preference preference, Serializable serializable) {
        FintechPreferencesFragment.y((FintechPreferencesFragment) this.f3127a);
    }

    @Override // nl0.InterfaceC8605e
    public void c(ru.rustore.sdk.activitylauncher.a launcherResult) {
        Intrinsics.checkNotNullParameter(launcherResult, "launcherResult");
        boolean equals = launcherResult.equals(a.C2157a.f97948b);
        lm0.e eVar = (lm0.e) this.f3127a;
        if (equals) {
            eVar.a(new wl0.e());
            return;
        }
        if (launcherResult instanceof a.d ? true : launcherResult.equals(a.e.f97952b) ? true : launcherResult.equals(a.f.f97953b)) {
            eVar.a(new RuStoreInstallException(launcherResult.a()));
            return;
        }
        if (launcherResult.equals(a.c.f97950b) ? true : launcherResult.equals(a.b.f97949b)) {
            eVar.b(Unit.f71690a);
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.HasAudioPlayerControllerListener
    public void hasAudio(boolean z11) {
        ReviewGalleryV2EventsDelegate.playerListener$lambda$7$lambda$0((ReviewGalleryV2EventsDelegate) this.f3127a, z11);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$1;
        insetsListener$lambda$1 = SelectionFormInputsDelegate.insetsListener$lambda$1((SelectionFormInputsDelegate) this.f3127a, view, c5353y0);
        return insetsListener$lambda$1;
    }
}

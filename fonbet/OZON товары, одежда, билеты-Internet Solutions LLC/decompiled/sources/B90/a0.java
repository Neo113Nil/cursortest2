package B90;

import a7.b;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nl0.InterfaceC8605e;
import qc.InterfaceC9021c;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input.FeedbackInputV2ViewHolder;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricVideoViewHolder;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.appupdate.errors.RuStoreInstallException;

/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Preference.d, OnReadyPlayerControllerListener, InterfaceC9021c, b.a, InterfaceC8605e, androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3134b;

    public /* synthetic */ a0(Object obj, int i11) {
        this.f3133a = i11;
        this.f3134b = obj;
    }

    @Override // qc.InterfaceC9021c
    public Object apply(Object obj, Object obj2) {
        LocalStateActualizer.ActualizingResult actualizeLocalState$lambda$0;
        actualizeLocalState$lambda$0 = LocalStateActualizer.actualizeLocalState$lambda$0((Function2) this.f3134b, obj, obj2);
        return actualizeLocalState$lambda$0;
    }

    @Override // nl0.InterfaceC8605e
    public void c(ru.rustore.sdk.activitylauncher.a launcherResult) {
        Intrinsics.checkNotNullParameter(launcherResult, "launcherResult");
        boolean equals = launcherResult instanceof a.d ? true : launcherResult.equals(a.e.f97952b) ? true : launcherResult.equals(a.f.f97953b) ? true : launcherResult.equals(a.C2157a.f97948b);
        lm0.e eVar = (lm0.e) this.f3134b;
        if (equals) {
            eVar.a(new RuStoreInstallException(launcherResult.a()));
            return;
        }
        if (launcherResult.equals(a.b.f97949b) ? true : launcherResult.equals(a.c.f97950b)) {
            eVar.b(Integer.valueOf(launcherResult.a()));
        }
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.h0((FintechPreferencesFragment) this.f3134b);
        return true;
    }

    @Override // a7.b.a
    public Object execute() {
        ((Y6.m) this.f3134b).f34686i.d();
        return null;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$0;
        insetsListener$lambda$0 = FeedbackInputV2ViewHolder.insetsListener$lambda$0((FeedbackInputV2ViewHolder) this.f3134b, view, c5353y0);
        return insetsListener$lambda$0;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
    public void onReady(PlayerState playerState) {
        switch (this.f3133a) {
            case 1:
                MediaCentricVideoViewHolder.playerListener$lambda$6$lambda$1((MediaCentricVideoViewHolder) this.f3134b, playerState);
                break;
            default:
                ReviewGalleryV2EventsDelegate.playerListener$lambda$7$lambda$3((ReviewGalleryV2EventsDelegate) this.f3134b, playerState);
                break;
        }
    }
}

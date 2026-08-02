package B90;

import Ve.C4538pm;
import android.location.Location;
import androidx.concurrent.futures.b;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class L implements Preference.d, b.c, OnFinishPlayerControllerListener, OnSuccessListener, K80.k, xZ.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3111a;

    public /* synthetic */ L(Object obj) {
        this.f3111a = obj;
    }

    @Override // K80.k
    public void a(Location location) {
        c30.i.a((c30.i) this.f3111a, location);
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((E.Q) this.f3111a).f6838e = aVar;
        return "CaptureCompleteFuture";
    }

    @Override // xZ.i
    public ComponentCallbacksC5392m create() {
        ComponentCallbacksC5392m handleNavigation$lambda$3;
        handleNavigation$lambda$3 = OzonTravelActivity.handleNavigation$lambda$3((String) this.f3111a);
        return handleNavigation$lambda$3;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.s0((FintechPreferencesFragment) this.f3111a);
        return true;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener
    public void onFinish() {
        HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$6((HotelsGalleryVideoPlayer) this.f3111a);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        C4538pm tmp0 = (C4538pm) this.f3111a;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.getClass();
        Unit unit = Unit.f71690a;
    }
}

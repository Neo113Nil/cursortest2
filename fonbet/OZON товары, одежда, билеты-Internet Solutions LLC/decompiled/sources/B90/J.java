package B90;

import android.os.Bundle;
import androidx.preference.Preference;
import j3.y;
import java.util.List;
import m3.r;
import ru.ozon.app.android.checkoutui.configurators.CheckoutRefreshConfigurator;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class J implements Preference.d, androidx.fragment.app.M, OnReadyPlayerControllerListener, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3109a;

    public /* synthetic */ J(Object obj) {
        this.f3109a = obj;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.t0((FintechPreferencesFragment) this.f3109a);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        CheckoutRefreshConfigurator.setRefreshResultListener$lambda$1((CheckoutRefreshConfigurator) this.f3109a, str, bundle);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((y.c) obj).t((List) this.f3109a);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
    public void onReady(PlayerState playerState) {
        HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$3((HotelsGalleryVideoPlayer) this.f3109a, playerState);
    }
}

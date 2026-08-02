package B90;

import N3.AbstractC3654e;
import N3.C3655f;
import androidx.preference.Preference;
import d80.C6102c;
import m3.C8050C;
import n3.C8436i;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class K implements Preference.d, OnStartPlayerControllerListener, AbstractC3654e.d, E6.d, C8436i.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3110a;

    public /* synthetic */ K(Object obj) {
        this.f3110a = obj;
    }

    @Override // N3.AbstractC3654e.d
    public long a(long j11) {
        return m3.N.j((j11 * r0.f18657e) / 1000000, 0L, ((N3.y) this.f3110a).f18662j - 1);
    }

    @Override // E6.d
    public void b(float f7, float f11, float f12) {
        C6102c.t((C6102c) this.f3110a);
    }

    @Override // n3.C8436i.b
    public void c(long j11, C8050C c8050c) {
        C3655f.a(j11, c8050c, ((u4.E) this.f3110a).f99920b);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.u0((FintechPreferencesFragment) this.f3110a);
        return true;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
    public void onStart(PlayerState playerState) {
        HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$4((HotelsGalleryVideoPlayer) this.f3110a, playerState);
    }
}

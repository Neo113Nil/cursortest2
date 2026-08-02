package B90;

import S0.InterfaceC3978p0;
import androidx.preference.Preference;
import io.sentry.InterfaceC7217w1;
import j3.C7255K;
import j3.y;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m3.r;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.single.PlayerShowcaseSingleComposableKt;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.storefront.core.atoms.views.TimeRangeFilterView;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import s6.InterfaceC9602b;
import u3.InterfaceC9928b;

/* loaded from: classes3.dex */
public final /* synthetic */ class F implements Preference.d, OnReadyPlayerControllerListener, InterfaceC9602b, InterfaceC7217w1, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3104b;

    public /* synthetic */ F(Object obj, int i11) {
        this.f3103a = i11;
        this.f3104b = obj;
    }

    @Override // s6.InterfaceC9602b
    public void a(Number number, Number number2) {
        TimeRangeFilterView.setUpTimeRangeSeekbar$lambda$3((TimeRangeFilterView) this.f3104b, number, number2);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.o0((FintechPreferencesFragment) this.f3104b);
        return true;
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(io.sentry.U u11) {
        ((AtomicReference) this.f3104b).set(u11.y());
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        switch (this.f3103a) {
            case 5:
                ((y.c) obj).f0((C7255K) this.f3104b);
                break;
            default:
                ((InterfaceC9928b) obj).getClass();
                break;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
    public void onReady(PlayerState playerState) {
        switch (this.f3103a) {
            case 1:
                PlayerShowcaseSingleComposableKt.PlayerCell$lambda$14$lambda$13$lambda$12((InterfaceC3978p0) this.f3104b, playerState);
                break;
            default:
                VideoMoleculeViewHolder.playerListener$lambda$12$lambda$6((VideoMoleculeViewHolder) this.f3104b, playerState);
                break;
        }
    }

    public /* synthetic */ F(InterfaceC9928b.a aVar, List list) {
        this.f3103a = 6;
        this.f3104b = list;
    }
}

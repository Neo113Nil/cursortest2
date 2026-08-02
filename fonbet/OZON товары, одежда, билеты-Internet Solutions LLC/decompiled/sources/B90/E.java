package B90;

import S0.InterfaceC3978p0;
import androidx.concurrent.futures.b;
import androidx.preference.Preference;
import io.sentry.e3;
import io.sentry.i3;
import io.sentry.k3;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import qc.InterfaceC9021c;
import ru.ozon.app.android.checkoutgeo.location.system.SystemLocationDataSourceImpl;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.single.PlayerShowcaseSingleComposableKt;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.storefront.core.atoms.views.TimeRangeFilterView;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import s6.InterfaceC9601a;

/* loaded from: classes3.dex */
public final /* synthetic */ class E implements Preference.d, OnBufferPlayerControllerListener, InterfaceC9601a, b.c, OnReadyPlayerControllerListener, k3, io.reactivex.B, InterfaceC9021c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3102b;

    public /* synthetic */ E(Object obj, int i11) {
        this.f3101a = i11;
        this.f3102b = obj;
    }

    @Override // s6.InterfaceC9601a
    public void a(Number number, Number number2) {
        TimeRangeFilterView.setUpTimeRangeSeekbar$lambda$2((TimeRangeFilterView) this.f3102b, number, number2);
    }

    @Override // qc.InterfaceC9021c
    public Object apply(Object obj, Object obj2) {
        Pair onAttach$lambda$2;
        onAttach$lambda$2 = OtherSellerViewHolder.onAttach$lambda$2((Function2) this.f3102b, obj, obj2);
        return onAttach$lambda$2;
    }

    @Override // io.reactivex.B
    public void b(io.reactivex.z zVar) {
        SystemLocationDataSourceImpl.requestSingleLocation$lambda$0((SystemLocationDataSourceImpl) this.f3102b, zVar);
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((AtomicReference) this.f3102b).set(aVar);
        return "Terminate InputBuffer";
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.p0((FintechPreferencesFragment) this.f3102b);
        return true;
    }

    @Override // io.sentry.k3
    public void e(i3 i3Var) {
        e3.t((e3) this.f3102b, i3Var);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
    public void onBuffer() {
        switch (this.f3101a) {
            case 1:
                PlayerShowcaseSingleComposableKt.PlayerCell$lambda$9((InterfaceC3978p0) this.f3102b, true);
                break;
            default:
                VideoMoleculeViewHolder.playerListener$lambda$12$lambda$5((VideoMoleculeViewHolder) this.f3102b);
                break;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
    public void onReady(PlayerState playerState) {
        StoryV3MediaFragment.showVideo$lambda$17$lambda$16$lambda$13((StoryV3MediaFragment) this.f3102b, playerState);
    }
}

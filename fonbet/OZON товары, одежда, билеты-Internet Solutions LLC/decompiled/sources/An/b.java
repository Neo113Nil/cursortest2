package An;

import S0.InterfaceC3978p0;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.preference.Preference;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import io.sentry.d3;
import io.sentry.e3;
import kotlin.jvm.functions.Function2;
import qc.d;
import ru.ozon.app.android.cart.configurator.CartKeyboardInsetConfigurator;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.single.PlayerShowcaseSingleComposableKt;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.tooltip.TooltipView;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements D, Preference.d, d, OnRenderedFirstFramePlayerControllerListener, OnErrorPlayerControllerListener, InterfaceC7217w1, OnStartPlayerControllerListener, TooltipView.OnTooltipOutsideTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1248a;

    public /* synthetic */ b(Object obj) {
        this.f1248a = obj;
    }

    @Override // qc.d
    public boolean a(Object obj, Object obj2) {
        boolean _init_$lambda$0;
        _init_$lambda$0 = AddressEditMapViewModelImpl._init_$lambda$0((Function2) this.f1248a, obj, obj2);
        return _init_$lambda$0;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.x((FintechPreferencesFragment) this.f1248a);
        return true;
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U u11) {
        u11.L(new d3((e3) this.f1248a, u11));
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$2;
        insetsListener$lambda$2 = CartKeyboardInsetConfigurator.insetsListener$lambda$2((CartKeyboardInsetConfigurator) this.f1248a, view, c5353y0);
        return insetsListener$lambda$2;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        StoryV3MediaFragment.showVideo$lambda$17$lambda$16$lambda$12((StoryV3MediaFragment) this.f1248a, str, exc, bool);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        PlayerShowcaseSingleComposableKt.PlayerCell$lambda$6((InterfaceC3978p0) this.f1248a, false);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
    public void onStart(PlayerState playerState) {
        VideoMoleculeViewHolder.playerListener$lambda$12$lambda$4((VideoMoleculeViewHolder) this.f1248a, playerState);
    }
}

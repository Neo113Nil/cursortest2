package B90;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.functions.Function2;
import qc.InterfaceC9021c;
import ru.ozon.app.android.cart.ui.tooltip.internal.OnTooltipOutsideTouchListener;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.TimerTicker;
import ru.ozon.app.android.miniapp.MiniAppWebActivity;
import ru.ozon.app.android.miniapp.databinding.ActivityMiniAppWebBinding;
import ru.ozon.app.android.pdp.utils.views.touchview.TouchImageView;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnVideoSizeChangedPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import w2.C10411b;
import w2.C10416g;

/* loaded from: classes3.dex */
public final /* synthetic */ class N implements Preference.d, OnVideoSizeChangedPlayerControllerListener, OnTooltipOutsideTouchListener, TouchImageView.OnTouchImageViewListener, InterfaceC9021c, Toolbar.h, C10411b.d, SwipeRefreshLayout.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3114a;

    public /* synthetic */ N(Object obj) {
        this.f3114a = obj;
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean a(androidx.appcompat.view.menu.i iVar) {
        boolean _init_$lambda$10;
        _init_$lambda$10 = FinToolbarView._init_$lambda$10((FinToolbarView) this.f3114a, iVar);
        return _init_$lambda$10;
    }

    @Override // qc.InterfaceC9021c
    public Object apply(Object obj, Object obj2) {
        Object ticker$lambda$0;
        ticker$lambda$0 = TimerTicker.ticker$lambda$0((Function2) this.f3114a, obj, obj2);
        return ticker$lambda$0;
    }

    @Override // w2.C10411b.d
    public void b(C10416g c10416g) {
        OzonTravelActivity.launchSplashScreen$lambda$2$lambda$1((OzonTravelActivity) this.f3114a, c10416g);
    }

    public boolean c(SwipeRefreshLayout swipeRefreshLayout, View view) {
        boolean initWebView$lambda$1$lambda$0;
        initWebView$lambda$1$lambda$0 = MiniAppWebActivity.initWebView$lambda$1$lambda$0((ActivityMiniAppWebBinding) this.f3114a, swipeRefreshLayout, view);
        return initWebView$lambda$1$lambda$0;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.V((FintechPreferencesFragment) this.f3114a);
        return true;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnVideoSizeChangedPlayerControllerListener
    public void onVideoSizeChanged(j3.Q q11) {
        HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$8((HotelsGalleryVideoPlayer) this.f3114a, q11);
    }
}

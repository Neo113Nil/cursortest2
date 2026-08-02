package B90;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.PdpGalleryPagerIndicator;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.pagerindicator.ViewPagerWrapper;
import ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter.OpenRangeFilterView;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricVideoViewHolder;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import s6.InterfaceC9601a;

/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Preference.d, OnStartPlayerControllerListener, InterfaceC9601a, androidx.core.view.D, ViewPagerWrapper.OnPageChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3137b;

    public /* synthetic */ b0(Object obj, int i11) {
        this.f3136a = i11;
        this.f3137b = obj;
    }

    @Override // s6.InterfaceC9601a
    public void a(Number number, Number number2) {
        OpenRangeFilterView.setUpSeekbar$lambda$6$lambda$3((OpenRangeFilterView) this.f3137b, number, number2);
    }

    public void b(int i11) {
        PdpGalleryPagerIndicator.pagerListener$lambda$1((PdpGalleryPagerIndicator) this.f3137b, i11);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.r0((FintechPreferencesFragment) this.f3137b);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 onViewCreated$lambda$3;
        onViewCreated$lambda$3 = ru.ozon.fintech.base.bottom.m.onViewCreated$lambda$3((ru.ozon.fintech.base.bottom.m) this.f3137b, view, c5353y0);
        return onViewCreated$lambda$3;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
    public void onStart(PlayerState playerState) {
        switch (this.f3136a) {
            case 1:
                MediaCentricVideoViewHolder.playerListener$lambda$6$lambda$2((MediaCentricVideoViewHolder) this.f3137b, playerState);
                break;
            default:
                ReviewGalleryV2EventsDelegate.playerListener$lambda$7$lambda$4((ReviewGalleryV2EventsDelegate) this.f3137b, playerState);
                break;
        }
    }
}

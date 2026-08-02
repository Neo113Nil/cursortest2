package E;

import C.s0;
import android.os.Bundle;
import androidx.camera.core.impl.InterfaceC5104l0;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.media3.ui.PlayerView;
import ru.ozon.app.android.fakeOzon.tab.FakeOzonTabNavigationFragment;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.data.LocalTabConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5WidgetViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;

/* loaded from: classes8.dex */
public final /* synthetic */ class D implements InterfaceC5104l0.a, s0.e, OnBottomNavigationItemSelectedListener, androidx.fragment.app.M, OnRenderedFirstFramePlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6794b;

    public /* synthetic */ D(Object obj, Object obj2) {
        this.f6793a = obj;
        this.f6794b = obj2;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0.a
    public void a(InterfaceC5104l0 interfaceC5104l0) {
        E e11 = (E) this.f6793a;
        e11.getClass();
        ((InterfaceC5104l0.a) this.f6794b).a(e11);
    }

    @Override // C.s0.e
    public void c(s0.d dVar) {
        N.l.h((N.l) this.f6793a, (s0) this.f6794b, dVar);
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        AddHotelGuestsV5WidgetViewHolder.showSelector$lambda$5$lambda$4((AddHotelGuestsV5WidgetViewHolder) this.f6793a, (ComponentCallbacksC5392m) this.f6794b, str, bundle);
    }

    @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
    public boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
        boolean bindBottomNavigation$lambda$9;
        bindBottomNavigation$lambda$9 = FakeOzonTabNavigationFragment.bindBottomNavigation$lambda$9((LocalTabConfig) this.f6793a, (FakeOzonTabNavigationFragment) this.f6794b, bottomMenuItem, bottomMenuItem2);
        return bindBottomNavigation$lambda$9;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        StoryV3MediaFragment.showVideo$lambda$17$lambda$16$lambda$15((StoryV3MediaFragment) this.f6793a, (PlayerView) this.f6794b);
    }
}

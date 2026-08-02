package B90;

import androidx.preference.Preference;
import ru.ozon.app.android.fresh.navigation.FreshTabNavigationFragment;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener;
import ru.ozon.app.android.tabbar.ui.model.BottomMenuItem;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2614p implements Preference.d, OnBottomNavigationItemSelectedListener, OnStartPlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3181a;

    public /* synthetic */ C2614p(Object obj) {
        this.f3181a = obj;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.D((FintechPreferencesFragment) this.f3181a);
        return true;
    }

    @Override // ru.ozon.app.android.tabbar.OnBottomNavigationItemSelectedListener
    public boolean onItemSelectedItem(BottomMenuItem bottomMenuItem, BottomMenuItem bottomMenuItem2) {
        boolean tabsState$lambda$1;
        tabsState$lambda$1 = FreshTabNavigationFragment.setTabsState$lambda$1((FreshTabNavigationFragment) this.f3181a, bottomMenuItem, bottomMenuItem2);
        return tabsState$lambda$1;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
    public void onStart(PlayerState playerState) {
        GalleryVideoPlayer.playerListener$lambda$6$lambda$4((GalleryVideoPlayer) this.f3181a, playerState);
    }
}

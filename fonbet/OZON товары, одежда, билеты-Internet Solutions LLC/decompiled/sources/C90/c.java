package C90;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.common.collect.AbstractC5880y;
import m3.InterfaceC8068j;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements SwipeRefreshLayout.j, OnRenderedFirstFramePlayerControllerListener, InterfaceC8068j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4509a;

    public /* synthetic */ c(Object obj) {
        this.f4509a = obj;
    }

    @Override // m3.InterfaceC8068j
    public void accept(Object obj) {
        ((AbstractC5880y.a) this.f4509a).e((k4.c) obj);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        FintechLogCatFragment.u((FintechLogCatFragment) this.f4509a);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        GalleryVideoPlayer.playerListener$lambda$6$lambda$0((GalleryVideoPlayer) this.f4509a);
    }
}

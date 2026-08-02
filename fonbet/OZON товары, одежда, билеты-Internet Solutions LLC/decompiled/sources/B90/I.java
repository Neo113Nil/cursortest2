package B90;

import android.graphics.ColorFilter;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import ru.ozon.app.android.geo.map.presentation.views.AddressEditMapView;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2View;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class I implements Preference.d, androidx.core.view.D, OnRenderedFirstFramePlayerControllerListener, P5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3108b;

    public /* synthetic */ I(Object obj, int i11) {
        this.f3107a = i11;
        this.f3108b = obj;
    }

    @Override // P5.e
    public ColorFilter a(P5.b bVar) {
        ColorFilter changeModeAnimation$lambda$1;
        changeModeAnimation$lambda$1 = MessengerCounterV2View.changeModeAnimation$lambda$1((MessengerCounterV2View) this.f3108b, bVar);
        return changeModeAnimation$lambda$1;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.a0((FintechPreferencesFragment) this.f3108b);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 applyInsets$lambda$0;
        C5353y0 insetsListener$lambda$0;
        switch (this.f3107a) {
            case 1:
                applyInsets$lambda$0 = AddressEditMapView.applyInsets$lambda$0((AddressEditMapView) this.f3108b, view, c5353y0);
                return applyInsets$lambda$0;
            default:
                insetsListener$lambda$0 = ReviewFormCommentVH.insetsListener$lambda$0((ReviewFormCommentVH) this.f3108b, view, c5353y0);
                return insetsListener$lambda$0;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$0((HotelsGalleryVideoPlayer) this.f3108b);
    }
}

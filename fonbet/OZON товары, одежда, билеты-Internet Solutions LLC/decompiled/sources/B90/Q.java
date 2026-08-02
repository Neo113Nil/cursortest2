package B90;

import android.os.Build;
import android.os.Bundle;
import androidx.concurrent.futures.b;
import androidx.preference.Preference;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonFragment;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.video.ReviewsPreviewVideoDelegate;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class Q implements Preference.d, OnRenderedFirstFramePlayerControllerListener, androidx.fragment.app.M, b.c, OnReadyPlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3118b;

    public /* synthetic */ Q(Ti.i iVar, GalleryActivity galleryActivity) {
        this.f3117a = 2;
        this.f3118b = galleryActivity;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        ((AtomicReference) this.f3118b).set(aVar);
        return "Data closed";
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.B((FintechPreferencesFragment) this.f3118b);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        Hi.k kVar;
        Hi.a aVar;
        Object parcelable;
        Object parcelable2;
        switch (this.f3117a) {
            case 2:
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 33) {
                    parcelable2 = bundle.getParcelable("media_arg", Hi.k.class);
                    kVar = (Hi.k) parcelable2;
                } else {
                    kVar = (Hi.k) bundle.getParcelable("media_arg");
                }
                if (kVar != null) {
                    Intrinsics.checkNotNullParameter(bundle, "bundle");
                    if (i11 >= 33) {
                        parcelable = bundle.getParcelable("CAMERA_RESTORABLE_STATE_ARG", Hi.a.class);
                        aVar = (Hi.a) parcelable;
                    } else {
                        aVar = (Hi.a) bundle.getParcelable("CAMERA_RESTORABLE_STATE_ARG");
                    }
                    if (aVar != null) {
                        Bi.c result = new Bi.c(C7714v.a0(kVar), aVar);
                        List<? extends Hi.k> legacyMedia = C7714v.a0(kVar);
                        GalleryActivity activity = (GalleryActivity) this.f3118b;
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        Intrinsics.checkNotNullParameter(result, "result");
                        Intrinsics.checkNotNullParameter(legacyMedia, "legacyMedia");
                        activity.K(result, legacyMedia);
                        break;
                    }
                }
                break;
            default:
                CancelReasonFragment.setFragmentResultListener$lambda$17((CancelReasonFragment) this.f3118b, str, bundle);
                break;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
    public void onReady(PlayerState playerState) {
        StoryMediaFragment.showVideo$lambda$32$lambda$31$lambda$27((StoryMediaFragment) this.f3118b, playerState);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        ReviewsPreviewVideoDelegate.playerListener$lambda$3$lambda$1((ReviewsPreviewVideoDelegate) this.f3118b);
    }

    public /* synthetic */ Q(Object obj, int i11) {
        this.f3117a = i11;
        this.f3118b = obj;
    }
}

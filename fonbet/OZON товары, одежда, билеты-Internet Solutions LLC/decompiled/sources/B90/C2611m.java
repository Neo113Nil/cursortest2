package B90;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.credentials.playservices.HiddenActivity;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnFailureListener;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.input.FeedbackInputViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2611m implements Preference.d, OnFailureListener, OnErrorPlayerControllerListener, androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3171a;

    public /* synthetic */ C2611m(Object obj) {
        this.f3171a = obj;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.X((FintechPreferencesFragment) this.f3171a);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$0;
        insetsListener$lambda$0 = FeedbackInputViewHolder.insetsListener$lambda$0((FeedbackInputViewHolder) this.f3171a, view, c5353y0);
        return insetsListener$lambda$0;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        GalleryVideoPlayer.playerListener$lambda$6$lambda$1((GalleryVideoPlayer) this.f3171a, str, exc, bool);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.d((HiddenActivity) this.f3171a, exc);
    }
}

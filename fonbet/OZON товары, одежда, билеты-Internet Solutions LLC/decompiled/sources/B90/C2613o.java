package B90;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.credentials.playservices.HiddenActivity;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.material.bottomnavigation.c;
import io.sentry.K1;
import io.sentry.W2;
import io.sentry.android.core.SentryAndroidOptions;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2613o implements Preference.d, OnFailureListener, OnReadyPlayerControllerListener, c.InterfaceC0879c, androidx.core.view.D, E6.d, K1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3178b;

    public /* synthetic */ C2613o(Object obj, int i11) {
        this.f3177a = i11;
        this.f3178b = obj;
    }

    @Override // io.sentry.K1.a
    public void a(W2 w22) {
        SentryAndroidOptions options = (SentryAndroidOptions) w22;
        Intrinsics.checkNotNullParameter(options, "options");
        options.setDsn((String) this.f3178b);
    }

    @Override // E6.d
    public void b(float f7, float f11, float f12) {
        c80.b.t((c80.b) this.f3178b);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.W((FintechPreferencesFragment) this.f3178b);
        return true;
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 onViewCreated$lambda$9$lambda$8;
        C5353y0 upToolbar$lambda$3;
        switch (this.f3177a) {
            case 4:
                onViewCreated$lambda$9$lambda$8 = OnboardingSlidesV2Fragment.onViewCreated$lambda$9$lambda$8((OnboardingSlidesV2Fragment) this.f3178b, view, c5353y0);
                return onViewCreated$lambda$9$lambda$8;
            default:
                upToolbar$lambda$3 = BarcodeFragment.setUpToolbar$lambda$3((BarcodeFragment) this.f3178b, view, c5353y0);
                return upToolbar$lambda$3;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.b((HiddenActivity) this.f3178b, exc);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
    public void onReady(PlayerState playerState) {
        GalleryVideoPlayer.playerListener$lambda$6$lambda$3((GalleryVideoPlayer) this.f3178b, playerState);
    }
}

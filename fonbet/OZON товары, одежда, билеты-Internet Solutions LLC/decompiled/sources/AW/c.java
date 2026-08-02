package AW;

import android.view.View;
import androidx.camera.core.impl.InterfaceC5104l0;
import androidx.camera.core.impl.W;
import androidx.camera.core.s;
import androidx.concurrent.futures.b;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.preference.Preference;
import io.sentry.C7230z2;
import io.sentry.E;
import io.sentry.W2;
import j3.y;
import l3.C7856b;
import m3.r;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserViewHolder;
import ru.ozon.app.android.travel.feature.hotels.shared.player.HotelsGalleryVideoPlayer;
import ru.ozon.app.android.ugc.widgets.reviewTiles.presentation.ReviewTilesVideoDelegate;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements OnRenderedFirstFramePlayerControllerListener, Preference.d, InterfaceC5104l0.a, OnErrorPlayerControllerListener, b.c, W2.c, r.a, D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f673a;

    public /* synthetic */ c(Object obj) {
        this.f673a = obj;
    }

    @Override // androidx.camera.core.impl.InterfaceC5104l0.a
    public void a(InterfaceC5104l0 interfaceC5104l0) {
        s.i((s) this.f673a, interfaceC5104l0);
    }

    public C7230z2 b(C7230z2 c7230z2, E e11) {
        g30.d.g2((g30.d) this.f673a, c7230z2, e11);
        return c7230z2;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        return W.a((W) this.f673a, aVar);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.G((FintechPreferencesFragment) this.f673a);
        return true;
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((y.c) obj).x((C7856b) this.f673a);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$1;
        insetsListener$lambda$1 = VerificationEdoCheckingUserViewHolder.insetsListener$lambda$1((VerificationEdoCheckingUserViewHolder) this.f673a, view, c5353y0);
        return insetsListener$lambda$1;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        HotelsGalleryVideoPlayer.playerListener$lambda$9$lambda$1((HotelsGalleryVideoPlayer) this.f673a, str, exc, bool);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        ReviewTilesVideoDelegate.playerListener$lambda$2$lambda$0((ReviewTilesVideoDelegate) this.f673a);
    }
}

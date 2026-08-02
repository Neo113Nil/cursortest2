package FY;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.fragment.app.M;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewHolder;
import ru.ozon.app.android.storefront.domain.onboarding.presentation.OnboardingDelegateImpl;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements OnReadyPlayerControllerListener, D, M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9218a;

    public /* synthetic */ e(Object obj) {
        this.f9218a = obj;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        OnboardingDelegateImpl.setupFragmentResultListener$lambda$5((OnboardingDelegateImpl) this.f9218a, str, bundle);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$1;
        insetsListener$lambda$1 = ChangeEmailViewHolder.insetsListener$lambda$1((ChangeEmailViewHolder) this.f9218a, view, c5353y0);
        return insetsListener$lambda$1;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
    public void onReady(PlayerState playerState) {
        VideoMoleculeViewHolder.playerListener$lambda$11$lambda$5((VideoMoleculeViewHolder) this.f9218a, playerState);
    }
}

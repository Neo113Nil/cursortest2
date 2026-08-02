package B90;

import android.graphics.ColorSpace;
import android.os.Bundle;
import androidx.preference.Preference;
import h4.C6798d;
import m1.InterfaceC8038i;
import ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshAfterDismissAndPopPageConfigurator;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3Delegate;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import w2.C10411b;

/* renamed from: B90.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2606h implements Preference.d, OnRenderedFirstFramePlayerControllerListener, androidx.fragment.app.M, O7.e, InterfaceC8038i, C10411b.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3154b;

    public /* synthetic */ C2606h(Object obj, int i11) {
        this.f3153a = i11;
        this.f3154b = obj;
    }

    @Override // O7.e
    public Object apply(Object obj) {
        h4.o oVar = (h4.o) obj;
        ((C6798d) this.f3154b).getClass();
        return oVar;
    }

    @Override // w2.C10411b.c
    public boolean b() {
        return !((S80.b) this.f3154b).u0();
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        return ((ColorSpace.Rgb) ((ColorSpace) this.f3154b)).getEotf().applyAsDouble(d11);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.A((FintechPreferencesFragment) this.f3154b);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        switch (this.f3153a) {
            case 2:
                NotificationSubscriptionBannerV3Delegate.observeViewEffects$lambda$0((NotificationSubscriptionBannerV3Delegate) this.f3154b, str, bundle);
                break;
            default:
                RefreshAfterDismissAndPopPageConfigurator.setRefreshResultListener$lambda$0((RefreshAfterDismissAndPopPageConfigurator) this.f3154b, str, bundle);
                break;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        VideoMoleculeViewHolder.playerListener$lambda$11$lambda$10((VideoMoleculeViewHolder) this.f3154b);
    }
}

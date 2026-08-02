package B90;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.jvm.functions.Function2;
import qc.InterfaceC9021c;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeFragment;
import ru.ozon.app.android.marketing.common.coupon.CouponViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.storefront.stories.story.presentation.BaseStoryFragment;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton.ReviewSubmitButtonViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2612n implements Preference.d, OnBufferPlayerControllerListener, InterfaceC9021c, SwipeRefreshLayout.j, androidx.core.view.D, androidx.fragment.app.M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3174a;

    public /* synthetic */ C2612n(Object obj) {
        this.f3174a = obj;
    }

    @Override // qc.InterfaceC9021c
    public Object apply(Object obj, Object obj2) {
        CouponViewModelImpl.CouponActivation _init_$lambda$2;
        _init_$lambda$2 = CouponViewModelImpl._init_$lambda$2((Function2) this.f3174a, obj, obj2);
        return _init_$lambda$2;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.f0((FintechPreferencesFragment) this.f3174a);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        ReviewSubmitButtonViewHolder.setupDismissAndSubmitListener$lambda$0((ReviewSubmitButtonViewHolder) this.f3174a, str, bundle);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 onViewCreated$lambda$0;
        onViewCreated$lambda$0 = BaseStoryFragment.onViewCreated$lambda$0((BaseStoryFragment) this.f3174a, view, c5353y0);
        return onViewCreated$lambda$0;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnBufferPlayerControllerListener
    public void onBuffer() {
        GalleryVideoPlayer.playerListener$lambda$6$lambda$2((GalleryVideoPlayer) this.f3174a);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        BarcodeFragment.onViewCreated$lambda$1$lambda$0((BarcodeFragment) this.f3174a);
    }
}

package B90;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import com.google.android.gms.tasks.OnFailureListener;
import io.reactivex.InterfaceC7095c;
import q3.i;
import ru.ozon.app.android.checkoutgeo.location.GoogleLocationDataSourceImpl;
import ru.ozon.app.android.storefront.ui.tooltip.internal.OnTooltipOutsideTouchListener;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2EventsDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetView;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener;
import ru.ozon.app.android.web.TransparentNavbarWebFragment;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class Y implements Preference.d, i.a, androidx.core.view.D, OnFinishPlayerControllerListener, androidx.fragment.app.M, OnFailureListener, OnTooltipOutsideTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3128a;

    public /* synthetic */ Y(Object obj) {
        this.f3128a = obj;
    }

    @Override // q3.i.a
    public void a(long j11, long j12, long j13) {
        D3.t.b((D3.t) this.f3128a, j11, j12);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        Toast.makeText(((FintechPreferencesFragment) this.f3128a).requireContext().getApplicationContext(), "Пока нельзя скопировать", 0).show();
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        TileRelatedProductsBottomSheetView.setupFragmentResultListener$lambda$13((TileRelatedProductsBottomSheetView) this.f3128a, str, bundle);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 c5353y02;
        c5353y02 = TransparentNavbarWebFragment.setupWindowInsets$lambda$5((TransparentNavbarWebFragment) this.f3128a, view, c5353y0);
        return c5353y02;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GoogleLocationDataSourceImpl.asCompletable$lambda$7$lambda$6((InterfaceC7095c) this.f3128a, exc);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnFinishPlayerControllerListener
    public void onFinish() {
        ReviewGalleryV2EventsDelegate.playerListener$lambda$7$lambda$1((ReviewGalleryV2EventsDelegate) this.f3128a);
    }
}

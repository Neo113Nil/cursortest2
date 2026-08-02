package Xw;

import androidx.lifecycle.J;
import androidx.lifecycle.W;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.WidgetState;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay.BottomCartWidgetOverlayHolder;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitVH;
import ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModel;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f34503b;

    public /* synthetic */ a(J j11, int i11) {
        this.f34502a = i11;
        this.f34503b = j11;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Object obj) {
        switch (this.f34502a) {
            case 0:
                BottomCartWidgetOverlayHolder.observer$lambda$0((BottomCartWidgetOverlayHolder) this.f34503b, (WidgetState.NewState) obj);
                break;
            default:
                FormPageLandingLimitVH.onAttach$lambda$3((FormPageLandingLimitVH) this.f34503b, (LandingLimitViewModel.UiAction) obj);
                break;
        }
    }
}

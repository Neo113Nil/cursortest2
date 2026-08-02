package B50;

import L3.L;
import androidx.concurrent.futures.b;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3TextInputView;
import ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2939b;

    public /* synthetic */ l(Object obj, int i11) {
        this.f2938a = i11;
        this.f2939b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2938a) {
            case 0:
                StoriesFragment.doOpenAnimation$lambda$8((StoriesFragment) this.f2939b);
                break;
            case 1:
                ((L.a) this.f2939b).d();
                break;
            case 2:
                ((b.a) this.f2939b).e(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            case 3:
                AddNewPassengerFormV3TextInputView.bindSuggests$lambda$10((AddNewPassengerFormV3TextInputView) this.f2939b);
                break;
            default:
                ((RelatedProductsBottomSheetView) this.f2939b).onExternalTapEvent();
                break;
        }
    }
}

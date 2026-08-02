package I90;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.camera.domain.exchangerdata.QrBottomSheetResult;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12059b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f12058a = i11;
        this.f12059b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onStart$lambda$14;
        switch (this.f12058a) {
            case 0:
                return f.d0((f) this.f12059b, (ActionResult2) obj);
            case 1:
                return OfflinePayFragment.u((OfflinePayFragment) this.f12059b, (View) obj);
            case 2:
                onStart$lambda$14 = CameraViewModel.onStart$lambda$14((CameraViewModel) this.f12059b, (QrBottomSheetResult) obj);
                return onStart$lambda$14;
            default:
                return z90.e.l0((z90.e) this.f12059b);
        }
    }
}

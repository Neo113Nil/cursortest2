package B50;

import androidx.lifecycle.z0;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.tracking.tracer.TrackingDeps;
import d70.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.cbottommodal.presentation.CbottomModalDialogFragment;
import ru.ozon.fintech.features.cbottomstories.presentation.FullFragment;
import ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.offline.presentation.main.OfflineMainFragment;
import ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment;
import ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2815b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f2814a = i11;
        this.f2815b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0.b factory;
        Unit startAnimateButton$lambda$35;
        TrackingDeps trackingDeps_delegate$lambda$1;
        switch (this.f2814a) {
            case 0:
                factory = ((FullFragment) this.f2815b).getFactory();
                return factory;
            case 1:
                z0.b bVar = ((InputPlaygroundFragment) this.f2815b).f96880a;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.n("factory");
                throw null;
            case 2:
                return CbottomWebViewDialogFragment.v((CbottomWebViewDialogFragment) this.f2815b);
            case 3:
                return Boolean.valueOf(CbottomModalDialogFragment.u((CbottomModalDialogFragment) this.f2815b));
            case 4:
                return new F30.a(new U50.f((NativeBridgeConfigurator) this.f2815b));
            case 5:
                startAnimateButton$lambda$35 = SharingPreviewFragment.startAnimateButton$lambda$35((SharingPreviewFragment) this.f2815b);
                return startAnimateButton$lambda$35;
            case 6:
                return ((OfflineMainFragment) this.f2815b).getFactory();
            case 7:
                trackingDeps_delegate$lambda$1 = VKIDDepsProd.trackingDeps_delegate$lambda$1((VKIDDepsProd) this.f2815b);
                return trackingDeps_delegate$lambda$1;
            default:
                ((ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a) this.f2815b).Z0().g(false, d.a.PAGE_LOADED_DELAY);
                return Unit.f71690a;
        }
    }
}

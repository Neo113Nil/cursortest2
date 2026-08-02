package B90;

import android.graphics.Point;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.network.useragent.UserAgentProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v2.OnboardingSlidesV2Fragment;
import ru.ozon.fintech.features.cbottomwebview.presentation.CbottomWebViewDialogFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3173b;

    public /* synthetic */ m0(Object obj, int i11) {
        this.f3172a = i11;
        this.f3173b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean isStandaloneIntegration_delegate$lambda$1;
        VKIDLoggerOut loggerOut$lambda$19;
        Unit createVideoChunk$lambda$4$lambda$3;
        Point displaySize_delegate$lambda$3;
        switch (this.f3172a) {
            case 0:
                return v0.q0((v0) this.f3173b);
            case 1:
                return F90.e.h0((F90.e) this.f3173b);
            case 2:
                return ((CbottomWebViewDialogFragment) this.f3173b).getFactory();
            case 3:
                isStandaloneIntegration_delegate$lambda$1 = OnboardingSlidesV2Fragment.isStandaloneIntegration_delegate$lambda$1((OnboardingSlidesV2Fragment) this.f3173b);
                return Boolean.valueOf(isStandaloneIntegration_delegate$lambda$1);
            case 4:
                return ((c80.b) this.f3173b).getFactory();
            case 5:
                loggerOut$lambda$19 = VKIDDepsProd.loggerOut$lambda$19((VKIDDepsProd) this.f3173b);
                return loggerOut$lambda$19;
            case 6:
                createVideoChunk$lambda$4$lambda$3 = CameraFragment.createVideoChunk$lambda$4$lambda$3((CameraFragment) this.f3173b);
                return createVideoChunk$lambda$4$lambda$3;
            case 7:
                displaySize_delegate$lambda$3 = UserAgentProvider.displaySize_delegate$lambda$3((UserAgentProvider) this.f3173b);
                return displaySize_delegate$lambda$3;
            default:
                return v30.e.j((v30.e) this.f3173b);
        }
    }
}

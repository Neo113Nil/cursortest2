package B50;

import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApi;
import kotlin.jvm.functions.Function0;
import qa0.C9016a;
import ru.ozon.fintech.features.camera.domain.scanner.MobScannerConfig;
import ru.ozon.fintech.features.camera.presentation.camera.CameraViewModel;
import ru.ozon.fintech.features.cbottomstories.presentation.StoriesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2937b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f2936a = i11;
        this.f2937b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean isStandaloneIntegration_delegate$lambda$1;
        InternalVKIDGroupSubscriptionApi groupSubscriptionApi_delegate$lambda$30;
        MobScannerConfig mobScannerConfig_delegate$lambda$0;
        switch (this.f2936a) {
            case 0:
                isStandaloneIntegration_delegate$lambda$1 = StoriesFragment.isStandaloneIntegration_delegate$lambda$1((StoriesFragment) this.f2937b);
                return Boolean.valueOf(isStandaloneIntegration_delegate$lambda$1);
            case 1:
                groupSubscriptionApi_delegate$lambda$30 = VKIDDepsProd.groupSubscriptionApi_delegate$lambda$30((VKIDDepsProd) this.f2937b);
                return groupSubscriptionApi_delegate$lambda$30;
            case 2:
                return C9016a.a((C9016a) this.f2937b);
            default:
                mobScannerConfig_delegate$lambda$0 = CameraViewModel.mobScannerConfig_delegate$lambda$0((CameraViewModel) this.f2937b);
                return mobScannerConfig_delegate$lambda$0;
        }
    }
}

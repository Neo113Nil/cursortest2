package B50;

import com.vk.id.fetchuser.VKIDUserInfoFetcher;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.cbottomstories.presentation.FullFragment;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment;
import ru.ozon.fintech.features.tabber.presentation.rko.RkoActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2817b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f2816a = i11;
        this.f2817b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean isStandaloneIntegration_delegate$lambda$1;
        boolean isStandaloneIntegration_delegate$lambda$0;
        VKIDUserInfoFetcher userInfoFetcher$lambda$22;
        Object obj = this.f2817b;
        switch (this.f2816a) {
            case 0:
                isStandaloneIntegration_delegate$lambda$1 = FullFragment.isStandaloneIntegration_delegate$lambda$1((FullFragment) obj);
                return Boolean.valueOf(isStandaloneIntegration_delegate$lambda$1);
            case 1:
                return NativeBridgeConfigurator.g((NativeBridgeConfigurator) obj);
            case 2:
                isStandaloneIntegration_delegate$lambda$0 = SharingPreviewFragment.isStandaloneIntegration_delegate$lambda$0((SharingPreviewFragment) obj);
                return Boolean.valueOf(isStandaloneIntegration_delegate$lambda$0);
            case 3:
                int i11 = RkoActivity.f96340t0;
                return ((RkoActivity) obj).J();
            case 4:
                userInfoFetcher$lambda$22 = VKIDDepsProd.userInfoFetcher$lambda$22((VKIDDepsProd) obj);
                return userInfoFetcher$lambda$22;
            default:
                return Boolean.valueOf(w30.n.a((w30.n) obj));
        }
    }
}

package B50;

import androidx.lifecycle.z0;
import com.vk.id.internal.di.VKIDDepsProd;
import com.vk.id.internal.state.StateGenerator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2829b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f2828a = i11;
        this.f2829b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StateGenerator stateGenerator_delegate$lambda$24;
        switch (this.f2828a) {
            case 0:
                return h.u((h) this.f2829b);
            case 1:
                z0.b bVar = ((TestingFeaturesV1EditFragment) this.f2829b).f96938b;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.n("factory");
                throw null;
            case 2:
                return J50.f.k0((J50.f) this.f2829b);
            case 3:
                return Boolean.valueOf(NativeBridgeConfigurator.p((NativeBridgeConfigurator) this.f2829b));
            case 4:
                return e50.b.f((e50.b) this.f2829b);
            default:
                stateGenerator_delegate$lambda$24 = VKIDDepsProd.stateGenerator_delegate$lambda$24((VKIDDepsProd) this.f2829b);
                return stateGenerator_delegate$lambda$24;
        }
    }
}

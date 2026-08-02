package B90;

import androidx.lifecycle.z0;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qa0.C9016a;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment;

/* renamed from: B90.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2620w implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3218b;

    public /* synthetic */ C2620w(Object obj, int i11) {
        this.f3217a = i11;
        this.f3218b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InternalVKIDDeviceIdProvider deviceIdProvider$lambda$27;
        switch (this.f3217a) {
            case 0:
                z0.b bVar = ((FintechPreferencesFragment) this.f3218b).f96744i;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.n("factory");
                throw null;
            case 1:
                return TestingFeaturesV1EditFragment.u((TestingFeaturesV1EditFragment) this.f3218b);
            case 2:
                deviceIdProvider$lambda$27 = VKIDDepsProd.deviceIdProvider$lambda$27((VKIDDepsProd) this.f3218b);
                return deviceIdProvider$lambda$27;
            default:
                return C9016a.b((C9016a) this.f3218b);
        }
    }
}

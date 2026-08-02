package B50;

import com.vk.id.internal.auth.device.DeviceIdPrefs;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment;
import w30.t;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2833b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f2832a = i11;
        this.f2833b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DeviceIdPrefs deviceIdStorage$lambda$26;
        switch (this.f2832a) {
            case 0:
                return ((h) this.f2833b).getFactory();
            case 1:
                return InputPlaygroundFragment.u((InputPlaygroundFragment) this.f2833b);
            case 2:
                return TestingFeaturesV1EditFragment.t((TestingFeaturesV1EditFragment) this.f2833b);
            case 3:
                deviceIdStorage$lambda$26 = VKIDDepsProd.deviceIdStorage$lambda$26((VKIDDepsProd) this.f2833b);
                return deviceIdStorage$lambda$26;
            default:
                return t.a((t) this.f2833b);
        }
    }
}

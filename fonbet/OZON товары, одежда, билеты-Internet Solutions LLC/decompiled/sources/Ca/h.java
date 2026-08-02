package Ca;

import com.vk.id.onetap.xml.OneTap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.onboarding.presentation.DisclosureFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment;

/* loaded from: classes9.dex */
public final /* synthetic */ class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4604b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f4603a = i11;
        this.f4604b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit Content$lambda$63$lambda$62;
        Object obj = this.f4604b;
        switch (this.f4603a) {
            case 0:
                Content$lambda$63$lambda$62 = OneTap.Content$lambda$63$lambda$62((OneTap) obj);
                return Content$lambda$63$lambda$62;
            case 1:
                return TestingFeaturesV2EditFragment.v((TestingFeaturesV2EditFragment) obj);
            case 2:
                return NativeBridgeConfigurator.o((NativeBridgeConfigurator) obj);
            case 3:
                return Long.valueOf(V70.d.g((V70.d) obj));
            case 4:
                return ((Z40.b) obj).getFactory();
            case 5:
                int i11 = l80.f.f72971Z;
                K40.a aVar = ((l80.f) obj).f72981J;
                if (aVar != null) {
                    aVar.f("");
                    return Unit.f71690a;
                }
                Intrinsics.n("cbottomDisplay");
                throw null;
            default:
                return ((DisclosureFragment) obj).getFactory();
        }
    }
}

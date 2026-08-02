package F70;

import Oe.N;
import Oe.O;
import androidx.lifecycle.z0;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import ru.ozon.fintech.features.camera.scanners.mlkit.utils.DetectedPhoneHandler;
import ru.ozon.fintech.features.cbottomonboarding.presentation.v1.OnboardingSlidesFragment;
import ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet;
import ru.ozon.fintech.features.operations.presentation.ReceiptFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9116b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f9115a = i11;
        this.f9116b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z0.b factory;
        Pattern phonePattern_delegate$lambda$0;
        switch (this.f9115a) {
            case 0:
                return ((ReceiptFragment) this.f9116b).getFactory();
            case 1:
                z0.b bVar = ((TestingFeaturesV2EditFragment) this.f9116b).f96965b;
                if (bVar != null) {
                    return bVar;
                }
                Intrinsics.n("factory");
                throw null;
            case 2:
                N n11 = (N) this.f9116b;
                return Integer.valueOf(O.a(n11, n11.k()));
            case 3:
                return Long.valueOf(V70.d.d((V70.d) this.f9116b));
            case 4:
                factory = ((OnboardingSlidesFragment) this.f9116b).getFactory();
                return factory;
            case 5:
                return f.M((f) this.f9116b);
            case 6:
                return ((CbottomBottomSheet) this.f9116b).getFactory();
            default:
                phonePattern_delegate$lambda$0 = DetectedPhoneHandler.phonePattern_delegate$lambda$0((String) this.f9116b);
                return phonePattern_delegate$lambda$0;
        }
    }

    public /* synthetic */ c(f fVar, boolean z11) {
        this.f9115a = 5;
        this.f9116b = fVar;
    }
}
